/* Ghidra pseudocode; not recovered Java. JNI types and captured pool applied. */

/* WARNING: Unknown calling convention -- yet parameter storage is locked */

void * recovered_native_755e20(RecoveredJNINativeInterface_conflict **env,void *self)

{
  CallStaticObjectMethod *pCVar1;
  byte bVar2;
  void *pvVar3;
  void *pvVar4;
  
  pCVar1 = (*env)->CallStaticObjectMethod;
  pvVar3 = (void *)func_0x001b6f30();
  pvVar4 = (void *)func_0x001b6fd0(env);
  pvVar4 = (*pCVar1)(env,pvVar3,pvVar4,0);
  bVar2 = (*(*env)->ExceptionCheck)(env);
  pvVar3 = (void *)0x0;
  if (bVar2 == 0) {
    pvVar3 = pvVar4;
  }
  return pvVar3;
}

