/* Ghidra pseudocode; not recovered Java. JNI types and captured pool applied. */

/* WARNING: Globals starting with '_' overlap smaller symbols at the same address */
/* WARNING: Unknown calling convention -- yet parameter storage is locked */

void recovered_native_2e47e0(RecoveredJNINativeInterface **env,void *self,void *arg1,void *arg2)

{
  CallStaticObjectMethod *pCVar1;
  CallVoidMethod *pCVar2;
  byte bVar3;
  void *clazz;
  void *pvVar4;
  undefined4 uStack_30;
  undefined1 uStack_2c;
  undefined4 uStack_28;
  undefined1 uStack_24;
  
  pCVar1 = (*env)->CallStaticObjectMethod;
  clazz = (void *)func_0x003e48c0();
  pvVar4 = (void *)func_0x003e4960(env);
  pvVar4 = (*pCVar1)(env,clazz,pvVar4);
  bVar3 = (*(*env)->ExceptionCheck)(env);
  if (bVar3 == 0) {
    pCVar2 = (*env)->CallVoidMethod;
    if (_DAT_004c9378 == (void *)0x0) {
      uStack_24 = 0;
      uStack_28 = 0x746c6168;
      uStack_2c = 0;
      uStack_30 = 0x56294928;
      _DAT_004c9378 = (*(*env)->GetMethodID)(env,clazz,(char *)&uStack_28,(char *)&uStack_30);
    }
    (*pCVar2)(env,pvVar4,_DAT_004c9378,1);
    (*(*env)->ExceptionCheck)(env);
  }
  return;
}

