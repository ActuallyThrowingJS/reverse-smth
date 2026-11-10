#!/usr/bin/env bash
set -euo pipefail
cd "$(dirname "$0")/.."
bash tools/build.sh
export CLASSPATH='build/classes:.cache/deps/*'
"${JAVA_HOME:+$JAVA_HOME/bin/}java" SemanticRemapTest
"${JAVA_HOME:+$JAVA_HOME/bin/}java" recovery.nativecode.JnicConstantStreamTest tests/data/chacha-input.json tests/data/client-native-pool.bin
"${JAVA_HOME:+$JAVA_HOME/bin/}java" SpecializeKeysTest
"${JAVA_HOME:+$JAVA_HOME/bin/}java" ControlFlowTest
python3 tools/extract_native.py inputs/PoliSlop.jar build/native-client
"${JAVA_HOME:+$JAVA_HOME/bin/}java" TrivialNativeTest build/native-client/linux-machine-62-44061000.so evidence/trivial-native-proof.json

"${JAVA_HOME:+$JAVA_HOME/bin/}java" CheckSourceApiTest

"${JAVA_HOME:+$JAVA_HOME/bin/}java" ApplyInferredProfilesTest

"${JAVA_HOME:+$JAVA_HOME/bin/}java" AuditContextCallersTest
"${JAVA_HOME:+$JAVA_HOME/bin/}java" InferModuleNamesTest

"${JAVA_HOME:+$JAVA_HOME/bin/}java" ExpandClassAliasesTest
