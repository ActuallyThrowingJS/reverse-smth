/* Ghidra pseudocode; not recovered Java. JNI types and captured pool applied. */

/* WARNING: Globals starting with '_' overlap smaller symbols at the same address */
/* WARNING: Unknown calling convention -- yet parameter storage is locked */

void * recovered_native_c50530
                 (RecoveredJNINativeInterface_conflict **env,void *self,void *arg1,void *arg2,
                 void *arg3,void *arg4)

{
  IsInstanceOf *pIVar1;
  ThrowNew *pTVar2;
  CallIntMethod *pCVar3;
  CallLongMethod *pCVar4;
  CallStaticObjectMethod *pCVar5;
  NewObjectArray *pNVar6;
  GetStaticObjectField *pGVar7;
  FindClass *pFVar8;
  CallVoidMethod *pCVar9;
  byte bVar10;
  uint uVar11;
  void *pvVar12;
  void *pvVar13;
  void *pvVar14;
  void *pvVar15;
  longlong lVar16;
  undefined8 uVar17;
  void *pvVar18;
  long lVar19;
  bool bVar20;
  byte abStack_68 [40];
  void *pvStack_40;
  void *pvStack_38;
  
  pvVar12 = (*(*env)->GetObjectArrayElement)(env,arg4,0);
  bVar10 = (*(*env)->ExceptionCheck)(env);
  if (bVar10 != 0) {
    return (void *)0x0;
  }
  pIVar1 = (*env)->IsInstanceOf;
  pvVar13 = (void *)func_0x001b6f30(env);
  bVar10 = (*pIVar1)(env,pvVar12,pvVar13);
  if (bVar10 == 0) {
    pTVar2 = (*env)->ThrowNew;
    pvVar14 = _DAT_00f62b08;
    if (_DAT_00f62b08 == (void *)0x0) {
      pFVar8 = (*env)->FindClass;
      abStack_68[0x10] = 0x60;
      abStack_68[0x11] = 0x70;
      abStack_68[0x12] = 0x83;
      abStack_68[0x13] = 0x6a;
      abStack_68[0x14] = 0x41;
      abStack_68[0x15] = 0xf0;
      abStack_68[0x16] = 0x30;
      abStack_68[0x17] = 0xb2;
      abStack_68[0x18] = 0xa1;
      abStack_68[0x19] = 0x3e;
      abStack_68[0x1a] = 0x78;
      abStack_68[0x1b] = 0x11;
      abStack_68[0x1c] = 0;
      abStack_68[0] = 0xdc;
      abStack_68[1] = 0x33;
      abStack_68[2] = 0xbf;
      abStack_68[3] = 100;
      abStack_68[4] = 0x72;
      abStack_68[5] = 0x83;
      abStack_68[6] = 0x6a;
      abStack_68[7] = 0xf3;
      abStack_68[8] = 0x66;
      abStack_68[9] = 0x2d;
      abStack_68[10] = 0xec;
      abStack_68[0xb] = 0xa5;
      abStack_68[0xc] = 0xc1;
      abStack_68[0xd] = 0x6c;
      abStack_68[0xe] = 0xbc;
      abStack_68[0xf] = 0x1c;
      if ((&UNK_20095349 < abStack_68) || (abStack_68 + 0x1c < &UNK_2009532f)) {
        abStack_68[0] = 0x6a;
        abStack_68[1] = 0x61;
        abStack_68[2] = 0x76;
        abStack_68[3] = 0x61;
        abStack_68[4] = 0x2f;
        abStack_68[5] = 0x6c;
        abStack_68[6] = 0x61;
        abStack_68[7] = 0x6e;
        abStack_68[8] = 0x67;
        abStack_68[9] = 0x2f;
        abStack_68[10] = 0x43;
        abStack_68[0xb] = 0x6c;
        abStack_68[0xc] = 0x61;
        abStack_68[0xd] = 0x73;
        abStack_68[0xe] = 0x73;
        abStack_68[0xf] = 0x43;
        abStack_68[0x10] = 0x61;
        abStack_68[0x11] = 0x73;
        abStack_68[0x12] = 0x74;
        abStack_68[0x13] = 0x45;
        abStack_68[0x14] = 0x78;
        abStack_68[0x15] = 99;
        abStack_68[0x16] = 0x65;
        abStack_68[0x17] = 0x70;
        lVar19 = 0x18;
      }
      else {
        lVar19 = 0;
      }
      do {
        abStack_68[lVar19] = abStack_68[lVar19] ^ (&UNK_2009532e)[lVar19];
        abStack_68[lVar19 + 1] = abStack_68[lVar19 + 1] ^ (&UNK_2009532f)[lVar19];
        lVar19 = lVar19 + 2;
      } while (lVar19 != 0x1c);
      pvVar14 = (*pFVar8)(env,(char *)abStack_68);
      pvVar14 = (*(*env)->NewGlobalRef)(env,pvVar14);
      pvVar15 = (void *)0x0;
      LOCK();
      bVar20 = _DAT_00f62b08 != (void *)0x0;
      pvVar18 = pvVar14;
      if (bVar20) {
        pvVar15 = _DAT_00f62b08;
        pvVar18 = _DAT_00f62b08;
      }
      _DAT_00f62b08 = pvVar18;
      UNLOCK();
      if (bVar20) {
        (*(*env)->DeleteGlobalRef)(env,pvVar14);
        pvVar14 = pvVar15;
      }
    }
    (*pTVar2)(env,pvVar14,"");
  }
  bVar10 = (*(*env)->ExceptionCheck)(env);
  if (bVar10 == 0) {
    pCVar3 = (*env)->CallIntMethod;
    pvVar14 = (void *)func_0x002679b0(env);
    uVar11 = (*pCVar3)(env,pvVar12,pvVar14);
    bVar10 = (*(*env)->ExceptionCheck)(env);
    if (bVar10 != 0) {
      return (void *)0x0;
    }
    pvVar12 = (*(*env)->GetObjectArrayElement)(env,arg4,1);
    bVar10 = (*(*env)->ExceptionCheck)(env);
    if (bVar10 == 0) {
      pIVar1 = (*env)->IsInstanceOf;
      pvVar14 = (void *)func_0x001b6970(env);
      bVar10 = (*pIVar1)(env,pvVar12,pvVar14);
      if (bVar10 == 0) {
        pTVar2 = (*env)->ThrowNew;
        pvVar15 = (void *)func_0x001b75b0(env);
        (*pTVar2)(env,pvVar15,"");
      }
      bVar10 = (*(*env)->ExceptionCheck)(env);
      if (bVar10 == 0) {
        pCVar4 = (*env)->CallLongMethod;
        pvStack_38 = pvVar14;
        pvVar14 = (void *)func_0x002ca410(env);
        lVar16 = (*pCVar4)(env,pvVar12,pvVar14);
        bVar10 = (*(*env)->ExceptionCheck)(env);
        if (bVar10 != 0) {
          return (void *)0x0;
        }
        pCVar5 = (*env)->CallStaticObjectMethod;
        pvVar12 = (void *)func_0x002da810(env);
        pvVar14 = (void *)func_0x00d509f0(env);
        pvVar12 = (*pCVar5)(env,pvVar12,pvVar14,(ulong)uVar11,lVar16);
        bVar10 = (*(*env)->ExceptionCheck)(env);
        if (bVar10 != 0) {
          return (void *)0x0;
        }
        bVar10 = (*(*env)->ExceptionCheck)(env);
        if (bVar10 == 0) {
          uVar17 = func_0x001ce000(env);
          pCVar5 = (*env)->CallStaticObjectMethod;
          pvVar14 = (void *)func_0x00264d60(env);
          pvVar15 = (void *)func_0x003ca380(env);
          pvStack_40 = pvVar14;
          pvVar14 = (*pCVar5)(env,pvVar14,pvVar15,uVar17,pvVar12);
          bVar10 = (*(*env)->ExceptionCheck)(env);
          if (bVar10 != 0) {
            return (void *)0x0;
          }
          pNVar6 = (*env)->NewObjectArray;
          pvVar15 = (void *)func_0x00311b60(env);
          pvVar15 = (*pNVar6)(env,2,pvVar15,(void *)0x0);
          bVar10 = (*(*env)->ExceptionCheck)(env);
          if (bVar10 != 0) {
            return (void *)0x0;
          }
          pGVar7 = (*env)->GetStaticObjectField;
          pvVar18 = (void *)func_0x003ca4c0(env);
          pvVar13 = (*pGVar7)(env,pvVar13,pvVar18);
          bVar10 = (*(*env)->ExceptionCheck)(env);
          if (bVar10 != 0) {
            return pvVar15;
          }
          (*(*env)->SetObjectArrayElement)(env,pvVar15,0,pvVar13);
          bVar10 = (*(*env)->ExceptionCheck)(env);
          if (bVar10 != 0) {
            return pvVar15;
          }
          pGVar7 = (*env)->GetStaticObjectField;
          pvVar13 = (void *)func_0x003ca560(env);
          pvVar13 = (*pGVar7)(env,pvStack_38,pvVar13);
          bVar10 = (*(*env)->ExceptionCheck)(env);
          if (bVar10 != 0) {
            return pvVar15;
          }
          (*(*env)->SetObjectArrayElement)(env,pvVar15,1,pvVar13);
          bVar10 = (*(*env)->ExceptionCheck)(env);
          if (bVar10 != 0) {
            return pvVar15;
          }
          pCVar5 = (*env)->CallStaticObjectMethod;
          pvVar13 = (void *)func_0x003ca600(env);
          pvVar13 = (*pCVar5)(env,pvStack_40,pvVar13,pvVar14,0,pvVar15);
          bVar10 = (*(*env)->ExceptionCheck)(env);
          if (bVar10 != 0) {
            return pvVar15;
          }
          pCVar9 = (*env)->CallVoidMethod;
          pvVar14 = (void *)func_0x003ca780(env);
          (*pCVar9)(env,arg2,pvVar14,pvVar13);
          bVar10 = (*(*env)->ExceptionCheck)(env);
          if (bVar10 != 0) {
            return pvVar15;
          }
          return pvVar12;
        }
      }
    }
  }
  return (void *)0x0;
}

