#!/usr/bin/env bash
# Follow caller-proven key contexts; never overwrites the primary source tree.
set -euo pipefail
cd "$(dirname "$0")/.."
if [[ $# -lt 2 || $# -gt 3 ]]; then
  echo 'Usage: bash tools/recover-callers.sh ORIGINAL_NAMES_ANALYSIS_JAR CRYPTO_STATE_JSON [OUTPUT_DIRECTORY]' >&2
  exit 2
fi
input="$1"
crypto="$2"
out="${3:-build/caller-proven}"
[[ -f "$input" && -f "$crypto" ]]
bash tools/build.sh
(cd inputs && sha256sum --check SHA256SUMS)
export CLASSPATH='build/classes:.cache/deps/*'
run() { "${JAVA_HOME:+$JAVA_HOME/bin/}java" -Xmx5g "$@"; }
mkdir -p "$out"
for round in {1..8}; do
  stage="$out/stage-$round"
  mkdir -p "$stage"
  run -Drecovery.inheritedMethods=true -Drecovery.splitIntegerKeys=true SpecializeKeys "$input" "$stage/specialized.jar" "$stage/specializations.json" > "$stage/specialize.log" 2>&1
  run RestoreStrings "$stage/specialized.jar" "$crypto" "$stage/strings.jar" "$stage/strings.json" > "$stage/strings.log" 2>&1
  run ResolveReferences "$stage/strings.jar" evidence/dispatcher-state.json "$crypto" "$stage/references.jar" "$stage/references.json" > "$stage/references.log" 2>&1
  run VerifyBytecode "$input" "$stage/references.jar" "$stage/verification.json" > "$stage/verification.log" 2>&1
  input="$stage/references.jar"
  printf '%s\n' "$input" > "$out/last-stage.txt"
  counts=$(python3 - "$stage" <<'PY'
import json,sys
from pathlib import Path
p=Path(sys.argv[1])
print(*(len(json.loads((p/name).read_text())) for name in ('specializations.json','references.json')))
PY
)
  echo "Caller pass $round: new variants and reference decodings: $counts"
  if [[ "$counts" == '0 0' ]]; then
    echo "Converged; final analysis archive: $input"
    exit 0
  fi
done
echo "Reached eight passes; intermediate results retained at $out. Do not claim convergence." >&2
exit 1
