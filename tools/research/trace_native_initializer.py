"""Experimental JNI-model trace. Never executes application natives in a JVM.

Depends on external GPL-3.0 C2J native emulator; upstream source is not vendored.
Unmodeled application calls are mocked: this is conditional decoding evidence,
not a recovered or behavior-validated initializer.
"""
from pathlib import Path
import argparse,hashlib,json,subprocess,struct,sys
parser=argparse.ArgumentParser(description=__doc__)
for option in ('c2j-root','image','buffer','jni-table','input-jar','crypto-state','dispatcher-state','output'):
 parser.add_argument('--'+option,required=True,type=Path)
parser.add_argument('--java',default='java')
parser.add_argument('--rva',default='0xc53c80')
parser.add_argument('--instruction-limit',type=int,default=20000000)
args=parser.parse_args()
root=Path(__file__).resolve().parents[2]
if hashlib.sha256(args.image.read_bytes()).hexdigest()!='d9579ee6f180cff451436b99186c804ad954ddb3a095782b122341cddc6eab34':
 raise ValueError('This experimental adapter is reviewed only for the supplied client ELF')
sys.path.insert(0,str(args.c2j_root/'py/native_emulate'))
from j2c_emu import Emu
from unicorn.x86_const import UC_X86_REG_RSP,UC_X86_REG_RIP,UC_X86_REG_RAX
names={r['slot']:r['name'] for r in json.loads(args.jni_table.read_text())}

class JnicEmu(Emu):
    def __init__(self, path, buffer):
        super().__init__(path, verbose=True)
        self.buffer_address = self.HEAP + 0x1000
        self.uc.mem_write(self.buffer_address, buffer)
        self.memcpy_address = self.CRT + 0x800
        for slot, name in self.fmt.imports.items():
            if name == 'memcpy': self.uc.mem_write(slot, struct.pack('<Q', self.memcpy_address))

    def _cstr(self, address):
        out = bytearray()
        try:
            for i in range(8192):
                c = bytes(self.uc.mem_read(address+i, 1))[0]
                if c == 0:
                    return out.decode('utf-8', 'replace') if out else None
                out.append(c)
        except Exception:
            return None
        return None

    def _capture_register(self, clazz, table, count):
        if count > 4096: raise ValueError('Excessive native method table')
        handle=self.handles.get(clazz)
        owner=handle[2] if handle and handle[0]=='class' else None
        for i in range(count):
            name, descriptor, function=struct.unpack('<QQQ',self.uc.mem_read(table+i*24,24))
            self.methods.append(dict(className=owner,name=self._cstr(name),desc=self._cstr(descriptor),fnAddr=function))

    def _return(self, uc, rsp, value):
        ret, = struct.unpack('<Q', uc.mem_read(rsp, 8))
        uc.reg_write(UC_X86_REG_RAX, value)
        uc.reg_write(UC_X86_REG_RSP, rsp+8)
        uc.reg_write(UC_X86_REG_RIP, ret)

    def _hook(self, uc, address, size, user_data):
        rsp = uc.reg_read(UC_X86_REG_RSP)
        if address == getattr(self, 'memcpy_address', None):
            dst, src, length = (self.abi.arg(uc, rsp, i) for i in (1,2,3))
            if length > 64*1024*1024: raise ValueError('Excessive memcpy')
            uc.mem_write(dst, bytes(uc.mem_read(src, length)))
            self._return(uc, rsp, dst)
        elif address == self.STUB + 230*8:
            self._return(uc, rsp, self.buffer_address)
        else:
            super()._hook(uc, address, size, user_data)

class Trace(JnicEmu):
 def _hook(self,uc,address,size,data):
  if getattr(self,'trace',None) is not None and self.STUB<=address<self.STUB+236*8:
   slot=(address-self.STUB)//8;rsp=uc.reg_read(UC_X86_REG_RSP);A=lambda i:self.abi.arg(uc,rsp,i);name=names.get(slot,str(slot));row={'slot':slot,'jni':name}
   if slot in (6,):row['class']=self._cstr(A(2))
   if slot in (94,144,33,113):
    clazz=self.handles.get(A(2));row.update(owner=clazz[2] if clazz else None,name=self._cstr(A(3)),descriptor=self._cstr(A(4)));self.trace.append(row);self._return(uc,rsp,self._new('fieldid' if slot in(94,144) else 'methodid',meta=(row['owner'],row['name'],row['descriptor'])));return
   if slot in (95,145,104,154):
    member=self.handles.get(A(3));row['member']=member[2] if member else None;self.trace.append(row)
    if slot in (95,145):self._return(uc,rsp,self._new('obj',meta=('field',row['member'])));return
    self._return(uc,rsp,0);return
   if slot in (34,35,36,114,115,116,61,62,63,141,142,143):
    member=self.handles.get(A(3));row['member']=member[2] if member else None;row['rawArg4']=hex(A(4));self.trace.append(row);meta=member[2] if member else None;self._return(uc,rsp,self._new('obj',meta=('result',meta)) if slot in(34,35,36,114,115,116) else 0);return
   self.trace.append(row)
  super()._hook(uc,address,size,data)
process=subprocess.Popen([args.java,'-Xmx2g','-cp',str(root/'build/classes')+':'+str(root/'.cache/deps/*'),'CryptoSnapshotService',str(args.input_jar.resolve()),str(args.crypto_state.resolve()),str(args.dispatcher_state.resolve())],stdin=subprocess.PIPE,stdout=subprocess.PIPE,text=True,cwd=root)
def rpc(q):
 process.stdin.write(json.dumps(q)+'\n');process.stdin.flush();line=process.stdout.readline()
 if not line:raise RuntimeError('Crypto RPC stopped')
 return json.loads(line)
def signed(v):return v-(1<<64) if v>=1<<63 else v
class MainTrace(Trace):
 def __init__(self,*a):super().__init__(*a);self.resolved=[];self.stopped=None
 def va(self,p):
  gp,fp,overflow,save=struct.unpack('<IIQQ',self.uc.mem_read(p,24));values=[]
  for _ in range(2):
   if gp<48:values.append(struct.unpack('<Q',self.uc.mem_read(save+gp,8))[0]);gp+=8
   else:values.append(struct.unpack('<Q',self.uc.mem_read(overflow,8))[0]);overflow+=8
  return values
 def _hook(self,uc,address,size,data):
  if getattr(self,'trace',None) is not None and self.STUB<=address<self.STUB+236*8:
   idx=(address-self.STUB)//8;rsp=uc.reg_read(UC_X86_REG_RSP);A=lambda i:self.abi.arg(uc,rsp,i);name=names.get(idx,str(idx));member=self.handles.get(A(3))
   if idx==114 and member:
    owner,method,desc=member[2]
    if (owner,method)==('java/lang/invoke/MethodType','fromMethodDescriptorString'):
     descriptor=self.handles[A(4)][1].decode('utf-8');self.trace.append({'jni':name,'model':'MethodType','descriptor':descriptor});self._return(uc,rsp,self._new('methodtype',meta=descriptor));return
    if desc=='(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;':
     indy=self.handles[A(5)][1].decode('utf-8');descriptor=self.handles[A(6)][2];self.trace.append({'jni':name,'model':'bootstrap','owner':owner,'indy':indy,'descriptor':descriptor});self._return(uc,rsp,self._new('callsite',meta=(owner,method,indy,descriptor)));return
    if owner in ('java/lang/Long','java/lang/Integer') and method=='valueOf':
     value=signed(A(4)) if owner=='java/lang/Long' else (A(4)&0xffffffff);value=value-(1<<32) if owner=='java/lang/Integer' and value>=1<<31 else value;self._return(uc,rsp,self._new('number',meta=value));return
   if idx==34 and member:
    owner,method,desc=member[2]
    if owner=='java/lang/invoke/CallSite' and method=='getTarget' and self.handles.get(A(2),[None])[0]=='callsite':
     self._return(uc,rsp,self._new('methodhandle',meta=self.handles[A(2)][2]));return
    if owner=='java/lang/invoke/MethodHandles$Lookup' and method=='findStatic':
     clazz=self.handles[A(4)][2];methodName=self.handles[A(5)][1].decode('utf-8');descriptor=self.handles[A(6)][2];self._return(uc,rsp,self._new('methodhandle',meta=('direct',clazz,methodName,descriptor)));return
    if owner=='java/lang/invoke/MethodHandle' and method=='invokeWithArguments':
     bootstrap=self.handles.get(A(2));array=self.handles.get(A(4))
     if bootstrap and bootstrap[0]=='methodhandle' and array and array[0]=='objects':
      targetOwner,targetName,indy,descriptor=bootstrap[2];values=[self.handles.get(h) for h in array[1]]
      if targetOwner=='direct' and targetName=='java/lang/invoke/StringConcatFactory':
       if indy!='makeConcatWithConstants':raise ValueError('Unmodeled concat bootstrap')
       recipe=values[3][1].decode('utf-8');callDescriptor=values[2][2];self._return(uc,rsp,self._new('callsite',meta=('concat',recipe,callDescriptor,[])));return
      if targetOwner=='concat':
       parts=[];at=0
       for ch in targetName:
        if ch=='\x01':
         h=values[at];at+=1
         if not h or h[0] not in ('str','number'):raise ValueError('Unknown string concat argument')
         parts.append(h[1].decode('utf-8') if h[0]=='str' else str(h[2]))
        elif ch=='\x02':raise ValueError('Unmodeled concat constant')
        else:parts.append(ch)
       self._return(uc,rsp,self._new('str',''.join(parts).encode('utf-8')));return
      if targetOwner.startswith('me/octo/client/modules/impl/macros/'):
       a,b=(h[2] for h in values[-2:]);answer=rpc({'operation':'member','owner':targetOwner,'first':a,'key':b,'isField':indy in ('e','R','Z','Ö')});self.trace.append({'jni':name,'model':'member-indy','first':a,'key':b,'indy':indy,'descriptor':descriptor,'answer':answer})

      if descriptor=='(IJ)Ljava/lang/String;' and all(h and h[0]=='number' for h in values):
       index,key=(h[2] for h in values);answer=rpc({'owner':targetOwner,'name':targetName,'index':index,'key':key});self.trace.append({'jni':name,'model':'string-indy','owner':targetOwner,'index':index,'key':key,'answer':answer})
       if 'plaintext' not in answer:self.stopped={'reason':'Unresolved string indy','details':answer};uc.emu_stop();return
       value=answer['plaintext'];self.resolved.append(value);self._return(uc,rsp,self._new('str',value.encode('utf-8')));return
   if name=='NewString':
    length=A(3)&0xffffffff
    if length>100000:raise ValueError('String model bound')
    value=bytes(uc.mem_read(A(2),length*2)).decode('utf-16-le','surrogatepass');self.trace.append({'jni':name,'value':value});self._return(uc,rsp,self._new('str',value.encode('utf-8','surrogatepass')));return
   if name in ['GetStaticLongField','GetStaticIntField'] and member:
    owner,field,desc=member[2];answer=rpc({'owner':owner,'field':field})
    if 'value' not in answer:self.stopped={'reason':'Uncaptured numeric field','owner':owner,'field':field,'details':answer};uc.emu_stop();return
    self.trace.append({'jni':name,'member':member[2],'value':answer['value']});self._return(uc,rsp,int(answer['value'])&((1<<64)-1));return
   if idx in (114,115,116) and member and len(member[2])==3 and member[2][2]=='(IJ)Ljava/lang/String;':
    owner,method,desc=member[2];values=[A(4),A(5)] if idx==114 else self.va(A(4)) if idx==115 else list(struct.unpack('<QQ',uc.mem_read(A(4),16)));index=values[0]&0xffffffff;index=index-(1<<32) if index>=1<<31 else index;answer=rpc({'owner':owner,'name':method,'index':index,'key':signed(values[1])})
    self.trace.append({'jni':name,'member':member[2],'decoded':answer})
    if 'plaintext' not in answer:self.stopped={'reason':'Unresolved string decode','owner':owner,'name':method,'index':index,'key':signed(values[1]),'details':answer};uc.emu_stop();return
    text=answer['plaintext'];self.resolved.append(text);self._return(uc,rsp,self._new('str',text.encode()));return
   if name=='NewObjectArray':
    length=A(2)&0xffffffff
    if length>100000:raise ValueError('Array model bound')
    handle=self._new('objects');self.handles[handle][1]=[A(4)]*length;self.trace.append({'jni':name,'length':length});self._return(uc,rsp,handle);return
   if name in ['GetObjectArrayElement','SetObjectArrayElement']:
    array=self.handles.get(A(2));index=A(3)&0xffffffff
    if not array or array[0]!='objects' or index>=len(array[1]):self.stopped={'reason':'Unsupported or out-of-bounds object array','jni':name,'index':index};uc.emu_stop();return
    if name=='GetObjectArrayElement':result=array[1][index]
    else:array[1][index]=A(4);result=0
    self.trace.append({'jni':name,'index':index});self._return(uc,rsp,result);return
  super()._hook(uc,address,size,data)

em=MainTrace(str(args.image),args.buffer.read_bytes())
try:
 em.run(em.fmt.exports['JNI_OnLoad'],as_onload=True,count=80000000)
 em.trace=[]
 em.run(em.fmt.base+int(args.rva,0),count=args.instruction_limit)
except Exception as error:
 em.stopped={'reason':'Emulator model exception','type':type(error).__name__,'message':str(error)}
finally:
 process.stdin.close();process.terminate();process.wait(timeout=5)
 result={'analysisOnly':True,'scope':'Conditional JNI models; unmodeled Java calls mocked; no application classes loaded in JVM; not behavioral reconstruction','returned':em.uc.reg_read(UC_X86_REG_RIP)==em.RET,'stopReason':em.stopped,'instructionLimit':args.instruction_limit,'nativeRva':args.rva,'resolvedStrings':em.resolved,'calls':getattr(em,'trace',[]),'inputs':{name:hashlib.sha256(getattr(args,name).read_bytes()).hexdigest() for name in ('image','buffer','input_jar','crypto_state','dispatcher_state')}}
 args.output.parent.mkdir(parents=True,exist_ok=True)
 args.output.write_text(json.dumps(result,indent=2,default=lambda x:{'bytes':bytes(x).hex()} if isinstance(x,(bytes,bytearray)) else str(x)))
 print('Conditional native trace: calls',len(result['calls']),'strings',len(em.resolved),'returned',result['returned'],'stop',em.stopped)
