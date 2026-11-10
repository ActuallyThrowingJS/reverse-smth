/* Ghidra pseudocode; not recovered Java. JNI types and captured pool applied. */

/* WARNING: Globals starting with '_' overlap smaller symbols at the same address */
/* WARNING: Unknown calling convention -- yet parameter storage is locked */

void * recovered_native_34360(RecoveredJNINativeInterface **env,void *self,longlong arg1)

{
  CallStaticObjectMethod *pCVar1;
  CallObjectMethod *pCVar2;
  AllocObject *pAVar3;
  FindClass *pFVar4;
  byte bVar5;
  void *pvVar6;
  void *pvVar7;
  void *pvVar8;
  void *obj;
  void *obj_00;
  void *clazz;
  void *pvVar9;
  long lVar10;
  bool bVar11;
  byte abStack_78 [48];
  void *pvStack_48;
  CallNonvirtualVoidMethod *pCStack_40;
  void *pvStack_38;
  
  pCVar1 = (*env)->CallStaticObjectMethod;
  pvVar7 = _DAT_004c83a0;
  if (_DAT_004c83a0 == (void *)0x0) {
    pFVar4 = (*env)->FindClass;
    abStack_78[0x10] = 7;
    abStack_78[0x11] = 0x6d;
    abStack_78[0x12] = 0x51;
    abStack_78[0x13] = 0xba;
    abStack_78[0x14] = 0x8e;
    abStack_78[0x15] = 0x7c;
    abStack_78[0x16] = 0xde;
    abStack_78[0x17] = 0x3d;
    abStack_78[0x18] = 6;
    abStack_78[0x19] = 0x71;
    abStack_78[0x1a] = 0xe3;
    abStack_78[0x1b] = 0x49;
    abStack_78[0] = 0xd4;
    abStack_78[1] = 1;
    abStack_78[2] = 0xcf;
    abStack_78[3] = 0x67;
    abStack_78[4] = 3;
    abStack_78[5] = 0x8d;
    abStack_78[6] = 0x50;
    abStack_78[7] = 0x1d;
    abStack_78[8] = 0xec;
    abStack_78[9] = 0x12;
    abStack_78[10] = 0xda;
    abStack_78[0xb] = 0xc2;
    abStack_78[0xc] = 0x12;
    abStack_78[0xd] = 0x69;
    abStack_78[0xe] = 0xbd;
    abStack_78[0xf] = 0x4c;
    abStack_78[0x1c] = 0x6a;
    abStack_78[0x1d] = 0x45;
    abStack_78[0x1e] = 0x9f;
    abStack_78[0x1f] = 0x79;
    abStack_78[0x20] = 0x9f;
    abStack_78[0x21] = 0x92;
    abStack_78[0x22] = 0x8d;
    abStack_78[0x23] = 0x2a;
    abStack_78[0x24] = 0;
    if ((&UNK_20028aaf < abStack_78) || (abStack_78 + 0x24 < &UNK_20028a8d)) {
      abStack_78[0] = 0x6e;
      abStack_78[1] = 0x65;
      abStack_78[2] = 0x74;
      abStack_78[3] = 0x2f;
      abStack_78[4] = 0x66;
      abStack_78[5] = 0x61;
      abStack_78[6] = 0x62;
      abStack_78[7] = 0x72;
      abStack_78[8] = 0x69;
      abStack_78[9] = 99;
      abStack_78[10] = 0x6d;
      abStack_78[0xb] = 99;
      abStack_78[0xc] = 0x2f;
      abStack_78[0xd] = 0x6c;
      abStack_78[0xe] = 0x6f;
      abStack_78[0xf] = 0x61;
      abStack_78[0x10] = 100;
      abStack_78[0x11] = 0x65;
      abStack_78[0x12] = 0x72;
      abStack_78[0x13] = 0x2f;
      abStack_78[0x14] = 0x61;
      abStack_78[0x15] = 0x70;
      abStack_78[0x16] = 0x69;
      abStack_78[0x17] = 0x2f;
      abStack_78[0x18] = 0x46;
      abStack_78[0x19] = 0x61;
      abStack_78[0x1a] = 0x62;
      abStack_78[0x1b] = 0x72;
      abStack_78[0x1c] = 0x69;
      abStack_78[0x1d] = 99;
      abStack_78[0x1e] = 0x4c;
      abStack_78[0x1f] = 0x6f;
      lVar10 = 0x20;
    }
    else {
      lVar10 = 0;
    }
    do {
      abStack_78[lVar10] = abStack_78[lVar10] ^ (&UNK_20028a8c)[lVar10];
      abStack_78[lVar10 + 1] = abStack_78[lVar10 + 1] ^ (&UNK_20028a8d)[lVar10];
      lVar10 = lVar10 + 2;
    } while (lVar10 != 0x24);
    pvVar7 = (*pFVar4)(env,(char *)abStack_78);
    pvVar7 = (*(*env)->NewGlobalRef)(env,pvVar7);
    pvVar6 = (void *)0x0;
    LOCK();
    bVar11 = _DAT_004c83a0 != (void *)0x0;
    pvVar8 = pvVar7;
    if (bVar11) {
      pvVar6 = _DAT_004c83a0;
      pvVar8 = _DAT_004c83a0;
    }
    _DAT_004c83a0 = pvVar8;
    UNLOCK();
    if (bVar11) {
      (*(*env)->DeleteGlobalRef)(env,pvVar7);
      pvVar7 = pvVar6;
    }
  }
  pvVar6 = (void *)func_0x00134800(env);
  pvVar6 = (*pCVar1)(env,pvVar7,pvVar6);
  bVar5 = (*(*env)->ExceptionCheck)(env);
  pvVar7 = (void *)0x0;
  if (bVar5 == 0) {
    pCVar2 = (*env)->CallObjectMethod;
    pvVar7 = (void *)func_0x00134940(env);
    pvVar6 = (*pCVar2)(env,pvVar6,pvVar7);
    bVar5 = (*(*env)->ExceptionCheck)(env);
    pvVar7 = (void *)0x0;
    if (bVar5 == 0) {
      pCVar2 = (*env)->CallObjectMethod;
      pvVar7 = (void *)func_0x00134a50(env);
      pvVar6 = (*pCVar2)(env,pvVar6,pvVar7);
      bVar5 = (*(*env)->ExceptionCheck)(env);
      pvVar7 = (void *)0x0;
      if (bVar5 == 0) {
        pAVar3 = (*env)->AllocObject;
        pvVar8 = (void *)func_0x00134b00(env);
        obj = (*pAVar3)(env,pvVar8);
        bVar5 = (*(*env)->ExceptionCheck)(env);
        if (bVar5 == 0) {
          obj_00 = (*(*env)->AllocObject)(env,pvVar8);
          bVar5 = (*(*env)->ExceptionCheck)(env);
          pvVar7 = obj;
          if (((bVar5 == 0) && (bVar5 = (*(*env)->ExceptionCheck)(env), pvVar7 = obj_00, bVar5 == 0)
              ) && (bVar5 = (*(*env)->ExceptionCheck)(env), bVar5 == 0)) {
            pCVar1 = (*env)->CallStaticObjectMethod;
            clazz = (void *)func_0x00134010(env);
            pvStack_38 = (void *)func_0x00134190(env);
            pvVar9 = (*pCVar1)(env,clazz,pvStack_38,0xe1306995,0xe1307a27,arg1 & 0xffffffff);
            bVar5 = (*(*env)->ExceptionCheck)(env);
            if (bVar5 == 0) {
              pCStack_40 = (*env)->CallNonvirtualVoidMethod;
              pvStack_48 = (void *)func_0x00134ba0(env);
              (*pCStack_40)(env,obj_00,pvVar8,pvStack_48,pvVar6,pvVar9);
              bVar5 = (*(*env)->ExceptionCheck)(env);
              if (((bVar5 == 0) && (bVar5 = (*(*env)->ExceptionCheck)(env), bVar5 == 0)) &&
                 (bVar5 = (*(*env)->ExceptionCheck)(env), bVar5 == 0)) {
                pvVar6 = (*(*env)->CallStaticObjectMethod)
                                   (env,clazz,pvStack_38,0xe130697d,0xe1304e2c,arg1 & 0xffffffff);
                bVar5 = (*(*env)->ExceptionCheck)(env);
                if (bVar5 == 0) {
                  (*(*env)->CallNonvirtualVoidMethod)(env,obj,pvVar8,pvStack_48,obj_00,pvVar6);
                  bVar5 = (*(*env)->ExceptionCheck)(env);
                  pvVar7 = obj;
                  if (bVar5 != 0) {
                    pvVar7 = obj_00;
                  }
                }
              }
            }
          }
        }
        else {
          pvVar7 = (void *)0x0;
        }
      }
    }
  }
  return pvVar7;
}

