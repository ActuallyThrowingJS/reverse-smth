#!/usr/bin/env bash
set -euo pipefail
cd "$(dirname "$0")/.."
mkdir -p .cache/deps build/classes
fetch() {
  local relative="$1" file="$2" expected="$3"
  if [[ ! -f ".cache/deps/$file" ]] || ! printf '%s  %s\n' "$expected" ".cache/deps/$file" | sha256sum --check --status; then
    curl --fail --location --retry 2 "https://repo.maven.apache.org/maven2/$relative" -o ".cache/deps/$file"
  fi
  printf '%s  %s\n' "$expected" ".cache/deps/$file" | sha256sum --check --status
}
fetch org/ow2/asm/asm/9.8/asm-9.8.jar asm.jar 876eab6a83daecad5ca67eb9fcabb063c97b5aeb8cf1fca7a989ecde17522051
fetch org/ow2/asm/asm-tree/9.8/asm-tree-9.8.jar asm-tree.jar 14b7880cb7c85eed101e2710432fc3ffb83275532a6a894dc4c4095d49ad59f1
fetch org/ow2/asm/asm-analysis/9.8/asm-analysis-9.8.jar asm-analysis.jar e640732fbcd3c6271925a504f125e38384688f4dfbbf92c8622dfcee0d09edb9
fetch org/ow2/asm/asm-util/9.8/asm-util-9.8.jar asm-util.jar 8ba0460ecb28fd0e2980e5f3ef3433a513a457bc077f81a53bdc75b587a08d15
fetch org/ow2/asm/asm-commons/9.8/asm-commons-9.8.jar asm-commons.jar 3301a1c1cb4c59fcc5292648dac1d7c5aed4c0f067dfbe88873b8cdfe77404f4
fetch com/google/code/gson/gson/2.11.0/gson-2.11.0.jar gson.jar 57928d6e5a6edeb2abd3770a8f95ba44dce45f3b23b7a9dc2b309c581552a78b
fetch org/vineflower/vineflower/1.11.2/vineflower-1.11.2.jar vineflower.jar e1e2415e7f78b34960402c4beddfc88e033d7842a23ecd132a8ec2eadd54f6bf
mapfile -d '' sources < <(find tools/java tools/vendor tests/java reconstruction/native-java/src/main/java -name '*.java' -print0)
"${JAVA_HOME:+$JAVA_HOME/bin/}javac" --release 21 -cp '.cache/deps/*' -d build/classes "${sources[@]}"
