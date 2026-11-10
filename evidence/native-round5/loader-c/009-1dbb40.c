/* Ghidra pseudocode; not recovered Java. JNI types and captured pool applied. */

/* WARNING: Globals starting with '_' overlap smaller symbols at the same address */
/* WARNING: Unknown calling convention -- yet parameter storage is locked */

void * recovered_native_1dbb40(RecoveredJNINativeInterface **env,void *self,void *arg1)

{
  byte *pbVar1;
  AllocObject *pAVar2;
  RecoveredJNINativeInterface *pRVar3;
  CallNonvirtualVoidMethod *pCVar4;
  FindClass *pFVar5;
  void *pvVar6;
  byte bVar7;
  void *pvVar8;
  void *pvVar9;
  long lVar10;
  void *pvVar11;
  void *pvVar12;
  GetMethodID *pGVar13;
  bool bVar14;
  undefined4 uStack_138;
  undefined1 uStack_134;
  undefined1 uStack_133;
  undefined1 uStack_132;
  GetMethodID *pGStack_130;
  undefined4 uStack_128;
  uint uStack_124;
  uint uStack_120;
  uint uStack_11c;
  uint uStack_118;
  uint uStack_114;
  uint uStack_110;
  uint uStack_10c;
  uint uStack_108;
  uint uStack_104;
  uint uStack_100;
  uint uStack_fc;
  uint uStack_f8;
  uint uStack_f4;
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
  undefined auStack_64 [12];
  char acStack_58 [32];
  FindClass *pFStack_38;
  
  pAVar2 = (*env)->AllocObject;
  pvVar9 = _DAT_004c8e70;
  if (_DAT_004c8e70 == (void *)0x0) {
    pFVar5 = (*env)->FindClass;
    func_0x004c53b0(&uStack_128,&UNK_0011cf60,0xc5);
    if ((&UNK_20026031 < &uStack_128) || (auStack_64 < &UNK_20025f6f)) {
      uStack_128 = uStack_128 ^ 0xc8bb369;
      uStack_124 = uStack_124 ^ 0x6af222;
      uStack_120 = uStack_120 ^ 0xd5bbb239;
      uStack_11c = uStack_11c ^ 0xe8df0b26;
      uStack_118 = uStack_118 ^ 0x66add247;
      uStack_114 = uStack_114 ^ 0xec3128a4;
      uStack_110 = uStack_110 ^ 0xa62b766e;
      uStack_10c = uStack_10c ^ 0x56530388;
      uStack_108 = uStack_108 ^ 0xdf399439;
      uStack_104 = uStack_104 ^ 0xda73a02a;
      uStack_100 = uStack_100 ^ 0xefe27d7d;
      uStack_fc = uStack_fc ^ 0xb38c75a5;
      uStack_f8 = uStack_f8 ^ 0xf3517f72;
      uStack_f4 = uStack_f4 ^ 0x7f15553f;
      uStack_f0 = uStack_f0 ^ 0x844b292c;
      uStack_ec = uStack_ec ^ 0x5cc69688;
      uStack_e8 = uStack_e8 ^ 0x1b9c6fb5;
      uStack_e4 = uStack_e4 ^ 0x3252936f;
      uStack_e0 = uStack_e0 ^ 0x9df3fee;
      uStack_dc = uStack_dc ^ 0x82dbd8fb;
      uStack_d8 = uStack_d8 ^ 0xb6f091a9;
      uStack_d4 = uStack_d4 ^ 0x1d0459aa;
      uStack_d0 = uStack_d0 ^ 0x2ae1a359;
      uStack_cc = uStack_cc ^ 0x1bee7ec8;
      uStack_c8 = uStack_c8 ^ 0xb55d35f2;
      uStack_c4 = uStack_c4 ^ 0x9280ef61;
      uStack_c0 = uStack_c0 ^ 0x22ad5cf1;
      uStack_bc = uStack_bc ^ 0xe7120523;
      uStack_b8 = uStack_b8 ^ 0xb186765d;
      uStack_b4 = uStack_b4 ^ 0x630fe2cf;
      uStack_b0 = uStack_b0 ^ 0xc252ee92;
      uStack_ac = uStack_ac ^ 0x58fcb022;
      uStack_a8 = uStack_a8 ^ 0xd1ccbf9d;
      uStack_a4 = uStack_a4 ^ 0xbea5de9f;
      uStack_a0 = uStack_a0 ^ 0x42409d22;
      uStack_9c = uStack_9c ^ 0x50c71019;
      uStack_98 = uStack_98 ^ 0xcf2e5cd0;
      uStack_94 = uStack_94 ^ 0x6454fc4c;
      uStack_90 = uStack_90 ^ 0x9a727c93;
      uStack_8c = uStack_8c ^ 0x5bed9ab8;
      uStack_88 = uStack_88 ^ 0xe20578cb;
      uStack_84 = uStack_84 ^ 0x637e1ad0;
      uStack_80 = uStack_80 ^ 0x16e72bb5;
      uStack_7c = uStack_7c ^ 0x49beb330;
      uStack_78 = uStack_78 ^ 0xbdbaa5c7;
      uStack_74 = uStack_74 ^ 0xd5f4ae59;
      uStack_70 = uStack_70 ^ 0x6adf3ec0;
      uStack_6c = uStack_6c ^ 0xcf0b7173;
      lVar10 = 0xc0;
    }
    else {
      lVar10 = 0;
    }
    do {
      *(byte *)((long)&uStack_128 + lVar10) =
           *(byte *)((long)&uStack_128 + lVar10) ^ (&UNK_20025f6e)[lVar10];
      pbVar1 = (byte *)((long)&uStack_128 + lVar10 + 1);
      *pbVar1 = *pbVar1 ^ (&UNK_20025f6f)[lVar10];
      lVar10 = lVar10 + 2;
    } while (lVar10 != 0xc4);
    pvVar9 = (*pFVar5)(env,(char *)&uStack_128);
    pvVar9 = (*(*env)->NewGlobalRef)(env,pvVar9);
    pvVar8 = (void *)0x0;
    LOCK();
    bVar14 = _DAT_004c8e70 != (void *)0x0;
    pvVar11 = pvVar9;
    if (bVar14) {
      pvVar8 = _DAT_004c8e70;
      pvVar11 = _DAT_004c8e70;
    }
    _DAT_004c8e70 = pvVar11;
    UNLOCK();
    if (bVar14) {
      (*(*env)->DeleteGlobalRef)(env,pvVar9);
      pvVar9 = pvVar8;
    }
  }
  pvVar8 = (*pAVar2)(env,pvVar9);
  bVar7 = (*(*env)->ExceptionCheck)(env);
  if (bVar7 == 0) {
    pRVar3 = *env;
    pCVar4 = pRVar3->CallNonvirtualVoidMethod;
    if (_DAT_004c8e78 == (void *)0x0) {
      uStack_132 = 0;
      uStack_138 = 0x696e693c;
      uStack_134 = 0x74;
      uStack_133 = 0x3e;
      builtin_strncpy(acStack_58,"(Ljava/net/URL;)V",0x12);
      pvVar11 = _DAT_004c8e70;
      pGVar13 = pRVar3->GetMethodID;
      if (_DAT_004c8e70 == (void *)0x0) {
        pFStack_38 = pRVar3->FindClass;
        pGStack_130 = pRVar3->GetMethodID;
        func_0x004c53b0(&uStack_128,&UNK_0011cf60,0xc5);
        if ((&UNK_20026031 < &uStack_128) || (auStack_64 < &UNK_20025f6f)) {
          uStack_128 = uStack_128 ^ 0xc8bb369;
          uStack_124 = uStack_124 ^ 0x6af222;
          uStack_120 = uStack_120 ^ 0xd5bbb239;
          uStack_11c = uStack_11c ^ 0xe8df0b26;
          uStack_118 = uStack_118 ^ 0x66add247;
          uStack_114 = uStack_114 ^ 0xec3128a4;
          uStack_110 = uStack_110 ^ 0xa62b766e;
          uStack_10c = uStack_10c ^ 0x56530388;
          uStack_108 = uStack_108 ^ 0xdf399439;
          uStack_104 = uStack_104 ^ 0xda73a02a;
          uStack_100 = uStack_100 ^ 0xefe27d7d;
          uStack_fc = uStack_fc ^ 0xb38c75a5;
          uStack_f8 = uStack_f8 ^ 0xf3517f72;
          uStack_f4 = uStack_f4 ^ 0x7f15553f;
          uStack_f0 = uStack_f0 ^ 0x844b292c;
          uStack_ec = uStack_ec ^ 0x5cc69688;
          uStack_e8 = uStack_e8 ^ 0x1b9c6fb5;
          uStack_e4 = uStack_e4 ^ 0x3252936f;
          uStack_e0 = uStack_e0 ^ 0x9df3fee;
          uStack_dc = uStack_dc ^ 0x82dbd8fb;
          uStack_d8 = uStack_d8 ^ 0xb6f091a9;
          uStack_d4 = uStack_d4 ^ 0x1d0459aa;
          uStack_d0 = uStack_d0 ^ 0x2ae1a359;
          uStack_cc = uStack_cc ^ 0x1bee7ec8;
          uStack_c8 = uStack_c8 ^ 0xb55d35f2;
          uStack_c4 = uStack_c4 ^ 0x9280ef61;
          uStack_c0 = uStack_c0 ^ 0x22ad5cf1;
          uStack_bc = uStack_bc ^ 0xe7120523;
          uStack_b8 = uStack_b8 ^ 0xb186765d;
          uStack_b4 = uStack_b4 ^ 0x630fe2cf;
          uStack_b0 = uStack_b0 ^ 0xc252ee92;
          uStack_ac = uStack_ac ^ 0x58fcb022;
          uStack_a8 = uStack_a8 ^ 0xd1ccbf9d;
          uStack_a4 = uStack_a4 ^ 0xbea5de9f;
          uStack_a0 = uStack_a0 ^ 0x42409d22;
          uStack_9c = uStack_9c ^ 0x50c71019;
          uStack_98 = uStack_98 ^ 0xcf2e5cd0;
          uStack_94 = uStack_94 ^ 0x6454fc4c;
          uStack_90 = uStack_90 ^ 0x9a727c93;
          uStack_8c = uStack_8c ^ 0x5bed9ab8;
          uStack_88 = uStack_88 ^ 0xe20578cb;
          uStack_84 = uStack_84 ^ 0x637e1ad0;
          uStack_80 = uStack_80 ^ 0x16e72bb5;
          uStack_7c = uStack_7c ^ 0x49beb330;
          uStack_78 = uStack_78 ^ 0xbdbaa5c7;
          uStack_74 = uStack_74 ^ 0xd5f4ae59;
          uStack_70 = uStack_70 ^ 0x6adf3ec0;
          uStack_6c = uStack_6c ^ 0xcf0b7173;
          lVar10 = 0xc0;
        }
        else {
          lVar10 = 0;
        }
        do {
          *(byte *)((long)&uStack_128 + lVar10) =
               *(byte *)((long)&uStack_128 + lVar10) ^ (&UNK_20025f6e)[lVar10];
          pbVar1 = (byte *)((long)&uStack_128 + lVar10 + 1);
          *pbVar1 = *pbVar1 ^ (&UNK_20025f6f)[lVar10];
          lVar10 = lVar10 + 2;
        } while (lVar10 != 0xc4);
        pvVar11 = (*pFStack_38)(env,(char *)&uStack_128);
        pvVar11 = (*(*env)->NewGlobalRef)(env,pvVar11);
        pvVar12 = (void *)0x0;
        LOCK();
        bVar14 = _DAT_004c8e70 != (void *)0x0;
        pvVar6 = pvVar11;
        if (bVar14) {
          pvVar12 = _DAT_004c8e70;
          pvVar6 = _DAT_004c8e70;
        }
        _DAT_004c8e70 = pvVar6;
        UNLOCK();
        pGVar13 = pGStack_130;
        if (bVar14) {
          (*(*env)->DeleteGlobalRef)(env,pvVar11);
          pvVar11 = pvVar12;
          pGVar13 = pGStack_130;
        }
      }
      _DAT_004c8e78 = (*pGVar13)(env,pvVar11,(char *)&uStack_138,acStack_58);
    }
    (*pCVar4)(env,pvVar8,pvVar9,_DAT_004c8e78,arg1);
    (*(*env)->ExceptionCheck)(env);
  }
  else {
    pvVar8 = (void *)0x0;
  }
  return pvVar8;
}

