package prasad.leetcode.p2348;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.Random;

public class NumberOfZeroFilledSubarraysTest {

    @Test
    public void test01() {
        Assert.assertEquals(6, new NumberOfZeroFilledSubarrays().zeroFilledSubarray(
                new int[] {1,3,0,0,2,0,0,4}));
    }

    @Test
    public void test02() {
        Assert.assertEquals(9, new NumberOfZeroFilledSubarrays().zeroFilledSubarray(
                new int[] {0,0,0,2,0,0}));
    }

    @Test
    public void test03() {
        Assert.assertEquals(0, new NumberOfZeroFilledSubarrays().zeroFilledSubarray(
                new int[] {2,10,2019}));
    }

    @Test
    public void test04() {
        Assert.assertEquals(8, new NumberOfZeroFilledSubarrays().zeroFilledSubarray(
                new int[] {0,0,0,2,0,2,0}));
    }

    @Test
    public void test05() {
        Assert.assertEquals(15, new NumberOfZeroFilledSubarrays().zeroFilledSubarray(
                new int[] {0,0,0,0,0}));
    }

    @Test
    public void test06() {
        int[] nums = new int[100000];
        Arrays.fill(nums, 0);
        // expected = (100000 * (100000 + 1)) / 2
        Assert.assertEquals(5000050000L, new NumberOfZeroFilledSubarrays().zeroFilledSubarray(nums));
    }

    @Test
    public void testTime() {
        int[] nums = new int[100000];
        Random random = new Random();
        for (int i = 0; i < 100000; i++) {
            nums[i] = random.nextInt(3);
        }
        long start = System.currentTimeMillis();
        new NumberOfZeroFilledSubarrays().zeroFilledSubarray(nums);
        System.out.println("Time = " + (System.currentTimeMillis() - start) + " ms");
    }
}
