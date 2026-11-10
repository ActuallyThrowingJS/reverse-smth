"""Replace four legacy loader native declarations with reviewed Java bodies."""
from pathlib import Path
import json
import re

root = Path(__file__).resolve().parent.parent
mapping = json.loads((root / 'mappings/legacy-loader-identifiers.json').read_text())
rows = json.loads((root / 'evidence/native-round5/recipes.json').read_text())
for row in rows:
    if row['label'] != 'loader':
        continue
    owner = re.sub('[Il]{12,}', lambda m: mapping.get(m[0], m[0]), row['owner'])
    name = mapping.get(row['name'], row['name'])
    path = root / 'reference/loader/src/main/java' / (owner + '.java')
    text = path.read_text()
    pattern = r'(?m)^[^\n]*\bnative\b[^\n]*' + re.escape(name) + r'\([^;]*?\);'
    kind = row['recipe']
    def matches(declaration):
        if kind == 'halt':
            return 'Thread' in declaration and 'Throwable' in declaration
        if kind == 'contextClassLoader':
            return 'ClassLoader' in declaration and bool(re.search(r'\(\s*\)', declaration))
        return 'ModContainer' in declaration
    candidates = [m for m in re.finditer(pattern, text) if matches(m[0])]
    if not candidates:
        # Idempotent replay against the already updated reference tree.
        if kind == 'halt' and 'Runtime.getRuntime().halt(1);' in text:
            continue
        if kind == 'contextClassLoader' and 'return Thread.currentThread().getContextClassLoader();' in text:
            continue
        if kind == 'modVersion' and '.getMetadata().getVersion().getFriendlyString();' in text:
            continue
        raise ValueError('Native declaration missing: ' + owner + '.' + name)
    if len(candidates) != 1:
        raise ValueError('Ambiguous native declaration: ' + owner + '.' + name)
    match = candidates[0]
    if kind == 'halt':
        body = 'Runtime.getRuntime().halt(1);'
    elif kind == 'contextClassLoader':
        body = 'return Thread.currentThread().getContextClassLoader();'
    else:
        argument = re.search(r'\b(\w+)\s*\)', match[0])[1]
        body = f'return {argument}.getMetadata().getVersion().getFriendlyString();'
    replacement = match[0].replace('native ', '').rstrip(';') + ' {\n      ' + body + '\n   }'
    path.write_text(text[:match.start()] + replacement + text[match.end():])
    print('Reconstructed loader body:', kind, owner, name)
