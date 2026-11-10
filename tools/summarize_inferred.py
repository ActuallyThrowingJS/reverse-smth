"""Inventory conditional Java declarations; decompiler success is not behavior proof."""
import argparse
import json
from pathlib import Path
import re

parser = argparse.ArgumentParser(description=__doc__)
parser.add_argument('variants', type=Path)
parser.add_argument('mappings', type=Path)
parser.add_argument('sources', type=Path)
parser.add_argument('log', type=Path)
parser.add_argument('output', type=Path)
args = parser.parse_args()
variants = json.loads(args.variants.read_text())
mapping = json.loads(args.mappings.read_text())
log = args.log.read_text(errors='replace')
failed = set(re.findall(r"Method (\S+) (\S+) in class (\S+) couldn't be decompiled", log))
names = {(m['owner'], m['name'], m['descriptor']): m['newName'] for m in mapping['methods']}
readable = []
for variant in variants:
    owner = mapping['classes'].get(variant['owner'], variant['owner'])
    name = names.get((variant['owner'], variant['variantName'], variant['variantDescriptor']), variant['variantName'])
    desc = re.sub(r'L([^;]+);', lambda m: 'L' + mapping['classes'].get(m[1], m[1]) + ';', variant['variantDescriptor'])
    source = args.sources / (owner.split('$')[0] + '.java')
    if (name, desc, owner) in failed or not source.is_file():
        continue
    # Constructor contexts need an AST-based inventory; none occurred in this run.
    if name == '<init>':
        continue
    if re.search(r'(?m)^\s*(?:public|protected|private)[^;{}]*\b' + re.escape(name) + r'\s*\(', source.read_text()):
        readable.append(dict(variant, source=str(source.relative_to(args.sources))))
report = {
    'analysisOnly': True,
    'runtimeCallerReachabilityEstablished': False,
    'contextsGenerated': len(variants),
    'contextsWithJavaDeclarationsAndNoRecordedDecompilerFailure': len(readable),
    'inferredMethodDecompilerFailures': sum('$inferred$' in n for n, d, o in failed),
    'allClassWriteFailureWarnings': log.count("couldn't be written"),
    'note': 'Declaration inventory only; no claim of type checking, complete source recovery or application equivalence.',
    'declarations': readable,
}
args.output.write_text(json.dumps(report, indent=2) + '\n')
print(json.dumps({k: v for k, v in report.items() if k != 'declarations'}, indent=2))
