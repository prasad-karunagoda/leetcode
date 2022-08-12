package prasad.leetcode.p1480;

import org.junit.Assert;
import org.junit.Test;

public class RunningSumOfArrayTest {

    @Test
    public void test01() {
        Assert.assertArrayEquals(new int[] {1,3,6,10}, new RunningSumOfArray().runningSum(new int[] {1,2,3,4}));
    }

    @Test
    public void test02() {
        Assert.assertArrayEquals(new int[] {1,2,3,4,5}, new RunningSumOfArray().runningSum(new int[] {1,1,1,1,1}));
    }

    @Test
    public void test03() {
        Assert.assertArrayEquals(new int[] {3,4,6,16,17}, new RunningSumOfArray().runningSum(new int[] {3,1,2,10,1}));
    }
}
