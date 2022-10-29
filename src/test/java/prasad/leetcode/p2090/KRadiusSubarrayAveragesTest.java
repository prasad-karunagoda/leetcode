package prasad.leetcode.p2090;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.Random;

public class KRadiusSubarrayAveragesTest {

    @Test
    public void test01() {
        Assert.assertArrayEquals(new int[] {-1,-1,-1,5,4,4,-1,-1,-1},
                new KRadiusSubarrayAverages().getAverages(new int[] {7,4,3,9,1,8,5,2,6}, 3));
        Assert.assertArrayEquals(new int[] {-1,-1,-1,5,4,4,-1,-1,-1},
                new KRadiusSubarrayAverages().getAverages_Slow(new int[] {7,4,3,9,1,8,5,2,6}, 3));
    }

    @Test
    public void test02() {
        Assert.assertArrayEquals(new int[] {100},
                new KRadiusSubarrayAverages().getAverages(new int[] {100}, 0));
        Assert.assertArrayEquals(new int[] {100},
                new KRadiusSubarrayAverages().getAverages_Slow(new int[] {100}, 0));
    }

    @Test
    public void test03() {
        Assert.assertArrayEquals(new int[] {-1},
                new KRadiusSubarrayAverages().getAverages(new int[] {100}, 5));
        Assert.assertArrayEquals(new int[] {-1},
                new KRadiusSubarrayAverages().getAverages_Slow(new int[] {100}, 5));
    }

    @Test
    public void test04() {
        Assert.assertArrayEquals(new int[] {-1,-1,-1,5,-1,-1,-1},
                new KRadiusSubarrayAverages().getAverages(new int[] {7,4,3,9,1,8,5}, 3));
        Assert.assertArrayEquals(new int[] {-1,-1,-1,5,-1,-1,-1},
                new KRadiusSubarrayAverages().getAverages_Slow(new int[] {7,4,3,9,1,8,5}, 3));
    }

    @Test
    public void test05() {
        int[] nums = new int[100000];
        Arrays.fill(nums, 100000);
        int[] expected = new int[100000];
        Arrays.fill(expected, 0, 40000, -1);
        Arrays.fill(expected, 40000, 60000, 100000);
        Arrays.fill(expected, 60000, 100000, -1);
        Assert.assertArrayEquals(expected, new KRadiusSubarrayAverages().getAverages(nums, 40000));
        Assert.assertArrayEquals(expected, new KRadiusSubarrayAverages().getAverages_Slow(nums, 40000));
    }

    @Test
    public void testTime() {
        int[] nums = new int[100000];
        Random random = new Random();
        for (int i = 0; i < nums.length; i++) {
            nums[i] = random.nextInt(100001);
        }

        long start = System.currentTimeMillis();
        new KRadiusSubarrayAverages().getAverages(nums, 1000);
        System.out.println("getAverages time = " + (System.currentTimeMillis() - start) + " ms");

        start = System.currentTimeMillis();
        new KRadiusSubarrayAverages().getAverages_Slow(nums, 1000);
        System.out.println("getAverages_Slow time = " + (System.currentTimeMillis() - start) + " ms");
    }
}
