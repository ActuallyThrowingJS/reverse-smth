#!/usr/bin/env bash
set -euo pipefail
cd "$(dirname "$0")/.."
bash tools/build.sh
export CLASSPATH='build/classes:.cache/deps/*'
"${JAVA_HOME:+$JAVA_HOME/bin/}java" SemanticRemapTest
"${JAVA_HOME:+$JAVA_HOME/bin/}java" recovery.nativecode.JnicConstantStreamTest tests/data/chacha-input.json tests/data/client-native-pool.bin
