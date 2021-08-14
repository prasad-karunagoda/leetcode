package prasad.leetcode.p371;

import org.junit.Assert;
import org.junit.Test;

public class SumOfTwoIntegersTest {

    @Test
    public void test01() {
        Assert.assertEquals(3, new SumOfTwoIntegers().getSum(1, 2));
    }

    @Test
    public void test02() {
        Assert.assertEquals(5, new SumOfTwoIntegers().getSum(2, 3));
    }

    @Test
    public void test03() {
        Assert.assertEquals(-22, new SumOfTwoIntegers().getSum(-15, -7));
    }

    @Test
    public void test04() {
        Assert.assertEquals(-28, new SumOfTwoIntegers().getSum(-11, -17));
    }

    @Test
    public void test05() {
        Assert.assertEquals(14, new SumOfTwoIntegers().getSum(-12, 26));
    }

    @Test
    public void test06() {
        Assert.assertEquals(8, new SumOfTwoIntegers().getSum(14, -6));
    }

    @Test
    public void test07() {
        Assert.assertEquals(-11, new SumOfTwoIntegers().getSum(-16, 5));
    }

    @Test
    public void test08() {
        Assert.assertEquals(-18, new SumOfTwoIntegers().getSum(7, -25));
    }

    @Test
    public void test09() {
        Assert.assertEquals(27, new SumOfTwoIntegers().getSum(15, 12));
    }

    @Test
    public void test10() {
        Assert.assertEquals(12, new SumOfTwoIntegers().getSum(0, 12));
    }

    @Test
    public void test11() {
        Assert.assertEquals(15, new SumOfTwoIntegers().getSum(15, 0));
    }

    @Test
    public void test12() {
        Assert.assertEquals(-14, new SumOfTwoIntegers().getSum(0, -14));
    }

    @Test
    public void test13() {
        Assert.assertEquals(-23, new SumOfTwoIntegers().getSum(-23, 0));
    }
}
