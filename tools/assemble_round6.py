"""Assemble the caller-proven pass while preserving checked source alternatives."""
from pathlib import Path
import json
import re
import shutil

root = Path(__file__).resolve().parent.parent
work = root / 'build/round6'
target = work / 'assembled'
previous = root / 'reference/client/src/main/java'
shutil.copytree(work / 'sources', target, dirs_exist_ok=True)
for source in (work / 'focused-vf').rglob('*.java'):
    destination = target / source.relative_to(work / 'focused-vf')
    destination.parent.mkdir(parents=True, exist_ok=True)
    shutil.copy2(source, destination)
plan = json.loads((root / 'mappings/semantic-mappings.json').read_text())
runtime = {v for v in plan['classes'].values() if v.rsplit('/', 1)[-1] in {'ZkmKeyFactory', 'ZkmMasterKeyFactory', 'ZkmFallbackKeyFactory'}}
alternatives = json.loads((root / 'reports/extended/source-choices.json').read_text())
mapping = json.loads((work / 'final-names.json').read_text())
variants = json.loads((work / 'specializations.json').read_text()) + json.loads((work / 'inherited/specializations.json').read_text())
changed = {mapping['classes'].get(r['owner'], r['owner']).split('$')[0] for r in variants}
assert not changed & {p[:-5] for p in alternatives}, 'A checked alternative gained new declarations; regenerate and recheck it.'
for owner in runtime:
    shutil.copy2(previous / (owner + '.java'), target / (owner + '.java'))
for relative in alternatives:
    shutil.copy2(previous / relative, target / relative)
focused = set(json.loads((work / 'focused-owners.json').read_text()))
def owner(line):
    match = re.search(r" in class (\S+) couldn't be decompiled", line)
    return match[1] if match else None
def in_scope(value, scope):
    return value is not None and any(value == s or value.startswith(s + '$') for s in scope)
def messages(path):
    return [line for line in path.read_text(errors='replace').splitlines() if "couldn't be decompiled" in line or "couldn't be written" in line]
baseline = json.loads((root / 'reports/decompiler-failures.json').read_text())
lines = [line for line in messages(work / 'decompile.log') if owner(line) not in runtime and not in_scope(owner(line), focused)]
lines.extend(line for line in messages(work / 'focused-vf.log') if "couldn't be decompiled" in line)
lines.extend(line for line in baseline['failures'] if owner(line) in runtime)
lines = [line for line in lines if not in_scope(owner(line), {p[:-5] for p in alternatives})]
def keys(lines):
    result = set()
    for line in lines:
        match = re.search(r"Method (\S+) (\S+) in class (\S+) couldn't be decompiled", line)
        if match and '$recovered$' not in match[1]:
            result.add((match[3], match[1], match[2]))
    return result
before, after = keys(baseline['failures']), keys(lines)
assert not after - before, sorted(after - before)[:10]
old_files = {p.relative_to(previous) for p in previous.rglob('*.java')}
new_files = {p.relative_to(target) for p in target.rglob('*.java')}
assert not old_files - new_files, old_files - new_files
report = dict(tool='Vineflower 1.11.2 with preserved compiler/API-checked alternatives', sourceFiles=len(new_files), methodFailures=sum("couldn't be decompiled" in line for line in lines), classWriteFailures=sum("couldn't be written" in line for line in lines), failures=lines)
(work / 'assembled-failures.json').write_text(json.dumps(report, indent=2) + '\n')
summary = dict(newCallerProvenVariants=len(variants), newVariantsWithJavaAndNoRecordedMethodFailure=len(json.loads((work / 'readable-new-variants.json').read_text())), newGenericDecompilerFailures=len(after - before), additionalGenericMethodsRecovered=len(before - after), remainingGenericMethodFailures=len(after), classWriteFailures=report['classWriteFailures'], sourceFiles=len(new_files), totalRegisteredNativeBodiesRecovered=34, registeredNativeBodiesRemaining=484, fullModBuildSuccessful=False)
(work / 'summary.json').write_text(json.dumps(summary, indent=2) + '\n')
print(json.dumps(summary, indent=2))
