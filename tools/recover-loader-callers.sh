#!/usr/bin/env bash
# Replay round 9 on the original-name loader analysis JAR containing the six recovered native bodies.
set -euo pipefail
cd "$(dirname "$0")/.."
input=${1:?Usage: recover-loader-callers.sh analysis-input.jar [output-directory]}
work=${2:-build/loader-callers}
java_cmd="${JAVA_HOME:+$JAVA_HOME/bin/}java"
bash tools/build.sh
export CLASSPATH='build/classes:.cache/deps/*'
mkdir -p "$work"
state=evidence/loader-round9/crypto-state.json
dispatcher=evidence/loader-round9/dispatcher-state.json
"$java_cmd" -Drecovery.interpreterTripCap=200000 -Drecovery.interpreterStepCap=16000000 -Xmx3g RestoreLiteralHelpers "$input" "$state" "$work/literals.jar" "$work/literals.json"
"$java_cmd" -Drecovery.loaderDispatcher=true -Xmx3g ResolveReferences "$work/literals.jar" "$dispatcher" "$state" "$work/references.jar" "$work/references.json"
input="$work/references.jar"
for stage in 1 2 3 4 5 6; do
 out="$work/follow-$stage"
 mkdir -p "$out"
 "$java_cmd" -Drecovery.specializationPrefix=lol/polinexclient/loader/ -Drecovery.inheritedMethods=true -Drecovery.splitIntegerKeys=true -Drecovery.superCalls=true -Xmx3g SpecializeKeys "$input" "$out/specialized.jar" "$out/specializations.json"
 "$java_cmd" -Drecovery.interpreterTripCap=200000 -Drecovery.interpreterStepCap=16000000 -Xmx3g RestoreLiteralHelpers "$out/specialized.jar" "$state" "$out/literals.jar" "$out/literals.json"
 "$java_cmd" -Drecovery.loaderDispatcher=true -Xmx3g ResolveReferences "$out/literals.jar" "$dispatcher" "$state" "$out/references.jar" "$out/references.json"
 input="$out/references.jar"
 counts=$(python3 - "$out" <<'PY'
import json,sys
from pathlib import Path
p=Path(sys.argv[1]);print(*(len(json.loads((p/n).read_text())) for n in ['specializations.json','literals.json','references.json']))
PY
)
 echo "Loader stage $stage: $counts"
 if [[ "$counts" == '0 0 0' ]]; then break; fi
 done
"$java_cmd" -Drecovery.ownerPrefix=lol/polinexclient/loader/ -Drecovery.allowVerifiedRollbacks=true -Xmx3g unlegit.zkm.ControlFlowDeobfuscator "$input" "$work/clean.jar" "$work/pre-flow.tsv" --remove-identity-rethrows --normalize-exception-ranges --normalize-zkm-shared-tails --materialize-residual-stacks --specialize-binary-sentinel-tails
"$java_cmd" -Drecovery.ownerPrefix=lol/polinexclient/loader/ -Xmx3g FoldProvenBranches "$work/clean.jar" "$work/pruned.jar" "$work/branches.json"
"$java_cmd" -Drecovery.ownerPrefix=lol/polinexclient/loader/ -Drecovery.allowVerifiedRollbacks=true -Xmx3g unlegit.zkm.ControlFlowDeobfuscator "$work/pruned.jar" "$work/final.jar" "$work/flow.tsv" --remove-identity-rethrows --normalize-exception-ranges --normalize-zkm-shared-tails --materialize-residual-stacks --specialize-binary-sentinel-tails
"$java_cmd" -Xmx3g VerifyBytecode "$input" "$work/final.jar" "$work/verification.json"
"$java_cmd" -Xmx3g -jar .cache/deps/vineflower.jar -log=WARN -thr=2 "$work/final.jar" "$work/sources"
# Assemble into a NEW directory with assemble_loader.py; never overwrite the previous source baseline.
