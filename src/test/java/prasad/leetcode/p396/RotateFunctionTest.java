package prasad.leetcode.p396;

import org.junit.Assert;
import org.junit.Test;

public class RotateFunctionTest {

    @Test
    public void test01() {
        Assert.assertEquals(26, new RotateFunction().maxRotateFunction(new int[] {4,3,2,6}));
    }

    @Test
    public void test02() {
        Assert.assertEquals(0, new RotateFunction().maxRotateFunction(new int[] {100}));
    }

    @Test
    public void test03() {
        Assert.assertEquals(-16, new RotateFunction().maxRotateFunction(new int[] {-4,-3,-2,-6}));
    }

    @Test
    public void testTime() {
        int[] nums = new int[100000];
        for (int i = 0; i < nums.length; i++) {
            if (i % 2 == 0) {
                nums[i] = 5;
            }
            else {
                nums[i] = -5;
            }
        }

        long startSlow = System.currentTimeMillis();
        new RotateFunction().maxRotateFunctionTooSlow(nums);
        System.out.println("Time (too slow) = " + (System.currentTimeMillis() - startSlow) + " ms");

        long start = System.currentTimeMillis();
        new RotateFunction().maxRotateFunction(nums);
        System.out.println("Time = " + (System.currentTimeMillis() - start) + " ms");
    }

    @Test
    public void testRotate() {
        Assert.assertArrayEquals(new int[] {37,16,73,84,32,45,34,62,17,26,93,26},
                new RotateFunction().rotate(new int[] {45,34,62,17,26,93,26,37,16,73,84,32}, 5));
    }
}
