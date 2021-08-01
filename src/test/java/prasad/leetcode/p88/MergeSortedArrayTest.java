package prasad.leetcode.p88;

import org.junit.Assert;
import org.junit.Test;

public class MergeSortedArrayTest {

    @Test
    public void test01() {
        int[] nums1 = new int[] {1,2,3,0,0,0};
        new MergeSortedArray().merge(nums1, 3, new int[] {2,5,6}, 3);
        Assert.assertArrayEquals(new int[] {1,2,2,3,5,6}, nums1);
    }

    @Test
    public void test02() {
        int[] nums1 = new int[] {1};
        new MergeSortedArray().merge(nums1, 1, new int[0], 0);
        Assert.assertArrayEquals(new int[] {1}, nums1);
    }

    @Test
    public void test03() {
        int[] nums1 = new int[] {0};
        new MergeSortedArray().merge(nums1, 0, new int[] {1}, 1);
        Assert.assertArrayEquals(new int[] {1}, nums1);
    }

    @Test
    public void test04() {
        int[] nums1 = new int[] {4,7,7,9,0,0,0};
        new MergeSortedArray().merge(nums1, 4, new int[] {2,7,11}, 3);
        Assert.assertArrayEquals(new int[] {2,4,7,7,7,9,11}, nums1);
    }

    @Test
    public void testShiftRight() {
        int[] array = new int[] {1,2,3,0,0,0};
        MergeSortedArray.shiftRight(array, 2);
        Assert.assertArrayEquals(new int[] {1,2,3,3,0,0}, array);
    }

    @Test
    public void testShiftRight_LastItem() {
        int[] array = new int[] {1,2,3,4,5};
        MergeSortedArray.shiftRight(array, 4);
        Assert.assertArrayEquals(new int[] {1,2,3,4,5}, array);
    }
}
