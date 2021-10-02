package prasad.leetcode.p504;

import org.junit.Assert;
import org.junit.Test;

public class Base7Test {

    @Test
    public void test100() {
        Assert.assertEquals("202", new Base7().convertToBase7(100));
    }

    @Test
    public void testMinus7() {
        Assert.assertEquals("-10", new Base7().convertToBase7(-7));
    }

    @Test
    public void test7() {
        Assert.assertEquals("10", new Base7().convertToBase7(7));
    }

    @Test
    public void test0() {
        Assert.assertEquals("0", new Base7().convertToBase7(0));
    }

    @Test
    public void test5() {
        Assert.assertEquals("5", new Base7().convertToBase7(5));
    }

    @Test
    public void test9() {
        Assert.assertEquals("12", new Base7().convertToBase7(9));
    }

    @Test
    public void testMinus9() {
        Assert.assertEquals("-12", new Base7().convertToBase7(-9));
    }

    @Test
    public void test956() {
        Assert.assertEquals("2534", new Base7().convertToBase7(956));
    }

    @Test
    public void testMinus956() {
        Assert.assertEquals("-2534", new Base7().convertToBase7(-956));
    }
}
