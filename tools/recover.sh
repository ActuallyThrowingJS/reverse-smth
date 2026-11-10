#!/usr/bin/env bash
set -euo pipefail
cd "$(dirname "$0")/.."
bash tools/build.sh
(cd inputs && sha256sum --check SHA256SUMS)
mkdir -p build/recovery
export CLASSPATH='build/classes:.cache/deps/*'
run() { "${JAVA_HOME:+$JAVA_HOME/bin/}java" -Xmx5g "$@"; }
client=inputs/PoliSlop.jar
out=build/recovery
run RecoverMasterKeys "$client" "$out/master-keys.json" "$out/keyed.jar" evidence/native-key-sites.json
run VerifyMasterKeys "$client" "$out/master-keys.json"
run RestoreStrings "$out/keyed.jar" evidence/crypto-state.json "$out/strings.jar" "$out/strings.json"
run ResolveReferences "$out/strings.jar" evidence/dispatcher-state.json evidence/crypto-state.json "$out/references.jar" "$out/references.json"
run VerifyBytecode "$out/strings.jar" "$out/references.jar" "$out/verification.json"
run EnrichNames "$out/references.jar" mappings/semantic-mappings.json "$out/parameters.jar" "$out/enriched.json" "$out/parameter-names.json"
run SemanticRemap "$out/parameters.jar" "$out/enriched.json" "$out/semantic.jar" "$out/mappings.json" "$out/remap-report.json"
run ParameterPresentation "$out/semantic.jar" "$out/presentation.jar"
run -jar .cache/deps/vineflower.jar -log=WARN -thr=4 --only=me/octo/client/ "$out/presentation.jar" "$out/sources"
python3 tools/prepare_reference.py "$out/sources/me/octo/client"
