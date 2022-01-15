package prasad.leetcode.p1545;

import org.junit.Assert;
import org.junit.Test;

public class FindKthBitInNthBinaryStringTest {

    @Test
    public void testInvertAndReverse01() {
        Assert.assertEquals("1", new FindKthBitInNthBinaryString().invertAndReverse("0"));
    }

    @Test
    public void testInvertAndReverse02() {
        Assert.assertEquals("0", new FindKthBitInNthBinaryString().invertAndReverse("1"));
    }

    @Test
    public void testInvertAndReverse03() {
        Assert.assertEquals("10", new FindKthBitInNthBinaryString().invertAndReverse("10"));
    }

    @Test
    public void testInvertAndReverse04() {
        Assert.assertEquals("11100", new FindKthBitInNthBinaryString().invertAndReverse("11000"));
    }

    @Test
    public void testFindKthBit01() {
        Assert.assertEquals('0', new FindKthBitInNthBinaryString().findKthBit(1, 1));
    }

    @Test
    public void testFindKthBit02() {
        Assert.assertEquals('1', new FindKthBitInNthBinaryString().findKthBit(3, 3));
    }

    @Test
    public void testFindKthBit03() {
        // 0  1  1  1  0  0  1  1  0  1  1  0  0  0  1  1  0  1  1  1  0  0  1  0  0  1  1  0  0  0  1
        // 1  2  3  4  5  6  7  8  9  10 11 12 13 14 15 16 17 18 19 20 21 22 23 24 25 26 27 28 29 30 31
        Assert.assertEquals('0', new FindKthBitInNthBinaryString().findKthBit(5, 5));
        Assert.assertEquals('1', new FindKthBitInNthBinaryString().findKthBit(5, 11));
        Assert.assertEquals('0', new FindKthBitInNthBinaryString().findKthBit(5, 17));
        Assert.assertEquals('1', new FindKthBitInNthBinaryString().findKthBit(5, 26));
    }
}
