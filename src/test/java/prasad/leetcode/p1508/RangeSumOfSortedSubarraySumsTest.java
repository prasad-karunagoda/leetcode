package prasad.leetcode.p1508;

import org.junit.Assert;
import org.junit.Test;

import java.util.Random;

public class RangeSumOfSortedSubarraySumsTest {

    @Test
    public void test01() {
        Assert.assertEquals(13, new RangeSumOfSortedSubarraySums().rangeSum(
                new int[] {1,2,3,4}, 4, 1, 5));
    }

    @Test
    public void test02() {
        Assert.assertEquals(6, new RangeSumOfSortedSubarraySums().rangeSum(
                new int[] {1,2,3,4}, 4, 3, 4));
    }

    @Test
    public void test03() {
        Assert.assertEquals(50, new RangeSumOfSortedSubarraySums().rangeSum(
                new int[] {1,2,3,4}, 4, 1, 10));
    }

    @Test
    public void test04() {
        Assert.assertEquals(4, new RangeSumOfSortedSubarraySums().rangeSum(
                new int[] {1,2,3,4}, 4, 5, 5));
    }

    @Test
    public void test05() {
        Assert.assertEquals(91, new RangeSumOfSortedSubarraySums().rangeSum(
                new int[] {6,13,8,5,11}, 5, 1, 8));
        Assert.assertEquals(61, new RangeSumOfSortedSubarraySums().rangeSum(
                new int[] {6,13,8,5,11}, 5, 3, 7));
        // Subarray sums: 5,6,8,11,13,13,16,19,21,24,26,27,32,37,43
    }

    @Test
    public void testTime() {
        int[] nums = new int[1000];
        Random random = new Random();
        for (int i = 0; i < 1000; i++) {
            nums[i] = random.nextInt(100) + 1;
        }
        long start = System.currentTimeMillis();
        new RangeSumOfSortedSubarraySums().rangeSum(nums, 1000, 1, 500_000);
        System.out.println("Time = " + (System.currentTimeMillis() - start) + " ms");
    }
}
