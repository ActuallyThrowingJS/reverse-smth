package recovery.nativecode;

import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Arrays;
import java.util.HexFormat;
import com.google.gson.*;

/** Independent RFC vector and differential comparison with native emulation. */
public class JnicConstantStreamTest {
    public static void main(String[] args) throws Exception {
        HexFormat hex = HexFormat.of();
        byte[] standard = JnicConstantStream.generate(
            "expand 32-byte k".getBytes(java.nio.charset.StandardCharsets.US_ASCII),
            hex.parseHex("000102030405060708090a0b0c0d0e0f101112131415161718191a1b1c1d1e1f"),
            hex.parseHex("000000090000004a00000000"), 1, 64);
        byte[] expected = hex.parseHex(
            "10f1e7e4d13b5915500fdd1fa32071c4c7d1f4c733c068030422aa9ac3d46c4e" +
            "d2826446079faa0914c2d705d98b02a2b5129cd1de164eb9cbd083e8a2503c4e");
        if (!Arrays.equals(standard, expected)) throw new AssertionError("RFC 8439 vector mismatch");

        JsonObject input = JsonParser.parseString(Files.readString(Path.of(args[0]))).getAsJsonObject();
        byte[] actual = JnicConstantStream.generate(hex.parseHex(input.get("sigma").getAsString()),
            hex.parseHex(input.get("key").getAsString()), hex.parseHex(input.get("nonce").getAsString()),
            0, input.get("length").getAsInt());
        if (!Arrays.equals(actual, Files.readAllBytes(Path.of(args[1])))) {
            throw new AssertionError("Native bootstrap differential mismatch");
        }
        if (JnicConstantStream.generate(new byte[16],new byte[32],new byte[12],0,0).length != 0) {
            throw new AssertionError("Empty output mismatch");
        }
        try {
            JnicConstantStream.generate(new byte[15],new byte[32],new byte[12],0,1);
            throw new AssertionError("Invalid input accepted");
        } catch (IllegalArgumentException expectedError) { }
        System.out.println("PASS RFC 8439, full " + actual.length + "-byte native pool, empty output and input validation");
    }
}
