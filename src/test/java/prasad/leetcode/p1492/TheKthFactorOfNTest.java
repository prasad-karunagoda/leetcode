package prasad.leetcode.p1492;

import org.junit.Assert;
import org.junit.Test;

public class TheKthFactorOfNTest {

    @Test
    public void test01() {
        Assert.assertEquals(1, new TheKthFactorOfN().kthFactor(1, 1));
    }

    @Test
    public void test02() {
        Assert.assertEquals(1, new TheKthFactorOfN().kthFactor(2, 1));
    }

    @Test
    public void test03() {
        Assert.assertEquals(2, new TheKthFactorOfN().kthFactor(2, 2));
    }

    @Test
    public void test04() {
        Assert.assertEquals(4, new TheKthFactorOfN().kthFactor(4, 3));
    }

    @Test
    public void test05() {
        Assert.assertEquals(3, new TheKthFactorOfN().kthFactor(12, 3));
    }

    @Test
    public void test06() {
        Assert.assertEquals(7, new TheKthFactorOfN().kthFactor(7, 2));
    }

    @Test
    public void test07() {
        Assert.assertEquals(-1, new TheKthFactorOfN().kthFactor(4, 4));
    }

    @Test
    public void test08() {
        // factors = 1, 2, 4, 11, 22, 44
        Assert.assertEquals(22, new TheKthFactorOfN().kthFactor(44, 5));
    }

    @Test
    public void test09() {
        // factors = 1, 3, 9, 27
        Assert.assertEquals(27, new TheKthFactorOfN().kthFactor(27, 4));
    }
}
