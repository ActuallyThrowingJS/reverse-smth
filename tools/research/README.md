Native evidence was obtained by unpacking the JNIC raw LZMA2 resource and carving its ELF images. The Linux x86-64 image was emulated using the C2J native emulator with adapters for long JNI names, memcpy, the bootstrap direct buffer and large RegisterNatives tables. No application native payload was loaded into the real JVM.

Extract the original native images without executing them:

```sh
python3 tools/extract_native.py inputs/PoliSlop.jar build/native-client
python3 tools/extract_native.py inputs/PolinexFabricLoader-26.1.2.jar build/native-loader
```

This uses Python's standard library. Image filenames, offsets, sizes and hashes are recorded in `images.json`. The checked extraction produced four client images and six loader images; the Linux client image SHA-256 is `d9579ee6f180cff451436b99186c804ad954ddb3a095782b122341cddc6eab34`.

The emulator image base is `0x10000000`; subtract it from each recorded `fnAddr` to get an ELF RVA. The Ghidra import used image base `0x100000`, so add that to the RVA. These bases are analysis conventions, not runtime addresses. The registration records were matched to original JAR declarations. All 518 registered implementation addresses fell in executable ELF segments and had unwind ranges.

Seven emulated native initializers supplied additional ZKM factory/decrypt seed triples. The probes stopped after these calls. Their captured inputs are committed in `evidence/native-key-sites.json`; they are necessary to reproduce the master-key registry state.

`evidence/crypto-state.json` and `dispatcher-state.json` are extraction snapshots tied to the SHA-256-pinned input. They came from a bounded interpreter model that replaces unrelated application calls with defaults. They are evidence for decoding, not replacements for real application initialization. `ExtractCrypto.java` is included for further investigation; the normal replay uses the tested snapshots.

The generated JNIC constant pool was captured from the emulated bootstrap. `tests/data/client-native-pool.bin` is the full 641,905-byte comparison vector. Its generator was reconstructed as readable Java and checked against this vector and an independent RFC 8439 vector.

`tools/ghidra/DecompileBootstrap.java` exports the real `JNI_OnLoad` at ELF RVA `0xe55230`; its output is `evidence/JNIC_OnLoad.ghidra.c`. It requires Ghidra's Java APIs and is intentionally excluded from the ordinary javac build. Main application methods, including Polinex.onInitialize, remain native and are not represented by this bootstrap reconstruction.
