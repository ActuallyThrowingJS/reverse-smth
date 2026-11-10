package recovery.nativecode;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/**
 * Readable reconstruction of the JNIC 3.7.0 JNI_OnLoad byte-pool generator.
 * The native payload uses a custom 16-byte ChaCha constant, a 32-byte embedded
 * key and the 12 nonce bytes at offsets 32..43 of JNICLoader.z.
 * This reconstructs the protector bootstrap, not a Polinex application method.
 */
public final class JnicConstantStream {
    private JnicConstantStream() {}

    public static byte[] generate(byte[] constant, byte[] key, byte[] nonce,
                                  int initialCounter, int length) {
        if (constant.length != 16 || key.length != 32 || nonce.length != 12) {
            throw new IllegalArgumentException("Expected 16 constant, 32 key and 12 nonce bytes");
        }
        if (length < 0) throw new IllegalArgumentException("Negative output length");

        int[] state = new int[16];
        readWords(constant, state, 0);
        readWords(key, state, 4);
        state[12] = initialCounter;
        readWords(nonce, state, 13);

        byte[] result = new byte[length];
        for (int offset = 0; offset < length; offset += 64) {
            int[] working = state.clone();
            for (int round = 0; round < 10; round++) {
                quarterRound(working, 0, 4, 8, 12);
                quarterRound(working, 1, 5, 9, 13);
                quarterRound(working, 2, 6, 10, 14);
                quarterRound(working, 3, 7, 11, 15);
                quarterRound(working, 0, 5, 10, 15);
                quarterRound(working, 1, 6, 11, 12);
                quarterRound(working, 2, 7, 8, 13);
                quarterRound(working, 3, 4, 9, 14);
            }
            ByteBuffer block = ByteBuffer.allocate(64).order(ByteOrder.LITTLE_ENDIAN);
            for (int i = 0; i < 16; i++) block.putInt(working[i] + state[i]);
            int count = Math.min(64, length - offset);
            System.arraycopy(block.array(), 0, result, offset, count);
            // Matches the native carry into the first nonce word.
            if (++state[12] == 0) state[13]++;
        }
        return result;
    }

    private static void readWords(byte[] bytes, int[] destination, int offset) {
        ByteBuffer input = ByteBuffer.wrap(bytes).order(ByteOrder.LITTLE_ENDIAN);
        for (int i = 0; input.hasRemaining(); i++) destination[offset + i] = input.getInt();
    }

    private static void quarterRound(int[] state, int a, int b, int c, int d) {
        state[a] += state[b];
        state[d] = Integer.rotateLeft(state[d] ^ state[a], 16);
        state[c] += state[d];
        state[b] = Integer.rotateLeft(state[b] ^ state[c], 12);
        state[a] += state[b];
        state[d] = Integer.rotateLeft(state[d] ^ state[a], 8);
        state[c] += state[d];
        state[b] = Integer.rotateLeft(state[b] ^ state[c], 7);
    }
}
