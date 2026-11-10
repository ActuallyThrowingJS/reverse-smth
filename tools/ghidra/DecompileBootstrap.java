// @category Recovery
import ghidra.app.script.GhidraScript;
import ghidra.app.decompiler.*;
import ghidra.program.model.listing.*;
import ghidra.program.model.data.*;
import ghidra.program.model.symbol.SourceType;
import java.nio.file.*;
public class DecompileBootstrap extends GhidraScript {
 public void run()throws Exception {
  var address=currentProgram.getImageBase().add(0xe55230);
  disassemble(address);Function f=getFunctionAt(address);if(f==null)f=createFunction(address,"JNI_OnLoad");
  f.setReturnType(IntegerDataType.dataType,SourceType.USER_DEFINED);
  f.replaceParameters(Function.FunctionUpdateType.DYNAMIC_STORAGE_ALL_PARAMS,true,SourceType.USER_DEFINED,
   new ParameterImpl("vm",new PointerDataType(new PointerDataType(VoidDataType.dataType)),currentProgram),new ParameterImpl("reserved",new PointerDataType(VoidDataType.dataType),currentProgram));
  DecompInterface decompiler=new DecompInterface();
  try {decompiler.openProgram(currentProgram);DecompileResults result=decompiler.decompileFunction(f,60,monitor);if(!result.decompileCompleted())throw new IllegalStateException(result.getErrorMessage());
   Files.writeString(Path.of(getScriptArgs()[0]),"/* Ghidra pseudocode of JNIC's generated bootstrap, not Polinex application Java. */\n"+result.getDecompiledFunction().getC());println("Bootstrap decompiled successfully");
  }finally{decompiler.dispose();}
 }
}
