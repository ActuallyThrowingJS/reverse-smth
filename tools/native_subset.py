"""Extract restored native owners and their nested classes for focused decompilation."""
import argparse
import json
from pathlib import Path
import zipfile

parser = argparse.ArgumentParser(description=__doc__)
parser.add_argument('input', type=Path)
parser.add_argument('output', type=Path)
args = parser.parse_args()
root = Path(__file__).resolve().parent.parent
owners = {r['owner'] for r in json.loads((root / 'evidence/trivial-native-proof.json').read_text())}
with zipfile.ZipFile(args.input) as source, zipfile.ZipFile(args.output, 'w', compression=zipfile.ZIP_DEFLATED) as output:
    for name in source.namelist():
        if name.endswith('.class') and any(name == owner + '.class' or name.startswith(owner + '$') for owner in owners):
            output.writestr(name, source.read(name))
print('Prepared restored native owners and nested classes')
