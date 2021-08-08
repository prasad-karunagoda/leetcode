package prasad.leetcode.p53;

import org.junit.Assert;
import org.junit.Test;

public class MaximumSubarrayTest {

    @Test
    public void test01() {
        Assert.assertEquals(6, new MaximumSubarray().maxSubArray(new int[] {-2,1,-3,4,-1,2,1,-5,4}));
    }

    @Test
    public void test02() {
        Assert.assertEquals(1, new MaximumSubarray().maxSubArray(new int[] {1}));
    }

    @Test
    public void test03() {
        Assert.assertEquals(23, new MaximumSubarray().maxSubArray(new int[] {5,4,-1,7,8}));
    }

    @Test
    public void test04() {
        Assert.assertEquals(4, new MaximumSubarray().maxSubArray(new int[] {-3,-5,-2,-7,4,-5,-1}));
    }

    @Test
    public void test05() {
        Assert.assertEquals(-2, new MaximumSubarray().maxSubArray(new int[] {-5,-2}));
    }
}
