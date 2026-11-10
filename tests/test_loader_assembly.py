"""Check display aliases never corrupt literals and recovery keeps method identity."""
import importlib.util
from pathlib import Path
import re

root = Path(__file__).resolve().parent.parent
spec = importlib.util.spec_from_file_location('assembly', root / 'tools/assemble_loader.py')
assembly = importlib.util.module_from_spec(spec)
spec.loader.exec_module(assembly)
original, alias = next(iter(assembly.MAPPING.items()))
source = f'   public void {original}(long input) {{ String value = "{original}"; /* {original} */ }}'
rendered = assembly.display(source)
assert f'void {alias}(' in rendered
assert f'"{original}"' in rendered and f'/* {original} */' in rendered
assert (alias, ('long',)) in assembly.methods(rendered)
body = assembly.cleanup_body()
methods = assembly.methods(body)
assert len(methods) == 1
name = next(iter(methods))[0]
assert name == 'Obf00236$recovered$a35241ef3c05d2d9'
assert 'void finishInitialization(' not in body
assert 'Obf00116$recovered$8eae88b1c14cdf6b(prepared, loadKey)' in body
assert 'lol.polinexclient.loader.Obf00091.Obf00120' in body
assert 'finally' in body and 'preparedPayload' not in body
print('PASS literal/comment preservation, method identity, parameter parsing and cleanup references')
