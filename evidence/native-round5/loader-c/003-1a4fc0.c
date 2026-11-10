/* Ghidra pseudocode; not recovered Java. JNI types and captured pool applied. */

/* WARNING: Globals starting with '_' overlap smaller symbols at the same address */
/* WARNING: Unknown calling convention -- yet parameter storage is locked */

void recovered_native_1a4fc0
               (RecoveredJNINativeInterface **env,void *self,void *arg1,void *arg2,void *arg3,
               void *arg4,void *arg5)

{
  CallVoidMethod *pCVar1;
  GetMethodID *pGVar2;
  ulong uVar3;
  byte bVar4;
  void *pvVar5;
  void *clazz;
  undefined8 uStack_68;
  undefined1 uStack_60;
  char acStack_58 [8];
  undefined4 uStack_50;
  undefined2 uStack_4c;
  undefined2 uStack_4a;
  undefined4 uStack_48;
  undefined1 uStack_44;
  undefined1 uStack_43;
  undefined8 uStack_38;
  
  uStack_38 = 1;
  (*(*env)->SetByteArrayRegion)(env,arg1,0,1,&uStack_38);
  bVar4 = (*(*env)->ExceptionCheck)(env);
  if (bVar4 == 0) {
    pvVar5 = (*(*env)->GetObjectArrayElement)(env,arg3,0);
    bVar4 = (*(*env)->ExceptionCheck)(env);
    if (bVar4 == 0) {
      pCVar1 = (*env)->CallVoidMethod;
      if (_DAT_004c8d28 == (void *)0x0) {
        pGVar2 = (*env)->GetMethodID;
        uStack_60 = 0;
        uStack_68 = 0x65756c6156746573;
        uStack_43 = 0;
        uStack_50 = 0x2f676e61;
        builtin_strncpy(acStack_58,"(Ljava/l",8);
        uStack_4c = 0x624f;
        uStack_4a = 0x656a;
        uStack_48 = 0x293b7463;
        uStack_44 = 0x56;
        clazz = (void *)func_0x00287180(env);
        _DAT_004c8d28 = (*pGVar2)(env,clazz,(char *)&uStack_68,acStack_58);
      }
      (*pCVar1)(env,arg2,_DAT_004c8d28,pvVar5);
      bVar4 = (*(*env)->ExceptionCheck)(env);
      if (bVar4 == 0) {
        pCVar1 = (*env)->CallVoidMethod;
        if (_DAT_004c8d30 == (void *)0x0) {
          pGVar2 = (*env)->GetMethodID;
          builtin_strncpy(acStack_58,"dispose",8);
          uVar3 = (ulong)uStack_68 >> 0x18;
          uStack_68 = CONCAT53((uint5)uVar3 & 0xffffffff00,0x562928);
          pvVar5 = (void *)func_0x004c4470(env);
          _DAT_004c8d30 = (*pGVar2)(env,pvVar5,acStack_58,(char *)&uStack_68);
        }
        (*pCVar1)(env,arg4,_DAT_004c8d30);
        (*(*env)->ExceptionCheck)(env);
      }
    }
  }
  return;
}

