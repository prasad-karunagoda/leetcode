package prasad.leetcode.p1016;

import org.junit.Assert;
import org.junit.Test;

public class BinaryStringWithSubstrings1ToNTest {

    @Test
    public void test01() {
        Assert.assertTrue(new BinaryStringWithSubstrings1ToN().queryString("0110", 3));
    }

    @Test
    public void test02() {
        Assert.assertFalse(new BinaryStringWithSubstrings1ToN().queryString("0110", 4));
    }

    @Test
    public void test03() {
        Assert.assertTrue(new BinaryStringWithSubstrings1ToN().queryString("01100101", 6));
    }

    @Test
    public void testTime() {
        String s = "1011101000010010011101100000110100010100001010010100101111000011111010100010100111111011001100111010110100111011110100111001001100110001100011101001010101011101001010010000110100110010011110000110001011011011000110011110011000101010110010100111110100010110100001000000010010101110001101010000110001101101001011101110100000111010010110111110000110011111110101101101001010011001101011000001111010110010001010101011110100011101101001011111011111111111101011011000100000000111100101101010101110111000111110010100110100100000010001000111101111001101001100100100110010001100010001110111100010101010101110101011000111011000110100010010011110111011101110011000011010110001000111011100100101111000011101111001011111011110100110011100001110100010110000010110000000010110101000100011000010100110000101011001110111111100110100101000100100001001110111111101011110000101001110010000111011110010110011000111110111000000011110110010110101100000011010100011110010111010100001110111110011010101101010000111001111011001";
        long start = System.currentTimeMillis();
        new BinaryStringWithSubstrings1ToN().queryString(s, 1000000000);
        System.out.println("Time = " + (System.currentTimeMillis() - start) + " ms");
    }
}
