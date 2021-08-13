package prasad.leetcode.p219;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;

public class ContainsDuplicate2Test {

    @Test
    public void test01() {
        Assert.assertTrue(new ContainsDuplicate2().containsNearbyDuplicate(new int[] {1,2,3,1}, 3));
    }

    @Test
    public void test02() {
        Assert.assertTrue(new ContainsDuplicate2().containsNearbyDuplicate(new int[] {1,0,1,1}, 1));
    }

    @Test
    public void test03() {
        Assert.assertFalse(new ContainsDuplicate2().containsNearbyDuplicate(new int[] {1,2,3,1,2,3}, 2));
    }

    @Test
    public void test04() {
        Assert.assertFalse(new ContainsDuplicate2().containsNearbyDuplicate(new int[] {5}, 2));
    }

    @Test
    public void test05() {
        Assert.assertTrue(new ContainsDuplicate2().containsNearbyDuplicate(new int[] {5,5}, 1));
    }

    @Test
    public void test06() {
        Assert.assertFalse(new ContainsDuplicate2().containsNearbyDuplicate(new int[] {5,5}, 0));
    }

    @Test
    public void test07() {
        Assert.assertFalse(new ContainsDuplicate2().containsNearbyDuplicate(new int[] {1,2,3,1}, 0));
    }

    @Test
    public void testTime() {
        int[] nums = new int[100000];
        for (int i = 0; i < 100000; i++) {
            nums[i] = i;
        }
        System.out.println(Arrays.toString(nums));

        long start = System.currentTimeMillis();
        Assert.assertFalse(new ContainsDuplicate2().containsNearbyDuplicate(nums, 100000));
        System.out.println("Time = " + (System.currentTimeMillis() - start) + " ms");
    }
}
