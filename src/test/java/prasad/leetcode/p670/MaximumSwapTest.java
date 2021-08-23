package prasad.leetcode.p670;

import org.junit.Assert;
import org.junit.Test;

public class MaximumSwapTest {

    @Test
    public void test2736() {
        Assert.assertEquals(7236, new MaximumSwap().maximumSwap(2736));
    }

    @Test
    public void test9973() {
        Assert.assertEquals(9973, new MaximumSwap().maximumSwap(9973));
    }

    @Test
    public void test45678345() {
        Assert.assertEquals(85674345, new MaximumSwap().maximumSwap(45678345));
    }

    @Test
    public void test0() {
        Assert.assertEquals(0, new MaximumSwap().maximumSwap(0));
    }

    @Test
    public void test5() {
        Assert.assertEquals(5, new MaximumSwap().maximumSwap(5));
    }
}
