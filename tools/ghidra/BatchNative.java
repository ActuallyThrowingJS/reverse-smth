// @category Recovery
import ghidra.app.script.GhidraScript;
import ghidra.app.decompiler.*;
import ghidra.program.model.address.*;
import ghidra.program.model.listing.*;
import ghidra.program.model.mem.MemoryBlock;
import ghidra.program.model.data.*;
import ghidra.program.model.symbol.SourceType;
import com.google.gson.*;
import java.nio.file.*;
import java.util.*;

/** Typed JNI pseudocode export using a captured bootstrap constant pool. */
public class BatchNative extends GhidraScript {
 DataType pointer=new PointerDataType(VoidDataType.dataType);
 DataType type(String name){name=name.replace("const ","").trim();if(name.contains("*")){String base=name.replace("*","").trim();return new PointerDataType(base.equals("char")?CharDataType.dataType:VoidDataType.dataType);}return switch(name){case "void"->VoidDataType.dataType;case "jboolean","jbyte"->ByteDataType.dataType;case "jchar"->UnsignedShortDataType.dataType;case "jshort"->ShortDataType.dataType;case "jint","jsize","jobjectRefType"->IntegerDataType.dataType;case "jlong"->LongLongDataType.dataType;case "jfloat"->FloatDataType.dataType;case "jdouble"->DoubleDataType.dataType;default->pointer;};}
 DataType javaType(char c){return switch(c){case 'V'->VoidDataType.dataType;case 'Z','B'->ByteDataType.dataType;case 'C'->UnsignedShortDataType.dataType;case 'S'->ShortDataType.dataType;case 'I'->IntegerDataType.dataType;case 'J'->LongLongDataType.dataType;case 'F'->FloatDataType.dataType;case 'D'->DoubleDataType.dataType;default->pointer;};}
 public void run()throws Exception{
  String[] args=getScriptArgs();Path output=Path.of(args[3]);Files.createDirectories(output);
  JsonObject pool=JsonParser.parseString(Files.readString(Path.of(args[1]))).getAsJsonObject();byte[] bytes=Files.readAllBytes(Path.of(pool.get("file").getAsString()));Address base=toAddr(0x20000000L);
  if(currentProgram.getMemory().getBlock(base)==null){MemoryBlock b=currentProgram.getMemory().createInitializedBlock("recovered_jnic_pool",base,new java.io.ByteArrayInputStream(bytes),bytes.length,monitor,false);b.setRead(true);b.setWrite(false);}
  Address global=currentProgram.getImageBase().add(Long.decode(pool.get("pointerRva").getAsString()));MemoryBlock block=currentProgram.getMemory().getBlock(global);if(!block.isInitialized())currentProgram.getMemory().convertToInitialized(block,(byte)0);setLong(global,base.getOffset());clearListing(global,global.add(7));Data data=createData(global,new PointerDataType(ByteDataType.dataType));MutabilitySettingsDefinition.DEF.setChoice(data,MutabilitySettingsDefinition.CONSTANT);
  StructureDataType table=new StructureDataType("RecoveredJNINativeInterface",0);for(int i=0;i<4;i++)table.add(pointer,8,"reserved"+i,null);
  for(JsonElement item:JsonParser.parseString(Files.readString(Path.of(args[2]))).getAsJsonArray()){
   JsonObject row=item.getAsJsonObject();FunctionDefinitionDataType function=new FunctionDefinitionDataType(row.get("name").getAsString());function.setReturnType(type(row.get("returnType").getAsString()));List<ParameterDefinition> params=new ArrayList<>();for(JsonElement element:row.getAsJsonArray("parameters")){JsonObject p=element.getAsJsonObject();if(p.get("type").getAsString().equals("...")){function.setVarArgs(true);continue;}params.add(new ParameterDefinitionImpl(p.get("name").getAsString(),type(p.get("type").getAsString()),null));}function.setArguments(params.toArray(ParameterDefinition[]::new));table.add(new PointerDataType(function),8,row.get("name").getAsString(),null);
  }
  DataType env=new PointerDataType(new PointerDataType(table));DecompInterface decompiler=new DecompInterface();DecompileOptions options=new DecompileOptions();options.setRespectReadOnly(true);options.setMaxJumpTableEntries(32768);options.setMaxInstructions(2000000);decompiler.setOptions(options);decompiler.openProgram(currentProgram);
  List<Map<String,Object>> reports=new ArrayList<>();int index=0;
  try{for(JsonElement item:JsonParser.parseString(Files.readString(Path.of(args[0]))).getAsJsonArray()){
   JsonObject row=item.getAsJsonObject();long rva=Long.decode(row.get("elfRva").getAsString()),size=Long.decode(row.get("unwindSize").getAsString());Address entry=currentProgram.getImageBase().add(rva);disassemble(entry);Function f=getFunctionAt(entry);if(f==null)f=createFunction(entry,"recovered_native_"+Long.toHexString(rva));Map<String,Object> report=new LinkedHashMap<>();report.put("rva",row.get("elfRva").getAsString());report.put("original",row);reports.add(report);
   try{if(f==null)throw new IllegalStateException("Function creation failed");f.setBody(new AddressSet(entry,entry.add(size-1)));String desc=row.get("desc").getAsString();List<Parameter> params=new ArrayList<>();params.add(new ParameterImpl("env",env,currentProgram));params.add(new ParameterImpl("self",pointer,currentProgram));int n=1;for(int i=1;i<desc.indexOf(')');i++){char c=desc.charAt(i);params.add(new ParameterImpl("arg"+n++,javaType(c),currentProgram));if(c=='['){while(desc.charAt(i+1)=='[')i++;if(desc.charAt(i+1)=='L')i=desc.indexOf(';',i);else i++;}else if(c=='L')i=desc.indexOf(';',i);}f.setReturnType(javaType(desc.charAt(desc.indexOf(')')+1)),SourceType.USER_DEFINED);f.replaceParameters(Function.FunctionUpdateType.DYNAMIC_STORAGE_ALL_PARAMS,true,SourceType.USER_DEFINED,params.toArray(Parameter[]::new));decompiler.flushCache();DecompileResults result=decompiler.decompileFunction(f,args.length>4?Integer.parseInt(args[4]):30,monitor);if(!result.decompileCompleted())throw new IllegalStateException(result.getErrorMessage());String code=result.getDecompiledFunction().getC();String name=String.format("%03d-%s.c",index,Long.toHexString(rva));Files.writeString(output.resolve(name),"/* Ghidra pseudocode; not recovered Java. JNI types and captured pool applied. */\n"+code);report.put("file",name);report.put("complete",true);report.put("unresolvedJumpTable",code.contains("Could not recover jumptable"));println("EXPORTED "+row.get("elfRva")+" "+code.length()+" chars");}
   catch(Exception e){report.put("complete",false);report.put("error",e.toString());println("FAILED "+e);}index++;
  }}finally{decompiler.dispose();Files.writeString(output.resolve("manifest.json"),new GsonBuilder().setPrettyPrinting().create().toJson(reports));}
 }
}
