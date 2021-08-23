package prasad.leetcode.p633;

import org.junit.Assert;
import org.junit.Test;

public class SumOfSquareNumbersTest {

    @Test
    public void test5() {
        Assert.assertTrue(new SumOfSquareNumbers().judgeSquareSum(5));
    }

    @Test
    public void test3() {
        Assert.assertFalse(new SumOfSquareNumbers().judgeSquareSum(3));
    }

    @Test
    public void test4() {
        Assert.assertTrue(new SumOfSquareNumbers().judgeSquareSum(4));
    }

    @Test
    public void test2() {
        Assert.assertTrue(new SumOfSquareNumbers().judgeSquareSum(2));
    }

    @Test
    public void test1() {
        Assert.assertTrue(new SumOfSquareNumbers().judgeSquareSum(1));
    }

    @Test
    public void test0() {
        Assert.assertTrue(new SumOfSquareNumbers().judgeSquareSum(0));
    }

    @Test
    public void testTime() {
        long start = System.currentTimeMillis();
        new SumOfSquareNumbers().judgeSquareSum(2147483647);
        System.out.println("Time = " + (System.currentTimeMillis() - start) + " ms");
    }

    @Test
    public void testIsSquare0() {
        Assert.assertTrue(new SumOfSquareNumbers().isSquare(0));
    }

    @Test
    public void testIsSquare1() {
        Assert.assertTrue(new SumOfSquareNumbers().isSquare(1));
    }

    @Test
    public void testIsSquare3() {
        Assert.assertFalse(new SumOfSquareNumbers().isSquare(3));
    }

    @Test
    public void testIsSquare4() {
        Assert.assertTrue(new SumOfSquareNumbers().isSquare(4));
    }
}
