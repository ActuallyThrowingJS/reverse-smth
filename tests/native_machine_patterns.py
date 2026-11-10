"""Optional Unicorn check of the exact native instructions in the proof snapshot."""
import json
from pathlib import Path
from unicorn import Uc, UC_ARCH_X86, UC_MODE_64
from unicorn.x86_const import UC_X86_REG_RDX, UC_X86_REG_RAX, UC_X86_REG_RSP

proof = Path(__file__).resolve().parent.parent / 'evidence/trivial-native-proof.json'
checked = 0
for row in json.loads(proof.read_text()):
    for argument in (0, 0x12345678, 0x7fff123456789abc):
        emulator = Uc(UC_ARCH_X86, UC_MODE_64)
        emulator.mem_map(0x100000, 0x1000)
        emulator.mem_map(0x200000, 0x1000)
        emulator.mem_write(0x100000, bytes.fromhex(row['machineBytes']))
        emulator.mem_write(0x200800, (0x100100).to_bytes(8, 'little'))
        emulator.reg_write(UC_X86_REG_RSP, 0x200800)
        emulator.reg_write(UC_X86_REG_RDX, argument)
        emulator.reg_write(UC_X86_REG_RAX, 0x55)
        emulator.emu_start(0x100000, 0x100100, count=4)
        assert emulator.reg_read(UC_X86_REG_RSP) == 0x200808
        if row['reconstruction'] == 'identity-first-argument':
            assert emulator.reg_read(UC_X86_REG_RAX) == argument
        else:
            assert emulator.reg_read(UC_X86_REG_RAX) == 0x55
        checked += 1
print(f'PASS {checked} native machine-code cases across nine complete implementation bodies')
