# Polinex source recovery

Recovery work for the supplied `PoliSlop.jar` and `PolinexFabricLoader-26.1.2.jar`. Original inputs, readable Java references, name mappings, decoding evidence and recovery tools are included.

**This is an incomplete source recovery, not a buildable replacement mod.** Many Java methods still contain ZKM control flow or decompiler failure comments. JNIC application bodies remain native. Analysis JARs cannot be used as replacement mods: native registrations and reflection still refer to original names.

Start with:

- [`reference/client/src/main/java`](reference/client/src/main/java): decrypted and semantically remapped client Java, with unresolved sections retained.
- [`reference/loader/src/main/java`](reference/loader/src/main/java): earlier loader recovery; less complete than the client pass.
- [`reconstruction/native-java`](reconstruction/native-java): readable Java reconstruction of the JNIC bootstrap constant-stream generator, with independent and full-pool tests. This is generated protection infrastructure, not the mod's application logic.
- [`mappings`](mappings): original-to-readable names and native implementation addresses.
- [`reports`](reports): validation results and unresolved-method inventory.

## What was recovered

The client pass solved 2,255 ZKM key sites, including seven recovered from native initializer calls. It patched 2,248 Java sites and independently checked decrypted literals in 115 known enum classes. It restored 11,809 encrypted string call sites, 147 static string references and 12,893 obfuscated field/method references. Five additional member replacements were withheld because direct Java access could not be proved.

The mapping pass provides 81 class aliases, 1,059 field names and 1,434 renamed method declarations. Names come from decrypted Kotlin parameter checks, constructor assignments, event producers, type information and display strings. **Aliases inferred from behavior or display names are proposed readable names, not recovered original identifiers.** The parameter report retains 2,132 original Kotlin parameter names. Decompiled parameters use an `Arg` suffix to avoid a Vineflower naming inconsistency.

The original JARs contain 122 loader and 396 client JNIC implementation bodies. All 518 native registration records were matched to supplied declarations and executable ELF ranges. Their addresses are mapped; their application bodies have not been translated back into Java. Eleven additional `NativePathFinder` native declarations are outside these JNIC registration sets.

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

Diagnostic bytecode comment dumps are removed from the reference Java. Failed methods remain explicitly marked `UNRECOVERED`, with Vineflower's failure bodies preserved; removing those comments does not recover their implementations.

No Fabric build is supplied because missing native bodies, unresolved control flow and remaining identifiers make a working source build unavailable. The next substantial tasks are control-flow reconstruction, translating native application methods, and resolving remaining reflection names before testing a full Java 25/Fabric build.

See [THIRD_PARTY.md](THIRD_PARTY.md) for tool provenance and licenses. The source inputs and recovered application code retain their existing ownership.
