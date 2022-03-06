package prasad.leetcode.p1685;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.Random;

public class SumOfAbsoluteDiffTest {

    @Test
    public void test01() {
        int[] result = new SumOfAbsoluteDiff().getSumAbsoluteDifferences(new int[] {2,3,5});
        Assert.assertArrayEquals(new int[] {4,3,5}, result);
    }

    @Test
    public void test02() {
        int[] result = new SumOfAbsoluteDiff().getSumAbsoluteDifferences(new int[] {1,4,6,8,10});
        Assert.assertArrayEquals(new int[] {24,15,13,15,21}, result);
    }

    @Test
    public void test03() {
        int[] result = new SumOfAbsoluteDiff().getSumAbsoluteDifferences(new int[] {4,7});
        Assert.assertArrayEquals(new int[] {3,3}, result);
    }

    @Test
    public void testTime() {
        int[] nums = new int[100000];
        Random random = new Random();
        for (int i = 0; i < 100000; i++) {
            nums[i] = random.nextInt(10000) + 1;
        }
        Arrays.sort(nums);

        long start = System.currentTimeMillis();
        new SumOfAbsoluteDiff().getSumAbsoluteDifferences(nums);
        System.out.println("Time = " + (System.currentTimeMillis() - start) + " ms");
    }
}
