"""Assemble native-body updates and preserve the baseline key-runtime sources."""
import json
from pathlib import Path
import re
import shutil

root = Path(__file__).resolve().parent.parent
work = root / 'build/flow'
plan = json.loads((root / 'mappings/semantic-mappings.json').read_text())
roles = {'ZkmKeyFactory', 'ZkmMasterKeyFactory', 'ZkmFallbackKeyFactory'}
runtime = {v for v in plan['classes'].values() if v.rsplit('/', 1)[-1] in roles}
owners = {r['owner'] for r in json.loads((root / 'evidence/trivial-native-proof.json').read_text())}
for name in runtime:
    original = root / 'build/recovery/sources' / (name + '.java')
    if not original.is_file():
        raise ValueError('Baseline runtime source missing: ' + str(original))
    shutil.copy2(original, work / 'sources' / (name + '.java'))
for source in (work / 'native-sources-complete').rglob('*.java'):
    relative = source.relative_to(work / 'native-sources-complete')
    target = work / 'sources' / relative
    target.parent.mkdir(parents=True, exist_ok=True)
    shutil.copy2(source, target)

native_lines = (work / 'native-decompile-complete.log').read_text(errors='replace').splitlines()
if any(not (work / "native-sources-complete" / (owner + ".java")).is_file() for owner in owners):
    raise ValueError("Restored native owner source missing")

def method_owner(line):
    match = re.search(r" in class (\S+) couldn't be decompiled", line)
    return match[1] if match else None

def native_owner(name):
    return name is not None and any(name == owner or name.startswith(owner + '$') for owner in owners)

lines = (work / 'decompile.log').read_text(errors='replace').splitlines()
filtered = [line for line in lines if method_owner(line) not in runtime and not native_owner(method_owner(line))]
base = json.loads((root / 'reports/baseline-decompiler-failures.json').read_text())['failures']
filtered.extend(line for line in base if method_owner(line) in runtime)
filtered.extend(line for line in native_lines if "couldn't be written" not in line)
(work / 'final-decompile.log').write_text('\n'.join(filtered) + '\n')
print('Assembled restored native Java sources and baseline key-runtime sources')
