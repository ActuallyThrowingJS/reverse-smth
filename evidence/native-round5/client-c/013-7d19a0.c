/* Ghidra pseudocode; not recovered Java. JNI types and captured pool applied. */

/* WARNING: Globals starting with '_' overlap smaller symbols at the same address */
/* WARNING: Unknown calling convention -- yet parameter storage is locked */

void * recovered_native_7d19a0(RecoveredJNINativeInterface_conflict **env,void *self,void *arg1)

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
    pvVar8 = _DAT_00f64610;
    if (_DAT_00f64610 == (void *)0x0) {
      pFVar5 = (*env)->FindClass;
      func_0x00f58ae0(&uStack_f8,&UNK_0014a0a3,0xca);
      if (&UNK_2008effe < auStack_2f && &uStack_f8 < &UNK_2008f0c7) {
        lVar10 = 0;
      }
      else {
        uStack_f8 = uStack_f8 ^ 0x36e7ee5453414cf6;
        uStack_f0 = uStack_f0 ^ 0x1729baad;
        uStack_ec = uStack_ec ^ 0x8a46bfbf;
        uStack_e8 = uStack_e8 ^ 0x5b831324;
        uStack_e4 = uStack_e4 ^ 0xe00fe2bc;
        uStack_e0 = uStack_e0 ^ 0x4a106dff;
        uStack_dc = uStack_dc ^ 0xe834fe80;
        uStack_d8 = uStack_d8 ^ 0x1a001981;
        uStack_d4 = uStack_d4 ^ 0x8ec9d1dc;
        uStack_d0 = uStack_d0 ^ 0x7af31cc6;
        uStack_cc = uStack_cc ^ 0xd74ab659;
        uStack_c8 = uStack_c8 ^ 0xdb6ef9b7;
        uStack_c4 = uStack_c4 ^ 0x9229dab8;
        uStack_c0 = uStack_c0 ^ 0x9968acc9;
        uStack_bc = uStack_bc ^ 0xd17b79df;
        uStack_b8 = uStack_b8 ^ 0x19467c65;
        uStack_b4 = uStack_b4 ^ 0x15511176;
        uStack_b0 = uStack_b0 ^ 0xe7fc7888;
        uStack_ac = uStack_ac ^ 0x99234f8c;
        uStack_a8 = uStack_a8 ^ 0x17065130;
        uStack_a4 = uStack_a4 ^ 0xad082f99;
        uStack_a0 = uStack_a0 ^ 0x574ec394;
        uStack_9c = uStack_9c ^ 0xbc14fb33;
        uStack_98 = uStack_98 ^ 0x5ca36413;
        uStack_94 = uStack_94 ^ 0xfdf8a99f;
        uStack_90 = uStack_90 ^ 0x6c3d76f8;
        uStack_8c = uStack_8c ^ 0xc2cedff2;
        uStack_88 = uStack_88 ^ 0x47bf9688;
        uStack_84 = uStack_84 ^ 0x2b9d3f21;
        uStack_80 = uStack_80 ^ 0xf3b7e3a3;
        uStack_7c = uStack_7c ^ 0xd598d8f5;
        uStack_78 = uStack_78 ^ 0x7e419317;
        uStack_74 = uStack_74 ^ 0x21132f17;
        uStack_70 = uStack_70 ^ 0x2abf79e1;
        uStack_6c = uStack_6c ^ 0xd4e9fa0;
        uStack_68 = uStack_68 ^ 0x71e566d4;
        uStack_64 = uStack_64 ^ 0x1cebf936;
        uStack_60 = uStack_60 ^ 0x4639a36d;
        uStack_5c = uStack_5c ^ 0x9dc186a3;
        uStack_58 = uStack_58 ^ 0x249d25d0;
        uStack_54 = uStack_54 ^ 0x4b685633;
        uStack_50 = uStack_50 ^ 0x8cd48666;
        uStack_4c = uStack_4c ^ 0x53f809df;
        uStack_48 = uStack_48 ^ 0x35ed4bf4;
        uStack_44 = uStack_44 ^ 0x83b688;
        uStack_40 = uStack_40 ^ 0xaa522fdf;
        uStack_3c = uStack_3c ^ 0x58ad82bb;
        uStack_38 = uStack_38 ^ 0xaae6dfcd6e12a4e6;
        lVar10 = 200;
      }
      *(byte *)((long)&uStack_f8 + lVar10) =
           *(byte *)((long)&uStack_f8 + lVar10) ^ (&UNK_2008effe)[lVar10];
      if (&UNK_2008effe < auStack_2f && &uStack_f8 < &UNK_2008f0c7) {
        do {
          pbVar1 = (byte *)((long)&uStack_f8 + lVar10 + 1);
          *pbVar1 = *pbVar1 ^ (&UNK_2008efff)[lVar10];
          pbVar1 = (byte *)((long)&uStack_f8 + lVar10 + 2);
          *pbVar1 = *pbVar1 ^ (&UNK_2008f000)[lVar10];
          lVar10 = lVar10 + 2;
        } while (lVar10 != 200);
      }
      pvVar8 = (*pFVar5)(env,(char *)&uStack_f8);
      pvVar8 = (*(*env)->NewGlobalRef)(env,pvVar8);
      pvVar9 = (void *)0x0;
      LOCK();
      bVar11 = _DAT_00f64610 != (void *)0x0;
      pvVar6 = pvVar8;
      if (bVar11) {
        pvVar9 = _DAT_00f64610;
        pvVar6 = _DAT_00f64610;
      }
      _DAT_00f64610 = pvVar6;
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

