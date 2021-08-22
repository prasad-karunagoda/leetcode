package prasad.leetcode.p26;

import org.junit.Assert;
import org.junit.Test;

public class RemoveDuplicatesFromSortedArrayTest {

    @Test
    public void test01() {
        int[] nums = new int[] {1, 1, 2};
        int newLength = new RemoveDuplicatesFromSortedArray().removeDuplicates(nums);
        Assert.assertEquals(2, newLength);
        Assert.assertEquals(1, nums[0]);
        Assert.assertEquals(2, nums[1]);
    }

    @Test
    public void test02() {
        int[] nums = new int[] {0, 0, 1, 1, 1, 2, 2, 3, 3, 4};
        int newLength = new RemoveDuplicatesFromSortedArray().removeDuplicates(nums);
        Assert.assertEquals(5, newLength);
        Assert.assertEquals(0, nums[0]);
        Assert.assertEquals(1, nums[1]);
        Assert.assertEquals(2, nums[2]);
        Assert.assertEquals(3, nums[3]);
        Assert.assertEquals(4, nums[4]);
    }

    @Test
    public void testEmptyArray() {
        int[] nums = new int[0];
        int newLength = new RemoveDuplicatesFromSortedArray().removeDuplicates(nums);
        Assert.assertEquals(0, newLength);
        Assert.assertEquals(0, nums.length);
    }

    @Test
    public void testPerformance() {
        int[] nums = new int[] {
                0, 0, 0, 0, 0,
                1, 1, 1, 1, 1, 1, 1, 1, 1,
                2, 2, 2, 2, 2, 2,
                3, 3, 3, 3, 3, 3,
                4, 4, 4, 4, 4, 4, 4, 4,
                5, 5, 5, 5, 5, 5,
                6, 6, 6, 6, 6,
                7, 7, 7, 7, 7, 7, 7,
                8, 8, 8, 8, 8, 8,
                9, 9, 9, 9, 9, 9};
        long start = System.currentTimeMillis();
        int newLength = new RemoveDuplicatesFromSortedArray().removeDuplicates(nums);
        System.out.println("Time = " + (System.currentTimeMillis() - start) + " ms");
        Assert.assertEquals(10, newLength);
    }
}
