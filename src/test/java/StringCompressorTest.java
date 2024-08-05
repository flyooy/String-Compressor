import static org.junit.Assert.assertEquals;

import org.example.StringCompressor;
import org.junit.Test;
public class StringCompressorTest {
    @Test
    public void testCompress() {
        String str = "aabcccccaa";
        assertEquals("a2bc5a2",StringCompressor.compressString(str));
        assertEquals("e2t8pab2",StringCompressor.compressString("eettttttttpabb"));
    }
    @Test
    public void testCompressReturnOriginalString() {
        String str2 = "abca";
        assertEquals("abca",StringCompressor.compressString(str2));
    }
}
