/* Ghidra pseudocode; not recovered Java. JNI types and captured pool applied. */

/* WARNING: Globals starting with '_' overlap smaller symbols at the same address */
/* WARNING: Unknown calling convention -- yet parameter storage is locked */

void * recovered_native_7b0cd0(RecoveredJNINativeInterface_conflict **env,void *self,void *arg1)

{
  CallObjectMethod *pCVar1;
  IsInstanceOf *pIVar2;
  ThrowNew *pTVar3;
  FindClass *pFVar4;
  void *pvVar5;
  byte bVar6;
  void *pvVar7;
  void *obj;
  void *pvVar8;
  long lVar9;
  bool bVar10;
  byte abStack_48 [40];
  
  pCVar1 = (*env)->CallObjectMethod;
  pvVar7 = (void *)func_0x008ae520();
  obj = (*pCVar1)(env,arg1,pvVar7);
  bVar6 = (*(*env)->ExceptionCheck)(env);
  pvVar7 = (void *)0x0;
  if (bVar6 == 0) {
    pIVar2 = (*env)->IsInstanceOf;
    pvVar7 = (void *)func_0x003e5970(env);
    bVar6 = (*pIVar2)(env,obj,pvVar7);
    if (bVar6 == 0) {
      pTVar3 = (*env)->ThrowNew;
      pvVar7 = _DAT_00f62b08;
      if (_DAT_00f62b08 == (void *)0x0) {
        pFVar4 = (*env)->FindClass;
        abStack_48[0x10] = 0x60;
        abStack_48[0x11] = 0x70;
        abStack_48[0x12] = 0x83;
        abStack_48[0x13] = 0x6a;
        abStack_48[0x14] = 0x41;
        abStack_48[0x15] = 0xf0;
        abStack_48[0x16] = 0x30;
        abStack_48[0x17] = 0xb2;
        abStack_48[0x18] = 0xa1;
        abStack_48[0x19] = 0x3e;
        abStack_48[0x1a] = 0x78;
        abStack_48[0x1b] = 0x11;
        abStack_48[0x1c] = 0;
        abStack_48[0] = 0xdc;
        abStack_48[1] = 0x33;
        abStack_48[2] = 0xbf;
        abStack_48[3] = 100;
        abStack_48[4] = 0x72;
        abStack_48[5] = 0x83;
        abStack_48[6] = 0x6a;
        abStack_48[7] = 0xf3;
        abStack_48[8] = 0x66;
        abStack_48[9] = 0x2d;
        abStack_48[10] = 0xec;
        abStack_48[0xb] = 0xa5;
        abStack_48[0xc] = 0xc1;
        abStack_48[0xd] = 0x6c;
        abStack_48[0xe] = 0xbc;
        abStack_48[0xf] = 0x1c;
        if ((&UNK_20095349 < abStack_48) || (abStack_48 + 0x1c < &UNK_2009532f)) {
          abStack_48[0] = 0x6a;
          abStack_48[1] = 0x61;
          abStack_48[2] = 0x76;
          abStack_48[3] = 0x61;
          abStack_48[4] = 0x2f;
          abStack_48[5] = 0x6c;
          abStack_48[6] = 0x61;
          abStack_48[7] = 0x6e;
          abStack_48[8] = 0x67;
          abStack_48[9] = 0x2f;
          abStack_48[10] = 0x43;
          abStack_48[0xb] = 0x6c;
          abStack_48[0xc] = 0x61;
          abStack_48[0xd] = 0x73;
          abStack_48[0xe] = 0x73;
          abStack_48[0xf] = 0x43;
          abStack_48[0x10] = 0x61;
          abStack_48[0x11] = 0x73;
          abStack_48[0x12] = 0x74;
          abStack_48[0x13] = 0x45;
          abStack_48[0x14] = 0x78;
          abStack_48[0x15] = 99;
          abStack_48[0x16] = 0x65;
          abStack_48[0x17] = 0x70;
          lVar9 = 0x18;
        }
        else {
          lVar9 = 0;
        }
        do {
          abStack_48[lVar9] = abStack_48[lVar9] ^ (&UNK_2009532e)[lVar9];
          abStack_48[lVar9 + 1] = abStack_48[lVar9 + 1] ^ (&UNK_2009532f)[lVar9];
          lVar9 = lVar9 + 2;
        } while (lVar9 != 0x1c);
        pvVar7 = (*pFVar4)(env,(char *)abStack_48);
        pvVar7 = (*(*env)->NewGlobalRef)(env,pvVar7);
        pvVar8 = (void *)0x0;
        LOCK();
        bVar10 = _DAT_00f62b08 != (void *)0x0;
        pvVar5 = pvVar7;
        if (bVar10) {
          pvVar8 = _DAT_00f62b08;
          pvVar5 = _DAT_00f62b08;
        }
        _DAT_00f62b08 = pvVar5;
        UNLOCK();
        if (bVar10) {
          (*(*env)->DeleteGlobalRef)(env,pvVar7);
          pvVar7 = pvVar8;
        }
      }
      (*pTVar3)(env,pvVar7,"");
    }
    bVar6 = (*(*env)->ExceptionCheck)(env);
    pvVar7 = (void *)0x0;
    if (bVar6 == 0) {
      pvVar7 = obj;
    }
  }
  return pvVar7;
}

