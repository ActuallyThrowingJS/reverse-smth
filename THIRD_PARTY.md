The supplied mod JARs and their recovered application sources retain their existing ownership and licenses. This repository does not grant a new license to them or to bundled dependencies.

`tools/vendor/com/zkmdeobf` comes from [DarkCreative1/zkm-deobfuscator](https://github.com/DarkCreative1/zkm-deobfuscator), commit `0c0d9b9b7be1f623567aa5fbc39ff1b67d71882f`, under the MIT license in `licenses/zkm-deobfuscator-MIT.txt`. `MiniInterpreter.java` has local changes for crypto argument retention, primitive class literals, modeled crypto types, map calls and thread IDs.

Build dependencies: ASM 9.7.1 (BSD 3-Clause), Gson 2.11.0 (Apache 2.0), Vineflower 1.11.2 (Apache 2.0). The build downloads their official Maven artifacts and checks pinned SHA-256 digests.

`tools/vendor/unlegit/zkm` is the control-flow engine and its required dependencies from [unleg1t/ZKM-27-Full-Deobfuscator](https://github.com/unleg1t/ZKM-27-Full-Deobfuscator), commit `7e4a61f0a9b53e6595a7af8d9b439b2fc7cfdaa7`, under the MIT license in `licenses/ZKM-27-Full-Deobfuscator-MIT.txt`. Local changes add an owner-prefix mutation filter and an optional mode that preserves rolled-back methods while retaining other verified transactions. The full archive remains available for hierarchy and provenance analysis. No sentinel-value assumptions are enabled.

Native investigation used Ghidra 11.4.2, Unicorn, pyelftools, and [gaoyu06/c2j-native-deobfuscator](https://github.com/gaoyu06/c2j-native-deobfuscator) (GPL-3.0). That emulator's source is not vendored here. The evidence includes results from an adapted emulator, with the workflow described in `tools/research/README.md`.

The ZKM recovery approach also draws on [Obliterating Zelix Klass Master](https://cubk.cn/en/articles/obliterating-zelix-klass-master). External articles are technical references, not instructions for this repository.
