"""Unpack JNIC LZMA2 resources and carve native images; never load them."""
from pathlib import Path
import json
import lzma
import struct
import argparse
import zipfile
import hashlib

parser = argparse.ArgumentParser(description=__doc__)
parser.add_argument('jar', type=Path)
parser.add_argument('output', type=Path)
args = parser.parse_args()
root = args.output
root.mkdir(parents=True, exist_ok=True)
with zipfile.ZipFile(args.jar) as jar:
    candidates = [n for n in jar.namelist() if n.startswith('dev/jnic/lib/') and n.endswith('.dat')]
    if len(candidates) != 1:
        raise ValueError('Expected exactly one JNIC payload')
    packed = jar.read(candidates[0])
data = lzma.decompress(packed, format=lzma.FORMAT_RAW,
                      filters=[{'id': lzma.FILTER_LZMA2, 'dict_size': 67108864}])
(root / 'payload.bin').write_bytes(data)
images = []
for magic, kind in ((b'\x7fELF', 'elf'), (b'MZ', 'pe'), (b'\xcf\xfa\xed\xfe', 'macho')):
    pos = 0
    while (pos := data.find(magic, pos)) != -1:
        start = pos
        pos += 1
        def read(fmt, offset): return struct.unpack_from(fmt, data, start + offset)
        try:
            if kind == 'elf':
                if data[start+4:start+6] != b'\x02\x01': continue
                machine, = read('<H', 18)
                shoff, = read('<Q', 40)
                size, count = read('<HH', 58)
                end = shoff + size * count
                if not size or end > len(data)-start: continue
                for i in range(count):
                    typ, = read('<I', shoff+i*size+4)
                    off, length = read('<QQ', shoff+i*size+24)
                    if typ != 8: end = max(end, off+length)
                name = f'linux-machine-{machine}-{start}.so'
            elif kind == 'pe':
                pe, = read('<I', 60)
                if data[start+pe:start+pe+4] != b'PE\x00\x00': continue
                machine, count = read('<HH', pe+4)
                optional, = read('<H', pe+20)
                section = pe+24+optional
                end = section+40*count
                for i in range(count):
                    length, off = read('<II', section+i*40+16)
                    end = max(end, off+length)
                name = f'windows-machine-{machine}-{start}.dll'
            else:
                machine, = read('<I', 4)
                count, = read('<I', 16)
                off, end = 32, 32
                for _ in range(count):
                    cmd, size = read('<II', off)
                    if size < 8: raise ValueError('Invalid Mach-O command size')
                    if cmd == 0x19:
                        fileoff, length = read('<QQ', off+40)
                        end = max(end, fileoff+length)
                    off += size
                name = f'macos-machine-{machine}-{start}.dylib'
            if end > len(data)-start: continue
            (root/name).write_bytes(data[start:start+end])
            images.append(dict(file=name, offset=start, size=end, kind=kind, machine=machine, sha256=hashlib.sha256(data[start:start+end]).hexdigest()))
        except struct.error:
            continue
(root/'images.json').write_text(json.dumps(images, indent=2))
print(args.jar.name, len(images), 'native images extracted')
