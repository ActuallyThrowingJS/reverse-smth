"""Keep the three already-recovered ZKM runtime classes at their baseline version."""
import argparse
import json
from pathlib import Path
import zipfile

parser = argparse.ArgumentParser(description=__doc__)
parser.add_argument('baseline', type=Path)
parser.add_argument('candidate', type=Path)
parser.add_argument('output', type=Path)
args = parser.parse_args()
if args.output.resolve() in (args.baseline.resolve(), args.candidate.resolve()):
    raise ValueError('Output must differ from both inputs')
root = Path(__file__).resolve().parent.parent
mapping = json.loads((root / 'mappings/semantic-mappings.json').read_text())
roles = {'ZkmKeyFactory', 'ZkmMasterKeyFactory', 'ZkmFallbackKeyFactory'}
preserved = {v + '.class' for v in mapping['classes'].values() if v.rsplit('/', 1)[-1] in roles}
if len(preserved) != 3:
    raise ValueError('Expected three identified runtime classes')
with zipfile.ZipFile(args.baseline) as base, zipfile.ZipFile(args.candidate) as candidate:
    if not preserved <= set(base.namelist()) & set(candidate.namelist()):
        raise ValueError('Runtime class missing')
    # Context specialization must not have introduced new runtime entry points.
    if any(b'$recovered$' in candidate.read(n) for n in preserved):
        raise ValueError('Runtime class has specialized methods; review required')
    with zipfile.ZipFile(args.output, 'w', compression=zipfile.ZIP_DEFLATED) as output:
        for entry in candidate.infolist():
            output.writestr(entry, base.read(entry.filename) if entry.filename in preserved else candidate.read(entry.filename))
print('Preserved all three ZKM key-runtime classes from the baseline analysis artifact')
