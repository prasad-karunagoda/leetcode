package prasad.leetcode.p1664;

import org.junit.Assert;
import org.junit.Test;

import java.util.Random;

public class WaysToMakeFairArrayTest {

    @Test
    public void test01() {
        Assert.assertEquals(1, new WaysToMakeFairArray().waysToMakeFair(new int[] {2,1,6,4}));
    }

    @Test
    public void test02() {
        Assert.assertEquals(3, new WaysToMakeFairArray().waysToMakeFair(new int[] {1,1,1}));
    }

    @Test
    public void test03() {
        Assert.assertEquals(0, new WaysToMakeFairArray().waysToMakeFair(new int[] {1,2,3}));
    }

    @Test
    public void testTime() {
        int[] nums = new int[100000];
        Random random = new Random();
        for (int i = 0; i < nums.length; i++) {
            nums[i] = random.nextInt(10000) + 1;
        }
        long start = System.currentTimeMillis();
        new WaysToMakeFairArray().waysToMakeFair(nums);
        System.out.println("Time = " + (System.currentTimeMillis() - start) + " ms");
    }
}
