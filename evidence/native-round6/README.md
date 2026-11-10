# Partial native initializer trace

`initializer-partial-trace.json` records a bounded emulation of the supplied client ELF at RVA `0xc53c80`. Its `inputs` field pins the image, original JAR, bootstrap buffer and decoding snapshots by SHA-256. The original native payload was not loaded into a real JVM.

The adapter models JNI method-type construction, boxed primitive arguments, call-site targets, recognized string decryptors and member-table decoding. **Other Java calls are mocked.** The trace therefore does not establish real branch reachability or reconstruct the initializer. Its final status is `returned: false`, with an explicit unknown string-concatenation argument as the stop reason. Twenty-one strings passed the existing padded-DES/strict-UTF-8 decoder; seven member invocations were checked against supplied declarations.

`client-jnic-buffer.bin` is the previously captured bootstrap-buffer snapshot for these pinned inputs. It is decoding evidence, not a fresh independent extraction. The external emulator dependency is C2J, GPL-3.0, commit `7950f0b280f5737c61de78e9d852869e8d7ff31e`; its code is not vendored here. The tested Python environment has Unicorn and pyelftools.

Example after building the Java tools, extracting the client native image and installing the external emulator:

```sh
python tools/research/trace_native_initializer.py \
  --c2j-root /path/to/c2j-native-deobfuscator \
  --image build/native-client/linux-machine-62-44061000.so \
  --buffer evidence/native-round6/client-jnic-buffer.bin \
  --jni-table evidence/native-round5/jni-table.json \
  --input-jar inputs/PoliSlop.jar \
  --crypto-state evidence/crypto-state.json \
  --dispatcher-state evidence/dispatcher-state.json \
  --output build/native-initializer-trace.json
```

Use `--java /path/to/java` when the analysis JDK is not on PATH. The next modeling task is to trace the unknown concatenation operand to its original loader/reflection state. Do not substitute fabricated values and then claim full initialization recovery.
