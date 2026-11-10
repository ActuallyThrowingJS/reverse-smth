/* Ghidra pseudocode; not recovered Java. JNI types and captured pool applied. */

/* WARNING: Globals starting with '_' overlap smaller symbols at the same address */
/* WARNING: Unknown calling convention -- yet parameter storage is locked */

void * recovered_native_7ae1d0(RecoveredJNINativeInterface_conflict **env,void *self,void *arg1)

{
  byte *pbVar1;
  CallObjectMethod *pCVar2;
  IsInstanceOf *pIVar3;
  ThrowNew *pTVar4;
  FindClass *pFVar5;
  void *pvVar6;
  byte bVar7;
  void *pvVar8;
  void *obj;
  void *pvVar9;
  long lVar10;
  bool bVar11;
  undefined8 uStack_f8;
  uint uStack_f0;
  uint uStack_ec;
  uint uStack_e8;
  uint uStack_e4;
  uint uStack_e0;
  uint uStack_dc;
  uint uStack_d8;
  uint uStack_d4;
  uint uStack_d0;
  uint uStack_cc;
  uint uStack_c8;
  uint uStack_c4;
  uint uStack_c0;
  uint uStack_bc;
  uint uStack_b8;
  uint uStack_b4;
  uint uStack_b0;
  uint uStack_ac;
  uint uStack_a8;
  uint uStack_a4;
  uint uStack_a0;
  uint uStack_9c;
  uint uStack_98;
  uint uStack_94;
  uint uStack_90;
  uint uStack_8c;
  uint uStack_88;
  uint uStack_84;
  uint uStack_80;
  uint uStack_7c;
  uint uStack_78;
  uint uStack_74;
  uint uStack_70;
  uint uStack_6c;
  uint uStack_68;
  uint uStack_64;
  uint uStack_60;
  uint uStack_5c;
  uint uStack_58;
  uint uStack_54;
  uint uStack_50;
  uint uStack_4c;
  uint uStack_48;
  uint uStack_44;
  uint uStack_40;
  uint uStack_3c;
  ulong uStack_38;
  undefined auStack_2f [7];
  
  pCVar2 = (*env)->CallObjectMethod;
  pvVar8 = (void *)func_0x008ae520();
  obj = (*pCVar2)(env,arg1,pvVar8);
  bVar7 = (*(*env)->ExceptionCheck)(env);
  pvVar8 = (void *)0x0;
  if (bVar7 == 0) {
    pIVar3 = (*env)->IsInstanceOf;
    pvVar8 = _DAT_00f64598;
    if (_DAT_00f64598 == (void *)0x0) {
      pFVar5 = (*env)->FindClass;
      func_0x00f58ae0(&uStack_f8,&UNK_001790d4,0xca);
      if (&UNK_2008af7a < auStack_2f && &uStack_f8 < &UNK_2008b043) {
        lVar10 = 0;
      }
      else {
        uStack_f8 = uStack_f8 ^ 0xf2a12e9a9a60c8f6;
        uStack_f0 = uStack_f0 ^ 0x885819b;
        uStack_ec = uStack_ec ^ 0xf1b0a1fc;
        uStack_e8 = uStack_e8 ^ 0xda8c6116;
        uStack_e4 = uStack_e4 ^ 0x83560f0e;
        uStack_e0 = uStack_e0 ^ 0xbb102e9c;
        uStack_dc = uStack_dc ^ 0x6d172758;
        uStack_d8 = uStack_d8 ^ 0x20989ad8;
        uStack_d4 = uStack_d4 ^ 0xd0e85ac5;
        uStack_d0 = uStack_d0 ^ 0x9d8c68e;
        uStack_cc = uStack_cc ^ 0xb0fbfe62;
        uStack_c8 = uStack_c8 ^ 0xcdef9a0;
        uStack_c4 = uStack_c4 ^ 0x73ee1b3b;
        uStack_c0 = uStack_c0 ^ 0xdc383cb7;
        uStack_bc = uStack_bc ^ 0x2f0988f4;
        uStack_b8 = uStack_b8 ^ 0x5584b173;
        uStack_b4 = uStack_b4 ^ 0xe463e886;
        uStack_b0 = uStack_b0 ^ 0x64d33920;
        uStack_ac = uStack_ac ^ 0x8ae32e00;
        uStack_a8 = uStack_a8 ^ 0xf5ff4c25;
        uStack_a4 = uStack_a4 ^ 0x6f698af7;
        uStack_a0 = uStack_a0 ^ 0xf0ec18db;
        uStack_9c = uStack_9c ^ 0x4cd5fb4;
        uStack_98 = uStack_98 ^ 0x507f8567;
        uStack_94 = uStack_94 ^ 0x4c0bc4c2;
        uStack_90 = uStack_90 ^ 0x2b24853d;
        uStack_8c = uStack_8c ^ 0x3dbdc701;
        uStack_88 = uStack_88 ^ 0xd0983e8e;
        uStack_84 = uStack_84 ^ 0x5c738d62;
        uStack_80 = uStack_80 ^ 0x753d5fbc;
        uStack_7c = uStack_7c ^ 0x8dd89745;
        uStack_78 = uStack_78 ^ 0xe213760d;
        uStack_74 = uStack_74 ^ 0x943ffa16;
        uStack_70 = uStack_70 ^ 0x609f453c;
        uStack_6c = uStack_6c ^ 0xc9a3363a;
        uStack_68 = uStack_68 ^ 0xd3c6f122;
        uStack_64 = uStack_64 ^ 0x5aef6524;
        uStack_60 = uStack_60 ^ 0x9a2d8d0f;
        uStack_5c = uStack_5c ^ 0x43660e62;
        uStack_58 = uStack_58 ^ 0x552e2371;
        uStack_54 = uStack_54 ^ 0xc81676d9;
        uStack_50 = uStack_50 ^ 0x4e2ad640;
        uStack_4c = uStack_4c ^ 0xba4ceb5a;
        uStack_48 = uStack_48 ^ 0xc0acb30e;
        uStack_44 = uStack_44 ^ 0x4a28f60c;
        uStack_40 = uStack_40 ^ 0x7d6d66c5;
        uStack_3c = uStack_3c ^ 0x4450ea3a;
        uStack_38 = uStack_38 ^ 0x442a7c07bbc170bd;
        lVar10 = 200;
      }
      *(byte *)((long)&uStack_f8 + lVar10) =
           *(byte *)((long)&uStack_f8 + lVar10) ^ (&UNK_2008af7a)[lVar10];
      if (&UNK_2008af7a < auStack_2f && &uStack_f8 < &UNK_2008b043) {
        do {
          pbVar1 = (byte *)((long)&uStack_f8 + lVar10 + 1);
          *pbVar1 = *pbVar1 ^ (&UNK_2008af7b)[lVar10];
          pbVar1 = (byte *)((long)&uStack_f8 + lVar10 + 2);
          *pbVar1 = *pbVar1 ^ (&UNK_2008af7c)[lVar10];
          lVar10 = lVar10 + 2;
        } while (lVar10 != 200);
      }
      pvVar8 = (*pFVar5)(env,(char *)&uStack_f8);
      pvVar8 = (*(*env)->NewGlobalRef)(env,pvVar8);
      pvVar9 = (void *)0x0;
      LOCK();
      bVar11 = _DAT_00f64598 != (void *)0x0;
      pvVar6 = pvVar8;
      if (bVar11) {
        pvVar9 = _DAT_00f64598;
        pvVar6 = _DAT_00f64598;
      }
      _DAT_00f64598 = pvVar6;
      UNLOCK();
      if (bVar11) {
        (*(*env)->DeleteGlobalRef)(env,pvVar8);
        pvVar8 = pvVar9;
      }
    }
    bVar7 = (*pIVar3)(env,obj,pvVar8);
    if (bVar7 == 0) {
      pTVar4 = (*env)->ThrowNew;
      pvVar8 = _DAT_00f62b08;
      if (_DAT_00f62b08 == (void *)0x0) {
        pFVar5 = (*env)->FindClass;
        uStack_e8 = 0x6a837060;
        uStack_e4 = 0xb230f041;
        uStack_e0 = 0x11783ea1;
        uStack_dc = uStack_dc & 0xffffff00;
        uStack_f8 = 0xf36a837264bf33dc;
        uStack_f0 = 0xa5ec2d66;
        uStack_ec = 0x1cbc6cc1;
        if ((&UNK_20095349 < &uStack_f8) || (&uStack_dc < &UNK_2009532f)) {
          uStack_f8 = 0x6e616c2f6176616a;
          uStack_f0 = 0x6c432f67;
          uStack_ec = 0x43737361;
          uStack_e8 = 0x45747361;
          uStack_e4 = 0x70656378;
          lVar10 = 0x18;
        }
        else {
          lVar10 = 0;
        }
        do {
          *(byte *)((long)&uStack_f8 + lVar10) =
               *(byte *)((long)&uStack_f8 + lVar10) ^ (&UNK_2009532e)[lVar10];
          pbVar1 = (byte *)((long)&uStack_f8 + lVar10 + 1);
          *pbVar1 = *pbVar1 ^ (&UNK_2009532f)[lVar10];
          lVar10 = lVar10 + 2;
        } while (lVar10 != 0x1c);
        pvVar8 = (*pFVar5)(env,(char *)&uStack_f8);
        pvVar8 = (*(*env)->NewGlobalRef)(env,pvVar8);
        pvVar9 = (void *)0x0;
        LOCK();
        bVar11 = _DAT_00f62b08 != (void *)0x0;
        pvVar6 = pvVar8;
        if (bVar11) {
          pvVar9 = _DAT_00f62b08;
          pvVar6 = _DAT_00f62b08;
        }
        _DAT_00f62b08 = pvVar6;
        UNLOCK();
        if (bVar11) {
          (*(*env)->DeleteGlobalRef)(env,pvVar8);
          pvVar8 = pvVar9;
        }
      }
      (*pTVar4)(env,pvVar8,"");
    }
    bVar7 = (*(*env)->ExceptionCheck)(env);
    pvVar8 = (void *)0x0;
    if (bVar7 == 0) {
      pvVar8 = obj;
    }
  }
  return pvVar8;
}

