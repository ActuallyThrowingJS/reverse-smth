# Caller-proven recovery pass

This pass adds 76 constant-argument analysis variants across two incremental stages. Forty have Java declarations without recorded method failures. The original generic methods remain available; argument evaluation and closed dispatch are preserved. The caller audit distinguishes exact dispatch from unresolved virtual targets and does not establish application entry-point reachability.

The two stages restored 11 + 119 string call sites, ten static string references and 48 + 144 member references. These counts include analysis variants. Primary source assembly preserved the seven previously checked alternatives, the three key-runtime sources and compiler-generated comparison bridges. There are no new generic-method failures, but no additional complete generic methods were recovered: **5,159 generic failures and 24 class-write warnings remain**.

Two more native `Lazy.getValue()` plus checked-cast methods were reconstructed from reviewed Ghidra output and JNI traces. Full executable ranges and body hashes are checked by `RestoreNativeRecipes`. The native fixture suite now passes **56 cases across 25 reviewed recipes**, in addition to the nine earlier exact-instruction reconstructions. Total: **34/518 native bodies recovered; 484 remain**. The two new bodies are in the primary client source tree.

Final analysis bytecode passes ASM BasicVerifier over **50,536 bodies**. This excludes runtime linkage and behavior. `gradle-compile.log` records the still-failing full Java 25 build; it must not be described as a working Fabric replacement.

Constructor-chain analysis found 32 new readable module-name proposals. Reordered display arguments, unrelated bases, ambiguous constructors and duplicate names have fixture coverage. The proposals are in `mappings/module-name-proposals.json` and are **not yet applied** to the sources.

The partial native initializer trace in `evidence/native-round6` decoded 21 strings and seven member invocations. It uses mocked application calls and stops on an unknown concatenation operand. That is conditional decoding evidence, not recovered initialization behavior.

See [`HANDOFF.md`](../../HANDOFF.md) for context, replay, remaining blockers and next steps. Historical baseline scripts retain their old specialization behavior; extended inherited and integer-key handling are opt-in flags. `tools/recover-callers.sh` enables them and iterates decoding without modifying the reference tree.

The bounded caller replay was tested on the end-of-pass archive. It reached zero new variants and zero new member decodings; one existing context was reused for two calls. Its follow-up archive remains an analysis intermediate, and no extra source coverage is claimed.
