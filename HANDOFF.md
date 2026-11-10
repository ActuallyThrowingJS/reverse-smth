# Recovery handoff

## Goal and authorization

Recover readable, semantically remapped Java for the owner's lost Minecraft 26.1.2 Fabric mod sources from `inputs/PoliSlop.jar` and `inputs/PolinexFabricLoader-26.1.2.jar`. The user authorized native analysis, alternative decompilers, repository updates, and concise context/handoffs/next steps. They explicitly stopped raw-archive packaging: continue source recovery and commit recovered source/evidence without spending time on archive bundles. Do not publish or reapply cloud-environment configuration; that was explicitly excluded earlier.

Do not describe the output as pristine or buildable. Do not replace missing logic with invented implementations. Keep original inputs intact. Inferred aliases are not original names, conditional key contexts do not prove application entry-point reachability, and Ghidra pseudocode is not Java.

## Current verified results

- Primary client reference: `reference/client/src/main/java`, 1,494 Java files. Loader reference now includes the round-9 caller pass and retains global `ObfNNNNN` display names: `reference/loader/src/main/java`.
- **36 of 518 registered native bodies recovered:** 30 client and six loader. **482 remain.** Eleven other `NativePathFinder` declarations are outside these registration records. The main native initializer is unresolved.
- Latest superclass-call pass adds 12 caller-proven variants; six have Java declarations without recorded method failures. It restores 33 string call sites and 41 member references. The earlier caller pass added 76 variants (40 readable). Counts include analysis variants.
- **5,159 generic Java methods still fail decompilation; 24 class-write warnings remain.** The latest assembly adds no generic decompiler failures and recovers no additional complete generic methods.
- Final analysis bytecode: 50,548 method bodies, no ASM BasicVerifier failures. This is stack verification, not runtime linkage or application validation.
- 32 new display-name aliases in `mappings/module-name-proposals.json` are now **applied**. The complete map has 111 top-level aliases and 364 explicit nested-class aliases (475 total). Nested names now follow their aliased outer classes. Eighty-seven old standalone nested files are merged into outer sources; two reviewed synthetic enum-switch helpers are folded by the decompiler.
- Earlier conditional-key research found 4,114 profiles. Only 15 syntax-gated fragments were exported. They remain separate in `reference/inferred-contexts` and must not replace generic methods.
- Native initializer tracing now decodes 21 strings and seven member invocations under mocked application calls. It stops at an unknown concatenation argument. This is partial, conditional evidence, not a recovered initializer.
- Java 25 / Minecraft 26.1.2 / Fabric Gradle dependency setup works. The full source build **still fails**, including unresolved dynamic/decompiler expressions. See `reports/round6` and `recovery-project/README.md`.

- Loader round 9: 21 caller-proven variants, 504 interpreted literal sites and 39 member references. All 21 variants have Java bodies without recorded decompiler failures; some still contain unresolved callees or dynamic expressions. Four generic loader methods remain explicitly failed, with no new generic failures. The recovered main initialization cleanup matches its context bytecode in 72 isolated JVM cases. Native count is unchanged.

## Where the evidence lives

- Input SHA-256 values: `inputs/SHA256SUMS`.
- Current failure inventory: `reports/decompiler-failures.json`.
- Latest superclass-call and native loader recovery: `reports/round8`. Historical caller assembly, audit and tests: `reports/round6`; the subsequent applied-alias pass, verification, checked source migrations and alternative rechecks: `reports/round7`.
- Registered native declarations and recovery flags: `mappings/*-native-registrations.json`.
- Native recipes with full ELF/body hashes and executable-range checks: `evidence/native-round5/recipes.json`. The filename is historical; it now contains 27 reviewed recipes, plus nine earlier exact-instruction reconstructions.
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
- `ExpandClassAliases`: expands aliases to nested classes using the longest mapped owner, checks the complete original/current class inventory, and rejects collisions. `tools/assemble_aliases.py` compares failures before/after aliases and accounts for every old source file, including reviewed synthetic helper folding.
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
build/round6/                                caller/native analysis intermediates
build/round7/                                applied class-alias intermediates
build/round8/                                superclass/native-loader intermediates
```

All `build/` artifacts are ignored and may disappear. Source, evidence, tests and this handoff must remain sufficient to understand the result. Regenerate the expanded snapshot with `ExtractCrypto` from `build/recovery/keyed.jar`; extraction is a bounded model with stubs, not actual mod initialization.

## Latest loader checkpoint

`reports/round9/README.md` explains the exact scope. `evidence/loader-round9` contains captured tables, extraction outcomes, caller/literal/member proofs and cleanup-fixture hashes. `tools/recover-loader-callers.sh` replays from an original-name analysis JAR with the six earlier native reconstructions. `tools/assemble_loader.py` preserves earlier successful methods, all 38 source paths, external packages and literal contents; do not copy raw decompiler output over the tree.

The actual Fabric main entry in `Obf00581.Obf00467` now reaches a known-key variant in `Obf00066`. Its cleanup calls the decoded payload initialization variant and zeroes/clears prepared bytes even on exceptions. That callback loads `me.octo.client.Polinex` and invokes `onInitialize`; other generic payload/archive handlers are still failed. The preLaunch entry `Obf00581.Obf00196` calls the still-native `Obf00564.Obf00369(J)V`, loader RVA **0x6d5c0**. Follow this path next.

Ghidra/structural tracing identified two ASM fallback/error class generators at loader RVAs 0x299ab0 and 0x373d80. Their strings still come from native `(III)String` decoders. They are not proof that the genuine reflected bootstrap class has been reconstructed. Warm artifacts are under `build/round9/generator-c`, `definition-c`, `string-c` and `*-trace.json`. The first reflected target remains absent in both supplied JARs.

## Next steps, in priority order

0. Prioritize the now-resolved native preLaunch target at loader RVA 0x6d5c0, then the three failed generic payload/archive handlers in Obf00066. Use the recovered main context to constrain those handlers. The generic private finish-init body is preserved from the earlier source; only its caller-proven variant received the tested CFR reconstruction. Do not assume guard-field values or replace the missing bootstrap with fallback classes.

1. Extend caller propagation beyond the current heuristic fixed point. A follow-up pass found zero new variants and zero new member decodings (it reused one existing context for two calls); its analysis output is not a further primary-source update. Newly decoded member calls expose more direct constant arguments. `tools/recover-callers.sh` runs the opt-in passes with decoding between them and writes each stage separately. Continue distinguishing static/private/final or final-receiver dispatch from overridable virtual calls. Direct-key consumers without `LXOR` are now supported with `-Drecovery.directKeyConsumers=true` (no client bodies unlocked in this pass). Immediate-superclass `INVOKESPECIAL` calls are supported with `-Drecovery.superCalls=true` and produced the new variants. Both are fixture-tested; ambiguous virtual calls and arbitrary ancestor special calls remain excluded.
2. Infer additional meaningful method/field aliases from decoded behavior and Kotlin metadata. The 32 constructor-based module aliases and nested-class expansion are applied, and all seven alternatives were recompiled/API-checked. Continue canonical owner/descriptor comparisons across renames; never globally replace repeated `I/l` tokens across unrelated packages.
3. Reconstruct the remaining control flow in failed methods. Native registrations, reflection and mutable protection sentinels still refer to original names; do not remove branches merely because they look like obfuscation. Any context-specific simplification must retain its preconditions.
4. Extend native tracing from the recorded stop: identify the unknown concatenation operand and model the original loader/reflection state. Recover the original initialization instead of inventing missing reflected values. The restored `$restoreCommVisit` establishes the loader-to-client package rewrite. The first decoded genuine-loader reflection target is absent even after mapping its client package back to the supplied loader JAR, so investigate the loader's ASM-generated class rather than assuming that target is an ordinary shipped class. Trace strings/member targets can guide smaller Ghidra slices of the 190 KB native initializer.
5. Continue reviewing small native bodies. Two loader bodies were reconstructed in the latest pass; earlier passes also recovered lazy casts. The ASM class-header visitor and URLConnection factory are now reconstructed. The small Swing callback and other loader helpers still have Ghidra output awaiting reconstruction. Match every proposed body to the full machine-body hash and test null/exception behavior.
6. Re-run the normal Java 25 build after source changes. Keep unresolved sections marked; a build scaffold or syntax check is not a working mod. A normal Fabric entry point and coherent loader replacement still require recovered initialization behavior.

## Operational lessons

Full-archive cleanup can spend minutes in ASM source analysis/frame recomputation. Progress logging is available with `-Drecovery.progress=true`; `-Drecovery.excludedOwners=comma,separated,internal,names` can leave chosen classes untouched. The three generated key-runtime classes were excluded in the latest cleanup and restored from the established baseline afterward. Check active JVM stacks before declaring a process hung; preserve partial evidence and do not leave the user without updates.

Keep this file and per-pass reports current with each repository checkpoint. Separate measured improvements, conditional research and outstanding work. The latest published commit can always be found with `git ls-remote origin refs/heads/main`; do not rely on a stale hardcoded SHA here.
