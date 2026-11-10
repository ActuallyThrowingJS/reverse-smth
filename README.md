# Polinex source recovery

Recovery work for the supplied `PoliSlop.jar` and `PolinexFabricLoader-26.1.2.jar`. Original inputs, readable Java references, name mappings, decoding evidence and recovery tools are included.

**This is an incomplete source recovery, not a buildable replacement mod.** Many Java methods still contain ZKM control flow or decompiler failure comments. Most JNIC application bodies remain native. Analysis JARs cannot be used as replacement mods: native registrations and reflection still refer to original names.

Start with:

- [`reference/client/src/main/java`](reference/client/src/main/java): decrypted and semantically remapped client Java, with unresolved sections retained.
- [`reference/loader/src/main/java`](reference/loader/src/main/java): earlier loader recovery; less complete than the client pass.
- [`reconstruction/native-java`](reconstruction/native-java): readable Java reconstruction of the JNIC bootstrap constant-stream generator, with independent and full-pool tests. This is generated protection infrastructure, not the mod's application logic.
- [`mappings`](mappings): original-to-readable names and native implementation addresses.
- [`reports`](reports): validation results and unresolved-method inventory.

## What was recovered

The client pass solved 2,255 ZKM key sites, including seven recovered from native initializer calls. It patched 2,248 Java sites and independently checked decrypted literals in 115 known enum classes. It restored 11,809 encrypted string call sites, 147 static string references and 12,893 obfuscated field/method references. Five additional member replacements were withheld because direct Java access could not be proved.

The current mapping provides 111 top-level class aliases, 364 explicit nested-class aliases, 1,059 field names and 1,434 renamed method declarations. Names come from decrypted Kotlin parameter checks, constructor assignments, event producers, type information and display strings. **Aliases inferred from behavior or display names are proposed readable names, not recovered original identifiers.** The parameter report retains 2,132 original Kotlin parameter names. Decompiled parameters use an `Arg` suffix to avoid a Vineflower naming inconsistency.

The original JARs contain 122 loader and 396 client JNIC implementation bodies. All 518 native registration records were matched to supplied declarations and executable ELF ranges. Their addresses are mapped; 36 bodies have now been reconstructed, while the others remain unresolved. Eleven additional `NativePathFinder` native declarations are outside these JNIC registration sets.

## Native code and Ghidra

JNIC translates Java methods into native implementations and leaves JNI declarations in the JAR. Consequently, these native bodies generally originated as Java; native code alone does not imply the author wrote C/C++. Ghidra can produce C-like pseudocode, but recovering Java requires reconstructing JNI operations, types and control flow.

[`evidence/JNIC_OnLoad.ghidra.c`](evidence/JNIC_OnLoad.ghidra.c) is a successful bootstrap decompilation. The clean Java constant-stream reconstruction passes RFC 8439 and matches all 641,905 bytes of the captured native pool. These checks do not validate native application logic. In particular, the large native `Polinex.onInitialize` body remains unresolved.

## Reproduce the client recovery

Use a JDK with `javac` 21 or newer, Python 3, Bash, curl and sha256sum. The recovery tools target Java 21. The original client's metadata requires Java 25 and Minecraft `>=26.1 <26.2`; that is separate from running these analysis tools.

```sh
bash tools/test.sh
bash tools/recover.sh > recovery-run.log 2>&1
```

Set `JAVA_HOME` if the intended JDK is not on PATH. Dependencies are downloaded from Maven Central with pinned SHA-256 checks. `inputs/SHA256SUMS` pins both supplied JARs. Output goes to ignored `build/recovery`; transformed JARs are analysis intermediates.

The normal replay uses committed crypto-state and native-key snapshots tied to these inputs. It does not independently reproduce native emulation or guarantee the extraction model can handle different JARs. See [`tools/research/README.md`](tools/research/README.md) for provenance and native analysis details.

Validation covers a synthetic JVM remapping fixture, the native constant-stream reconstruction, enum literals and differential ASM BasicVerifier checks over 48,556 methods before and after reference restoration. It does not cover a complete Minecraft launch, mod behavior, native linkage, or compilation of the decompiled project. Unresolved methods are listed in `reports/decompiler-failures.json`.

Diagnostic bytecode comment dumps are removed from the reference Java. Failed methods remain explicitly marked `UNRECOVERED`, with Vineflower's failure bodies preserved; removing those comments does not recover their implementations. Some methods that decompile still contain unresolved invokedynamic expressions in Vineflower's diagnostic syntax. A successful decompilation count does not mean that every remaining expression is valid or fully recovered Java.

A Java 25/Fabric build scaffold is now supplied in `recovery-project`. Dependencies resolve successfully, but missing native bodies, unresolved control flow and remaining expressions still prevent a complete source build. The next substantial tasks are control-flow reconstruction, translating native application methods, and resolving remaining reflection names before testing a full Java 25/Fabric build.

See [THIRD_PARTY.md](THIRD_PARTY.md) for tool provenance and licenses. The source inputs and recovered application code retain their existing ownership.

## Control-flow recovery update

The second pass recovers Java output for **41 methods that previously failed to decompile**, with no new generic-method decompiler failures. Another six previously failed methods have readable versions for recorded constant-key contexts. These are decompiler results; application behavior has not been tested in Minecraft.

Key propagation produced 1,658 analysis variants, of which 805 have Java declarations without decompiler failures. Original generic methods remain available for unknown keys. Each `$recovered$…` name identifies an analysis variant, not an original identifier. The added contexts unlocked 2,708 further string restorations and 8,006 further member-reference decodings, including sites within these variants.

Nine simple client native bodies are now reconstructed exactly from the Linux x86-64 image: seven object-identity helpers and two empty void methods. Their complete instructions, executable addresses and image hash are recorded in `evidence/trivial-native-proof.json`. After the extended pass, 486 registered native implementations still need reconstruction. The original native registration code must not run against these analysis replacements.

The control-flow engine preserves unknown branch values, checks exception ordering, and rolls back rejected method transactions. Proposed changes in 37 methods were rejected. The three ZKM key-runtime classes retain their baseline versions. Final analysis bytecode passes BasicVerifier across 49,698 method bodies after getter coalescing and native-body restoration. JVM fixtures cover 81 control-flow cases, 16 key-specialization cases and 18 native-reconstruction cases; optional Unicorn checks cover 27 native instruction cases.

After the baseline recovery, reproduce this pass with:

```sh
bash tools/recover-flow.sh > control-flow-run.log 2>&1
```

Results are under `build/flow`. See `reports/control-flow-summary.json`, `reports/recovered-generic-methods.json` and `reports/readable-key-variants.json` for exact coverage. Thousands of generic methods remain unresolved. The source tree continues to be an incomplete analysis reference, rather than a working Fabric project.

## Extended recovery update

The extended pass reconstructs **23 additional native bodies**, bringing the total to **32 of 518** registered implementations: 28 client bodies and four loader bodies. These include field access, lazy casts, process-exit handlers, context-class-loader access, mod-version lookup, constants and string-call-site linking. Their original machine bodies are hash-checked; 48 isolated JVM fixture cases cover the added reconstructions. Generated JNI caches are omitted, and normal Java exception propagation is retained. Native declarations still present in the sources remain unrecovered.

Split integer keys produced 741 additional analysis variants, enabling another 1,061 string restorations and 3,157 member-reference decodings. Seven complete-class alternatives from CFR and Procyon passed compilation against the real dependencies and declared-member checks, including `MinecraftMixin` and `GenericPools`. Another five previously failed original methods now have decompiled bodies. There are no new generic-method decompiler failures; 5,159 original methods and 24 class-writing failures remain in the failure inventory. Type-checking an alternative does not prove application behavior.

Ghidra exported 35 of 36 selected smaller native methods with named JNI calls. Its output in `evidence/native-round5` is pseudocode evidence, not recovered Java or buildable C. The large `Polinex.onInitialize` still timed out with a five-minute decompilation budget and remains unreconstructed.

The bytecode tools now use ASM 9.8 for Java 25 class-file support. See `recovery-project/README.md` for the standard Gradle scaffold, and `reports/extended` for checks and coverage. The full mod does not compile or launch yet.

A further reference-table investigation recovered 2,348 encrypted member records without relying on known caller keys. Every recovered record was verified against the original decoder, covering all 64 selector cases. Using this catalog to infer additional missing method keys is still experimental; the catalog itself is in `evidence/extended/member-catalog.json`.

The conditional-key experiment now finds 4,114 method contexts and decodes additional strings and member references in analysis copies. It passes stack verification over 55,069 bodies, but caller reachability remains unproven. See [`reports/inferred-contexts`](reports/inferred-contexts) for the assumptions, results, interrupted frame-computation pass and replay instructions. These results do not replace the primary source tree.

## Current handoff and caller pass

Start with [`HANDOFF.md`](HANDOFF.md) for current context, reproduction details, known limits and prioritized next steps. The latest caller pass adds 76 proven constant-argument variants; 40 decompile without recorded method failures. Two additional native lazy-cast methods bring the total to 34 of 518, with 484 remaining. The assembly preserves the existing 5,159 generic failures and 24 class-write warnings; it does not recover another complete generic method.

The 32 constructor-derived module aliases in [`mappings/module-name-proposals.json`](mappings/module-name-proposals.json) were subsequently applied, along with consistent nested-class names. A partial native initializer trace decodes 21 strings under explicitly mocked application calls. See [`reports/round6`](reports/round6) for measured coverage. The full Gradle build still fails.

## Applied class aliases

The alias pass applies 32 additional module names and explicitly maps 362 nested classes to their aliased outer names. This changes 394 binary class names, with complete class-inventory and collision checks. Eighty-seven formerly standalone nested source files are now merged into their outer classes; two reviewed synthetic enum-switch helpers are folded by the decompiler. The current tree contains 1,494 Java source files. All seven complete-class alternatives were recompiled and API-checked against the renamed archive. Failure counts remain unchanged; see [`reports/round7`](reports/round7) for source migrations and canonical failure comparison.

The superclass-call recovery pass adds 12 caller-proven variants, six with Java declarations and no recorded method failure. It restores 33 string sites and 41 member references. Two native loader helpers are now Java: the class-header package rewrite and the URLConnection factory. Total native recovery is 36/518; see [`reports/round8`](reports/round8). Generic failure counts and the full-build limitation remain unchanged.
