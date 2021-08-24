package prasad.leetcode.p738;

import org.junit.Assert;
import org.junit.Test;

public class MonotoneIncreasingDigitsTest {

    @Test
    public void test10() {
        Assert.assertEquals(9, new MonotoneIncreasingDigits().monotoneIncreasingDigits(10));
    }

    @Test
    public void test1234() {
        Assert.assertEquals(1234, new MonotoneIncreasingDigits().monotoneIncreasingDigits(1234));
    }

    @Test
    public void test332() {
        Assert.assertEquals(299, new MonotoneIncreasingDigits().monotoneIncreasingDigits(332));
    }

    @Test
    public void test4341() {
        Assert.assertEquals(3999, new MonotoneIncreasingDigits().monotoneIncreasingDigits(4341));
    }

    @Test
    public void test0() {
        Assert.assertEquals(0, new MonotoneIncreasingDigits().monotoneIncreasingDigits(0));
    }

    @Test
    public void test5() {
        Assert.assertEquals(5, new MonotoneIncreasingDigits().monotoneIncreasingDigits(5));
    }

    @Test
    public void test4321() {
        Assert.assertEquals(3999, new MonotoneIncreasingDigits().monotoneIncreasingDigits(4321));
    }

    @Test
    public void test4521() {
        Assert.assertEquals(4499, new MonotoneIncreasingDigits().monotoneIncreasingDigits(4521));
    }

    @Test
    public void test4421() {
        Assert.assertEquals(3999, new MonotoneIncreasingDigits().monotoneIncreasingDigits(4421));
    }
}
