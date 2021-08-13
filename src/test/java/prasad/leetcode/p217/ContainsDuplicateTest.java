package prasad.leetcode.p217;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;

public class ContainsDuplicateTest {

    @Test
    public void test01() {
        Assert.assertTrue(new ContainsDuplicate().containsDuplicate(new int[] {1,2,3,1}));
    }

    @Test
    public void test02() {
        Assert.assertFalse(new ContainsDuplicate().containsDuplicate(new int[] {1,2,3,4}));
    }

    @Test
    public void test03() {
        Assert.assertTrue(new ContainsDuplicate().containsDuplicate(new int[] {1,1,1,3,3,4,3,2,4,2}));
    }

    @Test
    public void test04() {
        Assert.assertFalse(new ContainsDuplicate().containsDuplicate(new int[] {5}));
    }

    @Test
    public void testLoad() {
        int[] nums = new int[100000];
        for (int i = 0; i < 100000; i++) {
            nums[i] = i;
        }
        System.out.println(Arrays.toString(nums));

        long start = System.currentTimeMillis();
        Assert.assertFalse(new ContainsDuplicate().containsDuplicate(nums));
        System.out.println("Time = " + (System.currentTimeMillis() - start) + " ms");
    }
}
