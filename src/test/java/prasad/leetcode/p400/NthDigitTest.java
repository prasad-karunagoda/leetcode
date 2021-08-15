package prasad.leetcode.p400;

import org.junit.Assert;
import org.junit.Test;

public class NthDigitTest {

    @Test
    public void testGetPassedGroupLength5() {
        Assert.assertArrayEquals(new long[] {0, 1}, new NthDigit().getPassedLengthAndCurrentGroupNumberOfDigits(5));
    }

    @Test
    public void testGetPassedGroupLength15() {
        Assert.assertArrayEquals(new long[] {9, 2}, new NthDigit().getPassedLengthAndCurrentGroupNumberOfDigits(15));
    }

    @Test
    public void testGetPassedGroupLength208() {
        Assert.assertArrayEquals(new long[] {189, 3}, new NthDigit().getPassedLengthAndCurrentGroupNumberOfDigits(208));
    }

    @Test
    public void testGetPassedGroupLength2500() {
        Assert.assertArrayEquals(new long[] {2889, 4}, new NthDigit().getPassedLengthAndCurrentGroupNumberOfDigits(2900));
    }

    @Test
    public void testFindNthDigit7() {
        Assert.assertEquals(7, new NthDigit().findNthDigit(7));
    }

    @Test
    public void testFindNthDigit13() {
        Assert.assertEquals(4, new NthDigit().findNthDigit(19));
    }

    @Test
    public void testFindNthDigit207() {
        Assert.assertEquals(5, new NthDigit().findNthDigit(207));
    }

    @Test
    public void testFindNthDigit208() {
        Assert.assertEquals(1, new NthDigit().findNthDigit(208));
    }

    @Test
    public void testFindNthDigit1000000000() {
        new NthDigit().findNthDigit(1000000000);
    }
}
