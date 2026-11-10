/* Ghidra pseudocode; not recovered Java. JNI types and captured pool applied. */

/* WARNING: Globals starting with '_' overlap smaller symbols at the same address */
/* WARNING: Unknown calling convention -- yet parameter storage is locked */

void * recovered_native_2f2d00(RecoveredJNINativeInterface **env,void *self,longlong arg1)

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
  pvVar15 = _DAT_004c93a8;
  if (_DAT_004c93a8 == (void *)0x0) {
    pFVar7 = (*env)->FindClass;
    func_0x004c53b0(&uStack_f8,&UNK_0011d342,0xc5);
    if ((&UNK_2002516d < &uStack_f8) || (auStack_34 < &UNK_200250ab)) {
      uStack_f8 = uStack_f8 ^ 0x2d9e588b5c9cba4a;
      uStack_f0 = uStack_f0 ^ 0x653c1e4a;
      uStack_ec = uStack_ec ^ 0xa4d755a5;
      uStack_e8 = uStack_e8 ^ 0xab98e378;
      uStack_e4 = uStack_e4 ^ 0xab2e4853;
      uStack_e0 = uStack_e0 ^ 0x86b12d34;
      uStack_dc = uStack_dc ^ 0x9c9f941b;
      uStack_d8 = uStack_d8 ^ 0x329627a7;
      uStack_d4 = uStack_d4 ^ 0xad8ca616;
      uStack_d0 = uStack_d0 ^ 0x6f16064e;
      uStack_cc = uStack_cc ^ 0x7bf9e011;
      uStack_c8 = uStack_c8 ^ 0x801a5e2d;
      uStack_c4 = uStack_c4 ^ 0xbe0853e9;
      uStack_c0 = uStack_c0 ^ 0x86e6df7;
      uStack_bc = uStack_bc ^ 0x9630fd5b;
      uStack_b8 = uStack_b8 ^ 0xb2ba74ed;
      uStack_b4 = uStack_b4 ^ 0x7a046118;
      uStack_b0 = uStack_b0 ^ 0xb5069646;
      uStack_ac = uStack_ac ^ 0x9e962174;
      uStack_a8 = uStack_a8 ^ 0x7a026408;
      uStack_a4 = uStack_a4 ^ 0x70a6fe57;
      uStack_a0 = uStack_a0 ^ 0x87693f75;
      uStack_9c = uStack_9c ^ 0x41d2292f;
      uStack_98 = uStack_98 ^ 0xf47c6117;
      uStack_94 = uStack_94 ^ 0xbf54d90c;
      uStack_90 = uStack_90 ^ 0xc53a3fd;
      uStack_8c = uStack_8c ^ 0x636b25c0;
      uStack_88 = uStack_88 ^ 0xc91e32a1;
      uStack_84 = uStack_84 ^ 0xedbfe105;
      uStack_80 = uStack_80 ^ 0xa112eedf;
      uStack_7c = uStack_7c ^ 0xeb7842b6;
      uStack_78 = uStack_78 ^ 0x30cef0d8;
      uStack_74 = uStack_74 ^ 0x1d3e0a82;
      uStack_70 = uStack_70 ^ 0x3fa3e5cb;
      uStack_6c = uStack_6c ^ 0xd2606e7b;
      uStack_68 = uStack_68 ^ 0x4063487;
      uStack_64 = uStack_64 ^ 0xc8f6e2ea;
      uStack_60 = uStack_60 ^ 0xfd0ff900;
      uStack_5c = uStack_5c ^ 0x21e785cc;
      uStack_58 = uStack_58 ^ 0x17f00f6c;
      uStack_54 = uStack_54 ^ 0x2d0e104e;
      uStack_50 = uStack_50 ^ 0xbbea1257;
      uStack_4c = uStack_4c ^ 0xe3d5d357;
      uStack_48 = uStack_48 ^ 0x4a9f09f6;
      uStack_44 = uStack_44 ^ 0x9f2912ec;
      uStack_40 = uStack_40 ^ 0x40033f97;
      uStack_3c = uStack_3c ^ 0x4f2df1c0;
      lVar16 = 0xc0;
    }
    else {
      lVar16 = 0;
    }
    do {
      *(byte *)((long)&uStack_f8 + lVar16) =
           *(byte *)((long)&uStack_f8 + lVar16) ^ (&UNK_200250aa)[lVar16];
      pbVar1 = (byte *)((long)&uStack_f8 + lVar16 + 1);
      *pbVar1 = *pbVar1 ^ (&UNK_200250ab)[lVar16];
      lVar16 = lVar16 + 2;
    } while (lVar16 != 0xc4);
    pvVar15 = (*pFVar7)(env,(char *)&uStack_f8);
    pvVar15 = (*(*env)->NewGlobalRef)(env,pvVar15);
    pvVar10 = (void *)0x0;
    LOCK();
    bVar17 = _DAT_004c93a8 != (void *)0x0;
    pvVar14 = pvVar15;
    if (bVar17) {
      pvVar10 = _DAT_004c93a8;
      pvVar14 = _DAT_004c93a8;
    }
    _DAT_004c93a8 = pvVar14;
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
    if (_DAT_004c93b0 == (void *)0x0) {
      pGVar6 = (*env)->GetMethodID;
      uVar8 = uStack_f8 >> 0x30;
      uStack_f8 = CONCAT26((ushort)uVar8 & 0xff00,0x3e74696e693c);
      uStack_129 = 0;
      cStack_12c = '(';
      uStack_12b = 0x29;
      uStack_12a = 0x56;
      pvVar14 = (void *)func_0x003f3670(env);
      _DAT_004c93b0 = (*pGVar6)(env,pvVar14,(char *)&uStack_f8,&cStack_12c);
    }
    (*pCVar3)(env,pvVar10,pvVar15,_DAT_004c93b0);
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
                        (*pCStack_118)(env,pvStack_128,pvStack_120,0xcfb224b,0xf304b4c7,
                                       arg1 & 0xffffffff);
          bVar9 = (*(*env)->ExceptionCheck)(env);
          if (((bVar9 == 0) && (bVar9 = (*(*env)->ExceptionCheck)(env), bVar9 == 0)) &&
             (bVar9 = (*(*env)->ExceptionCheck)(env), bVar9 == 0)) {
            pvStack_110 = (*(*env)->CallStaticObjectMethod)
                                    (env,pvStack_128,pvStack_120,0xcfb2253,0xf304b526,
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
                                            (env,pvStack_128,pvStack_120,0xcfb2241,0xf30488a5,
                                             arg1 & 0xffffffff);
                    bVar9 = (*(*env)->ExceptionCheck)(env);
                    if (((bVar9 == 0) && (bVar9 = (*(*env)->ExceptionCheck)(env), bVar9 == 0)) &&
                       (bVar9 = (*(*env)->ExceptionCheck)(env), bVar9 == 0)) {
                      pvStack_110 = (*(*env)->CallStaticObjectMethod)
                                              (env,pvStack_128,pvStack_120,0xcfb2251,0xcfb6981,
                                               arg1 & 0xffffffff);
                      bVar9 = (*(*env)->ExceptionCheck)(env);
                      if (((bVar9 == 0) && (bVar9 = (*(*env)->ExceptionCheck)(env), bVar9 == 0)) &&
                         (bVar9 = (*(*env)->ExceptionCheck)(env), bVar9 == 0)) {
                        pCStack_108 = (CallNonvirtualVoidMethod *)
                                      (*(*env)->CallStaticObjectMethod)
                                                (env,pvStack_128,pvStack_120,0xcfb2242,0xcfb7c56,
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
                                                        (env,pvStack_128,pvStack_120,0xcfb2245,
                                                         0xcfb7ae5,arg1 & 0xffffffff);
                                bVar9 = (*(*env)->ExceptionCheck)(env);
                                if (((bVar9 == 0) &&
                                    (bVar9 = (*(*env)->ExceptionCheck)(env), bVar9 == 0)) &&
                                   (bVar9 = (*(*env)->ExceptionCheck)(env), bVar9 == 0)) {
                                  pvStack_110 = (*(*env)->CallStaticObjectMethod)
                                                          (env,pvStack_128,pvStack_120,0xcfb225a,
                                                           0xf304ecd3,arg1 & 0xffffffff);
                                  bVar9 = (*(*env)->ExceptionCheck)(env);
                                  if (((bVar9 == 0) &&
                                      (bVar9 = (*(*env)->ExceptionCheck)(env), bVar9 == 0)) &&
                                     (bVar9 = (*(*env)->ExceptionCheck)(env), bVar9 == 0)) {
                                    pvVar13 = (*(*env)->CallStaticObjectMethod)
                                                        (env,pvStack_128,pvStack_120,0xcfb2246,
                                                         0xcfb03c6,arg1 & 0xffffffff);
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

