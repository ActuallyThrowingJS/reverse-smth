"""Compare the baseline decompilation with the context-specialized recovery."""
import json
from pathlib import Path
import re

root = Path(__file__).resolve().parent.parent
work = root / 'build/flow'
base = json.loads((root / 'reports/baseline-decompiler-failures.json').read_text())
old_map = json.loads((root / 'mappings/semantic-mappings-final.json').read_text())
new_map = json.loads((work / 'mappings.json').read_text())
variants = json.loads((work / 'specializations.json').read_text())
lines = (work / 'final-decompile.log').read_text(errors='replace').splitlines()
failed_lines = [s for s in lines if "couldn't be decompiled" in s or "couldn't be written" in s]

def failures(lines):
    result = set()
    for line in lines:
        match = re.search(r"Method (\S+) (\S+) in class (\S+) couldn't be decompiled", line)
        if match:
            result.add((match[3], match[1], match[2]))
    return result

def descriptor(value, mapping):
    return re.sub(r'L([^;]+);', lambda m: 'L' + mapping['classes'].get(m[1], m[1]) + ';', value)

old_failed = failures(base['failures'])
new_failed = failures(lines)
old_names = {(m['owner'], m['name'], m['descriptor']): m['newName'] for m in old_map['methods']}
readable = []
previously_failed = set()
for variant in variants:
    owner, name, desc = variant['owner'], variant['originalName'], variant['descriptor']
    old_key = (old_map['classes'].get(owner, owner), old_names.get((owner, name, desc), name), descriptor(desc, old_map))
    new_owner = new_map['classes'].get(owner, owner)
    clone = variant['cloneName']
    new_key = (new_owner, clone, descriptor(desc, new_map))
    relative = Path('reference/client/src/main/java') / (new_owner.split('$')[0] + '.java')
    source = work / 'sources' / (new_owner.split('$')[0] + '.java')
    if new_key in new_failed or not source.is_file():
        continue
    text = source.read_text()
    if not re.search(r'(?m)^\s*(?:public|protected|private)[^;{}]*\b' + re.escape(clone) + r'\s*\(', text):
        continue
    row = dict(variant, readableFile=str(relative), originalPreviouslyFailed=old_key in old_failed)
    readable.append(row)
    if old_key in old_failed:
        previously_failed.add(old_key)

sources = list((work / 'sources/me/octo/client').rglob('*.java'))
generic_failed = {key for key in new_failed if '$recovered$' not in key[1]}
recovered_generic = old_failed - generic_failed
new_generic_failures = generic_failed - old_failed
summary = {
    'analysisOnly': True,
    'previouslyFailedGenericMethodsNowDecompiled': len(recovered_generic),
    'newGenericDecompilerFailures': len(new_generic_failures),
    'genericMethodsPreserved': True,
    'variantsGenerated': len(variants),
    'variantsWithJavaDeclarationsAndNoDecompilerFailure': len(readable),
    'previouslyFailedOriginalMethodsWithReadableVariants': len(previously_failed),
    'failedMethodWarningsIncludingGenericAndVariantMethods': sum("couldn't be decompiled" in x for x in failed_lines),
    'classWriteFailures': sum("couldn't be written" in x for x in failed_lines),
    'sourceFiles': len(sources),
    'note': 'A readable variant covers its recorded constant-key context, not all possible arguments. Decompiler success is not application behavior validation.',
}
(root / 'reports/recovered-generic-methods.json').write_text(json.dumps(sorted(recovered_generic), indent=2) + '\n')
if new_generic_failures:
    raise ValueError('New generic decompiler failures: ' + str(sorted(new_generic_failures)))
(root / 'reports/control-flow-summary.json').write_text(json.dumps(summary, indent=2) + '\n')
(root / 'reports/readable-key-variants.json').write_text(json.dumps(readable, indent=2) + '\n')
(root / 'reports/decompiler-failures.json').write_text(json.dumps(dict(tool='Vineflower 1.11.2', sourceFiles=len(sources), methodFailures=summary['failedMethodWarningsIncludingGenericAndVariantMethods'], classWriteFailures=summary['classWriteFailures'], failures=failed_lines), indent=2) + '\n')
print(json.dumps(summary, indent=2))
