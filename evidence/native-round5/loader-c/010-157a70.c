/* Ghidra pseudocode; not recovered Java. JNI types and captured pool applied. */

/* WARNING: Removing unreachable block (ram,0x00257acc) */
/* WARNING: Globals starting with '_' overlap smaller symbols at the same address */
/* WARNING: Unknown calling convention -- yet parameter storage is locked */

void recovered_native_157a70(RecoveredJNINativeInterface **env,void *self,longlong arg1,int arg2)

{
  byte *pbVar1;
  GetStaticLongField *pGVar2;
  IsInstanceOf *pIVar3;
  RecoveredJNINativeInterface *pRVar4;
  CallStaticVoidMethod *pCVar5;
  GetStaticFieldID *pGVar6;
  FindClass *pFVar7;
  uint uVar8;
  void *pvVar9;
  byte bVar10;
  longlong lVar11;
  void *pvVar12;
  void *pvVar13;
  void *pvVar14;
  ulong uVar15;
  long lVar16;
  bool bVar17;
  undefined4 uStack_b0;
  undefined1 uStack_ac;
  undefined8 uStack_a8;
  undefined4 uStack_a0;
  undefined4 uStack_9c;
  undefined4 uStack_98;
  undefined4 uStack_94;
  undefined4 uStack_90;
  undefined4 uStack_8c;
  undefined8 uStack_88;
  undefined8 uStack_80;
  undefined8 uStack_78;
  undefined8 uStack_70;
  undefined8 uStack_68;
  undefined4 uStack_60;
  undefined2 uStack_5c;
  undefined2 uStack_5a;
  undefined4 uStack_58;
  undefined2 uStack_54;
  undefined2 uStack_52;
  undefined4 uStack_50;
  undefined4 uStack_4c;
  undefined7 uStack_48;
  undefined1 uStack_41;
  undefined1 auStack_40 [8];
  long lStack_38;
  
  lStack_38 = (long)arg2;
  pGVar2 = (*env)->GetStaticLongField;
  pvVar13 = _DAT_004c8390;
  if (_DAT_004c8390 == (void *)0x0) {
    pFVar7 = (*env)->FindClass;
    uStack_48 = 0x51483eab399009;
    uStack_41 = 0x9d;
    auStack_40._0_7_ = 0x2b52f740f46;
    uStack_58 = 0xb7746260;
    uStack_54 = 0xc0ba;
    uStack_52 = 0x4188;
    uStack_50 = 0xd7103f8e;
    uStack_4c = 0x606c8414;
    uStack_68 = 0x60024329e4299077;
    uStack_60 = 0x9b334b21;
    uStack_5c = 0x427e;
    uStack_5a = 0x858;
    uStack_78 = 0x7007d6f9c6b13423;
    uStack_70 = 0x726fbfea4901197c;
    uStack_88 = 0xce859bf3c7d4f796;
    uStack_80 = 0xb4b05582268393d7;
    uStack_98 = 0xff441585;
    uStack_94 = 0x6b31bac2;
    uStack_90 = 0xb8d0761;
    uStack_8c = 0x3def2168;
    uStack_a8 = 0xb41b208f8f2caead;
    uStack_a0 = 0xf75faf69;
    uStack_9c = 0x71865747;
    if ((&UNK_20025595 < &uStack_a8) || (auStack_40 + 6 < &UNK_20025529)) {
      uStack_a8 = 0x696c6f702f6c6f6c;
      uStack_a0 = 0x6378656e;
      uStack_9c = 0x6e65696c;
      uStack_98 = 0x6f6c2f74;
      uStack_94 = 0x72656461;
      uStack_90 = 0x6c6c6c2f;
      uStack_8c = 0x6c496c49;
      uStack_88 = 0x496c496c496c6c6c;
      uStack_80 = 0x6c49496c496c6c49;
      uStack_78 = 0x6c6c49496c494949;
      uStack_70 = 0x6c49496c6c6c4949;
      uStack_68 = 0x6c6c6c6c6c496c6c;
      uStack_60 = 0x6c6c6c49;
      uStack_5c = 0x6c49;
      uStack_5a = 0x6c6c;
      uStack_58 = 0x6c6c6c6c;
      uStack_54 = 0x6c6c;
      uStack_52 = 0x6c49;
      uStack_50 = 0x496c496c;
      uStack_4c = 0x49496c49;
      uStack_48 = 0x496c496c6c4949;
      uStack_41 = 0x6c;
      lVar16 = 0x68;
    }
    else {
      lVar16 = 0;
    }
    do {
      *(byte *)((long)&uStack_a8 + lVar16) =
           *(byte *)((long)&uStack_a8 + lVar16) ^ (&UNK_20025528)[lVar16];
      pbVar1 = (byte *)((long)&uStack_a8 + lVar16 + 1);
      *pbVar1 = *pbVar1 ^ (&UNK_20025529)[lVar16];
      lVar16 = lVar16 + 2;
    } while (lVar16 != 0x6e);
    pvVar13 = (*pFVar7)(env,(char *)&uStack_a8);
    pvVar13 = (*(*env)->NewGlobalRef)(env,pvVar13);
    pvVar12 = (void *)0x0;
    LOCK();
    bVar17 = _DAT_004c8390 != (void *)0x0;
    pvVar14 = pvVar13;
    if (bVar17) {
      pvVar12 = _DAT_004c8390;
      pvVar14 = _DAT_004c8390;
    }
    _DAT_004c8390 = pvVar14;
    UNLOCK();
    if (bVar17) {
      (*(*env)->DeleteGlobalRef)(env,pvVar13);
      pvVar13 = pvVar12;
    }
  }
  if (pvRam00000000004c8ad0 == (void *)0x0) {
    pGVar6 = (*env)->GetStaticFieldID;
    uStack_68 = 0xb79d6026f8798b66;
    uStack_60 = 0x540577fd;
    uStack_5c = 0xfd17;
    uStack_78 = 0x118915e6b94ab51f;
    uStack_70 = 0x17b12a1dd25fb7b;
    uStack_88 = 0x597785905ff9e477;
    uStack_80 = 0x887cc4aabcd6a4b9;
    uStack_98 = 0xf724cd09;
    uStack_94 = 0x43d9497b;
    uStack_90 = 0xd08c13dc;
    uStack_8c = 0x113eae6c;
    uStack_a8 = 0x73a1302f9e00f34;
    uStack_a0 = 0xc0eb5cc1;
    uStack_9c = 0xfed021c;
    uStack_5a = 0xad0c;
    uStack_58 = 0xcf72ef38;
    uStack_54 = 0x5a;
    if ((&UNK_20025655 < &uStack_a8) || ((undefined *)((long)&uStack_54 + 1) < &UNK_20025602)) {
      uStack_a8 = 0x496c496c496c6c49;
      uStack_a0 = 0x496c496c;
      uStack_9c = 0x49494949;
      uStack_98 = 0x49496c6c;
      uStack_94 = 0x49496c6c;
      uStack_90 = 0x49494949;
      uStack_8c = 0x6c6c496c;
      uStack_88 = 0x496c496c6c6c496c;
      uStack_80 = 0x49496c6c6c6c4949;
      uStack_78 = 0x6c6c4949496c6c49;
      uStack_70 = 0x496c4949496c496c;
      uStack_68 = 0x494949496c6c4949;
      uStack_60 = 0x49496c6c;
      uStack_5c = 0x4949;
      uStack_5a = 0x4949;
      uVar15 = 0x50;
    }
    else {
      uVar15 = 0;
    }
    *(byte *)((long)&uStack_a8 + uVar15) =
         *(byte *)((long)&uStack_a8 + uVar15) ^ (&DAT_20000000)[uVar15 | 0x25601];
    do {
      pbVar1 = (byte *)((long)&uStack_a8 + uVar15 + 1);
      *pbVar1 = *pbVar1 ^ (&UNK_20025602)[uVar15];
      pbVar1 = (byte *)((long)&uStack_a8 + uVar15 + 2);
      *pbVar1 = *pbVar1 ^ (&UNK_20025603)[uVar15];
      uVar15 = uVar15 + 2;
    } while (uVar15 != 0x54);
    uVar8 = (uint)uStack_b0 >> 8;
    uStack_b0 = CONCAT31((uint3)uVar8 & 0xffff00,0x4a);
    pvVar12 = (void *)func_0x00134010(env);
    pvRam00000000004c8ad0 = (*pGVar6)(env,pvVar12,(char *)&uStack_a8,(char *)&uStack_b0);
  }
  lVar11 = (*pGVar2)(env,pvVar13,pvRam00000000004c8ad0);
  bVar10 = (*(*env)->ExceptionCheck)(env);
  if (bVar10 == 0) {
    lVar16 = lVar11 * lStack_38;
    pRVar4 = *env;
    pCVar5 = pRVar4->CallStaticVoidMethod;
    pvVar13 = (void *)func_0x0016a180(env);
    if (pvRam00000000004c8ad8 == (void *)0x0) {
      uVar15 = (ulong)uStack_a8 >> 0x28;
      uStack_a8 = CONCAT35((uint3)uVar15 & 0xffff00,0x7065656c73);
      uStack_ac = 0;
      uStack_b0 = 0x56294a28;
      pvRam00000000004c8ad8 =
           (*pRVar4->GetStaticMethodID)(env,pvVar13,(char *)&uStack_a8,(char *)&uStack_b0);
    }
    (*pCVar5)(env,pvVar13,pvRam00000000004c8ad8,lVar16);
    bVar10 = (*(*env)->ExceptionCheck)(env);
    if (bVar10 != 0) {
      pvVar12 = (*(*env)->ExceptionOccurred)(env);
      pIVar3 = (*env)->IsInstanceOf;
      pvVar13 = pvRam00000000004c8688;
      if (pvRam00000000004c8688 == (void *)0x0) {
        pFVar7 = (*env)->FindClass;
        uStack_98 = 0x2abae96f;
        uStack_94 = 0x187968b2;
        uStack_90 = 0xded61856;
        uStack_8c = CONCAT13(uStack_8c._3_1_,0x4d32);
        uStack_a8 = 0x6336be8ea78a34ab;
        uStack_a0 = 0x4996d374;
        uStack_9c = 0xa50ee1f;
        if ((&UNK_20027bc9 < &uStack_a8) || ((undefined *)((long)&uStack_8c + 2) < &UNK_20027bad)) {
          uStack_a8 = 0x6e616c2f6176616a;
          uStack_a0 = 0x6e492f67;
          uStack_9c = 0x72726574;
          uStack_98 = 0x65747075;
          uStack_94 = 0x63784564;
          lVar16 = 0x18;
        }
        else {
          lVar16 = 0;
        }
        do {
          *(byte *)((long)&uStack_a8 + lVar16) =
               *(byte *)((long)&uStack_a8 + lVar16) ^ (&UNK_20027bac)[lVar16];
          pbVar1 = (byte *)((long)&uStack_a8 + lVar16 + 1);
          *pbVar1 = *pbVar1 ^ (&UNK_20027bad)[lVar16];
          lVar16 = lVar16 + 2;
        } while (lVar16 != 0x1e);
        pvVar13 = (*pFVar7)(env,(char *)&uStack_a8);
        pvVar13 = (*(*env)->NewGlobalRef)(env,pvVar13);
        pvVar14 = (void *)0x0;
        LOCK();
        bVar17 = pvRam00000000004c8688 != (void *)0x0;
        pvVar9 = pvVar13;
        if (bVar17) {
          pvVar14 = pvRam00000000004c8688;
          pvVar9 = pvRam00000000004c8688;
        }
        pvRam00000000004c8688 = pvVar9;
        UNLOCK();
        if (bVar17) {
          (*(*env)->DeleteGlobalRef)(env,pvVar13);
          pvVar13 = pvVar14;
        }
      }
      bVar10 = (*pIVar3)(env,pvVar12,pvVar13);
      if (bVar10 != 0) {
        (*(*env)->ExceptionClear)(env);
      }
    }
  }
  else {
    pvVar12 = (*(*env)->ExceptionOccurred)(env);
    pIVar3 = (*env)->IsInstanceOf;
    pvVar13 = pvRam00000000004c8688;
    if (pvRam00000000004c8688 == (void *)0x0) {
      pFVar7 = (*env)->FindClass;
      uStack_98 = 0x2abae96f;
      uStack_94 = 0x187968b2;
      uStack_90 = 0xded61856;
      uStack_8c = CONCAT13(uStack_8c._3_1_,0x4d32);
      uStack_a8 = 0x6336be8ea78a34ab;
      uStack_a0 = 0x4996d374;
      uStack_9c = 0xa50ee1f;
      if ((&UNK_20027bc9 < &uStack_a8) || ((undefined *)((long)&uStack_8c + 2) < &UNK_20027bad)) {
        uStack_a8 = 0x6e616c2f6176616a;
        uStack_a0 = 0x6e492f67;
        uStack_9c = 0x72726574;
        uStack_98 = 0x65747075;
        uStack_94 = 0x63784564;
        lVar16 = 0x18;
      }
      else {
        lVar16 = 0;
      }
      do {
        *(byte *)((long)&uStack_a8 + lVar16) =
             *(byte *)((long)&uStack_a8 + lVar16) ^ (&UNK_20027bac)[lVar16];
        pbVar1 = (byte *)((long)&uStack_a8 + lVar16 + 1);
        *pbVar1 = *pbVar1 ^ (&UNK_20027bad)[lVar16];
        lVar16 = lVar16 + 2;
      } while (lVar16 != 0x1e);
      pvVar13 = (*pFVar7)(env,(char *)&uStack_a8);
      pvVar13 = (*(*env)->NewGlobalRef)(env,pvVar13);
      pvVar14 = (void *)0x0;
      LOCK();
      bVar17 = pvRam00000000004c8688 != (void *)0x0;
      pvVar9 = pvVar13;
      if (bVar17) {
        pvVar14 = pvRam00000000004c8688;
        pvVar9 = pvRam00000000004c8688;
      }
      pvRam00000000004c8688 = pvVar9;
      UNLOCK();
      if (bVar17) {
        (*(*env)->DeleteGlobalRef)(env,pvVar13);
        pvVar13 = pvVar14;
      }
    }
    bVar10 = (*pIVar3)(env,pvVar12,pvVar13);
    if (bVar10 != 0) {
      (*(*env)->ExceptionClear)(env);
    }
  }
  return;
}

