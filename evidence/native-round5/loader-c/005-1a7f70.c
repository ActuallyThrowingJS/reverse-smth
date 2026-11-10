/* Ghidra pseudocode; not recovered Java. JNI types and captured pool applied. */

/* WARNING: Globals starting with '_' overlap smaller symbols at the same address */
/* WARNING: Unknown calling convention -- yet parameter storage is locked */

void * recovered_native_1a7f70(RecoveredJNINativeInterface **env,void *self,void *arg1)

{
  CallObjectMethod *pCVar1;
  GetMethodID *pGVar2;
  byte bVar3;
  void *pvVar4;
  void *pvVar5;
  long lVar6;
  ulong uVar7;
  undefined8 uStack_78;
  undefined8 uStack_70;
  undefined2 uStack_68;
  byte abStack_58 [8];
  undefined4 uStack_50;
  undefined4 uStack_4c;
  undefined4 uStack_48;
  uint uStack_44;
  undefined8 uStack_40;
  undefined8 uStack_38;
  undefined8 uStack_30;
  undefined auStack_28 [8];
  
  pCVar1 = (*env)->CallObjectMethod;
  if (_DAT_004c8d38 == (void *)0x0) {
    pGVar2 = (*env)->GetMethodID;
    uVar7 = (ulong)uStack_70 >> 0x18;
    uStack_78 = 0x646174654d746567;
    uStack_70 = CONCAT53((uint5)uVar7 & 0xffffffff00,0x617461);
    uStack_38 = 0x48d0cb216119d6f0;
    uStack_30 = 0xcbbf6ac6ae8b3994;
    uStack_48 = 0x19095fc;
    uStack_44 = 0x661f9280;
    uStack_40 = 0x201835e10804c778;
    abStack_58[0] = 0x8f;
    abStack_58[1] = 0x56;
    abStack_58[2] = 0x38;
    abStack_58[3] = 0xd6;
    abStack_58[4] = 0xc5;
    abStack_58[5] = 0x96;
    abStack_58[6] = 0xfd;
    abStack_58[7] = 0x4c;
    uStack_50 = 0xdbd79daf;
    uStack_4c = 0xf832a99e;
    auStack_28[0] = 0;
    if ((&UNK_20025e64 < abStack_58) || (auStack_28 < &UNK_20025e36)) {
      uStack_50 = 0x69726261;
      uStack_4c = 0x2f636d63;
      abStack_58[0] = 0x28;
      abStack_58[1] = 0x29;
      abStack_58[2] = 0x4c;
      abStack_58[3] = 0x6e;
      abStack_58[4] = 0x65;
      abStack_58[5] = 0x74;
      abStack_58[6] = 0x2f;
      abStack_58[7] = 0x66;
      uStack_48 = 0x64616f6c;
      uStack_44 = 0x612f7265;
      uStack_40 = 0x646174656d2f6970;
      uStack_38 = 0x4d646f4d2f617461;
      uStack_30 = 0x3b61746164617465;
    }
    else {
      lVar6 = 0;
      do {
        abStack_58[lVar6] = abStack_58[lVar6] ^ (&UNK_20025e35)[lVar6];
        abStack_58[lVar6 + 1] = abStack_58[lVar6 + 1] ^ (&UNK_20025e36)[lVar6];
        abStack_58[lVar6 + 2] = abStack_58[lVar6 + 2] ^ (&UNK_20025e37)[lVar6];
        lVar6 = lVar6 + 3;
      } while (lVar6 != 0x30);
    }
    pvVar5 = (void *)func_0x004c4730(env);
    _DAT_004c8d38 = (*pGVar2)(env,pvVar5,(char *)&uStack_78,(char *)abStack_58);
  }
  pvVar4 = (*pCVar1)(env,arg1,_DAT_004c8d38);
  bVar3 = (*(*env)->ExceptionCheck)(env);
  pvVar5 = (void *)0x0;
  if (bVar3 == 0) {
    pCVar1 = (*env)->CallObjectMethod;
    if (_DAT_004c8d48 == (void *)0x0) {
      pGVar2 = (*env)->GetMethodID;
      uVar7 = (ulong)uStack_70 >> 0x10;
      uStack_78 = 0x6973726556746567;
      uStack_70 = CONCAT62((uint6)uVar7 & 0xffffffffff00,0x6e6f);
      uStack_48 = 0x678f111e;
      uStack_44 = 0x3aefb085;
      uStack_40 = 0x3534a5744761e2bf;
      abStack_58[0] = 0x70;
      abStack_58[1] = 0xf3;
      abStack_58[2] = 0x83;
      abStack_58[3] = 0xa2;
      abStack_58[4] = 0x73;
      abStack_58[5] = 0x6f;
      abStack_58[6] = 0x39;
      abStack_58[7] = 8;
      uStack_50 = 0xb638a0bb;
      uStack_4c = 0xd26be89b;
      uStack_38 = CONCAT44(uStack_38._4_4_,0xb338ee);
      if ((&UNK_20025274 < abStack_58) || ((undefined *)((long)&uStack_38 + 3) < &UNK_20025253)) {
        abStack_58[0] = 0x28;
        abStack_58[1] = 0x29;
        abStack_58[2] = 0x4c;
        abStack_58[3] = 0x6e;
        abStack_58[4] = 0x65;
        abStack_58[5] = 0x74;
        abStack_58[6] = 0x2f;
        abStack_58[7] = 0x66;
        uStack_50 = 0x69726261;
        uStack_4c = 0x2f636d63;
        uStack_48 = 0x64616f6c;
        uStack_44 = 0x612f7265;
        uStack_40 = 0x69737265562f6970;
        uVar7 = 0x20;
      }
      else {
        uVar7 = 0;
      }
      abStack_58[uVar7] = abStack_58[uVar7] ^ (&DAT_20000000)[uVar7 | 0x25252];
      do {
        abStack_58[uVar7 + 1] = abStack_58[uVar7 + 1] ^ (&UNK_20025253)[uVar7];
        abStack_58[uVar7 + 2] = abStack_58[uVar7 + 2] ^ (&UNK_20025254)[uVar7];
        uVar7 = uVar7 + 2;
      } while (uVar7 != 0x22);
      pvVar5 = (void *)func_0x004c4840(env);
      _DAT_004c8d48 = (*pGVar2)(env,pvVar5,(char *)&uStack_78,(char *)abStack_58);
    }
    pvVar4 = (*pCVar1)(env,pvVar4,_DAT_004c8d48);
    bVar3 = (*(*env)->ExceptionCheck)(env);
    pvVar5 = (void *)0x0;
    if (bVar3 == 0) {
      pCVar1 = (*env)->CallObjectMethod;
      if (_DAT_004c8d58 == (void *)0x0) {
        pGVar2 = (*env)->GetMethodID;
        uStack_78 = 0x6e65697246746567;
        uStack_70 = 0x6e69727453796c64;
        uStack_68 = 0x67;
        uStack_44 = uStack_44 & 0xffffff00;
        uStack_50 = 0x676e616c;
        uStack_4c = 0x7274532f;
        abStack_58[0] = 0x28;
        abStack_58[1] = 0x29;
        abStack_58[2] = 0x4c;
        abStack_58[3] = 0x6a;
        abStack_58[4] = 0x61;
        abStack_58[5] = 0x76;
        abStack_58[6] = 0x61;
        abStack_58[7] = 0x2f;
        uStack_48 = 0x3b676e69;
        pvVar5 = (void *)func_0x004c4950(env);
        _DAT_004c8d58 = (*pGVar2)(env,pvVar5,(char *)&uStack_78,(char *)abStack_58);
      }
      pvVar4 = (*pCVar1)(env,pvVar4,_DAT_004c8d58);
      bVar3 = (*(*env)->ExceptionCheck)(env);
      pvVar5 = (void *)0x0;
      if (bVar3 == 0) {
        pvVar5 = pvVar4;
      }
    }
  }
  return pvVar5;
}

