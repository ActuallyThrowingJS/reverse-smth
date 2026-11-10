#!/usr/bin/env bash
set -euo pipefail
cd "$(dirname "$0")/.."
mkdir -p .cache/deps build/classes
fetch() {
  local relative="$1" file="$2" expected="$3"
  if [[ ! -f ".cache/deps/$file" ]]; then
    curl --fail --location --retry 2 "https://repo.maven.apache.org/maven2/$relative" -o ".cache/deps/$file"
  fi
  printf '%s  %s\n' "$expected" ".cache/deps/$file" | sha256sum --check --status
}
fetch org/ow2/asm/asm/9.7.1/asm-9.7.1.jar asm.jar 8cadd43ac5eb6d09de05faecca38b917a040bb9139c7edeb4cc81c740b713281
fetch org/ow2/asm/asm-tree/9.7.1/asm-tree-9.7.1.jar asm-tree.jar 9929881f59eb6b840e86d54570c77b59ce721d104e6dfd7a40978991c2d3b41f
fetch org/ow2/asm/asm-analysis/9.7.1/asm-analysis-9.7.1.jar asm-analysis.jar 85b29371884ba31bb76edf22323c2c24e172c3267a67152eba3d1ccc2e041ef2
fetch org/ow2/asm/asm-util/9.7.1/asm-util-9.7.1.jar asm-util.jar f885be71b5c90556f5f1ad1c4f9276b29b96057c497d46666fe4ddbec3cb43c6
fetch org/ow2/asm/asm-commons/9.7.1/asm-commons-9.7.1.jar asm-commons.jar 9a579b54d292ad9be171d4313fd4739c635592c2b5ac3a459bbd1049cddec6a0
fetch com/google/code/gson/gson/2.11.0/gson-2.11.0.jar gson.jar 57928d6e5a6edeb2abd3770a8f95ba44dce45f3b23b7a9dc2b309c581552a78b
fetch org/vineflower/vineflower/1.11.2/vineflower-1.11.2.jar vineflower.jar e1e2415e7f78b34960402c4beddfc88e033d7842a23ecd132a8ec2eadd54f6bf
mapfile -d '' sources < <(find tools/java tools/vendor tests/java reconstruction/native-java/src/main/java -name '*.java' -print0)
"${JAVA_HOME:+$JAVA_HOME/bin/}javac" --release 21 -cp '.cache/deps/*' -d build/classes "${sources[@]}"
