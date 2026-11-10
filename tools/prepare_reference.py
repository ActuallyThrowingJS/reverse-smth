"""Remove Vineflower's diagnostic comment dumps; preserve its failure bodies."""
import argparse
from pathlib import Path

parser = argparse.ArgumentParser(description=__doc__)
parser.add_argument("source_root", type=Path)
parser.add_argument("--report", default="reports/decompiler-failures.json")
args = parser.parse_args()
count = 0
for path in args.source_root.rglob("*.java"):
    lines = path.read_text().splitlines(keepends=True)
    result = []
    index = 0
    while index < len(lines):
        if lines[index].lstrip().startswith("// $VF: Couldn't be decompiled"):
            indent = lines[index][:len(lines[index]) - len(lines[index].lstrip())]
            result.append(indent + f"// UNRECOVERED: ZKM control flow; see {args.report}.\n")
            count += 1
            index += 1
            while index < len(lines) and (not lines[index].strip() or lines[index].lstrip().startswith("//")):
                index += 1
        else:
            result.append(lines[index])
            index += 1
    path.write_text("".join(result))
print(f"Removed diagnostic comment dumps from {count} unrecovered methods; failure bodies preserved")
