# Applied module and nested-class aliases

This pass applies the 32 constructor-derived module aliases. It also expands outer-class aliases to **362 nested classes**, including nested classes of already named modules. There are **475 explicit class aliases** in the complete map: 111 top-level and 364 nested. These are readable aliases, not recovered original identifiers.

The class-only delta changes 394 names in the previous analysis archive. `ExpandClassAliases` checks the original/current class inventories and rejects target-name collisions. Existing method and field mappings remain intact. JVM fixtures cover longest-owner matching, partially renamed archives, nested reflection metadata, method references/descriptors and collision rejection.

Source output now contains **1,494 Java files**. The reduction from 1,583 is accounted for: 87 formerly standalone nested declarations are included in their outer source files, while two reviewed synthetic enum-switch helpers are folded by the decompiler. `source-migrations.json` records each of those 89 cases. The two helper classes remain in the analysis bytecode; their pre-remap class hashes and review are in `evidence/nested-alias-switch-helpers.json`.

All seven preserved CFR/Procyon source alternatives passed fresh compilation and declared-API checks against the renamed binary and real dependencies. The three key-runtime source classes were preserved only after checking that none references a class affected by the delta. Recovered native bodies remain present.

Failure comparison maps new owners and descriptors back through the class-only delta before checking regressions. **No new generic-method failures:** 5,159 remain, with 24 class-write warnings. This pass changes names and nested-source organization; it does not recover additional generic method bodies. ASM BasicVerifier passes all **50,536 method bodies**. The full Java 25 Gradle build still fails; stack checks and isolated alternative compilation do not establish a working mod.

Current recovery context and next steps are maintained in [`HANDOFF.md`](../../HANDOFF.md). Reproduction artifacts are under ignored `build/round7`; `ExpandClassAliases`, `SemanticRemap` and `tools/assemble_aliases.py` are committed. Do not copy old standalone nested files back into the renamed tree.
