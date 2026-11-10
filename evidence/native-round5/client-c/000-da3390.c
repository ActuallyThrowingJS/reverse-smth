/* Ghidra pseudocode; not recovered Java. JNI types and captured pool applied. */

/* WARNING: Unknown calling convention -- yet parameter storage is locked */

double recovered_native_da3390(RecoveredJNINativeInterface_conflict **env,void *self)

{
  byte bVar1;
  
  bVar1 = (*(*env)->ExceptionCheck)(env);
  if (bVar1 != 0) {
    return 0.0;
  }
  return 10.0;
}

