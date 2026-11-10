/* Ghidra pseudocode; not recovered Java. JNI types and captured pool applied. */

/* WARNING: Globals starting with '_' overlap smaller symbols at the same address */
/* WARNING: Unknown calling convention -- yet parameter storage is locked */

void * recovered_native_2e4ab0(RecoveredJNINativeInterface **env,void *self,longlong arg1)

{
  byte *pbVar1;
  AllocObject *pAVar2;
  CallNonvirtualVoidMethod *pCVar3;
  NewObjectArray *pNVar4;
  CallVoidMethod *pCVar5;
  GetMethodID *pGVar6;
  FindClass *pFVar7;
  ulong uVar8;
  byte bVar9;
  void *pvVar10;
  void *pvVar11;
  void *pvVar12;
  void *pvVar13;
  void *pvVar14;
  void *pvVar15;
  long lVar16;
  bool bVar17;
  char cStack_12c;
  undefined1 uStack_12b;
  undefined1 uStack_12a;
  undefined1 uStack_129;
  void *pvStack_128;
  void *pvStack_120;
  CallStaticObjectMethod *pCStack_118;
  void *pvStack_110;
  CallNonvirtualVoidMethod *pCStack_108;
  void *pvStack_100;
  undefined8 uStack_f8;
  uint uStack_f0;
  uint uStack_ec;
  uint uStack_e8;
  uint uStack_e4;
  undefined4 uStack_e0;
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
  undefined auStack_34 [4];
  
  pAVar2 = (*env)->AllocObject;
  pvVar15 = _DAT_004c9380;
  if (_DAT_004c9380 == (void *)0x0) {
    pFVar7 = (*env)->FindClass;
    func_0x004c53b0(&uStack_f8,&UNK_00123fce,0xc5);
    if ((&UNK_20027db4 < &uStack_f8) || (auStack_34 < &UNK_20027cf2)) {
      uStack_f8 = uStack_f8 ^ 0x351e6cd44e62c9e8;
      uStack_f0 = uStack_f0 ^ 0xc654483b;
      uStack_ec = uStack_ec ^ 0xd2d00eef;
      uStack_e8 = uStack_e8 ^ 0x78e0c0d;
      uStack_e4 = uStack_e4 ^ 0xc618f6cf;
      uStack_e0 = uStack_e0 ^ 0x2fa0a3db;
      uStack_dc = uStack_dc ^ 0xb78e4d51;
      uStack_d8 = uStack_d8 ^ 0x99b6bc3e;
      uStack_d4 = uStack_d4 ^ 0xd75e4364;
      uStack_d0 = uStack_d0 ^ 0x3957c09e;
      uStack_cc = uStack_cc ^ 0x585c8c20;
      uStack_c8 = uStack_c8 ^ 0xe846f485;
      uStack_c4 = uStack_c4 ^ 0x2f432784;
      uStack_c0 = uStack_c0 ^ 0xea4670c9;
      uStack_bc = uStack_bc ^ 0xbfd74c82;
      uStack_b8 = uStack_b8 ^ 0x2d071c83;
      uStack_b4 = uStack_b4 ^ 0x876fe1a3;
      uStack_b0 = uStack_b0 ^ 0x8168000f;
      uStack_ac = uStack_ac ^ 0x2ba78a39;
      uStack_a8 = uStack_a8 ^ 0x55d7bcb2;
      uStack_a4 = uStack_a4 ^ 0x71ca1b45;
      uStack_a0 = uStack_a0 ^ 0xa8b93af1;
      uStack_9c = uStack_9c ^ 0xacb625dc;
      uStack_98 = uStack_98 ^ 0x364d69fb;
      uStack_94 = uStack_94 ^ 0x89f5fc0;
      uStack_90 = uStack_90 ^ 0xdf3013;
      uStack_8c = uStack_8c ^ 0x2bb22bd3;
      uStack_88 = uStack_88 ^ 0xe700e8a3;
      uStack_84 = uStack_84 ^ 0xe8a97b6f;
      uStack_80 = uStack_80 ^ 0xd3a49664;
      uStack_7c = uStack_7c ^ 0x83e59b51;
      uStack_78 = uStack_78 ^ 0x27801eb4;
      uStack_74 = uStack_74 ^ 0x3d0b9563;
      uStack_70 = uStack_70 ^ 0xed4a46c9;
      uStack_6c = uStack_6c ^ 0xc6148a7c;
      uStack_68 = uStack_68 ^ 0x1aed6ad4;
      uStack_64 = uStack_64 ^ 0xe47fc48;
      uStack_60 = uStack_60 ^ 0x22a87861;
      uStack_5c = uStack_5c ^ 0x2d6dba62;
      uStack_58 = uStack_58 ^ 0xd5909f5c;
      uStack_54 = uStack_54 ^ 0x6d8a7f14;
      uStack_50 = uStack_50 ^ 0x11d89e5c;
      uStack_4c = uStack_4c ^ 0x5d0c658a;
      uStack_48 = uStack_48 ^ 0xc9a59e2a;
      uStack_44 = uStack_44 ^ 0x8fe94283;
      uStack_40 = uStack_40 ^ 0x3c0808b9;
      uStack_3c = uStack_3c ^ 0x89664b67;
      lVar16 = 0xc0;
    }
    else {
      lVar16 = 0;
    }
    do {
      *(byte *)((long)&uStack_f8 + lVar16) =
           *(byte *)((long)&uStack_f8 + lVar16) ^ (&UNK_20027cf1)[lVar16];
      pbVar1 = (byte *)((long)&uStack_f8 + lVar16 + 1);
      *pbVar1 = *pbVar1 ^ (&UNK_20027cf2)[lVar16];
      lVar16 = lVar16 + 2;
    } while (lVar16 != 0xc4);
    pvVar15 = (*pFVar7)(env,(char *)&uStack_f8);
    pvVar15 = (*(*env)->NewGlobalRef)(env,pvVar15);
    pvVar10 = (void *)0x0;
    LOCK();
    bVar17 = _DAT_004c9380 != (void *)0x0;
    pvVar14 = pvVar15;
    if (bVar17) {
      pvVar10 = _DAT_004c9380;
      pvVar14 = _DAT_004c9380;
    }
    _DAT_004c9380 = pvVar14;
    UNLOCK();
    if (bVar17) {
      (*(*env)->DeleteGlobalRef)(env,pvVar15);
      pvVar15 = pvVar10;
    }
  }
  pvVar10 = (*pAVar2)(env,pvVar15);
  bVar9 = (*(*env)->ExceptionCheck)(env);
  if (bVar9 == 0) {
    pCVar3 = (*env)->CallNonvirtualVoidMethod;
    if (_DAT_004c9388 == (void *)0x0) {
      pGVar6 = (*env)->GetMethodID;
      uVar8 = uStack_f8 >> 0x30;
      uStack_f8 = CONCAT26((ushort)uVar8 & 0xff00,0x3e74696e693c);
      uStack_129 = 0;
      cStack_12c = '(';
      uStack_12b = 0x29;
      uStack_12a = 0x56;
      pvVar14 = (void *)func_0x003e5420(env);
      _DAT_004c9388 = (*pGVar6)(env,pvVar14,(char *)&uStack_f8,&cStack_12c);
    }
    (*pCVar3)(env,pvVar10,pvVar15,_DAT_004c9388);
    bVar9 = (*(*env)->ExceptionCheck)(env);
    pvVar15 = pvVar10;
    if (bVar9 == 0) {
      pNVar4 = (*env)->NewObjectArray;
      pvVar14 = _DAT_004c9390;
      if (_DAT_004c9390 == (void *)0x0) {
        pFVar7 = (*env)->FindClass;
        uStack_e8 = 0x1c2dbf6f;
        uStack_e4 = 0xa8ac6dd1;
        uStack_e0 = 0x4d0ff8;
        uStack_f8 = 0xc49a9d128c9ab0e8;
        uStack_f0 = 0xe7898673;
        uStack_ec = 0x59b34fc7;
        if ((&UNK_20025f2d < &uStack_f8) || ((undefined *)((long)&uStack_e0 + 3) < &UNK_20025f14)) {
          uStack_f8 = 0x6e616c2f6176616a;
          uStack_f0 = 0x74532f67;
          uStack_ec = 0x546b6361;
          uStack_e8 = 0x65636172;
          uStack_e4 = 0x6d656c45;
          lVar16 = 0x18;
        }
        else {
          lVar16 = 0;
        }
        *(byte *)((long)&uStack_f8 + lVar16) =
             *(byte *)((long)&uStack_f8 + lVar16) ^ (&UNK_20025f13)[lVar16];
        do {
          pbVar1 = (byte *)((long)&uStack_f8 + lVar16 + 1);
          *pbVar1 = *pbVar1 ^ (&UNK_20025f14)[lVar16];
          pbVar1 = (byte *)((long)&uStack_f8 + lVar16 + 2);
          *pbVar1 = *pbVar1 ^ (&UNK_20025f15)[lVar16];
          lVar16 = lVar16 + 2;
        } while (lVar16 != 0x1a);
        pvVar14 = (*pFVar7)(env,(char *)&uStack_f8);
        pvVar14 = (*(*env)->NewGlobalRef)(env,pvVar14);
        pvVar11 = (void *)0x0;
        LOCK();
        bVar17 = _DAT_004c9390 != (void *)0x0;
        pvVar12 = pvVar14;
        if (bVar17) {
          pvVar11 = _DAT_004c9390;
          pvVar12 = _DAT_004c9390;
        }
        _DAT_004c9390 = pvVar12;
        UNLOCK();
        if (bVar17) {
          (*(*env)->DeleteGlobalRef)(env,pvVar14);
          pvVar14 = pvVar11;
        }
      }
      pvVar11 = (*pNVar4)(env,3,pvVar14,(void *)0x0);
      bVar9 = (*(*env)->ExceptionCheck)(env);
      if (bVar9 == 0) {
        pvVar12 = (*(*env)->AllocObject)(env,pvVar14);
        bVar9 = (*(*env)->ExceptionCheck)(env);
        pvVar15 = pvVar11;
        if (((bVar9 == 0) && (bVar9 = (*(*env)->ExceptionCheck)(env), pvVar15 = pvVar12, bVar9 == 0)
            ) && (bVar9 = (*(*env)->ExceptionCheck)(env), bVar9 == 0)) {
          pCStack_118 = (*env)->CallStaticObjectMethod;
          pvStack_128 = (void *)func_0x003cacd0(env);
          pvStack_120 = (void *)func_0x003cae50(env);
          pCStack_118 = (CallStaticObjectMethod *)
                        (*pCStack_118)(env,pvStack_128,pvStack_120,0xa8a77b64,0x5758d180,
                                       arg1 & 0xffffffff);
          bVar9 = (*(*env)->ExceptionCheck)(env);
          if (((bVar9 == 0) && (bVar9 = (*(*env)->ExceptionCheck)(env), bVar9 == 0)) &&
             (bVar9 = (*(*env)->ExceptionCheck)(env), bVar9 == 0)) {
            pvStack_110 = (*(*env)->CallStaticObjectMethod)
                                    (env,pvStack_128,pvStack_120,0xa8a77b7c,0x5758ebdf,
                                     arg1 & 0xffffffff);
            bVar9 = (*(*env)->ExceptionCheck)(env);
            if (bVar9 == 0) {
              pCStack_108 = (*env)->CallNonvirtualVoidMethod;
              pvStack_100 = (void *)func_0x003e56f0(env);
              (*pCStack_108)(env,pvVar12,pvVar14,pvStack_100,pCStack_118,pvStack_110,0,
                             0xfffffffffffffffe);
              bVar9 = (*(*env)->ExceptionCheck)(env);
              if (bVar9 == 0) {
                (*(*env)->SetObjectArrayElement)(env,pvVar11,0,pvVar12);
                bVar9 = (*(*env)->ExceptionCheck)(env);
                if (bVar9 == 0) {
                  pvVar12 = (*(*env)->AllocObject)(env,pvVar14);
                  bVar9 = (*(*env)->ExceptionCheck)(env);
                  pvVar15 = pvVar11;
                  if (((bVar9 == 0) &&
                      (bVar9 = (*(*env)->ExceptionCheck)(env), pvVar15 = pvVar12, bVar9 == 0)) &&
                     (bVar9 = (*(*env)->ExceptionCheck)(env), bVar9 == 0)) {
                    pCStack_118 = (CallStaticObjectMethod *)
                                  (*(*env)->CallStaticObjectMethod)
                                            (env,pvStack_128,pvStack_120,0xa8a77b64,0x5758d180,
                                             arg1 & 0xffffffff);
                    bVar9 = (*(*env)->ExceptionCheck)(env);
                    if (((bVar9 == 0) && (bVar9 = (*(*env)->ExceptionCheck)(env), bVar9 == 0)) &&
                       (bVar9 = (*(*env)->ExceptionCheck)(env), bVar9 == 0)) {
                      pvStack_110 = (*(*env)->CallStaticObjectMethod)
                                              (env,pvStack_128,pvStack_120,0xa8a77b75,0xa8a74eb0,
                                               arg1 & 0xffffffff);
                      bVar9 = (*(*env)->ExceptionCheck)(env);
                      if (((bVar9 == 0) && (bVar9 = (*(*env)->ExceptionCheck)(env), bVar9 == 0)) &&
                         (bVar9 = (*(*env)->ExceptionCheck)(env), bVar9 == 0)) {
                        pCStack_108 = (CallNonvirtualVoidMethod *)
                                      (*(*env)->CallStaticObjectMethod)
                                                (env,pvStack_128,pvStack_120,0xa8a77b63,0xa8a75ae3,
                                                 arg1 & 0xffffffff);
                        bVar9 = (*(*env)->ExceptionCheck)(env);
                        if (bVar9 == 0) {
                          (*(*env)->CallNonvirtualVoidMethod)
                                    (env,pvVar12,pvVar14,pvStack_100,pCStack_118,pvStack_110,
                                     pCStack_108,0x4a);
                          bVar9 = (*(*env)->ExceptionCheck)(env);
                          if (bVar9 == 0) {
                            (*(*env)->SetObjectArrayElement)(env,pvVar11,1,pvVar12);
                            bVar9 = (*(*env)->ExceptionCheck)(env);
                            if (bVar9 == 0) {
                              pvVar12 = (*(*env)->AllocObject)(env,pvVar14);
                              bVar9 = (*(*env)->ExceptionCheck)(env);
                              pvVar15 = pvVar11;
                              if (((bVar9 == 0) &&
                                  (bVar9 = (*(*env)->ExceptionCheck)(env), pvVar15 = pvVar12,
                                  bVar9 == 0)) &&
                                 (bVar9 = (*(*env)->ExceptionCheck)(env), bVar9 == 0)) {
                                pCStack_118 = (CallStaticObjectMethod *)
                                              (*(*env)->CallStaticObjectMethod)
                                                        (env,pvStack_128,pvStack_120,0xa8a77b6b,
                                                         0x57588365,arg1 & 0xffffffff);
                                bVar9 = (*(*env)->ExceptionCheck)(env);
                                if (((bVar9 == 0) &&
                                    (bVar9 = (*(*env)->ExceptionCheck)(env), bVar9 == 0)) &&
                                   (bVar9 = (*(*env)->ExceptionCheck)(env), bVar9 == 0)) {
                                  pvStack_110 = (*(*env)->CallStaticObjectMethod)
                                                          (env,pvStack_128,pvStack_120,0xa8a77b68,
                                                           0x575889e7,arg1 & 0xffffffff);
                                  bVar9 = (*(*env)->ExceptionCheck)(env);
                                  if (((bVar9 == 0) &&
                                      (bVar9 = (*(*env)->ExceptionCheck)(env), bVar9 == 0)) &&
                                     (bVar9 = (*(*env)->ExceptionCheck)(env), bVar9 == 0)) {
                                    pvVar13 = (*(*env)->CallStaticObjectMethod)
                                                        (env,pvStack_128,pvStack_120,0xa8a77b63,
                                                         0xa8a75ae3,arg1 & 0xffffffff);
                                    bVar9 = (*(*env)->ExceptionCheck)(env);
                                    if (bVar9 == 0) {
                                      (*(*env)->CallNonvirtualVoidMethod)
                                                (env,pvVar12,pvVar14,pvStack_100,pCStack_118,
                                                 pvStack_110,pvVar13,0xaa);
                                      bVar9 = (*(*env)->ExceptionCheck)(env);
                                      if (bVar9 == 0) {
                                        (*(*env)->SetObjectArrayElement)(env,pvVar11,2,pvVar12);
                                        bVar9 = (*(*env)->ExceptionCheck)(env);
                                        if (bVar9 == 0) {
                                          pCVar5 = (*env)->CallVoidMethod;
                                          pvVar14 = (void *)func_0x003e5840(env);
                                          (*pCVar5)(env,pvVar10,pvVar14,pvVar11);
                                          bVar9 = (*(*env)->ExceptionCheck)(env);
                                          if (bVar9 == 0) {
                                            pvVar15 = pvVar10;
                                          }
                                        }
                                      }
                                    }
                                  }
                                }
                              }
                            }
                          }
                        }
                      }
                    }
                  }
                }
              }
            }
          }
        }
      }
    }
  }
  else {
    pvVar15 = (void *)0x0;
  }
  return pvVar15;
}

