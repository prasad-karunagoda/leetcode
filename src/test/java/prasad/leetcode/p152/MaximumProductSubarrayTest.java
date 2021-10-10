package prasad.leetcode.p152;

import org.junit.Assert;
import org.junit.Test;

public class MaximumProductSubarrayTest {

    @Test
    public void test01() {
        Assert.assertEquals(6, new MaximumProductSubarray().maxProduct(new int[] {2,3,-2,4}));
    }

    @Test
    public void test02() {
        Assert.assertEquals(0, new MaximumProductSubarray().maxProduct(new int[] {-2,0,-1}));
    }

    @Test
    public void test03() {
        Assert.assertEquals(12, new MaximumProductSubarray().maxProduct(new int[] {2,3,2}));
    }

    @Test
    public void test04() {
        Assert.assertEquals(8, new MaximumProductSubarray().maxProduct(new int[] {2,-3,8}));
    }

    @Test
    public void testTime() {
        int[] nums = new int[20000];
        for (int i = 0; i < 20000; i++) {
            nums[i] = ((int) (Math.random() * 21)) - 10;
        }
        long start = System.currentTimeMillis();
        new MaximumProductSubarray().maxProduct(nums);
        System.out.println("Time = " + (System.currentTimeMillis() - start) + " ms");
    }
}
