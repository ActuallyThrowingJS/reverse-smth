# Recovery handoff

## Goal and authorization

Recover readable, semantically remapped Java for the owner's lost Minecraft 26.1.2 Fabric mod sources from `inputs/PoliSlop.jar` and `inputs/PolinexFabricLoader-26.1.2.jar`. The user authorized native analysis, alternative decompilers, repository updates, and maintaining context/handoffs/next steps. Do not publish or reapply cloud-environment configuration; that was explicitly excluded earlier.

Do not describe the output as pristine or buildable. Do not replace missing logic with invented implementations. Keep original inputs intact. Inferred aliases are not original names, conditional key contexts do not prove application entry-point reachability, and Ghidra pseudocode is not Java.

## Current verified results

- Primary client reference: `reference/client/src/main/java`, 1,583 Java files. Loader reference remains an older recovery with global `ObfNNNNN` display names: `reference/loader/src/main/java`.
- **34 of 518 registered native bodies recovered:** 30 client and four loader. **484 remain.** Eleven other `NativePathFinder` declarations are outside these registration records. The main native initializer is unresolved.
- Latest caller pass adds 76 constant-argument variants; 40 have Java declarations without recorded method failures. It restores 130 string call sites, ten static string references and 192 member references across its two incremental passes. Counts include analysis variants.
- **5,159 generic Java methods still fail decompilation; 24 class-write warnings remain.** The latest assembly adds no generic decompiler failures and recovers no additional complete generic methods.
- Final analysis bytecode: 50,536 method bodies, no ASM BasicVerifier failures. This is stack verification, not runtime linkage or application validation.
- 32 new display-name aliases are in `mappings/module-name-proposals.json`. They have constructor-chain provenance and are **not yet applied** to the primary sources. Existing applied aliases remain 81.
- Earlier conditional-key research found 4,114 profiles. Only 15 syntax-gated fragments were exported. They remain separate in `reference/inferred-contexts` and must not replace generic methods.
- Native initializer tracing now decodes 21 strings and seven member invocations under mocked application calls. It stops at an unknown concatenation argument. This is partial, conditional evidence, not a recovered initializer.
- Java 25 / Minecraft 26.1.2 / Fabric Gradle dependency setup works. The full source build **still fails**, including unresolved dynamic/decompiler expressions. See `reports/round6` and `recovery-project/README.md`.

## Where the evidence lives

- Input SHA-256 values: `inputs/SHA256SUMS`.
- Current failure inventory: `reports/decompiler-failures.json`.
- Latest assembly, caller audit, tests and verification: `reports/round6`.
- Registered native declarations and recovery flags: `mappings/*-native-registrations.json`.
- Native recipes with full ELF/body hashes and executable-range checks: `evidence/native-round5/recipes.json`. The filename is historical; it now contains 25 reviewed recipes, plus nine earlier exact-instruction reconstructions.
- Ghidra small-method pseudocode and JNI metadata: `evidence/native-round5`. Large initializer decompilation attempts timed out, including a five-minute budget.
- Latest partial initializer trace and bootstrap buffer: `evidence/native-round6`. Its `stopReason`, mocked-call scope and input hashes must remain attached to any claims drawn from it.
- Member table: `evidence/extended/member-catalog.json`, 2,348 records; verified with the original interpreted decoder and all 64 selector cases.
- The seven compiler/API-checked full-class CFR/Procyon alternatives are listed in `reports/extended/source-choices.json`. Preserve or regenerate them when changing the reference tree.

## Tools and replay

Analysis tools require Java 21+, Python 3 and Bash. Actual dependency compilation and syntax parsing require Java 25. `tools/build.sh` pins downloaded ASM 9.8, Gson and Vineflower dependencies by SHA-256. `tools/test.sh` runs isolated fixtures; application natives are never loaded into the real JVM.

Baseline workflows: `tools/recover.sh`, `tools/recover-flow.sh`. Later stages use committed extraction snapshots; they do not independently recreate every native-emulation result. Regeneration must preserve the three ZKM key-runtime sources, the checked alternative sources and recovered native bodies. Do not blindly copy a fresh decompiler directory over the reference tree.

New tools:

- `AuditContextCallers`: compares actual invocation-argument dataflow to inferred profiles and distinguishes exact from ambiguous virtual dispatch. Matching calls do not prove application entry-point reachability.
- `SpecializeKeys`: supports inherited declarations and final receiver classes with `-Drecovery.inheritedMethods=true`; split integer keys require `-Drecovery.splitIntegerKeys=true`. These opt-ins preserve the historical baseline replay. Closed dispatch and constant argument dataflow remain mandatory. Synthetic variants retain the generic methods and argument evaluation.
- `InferModuleNames`: follows the display-name argument through constructor chains, including reordered arguments; rejects ambiguous displays and duplicate aliases. Its seed convention is the GUI module base's first String argument.
- `tools/research/trace_native_initializer.py`: experimental, bounded native trace using an **external GPL-3.0 C2J emulator**, Unicorn and `CryptoSnapshotService`. No application classes are loaded in its JVM. The adapter intentionally reports unknown model operations rather than claiming complete reconstruction.
- `tools/assemble_round6.py`: overlays focused native/bridge output, preserves the three key runtime sources and the seven unchanged checked alternatives, and rejects new generic-method failures or missing source files.

Warm workspace locations (convenience, not portable dependencies):

```text
/workspace/reverse-smth                       repository
/workspace/recovery/tools/jdk-21.0.13+9       analysis JDK
/workspace/recovery/tools/jdk-25.0.5+8        target JDK
/workspace/recovery/tools/ghidra_11.4.2_PUBLIC
/workspace/recovery/tools/c2j-native-deobfuscator
/workspace/recovery/native-venv
build/round5/crypto-expanded/crypto-state.json expanded interpreter snapshot
build/round5/catalog/profiles-expanded.json   4,114 conditional key profiles
build/round6/                                latest analysis intermediates
```

All `build/` artifacts are ignored and may disappear. Source, evidence, tests and this handoff must remain sufficient to understand the result. Regenerate the expanded snapshot with `ExtractCrypto` from `build/recovery/keyed.jar`; extraction is a bounded model with stubs, not actual mod initialization.

## Next steps, in priority order

1. Extend caller propagation beyond the current heuristic fixed point. A follow-up pass found zero new variants and zero new member decodings (it reused one existing context for two calls); its analysis output is not a further primary-source update. Newly decoded member calls expose more direct constant arguments. `tools/recover-callers.sh` runs the opt-in passes with decoding between them and writes each stage separately. Continue distinguishing static/private/final or final-receiver dispatch from overridable virtual calls. Some keyed methods consume their argument directly and lack `LXOR`; the current specialization heuristic misses those. Extend that narrowly with fixture coverage.
2. Apply the 32 module-name proposals through `SemanticRemap`, regenerate source and recheck affected CFR/Procyon alternatives. Compare failure inventory using original owners/descriptors so aliases do not appear as false regressions. Preserve descriptor and owner isolation; never globally replace repeated `I/l` tokens across unrelated packages.
3. Reconstruct the remaining control flow in failed methods. Native registrations, reflection and mutable protection sentinels still refer to original names; do not remove branches merely because they look like obfuscation. Any context-specific simplification must retain its preconditions.
4. Extend native tracing from the recorded stop: identify the unknown concatenation operand and model the original loader/reflection state. Recover the original initialization instead of inventing missing reflected values. Trace strings/member targets can guide smaller Ghidra slices of the 190 KB native initializer.
5. Continue reviewing small native bodies. Two additional lazy-cast bodies were reconstructed this pass. Small Swing callback, ASM visitor and loader helper functions have Ghidra output but are not yet reconstructed. Match every proposed body to the full machine-body hash and test null/exception behavior.
6. Re-run the normal Java 25 build after source changes. Keep unresolved sections marked; a build scaffold or syntax check is not a working mod. A normal Fabric entry point and coherent loader replacement still require recovered initialization behavior.

## Operational lessons

Full-archive cleanup can spend minutes in ASM source analysis/frame recomputation. Progress logging is available with `-Drecovery.progress=true`; `-Drecovery.excludedOwners=comma,separated,internal,names` can leave chosen classes untouched. The three generated key-runtime classes were excluded in the latest cleanup and restored from the established baseline afterward. Check active JVM stacks before declaring a process hung; preserve partial evidence and do not leave the user without updates.

Keep this file and per-pass reports current with each repository checkpoint. Separate measured improvements, conditional research and outstanding work. The latest published commit can always be found with `git ls-remote origin refs/heads/main`; do not rely on a stale hardcoded SHA here.
