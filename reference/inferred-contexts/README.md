# Conditional Java fragments

These 15 method fragments come from syntax-valid Java 25 source units and have no recorded method-decompilation failures. They retain obfuscated names and residual protection control flow. They are not standalone classes, pristine source, or part of the Fabric build.

Each `.java.txt` file records its required argument bindings, original owner and descriptor. `fragments/index.json` maps each exported fragment to its analysis method and source. The application callers have not been proven to supply these arguments, and the fragments have not been type-checked or behavior-validated. Do not replace primary methods with them.

See [`reports/inferred-contexts`](../../reports/inferred-contexts) for the key model, verification, coverage and replay instructions. Original generic methods in the primary reference tree remain intact.
