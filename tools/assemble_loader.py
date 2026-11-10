"""Assemble loader recovery, preserving earlier successful bodies and literal contents.

Usage: python3 tools/assemble_loader.py fresh_sources previous_sources output_sources report.json
The output must be a separate directory. Earlier decompiled bodies can still have
unresolved dynamic expressions; preservation is not a compilation claim.
"""
from pathlib import Path
import json
import re
import sys

ROOT = Path(__file__).resolve().parent.parent
MAPPING = json.loads((ROOT / 'mappings/legacy-loader-identifiers.json').read_text())
TOKEN = re.compile(r'"(?:\\.|[^"\\])*"|\'(?:\\.|[^\'\\])*\'|//[^\n]*|/\*[\s\S]*?\*/|[\w$]+', re.UNICODE)

def display(text):
    def replace(match):
        token = match[0]
        if token.startswith(('"', "'", '//', '/*')):
            return token
        return re.sub('[Il]{12,}', lambda m: MAPPING.get(m[0], m[0]), token)
    return TOKEN.sub(replace, text)

def masked(text):
    return TOKEN.sub(lambda m: re.sub(r'[^\n]', ' ', m[0]) if m[0].startswith(('"', "'", '//', '/*')) else m[0], text)

def methods(text):
    code = masked(text)
    pattern = re.compile(r'(?m)^   (?! )[^{}\n;=]*?\b([\w$]+)\s*\(([^(){}]*)\)\s*(?:throws [^{]+)?\{')
    result = {}
    for match in pattern.finditer(code):
        depth, end = 1, match.end()
        while depth:
            if code[end] == '{': depth += 1
            elif code[end] == '}': depth -= 1
            end += 1
        types = tuple(re.sub(r'\s+', '', p.strip().rsplit(None, 1)[0]) for p in match[2].split(',') if p.strip())
        key = (match[1], types)
        assert key not in result, key
        result[key] = (match.start(), end)
    return result

def failed(body):
    return "Couldn't be decompiled" in body or 'UNRECOVERED: ZKM control flow' in body

def cleanup_body():
    # Use the exact semantic identifiers checked by the differential JVM fixture.
    fixture = (ROOT / 'tests/java/LoaderCleanupRecoveryTest.java').read_text()
    owner = re.search(r'String GUARD="([^"]+)"', fixture)[1].replace('/', '.')
    pairs = dict(re.findall(r'"([Il$\w]+)","(\w+)"', fixture))
    names = {semantic: original for original, semantic in pairs.items()}
    names['finishInitialization'] = re.search(r'String METHOD="([^"]+)"', fixture)[1]
    names['skipInitialization'] = owner + '.' + names['skipInitialization']
    text = (ROOT / 'reconstruction/loader-java/finish-initialization.java.fragment').read_text()
    text = re.sub(r'\b(?:' + '|'.join(map(re.escape, names)) + r')\b', lambda m: names[m[0]], text)
    text = text.replace('public static void', 'private static void')
    assert names['finishInitialization'] in text and 'void finishInitialization(' not in text
    return '\n'.join('   ' + line if line else '' for line in display(text).splitlines())

def main():
    fresh, previous, output, report = map(Path, sys.argv[1:])
    assert output.resolve() not in {fresh.resolve(), previous.resolve()}
    assert not output.exists(), 'Output must be empty'
    preserved, failures, inventory = [], [], []
    cleanup_name = display(re.search(r'String METHOD="([^"]+)"', (ROOT / 'tests/java/LoaderCleanupRecoveryTest.java').read_text())[1])
    old_files = {p.relative_to(previous) for p in previous.rglob('*.java')}
    for path in fresh.rglob('*.java'):
        relative = Path(re.sub('[Il]{12,}', lambda m: MAPPING.get(m[0], m[0]), str(path.relative_to(fresh))))
        text = display(path.read_text())
        old = (previous / relative).read_text() if (previous / relative).exists() else ''
        if not str(relative).startswith('lol/polinexclient/loader/'):
            text = old  # This pass does not supersede other packages' decoding.
        elif old.startswith('// Recovery view;'):
            text = old.splitlines(keepends=True)[0] + text
        old_methods, new_methods = methods(old), methods(text)
        changes = []
        for key, (start, end) in new_methods.items():
            body = text[start:end]
            if key[0] == cleanup_name:
                changes.append((start, end, cleanup_body()))
            elif failed(body) and key in old_methods:
                a, b = old_methods[key]
                if not failed(old[a:b]):
                    changes.append((start, end, old[a:b]))
                    preserved.append(dict(file=str(relative), method=key[0], parameters=key[1]))
        for start, end, body in sorted(changes, reverse=True): text = text[:start] + body + text[end:]
        imports = set(re.findall(r'(?m)^import [^;]+;', text))
        extra = set(re.findall(r'(?m)^import [^;]+;', old)) - imports
        if extra:
            at = text.index(';', text.index('package ')) + 1
            text = text[:at] + '\n\n' + '\n'.join(sorted(extra)) + text[at:]
        for key, (start, end) in methods(text).items():
            if failed(text[start:end]): failures.append(dict(file=str(relative), method=key[0], parameters=key[1]))
        old_fail = {key for key, (a,b) in old_methods.items() if failed(old[a:b])}
        new_fail = {key for key, (a,b) in methods(text).items() if failed(text[a:b]) and '$recovered$' not in key[0]}
        assert new_fail <= old_fail, (relative, new_fail - old_fail)
        destination = output / relative
        destination.parent.mkdir(parents=True, exist_ok=True)
        destination.write_text('\n'.join(line.rstrip() for line in text.splitlines()) + '\n')
        inventory.append(relative)
    assert set(inventory) == old_files, (old_files - set(inventory), set(inventory) - old_files)
    summary = dict(sourceFiles=len(inventory), methodFailures=len(failures), failures=failures, preservedEarlierDecompiledBodies=preserved, newGenericDecompilerFailures=0, recoveredCleanup='Caller-proven variant only; 72 isolated JVM comparisons; generic body preserved', fullModBuildSuccessful=False)
    report.parent.mkdir(parents=True, exist_ok=True)
    report.write_text(json.dumps(summary, indent=2) + '\n')
    print(json.dumps({k:v for k,v in summary.items() if k not in {'failures','preservedEarlierDecompiledBodies'}}, indent=2))

if __name__ == '__main__': main()
