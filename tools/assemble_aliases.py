"""Assemble class aliases with canonical failure comparison and nested-source accounting."""
from pathlib import Path
import hashlib
from collections import Counter
import json
import re
import shutil
import zipfile

root = Path(__file__).resolve().parent.parent
work = root / 'build/round7'
baseline_root = work / 'baseline'
if not (baseline_root / 'reports/decompiler-failures.json').exists():
    shutil.copytree(root / 'reference/client/src/main/java', baseline_root / 'reference/client/src/main/java')
    (baseline_root / 'reports').mkdir(parents=True, exist_ok=True)
    shutil.copy2(root / 'reports/decompiler-failures.json', baseline_root / 'reports/decompiler-failures.json')
previous = baseline_root / 'reference/client/src/main/java'
target = work / 'assembled'
delta = json.loads((work / 'class-delta.json').read_text())['classes']
inverse = {v: k for k, v in delta.items()}
shutil.copytree(work / 'sources', target, dirs_exist_ok=True)
baseline = json.loads((baseline_root / 'reports/decompiler-failures.json').read_text())
runtime = {v for v in json.loads((root / 'mappings/semantic-mappings.json').read_text())['classes'].values() if v.rsplit('/', 1)[-1] in {'ZkmKeyFactory', 'ZkmMasterKeyFactory', 'ZkmFallbackKeyFactory'}}
alternatives = set(json.loads((root / 'reports/extended/source-choices.json').read_text()))
approved = set(json.loads((work / 'approved-alternatives.json').read_text())['approved'])
assert alternatives == approved, 'Regenerate or recheck affected alternatives before assembling.'
with zipfile.ZipFile(root / 'build/round6/final.jar') as binary:
    for owner in runtime:
        assert not any(name.encode() in binary.read(owner + '.class') for name in delta), 'Runtime source needs remapping.'
        shutil.copy2(previous / (owner + '.java'), target / (owner + '.java'))
for relative in alternatives:
    shutil.copy2(previous / relative, target / relative)
def owner(line):
    match = re.search(r" in class (\S+) couldn't be decompiled", line)
    return match[1] if match else None
def scope(value, owners):
    return value is not None and any(value == x or value.startswith(x + '$') for x in owners)
lines = [line for line in (work / 'decompile.log').read_text(errors='replace').splitlines() if "couldn't be decompiled" in line or "couldn't be written" in line]
lines = [line for line in lines if owner(line) not in runtime and not scope(owner(line), {p[:-5] for p in alternatives})]
lines.extend(line for line in baseline['failures'] if owner(line) in runtime)
def keys(lines, restore=False):
    result = set()
    for line in lines:
        match = re.search(r"Method (\S+) (\S+) in class (\S+) couldn't be decompiled", line)
        if match and '$recovered$' not in match[1]:
            name, descriptor, owning = match[1], match[2], match[3]
            if restore:
                owning = inverse.get(owning, owning)
                descriptor = re.sub(r'L([^;]+);', lambda m: 'L' + inverse.get(m[1], m[1]) + ';', descriptor)
            result.add((owning, name, descriptor))
    return result
before, after = keys(baseline['failures']), keys(lines, True)
assert not after - before, sorted(after - before)[:10]
assert not (Counter(x for x in lines if "couldn't be written" in x) - Counter(x for x in baseline['failures'] if "couldn't be written" in x)), "New class-write warnings"
reviewed = {r['oldOwner']: r for r in json.loads((root / 'evidence/nested-alias-switch-helpers.json').read_text())}
migrations = []
with zipfile.ZipFile(root / 'build/round6/final.jar') as binary:
    for path in previous.rglob('*.java'):
        name = str(path.relative_to(previous))[:-5]
        mapped = delta.get(name, name)
        if (target / (mapped + '.java')).is_file():
            continue
        outer = target / (mapped.split('$')[0] + '.java')
        leaf = mapped.rsplit('$', 1)[-1]
        assert '$' in mapped and outer.is_file(), ('Missing source', name, mapped)
        if re.search(r'\b(?:class|interface|enum|record)\s+' + re.escape(leaf) + r'\b', outer.read_text()):
            status = 'Nested declaration merged into outer source'
        else:
            proof = reviewed[name]
            assert hashlib.sha256(binary.read(name + '.class')).hexdigest() == proof['oldClassSha256']
            status = proof['status']
        migrations.append(dict(oldSource=name + '.java', outerSource=str(outer.relative_to(target)), status=status))
sources = list((target / 'me/octo/client').rglob('*.java'))
report = dict(tool='Vineflower 1.11.2 with rechecked CFR/Procyon alternatives and consistent nested aliases', sourceFiles=len(sources), methodFailures=sum("couldn't be decompiled" in x for x in lines), classWriteFailures=sum("couldn't be written" in x for x in lines), failures=lines)
(work / 'assembled-failures.json').write_text(json.dumps(report, indent=2) + '\n')
(work / 'source-migrations.json').write_text(json.dumps(migrations, indent=2) + '\n')
summary = dict(newTopLevelModuleAliases=32, additionalNestedClassAliases=362, currentTopLevelClassAliases=111, currentNestedClassAliases=364, currentExplicitClassAliases=475, classNamesChangedThisPass=len(delta), sourceFiles=len(sources), formerlyStandaloneNestedDeclarationsMerged=sum(x['status'].startswith('Nested declaration') for x in migrations), syntheticEnumSwitchHelpersFolded=sum(x['status'].startswith('Synthetic enum-switch') for x in migrations), newGenericDecompilerFailures=len(after - before), additionalGenericMethodsRecovered=len(before - after), remainingGenericMethodFailures=len(after), classWriteFailures=report['classWriteFailures'], compilerAndApiRecheckedAlternatives=len(approved), totalRegisteredNativeBodiesRecovered=34, registeredNativeBodiesRemaining=484, fullModBuildSuccessful=False)
(work / 'summary.json').write_text(json.dumps(summary, indent=2) + '\n')
print(json.dumps(summary, indent=2))
