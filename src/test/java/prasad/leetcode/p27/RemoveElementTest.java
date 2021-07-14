package prasad.leetcode.p27;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class RemoveElementTest {

    @Test
    public void test01() {
        int[] nums = new int[] {3, 2, 2, 3};
        int newLength = new RemoveElement().removeElement(nums, 3);
        Assert.assertEquals(2, newLength);
        Assert.assertEquals(2, nums[0]);
        Assert.assertEquals(2, nums[1]);
    }

    @Test
    public void test02() {
        int[] nums = new int[] {0, 1, 2, 2, 3, 0, 4, 2};
        int newLength = new RemoveElement().removeElement(nums, 2);
        Assert.assertEquals(5, newLength);

        List<Integer> expected = new ArrayList<>(Arrays.asList(0, 1, 3, 0, 4));
        expected.sort(Comparator.comparingInt(i -> i));
        List<Integer> actual = new ArrayList<>(Arrays.asList(nums[0], nums[1], nums[2], nums[3], nums[4]));
        actual.sort(Comparator.comparingInt(i -> i));
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void test03() {
        int[] nums = new int[] {5};
        int newLength = new RemoveElement().removeElement(nums, 5);
        Assert.assertEquals(0, newLength);
    }

    @Test
    public void testEmptyNums() {
        int[] nums = new int[0];
        int newLength = new RemoveElement().removeElement(nums, 3);
        Assert.assertEquals(0, newLength);
    }
}
