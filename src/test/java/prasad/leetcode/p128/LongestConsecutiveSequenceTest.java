package prasad.leetcode.p128;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;

public class LongestConsecutiveSequenceTest {

    @Test
    public void test01() {
        Assert.assertEquals(4, new LongestConsecutiveSequence().longestConsecutive(new int[] {100,4,200,1,3,2}));
    }

    @Test
    public void test02() {
        Assert.assertEquals(9, new LongestConsecutiveSequence().longestConsecutive(new int[] {0,3,7,2,5,8,4,6,0,1}));
    }

    @Test
    public void test03() {
        Assert.assertEquals(0, new LongestConsecutiveSequence().longestConsecutive(new int[0]));
    }

    @Test
    public void test04() {
        Assert.assertEquals(1, new LongestConsecutiveSequence().longestConsecutive(new int[] {5}));
    }

    @Test
    public void test05() {
        Assert.assertEquals(5, new LongestConsecutiveSequence().longestConsecutive(new int[] {4,0,-4,-2,2,5,2,0,-8,-8,-8,-8,-1,7,4,5,5,-4,6,6,-3}));
    }

    @Test
    public void testTime() {
        int[] nums = new int[100000];
        for (int i = 0; i < 100000; i++) {
            nums[i] = (int) (1000000000 * Math.random());
        }
        System.out.println(Arrays.toString(nums));

        long start = System.currentTimeMillis();
        int maxLength = new LongestConsecutiveSequence().longestConsecutive(nums);
        System.out.println("Time = " + (System.currentTimeMillis() - start) + " ms");
        System.out.println("maxLength = " + maxLength);
    }
}
