# Superclass calls and two loader reconstructions

The caller audit identified eight inferred key profiles with exact superclass calls that the old specialization rules skipped. The new opt-in rule accepts immediate-superclass `INVOKESPECIAL` references, including inherited implementations, while preserving unknown arguments and virtual overrides. Twenty-seven JVM fixture cases check that dispatch; sixteen more cover direct protector-key consumers without XOR. Direct-key support did not unlock additional client bodies in this pass.

Superclass propagation reached a fixed point after three stages: **12 new caller-proven variants**, **33 string call sites** and **41 member references**. Six variants have Java declarations without recorded method failures; six remain unresolved. Generic methods are retained. The assembly introduces no generic-method failures: **5,159 remain**, with **24 class-write warnings**. All seven preserved full-class alternatives were freshly compiled and API-checked. ASM BasicVerifier passes **50,548 method bodies**; the complete Gradle build still fails.

Two additional native loader methods are now Java in the primary reference tree:

- `me/octo/client/Obf00107.$restoreCommVisit`: replace the loader package in a class name, then forward the class header to ASM.
- `lol/polinexclient/loader/Obf00160.openConnection`: construct the supplied URLConnection subclass with the original URL.

Ghidra output, native lookup traces, supplied constructor/type checks and complete ELF/body hashes support these recipes. The reviewed native fixture suite passes **67 cases across 27 recipes**, in addition to the nine earlier exact-instruction reconstructions. Total recovery is **36 of 518 native bodies**, leaving **482**. JNI cache infrastructure is omitted; application initialization remains unrecovered.

The source and concise recovery evidence are committed. Raw archive packaging was stopped at the user's request; no archive bundle was pushed. Continue with the unresolved control flow, additional caller evidence and original loader/native initialization, as recorded in `HANDOFF.md`.
