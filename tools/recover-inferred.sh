#!/usr/bin/env bash
# Conditional analysis views; these artifacts must never be run as replacement mods.
set -euo pipefail
cd "$(dirname "$0")/.."
if [[ $# -lt 2 || $# -gt 3 ]]; then
  echo 'Usage: bash tools/recover-inferred.sh ORIGINAL_NAMES_KEYED_JAR CRYPTO_STATE_JSON [OUTPUT_DIRECTORY]' >&2
  echo 'For example, use build/recovery/keyed.jar and a snapshot from ExtractCrypto.' >&2
  exit 2
fi
input="$1"
crypto="$2"
out="${3:-build/inferred-contexts}"
[[ -f "$input" && -f "$crypto" ]]
mkdir -p "$out"
bash tools/build.sh
export CLASSPATH='build/classes:.cache/deps/*'
run() { "${JAVA_HOME:+$JAVA_HOME/bin/}java" -Xmx5g "$@"; }
run ValidateMemberCatalog "$input" evidence/dispatcher-state.json evidence/extended/member-catalog.json "$out/catalog-validation.json"
run RestoreStrings "$input" "$crypto" "$out/strings.jar" "$out/strings.json"
run InferReferenceKeys "$out/strings.jar" evidence/dispatcher-state.json evidence/extended/member-catalog.json "$out/profiles.json" "$out/inference.json"
run ApplyInferredProfiles "$out/strings.jar" "$out/profiles.json" "$out/contexts.jar" "$out/variants.json"
run RestoreStrings "$out/contexts.jar" "$crypto" "$out/context-strings.jar" "$out/context-strings.json"
run ResolveReferences "$out/context-strings.jar" evidence/dispatcher-state.json "$crypto" "$out/references.jar" "$out/references.json"
run VerifyBytecode "$out/contexts.jar" "$out/references.jar" "$out/verification.json"
# Do not invoke control-flow/frame recomputation here: the expanded archive
# exposed a pathological ASM frame-computation case. Preserve its evidence.
run EnrichNames "$out/references.jar" mappings/semantic-mappings.json "$out/parameters.jar" "$out/names.json" "$out/parameter-names.json"
run SemanticRemap "$out/parameters.jar" "$out/names.json" "$out/semantic.jar" "$out/final-names.json" "$out/remap.json"
run ParameterPresentation "$out/semantic.jar" "$out/presentation.jar"
run -jar .cache/deps/vineflower.jar -log=WARN -thr=4 --only=me/octo/client/ "$out/presentation.jar" "$out/sources" > "$out/decompile.log" 2>&1
python3 tools/summarize_inferred.py "$out/variants.json" "$out/final-names.json" "$out/sources" "$out/decompile.log" "$out/declaration-inventory.json"
echo "Conditional views written to $out; inferred callers and full application behavior remain unverified."
