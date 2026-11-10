#!/usr/bin/env bash
set -euo pipefail
cd "$(dirname "$0")/.."
bash tools/build.sh
if [[ ! -f build/recovery/references.jar || ! -f build/recovery/presentation.jar || ! -d build/recovery/sources/me/octo/client ]]; then
  echo 'Run bash tools/recover.sh first.' >&2
  exit 1
fi
(cd inputs && sha256sum --check SHA256SUMS)
export CLASSPATH='build/classes:.cache/deps/*'
run() { "${JAVA_HOME:+$JAVA_HOME/bin/}java" -Xmx5g "$@"; }
out=build/flow
mkdir -p "$out"
# These two directories contain only disposable decompiler output.
python3 - <<'PY'
from pathlib import Path
import shutil
for name in ('build/flow/sources', 'build/flow/native-sources-complete'):
    path = Path(name)
    if path.is_dir():
        shutil.rmtree(path)
PY
run SpecializeKeys build/recovery/references.jar "$out/specialized.jar" "$out/specializations.json"
run RestoreStrings "$out/specialized.jar" evidence/crypto-state.json "$out/strings.jar" "$out/strings.json"
run ResolveReferences "$out/strings.jar" evidence/dispatcher-state.json evidence/crypto-state.json "$out/references.jar" "$out/references.json"
run -Drecovery.ownerPrefix=me/octo/client/ -Drecovery.allowVerifiedRollbacks=true unlegit.zkm.ControlFlowDeobfuscator "$out/references.jar" "$out/clean.jar" "$out/flow.tsv" --remove-identity-rethrows --normalize-exception-ranges --normalize-zkm-shared-tails --materialize-residual-stacks --specialize-binary-sentinel-tails
run VerifyBytecode "$out/references.jar" "$out/clean.jar" "$out/verification.json"
run EnrichNames "$out/clean.jar" mappings/semantic-mappings.json "$out/parameters.jar" "$out/enriched.json" "$out/parameter-names.json"
run SemanticRemap "$out/parameters.jar" "$out/enriched.json" "$out/semantic.jar" "$out/mappings.json" "$out/remap-report.json"
run ParameterPresentation "$out/semantic.jar" "$out/presentation.jar"
run -jar .cache/deps/vineflower.jar -log=WARN -thr=4 --only=me/octo/client/ "$out/presentation.jar" "$out/sources" > "$out/decompile.log" 2>&1
python3 tools/extract_native.py inputs/PoliSlop.jar build/native-client
run RestoreTrivialNatives "$out/presentation.jar" build/native-client/linux-machine-62-44061000.so evidence/trivial-native-proof.json "$out/native-java.jar"
python3 tools/preserve_key_runtime.py build/recovery/presentation.jar "$out/native-java.jar" "$out/final.jar"
run VerifyBytecode "$out/native-java.jar" "$out/final.jar" "$out/final-verification.json"
python3 tools/native_subset.py "$out/final.jar" "$out/native-subset-complete.jar"
run -jar .cache/deps/vineflower.jar -log=WARN -thr=4 -e="$out/final.jar" "$out/native-subset-complete.jar" "$out/native-sources-complete" > "$out/native-decompile-complete.log" 2>&1
python3 tools/merge_flow_sources.py
python3 tools/summarize_flow.py
python3 tools/prepare_reference.py "$out/sources/me/octo/client"
