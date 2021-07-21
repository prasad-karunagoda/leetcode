package prasad.leetcode.p80;

import org.junit.Assert;
import org.junit.Test;

public class RemoveDuplicatesFromSortedArray2Test {

    @Test
    public void tes01() {
        int[] nums = new int[] {1,1,1,2,2,3};
        int newLength = new RemoveDuplicatesFromSortedArray2().removeDuplicates(nums);
        Assert.assertEquals(5, newLength);

        int[] expected = new int[newLength];
        System.arraycopy(nums, 0, expected, 0, newLength);
        Assert.assertArrayEquals(expected, new int[] {1,1,2,2,3});
    }

    @Test
    public void tes02() {
        int[] nums = new int[] {0,0,1,1,1,1,2,3,3};
        int newLength = new RemoveDuplicatesFromSortedArray2().removeDuplicates(nums);
        Assert.assertEquals(7, newLength);

        int[] expected = new int[newLength];
        System.arraycopy(nums, 0, expected, 0, newLength);
        Assert.assertArrayEquals(expected, new int[] {0,0,1,1,2,3,3});
    }

    @Test
    public void tes03() {
        int[] nums = new int[] {5};
        int newLength = new RemoveDuplicatesFromSortedArray2().removeDuplicates(nums);
        Assert.assertEquals(1, newLength);
        Assert.assertEquals(5, nums[0]);
    }

    @Test
    public void tes04() {
        int[] nums = new int[] {7,7};
        int newLength = new RemoveDuplicatesFromSortedArray2().removeDuplicates(nums);
        Assert.assertEquals(2, newLength);
        Assert.assertEquals(7, nums[0]);
        Assert.assertEquals(7, nums[1]);
    }

    @Test
    public void tes05() {
        int[] nums = new int[] {-4,-4,-4,-4,-4};
        int newLength = new RemoveDuplicatesFromSortedArray2().removeDuplicates(nums);
        Assert.assertEquals(2, newLength);
        Assert.assertEquals(-4, nums[0]);
        Assert.assertEquals(-4, nums[1]);
    }
}
