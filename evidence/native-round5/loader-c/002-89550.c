/* Ghidra pseudocode; not recovered Java. JNI types and captured pool applied. */

/* WARNING: Globals starting with '_' overlap smaller symbols at the same address */
/* WARNING: Unknown calling convention -- yet parameter storage is locked */

void * recovered_native_89550(RecoveredJNINativeInterface **env,void *self)

{
  CallStaticObjectMethod *pCVar1;
  CallObjectMethod *pCVar2;
  GetMethodID *pGVar3;
  byte bVar4;
  void *pvVar5;
  void *pvVar6;
  void *obj;
  long lVar7;
  byte abStack_68 [32];
  char acStack_48 [32];
  
  pCVar1 = (*env)->CallStaticObjectMethod;
  pvVar5 = (void *)func_0x0016a180();
  pvVar6 = (void *)func_0x0016c390(env);
  obj = (*pCVar1)(env,pvVar5,pvVar6);
  bVar4 = (*(*env)->ExceptionCheck)(env);
  pvVar6 = (void *)0x0;
  if (bVar4 == 0) {
    pCVar2 = (*env)->CallObjectMethod;
    if (_DAT_004c87a8 == (void *)0x0) {
      pGVar3 = (*env)->GetMethodID;
      builtin_strncpy(acStack_48,"getContextClassLoader",0x16);
      abStack_68[0] = 0x57;
      abStack_68[1] = 0x70;
      abStack_68[2] = 0x62;
      abStack_68[3] = 0xa2;
      abStack_68[4] = 0xda;
      abStack_68[5] = 0x2a;
      abStack_68[6] = 0x72;
      abStack_68[7] = 0xc2;
      abStack_68[8] = 0x6a;
      abStack_68[9] = 0xcd;
      abStack_68[10] = 0x80;
      abStack_68[0xb] = 0xab;
      abStack_68[0xc] = 2;
      abStack_68[0xd] = 0x74;
      abStack_68[0xe] = 0x7e;
      abStack_68[0xf] = 0x4a;
      abStack_68[0x10] = 200;
      abStack_68[0x11] = 0x2e;
      abStack_68[0x12] = 0x3d;
      abStack_68[0x13] = 0x1f;
      abStack_68[0x14] = 0x37;
      abStack_68[0x15] = 0x10;
      abStack_68[0x16] = 0x21;
      abStack_68[0x17] = 0xc0;
      abStack_68[0x18] = 0xb0;
      abStack_68[0x19] = 0;
      if (&UNK_20024178 < abStack_68 + 0x19 && abStack_68 < &UNK_20024191) {
        lVar7 = 0;
      }
      else {
        abStack_68[0] = 0x28;
        abStack_68[1] = 0x29;
        abStack_68[2] = 0x4c;
        abStack_68[3] = 0x6a;
        abStack_68[4] = 0x61;
        abStack_68[5] = 0x76;
        abStack_68[6] = 0x61;
        abStack_68[7] = 0x2f;
        abStack_68[8] = 0x6c;
        abStack_68[9] = 0x61;
        abStack_68[10] = 0x6e;
        abStack_68[0xb] = 0x67;
        abStack_68[0xc] = 0x2f;
        abStack_68[0xd] = 0x43;
        abStack_68[0xe] = 0x6c;
        abStack_68[0xf] = 0x61;
        abStack_68[0x10] = 0x73;
        abStack_68[0x11] = 0x73;
        abStack_68[0x12] = 0x4c;
        abStack_68[0x13] = 0x6f;
        abStack_68[0x14] = 0x61;
        abStack_68[0x15] = 100;
        abStack_68[0x16] = 0x65;
        abStack_68[0x17] = 0x72;
        lVar7 = 0x18;
      }
      abStack_68[lVar7] = abStack_68[lVar7] ^ (&UNK_20024178)[lVar7];
      if (&UNK_20024178 < abStack_68 + 0x19 && abStack_68 < &UNK_20024191) {
        do {
          abStack_68[lVar7 + 1] = abStack_68[lVar7 + 1] ^ (&UNK_20024179)[lVar7];
          abStack_68[lVar7 + 2] = abStack_68[lVar7 + 2] ^ (&UNK_2002417a)[lVar7];
          lVar7 = lVar7 + 2;
        } while (lVar7 != 0x18);
      }
      _DAT_004c87a8 = (*pGVar3)(env,pvVar5,acStack_48,(char *)abStack_68);
    }
    pvVar5 = (*pCVar2)(env,obj,_DAT_004c87a8);
    bVar4 = (*(*env)->ExceptionCheck)(env);
    pvVar6 = (void *)0x0;
    if (bVar4 == 0) {
      pvVar6 = pvVar5;
    }
  }
  return pvVar6;
}

