# Fabric recovery build

This is the Java 25 / Minecraft 26.1.2 build scaffold for the recovered client sources. It uses Fabric Loom 1.19.4, Fabric Loader 0.20.1, Fabric API 0.155.3+26.1.2 and Fabric Language Kotlin 1.13.10+kotlin.2.3.20.

Dependency resolution has been tested successfully. **The complete source compile still fails on unrecovered expressions. This is not a runnable replacement mod.** The custom loader and large native initializer have not been replaced with a complete standard Fabric entrypoint.

With a JDK 25 installation:

```sh
./gradlew writeRecoveryClasspath
./gradlew compileJava
```

From the repository root in a proxied cloud environment:

```sh
JAVA25_HOME=/path/to/jdk-25 python3 tools/run_gradle.py writeRecoveryClasspath
JAVA25_HOME=/path/to/jdk-25 python3 tools/run_gradle.py compileJava
```

The wrapper is pinned to Gradle 9.8.2 with its distribution SHA-256. The wrapper JAR was also checked against Gradle's published SHA-256. Original resources and bundled dependency classes are extracted from the supplied JAR into ignored build directories; original JARs remain unchanged. Recovered project classes are excluded from the bundled dependency JAR, so it cannot silently satisfy missing project source implementations.

The source alternatives were separately compiled against the analysis binary plus these real dependencies, then checked for missing declared members and native/volatile regressions. That per-class check does not establish a complete application build or runtime behavior.
