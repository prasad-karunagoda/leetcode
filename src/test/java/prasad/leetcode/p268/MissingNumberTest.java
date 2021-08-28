package prasad.leetcode.p268;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;

public class MissingNumberTest {

    @Test
    public void test01() {
        Assert.assertEquals(2, new MissingNumber().missingNumber(new int[] {3,0,1}));
    }

    @Test
    public void test02() {
        Assert.assertEquals(2, new MissingNumber().missingNumber(new int[] {0,1}));
    }

    @Test
    public void test03() {
        Assert.assertEquals(8, new MissingNumber().missingNumber(new int[] {9,6,4,2,3,5,7,0,1}));
    }

    @Test
    public void test04() {
        Assert.assertEquals(1, new MissingNumber().missingNumber(new int[] {0}));
    }

    @Test
    public void test05() {
        Assert.assertEquals(0, new MissingNumber().missingNumber(new int[] {1}));
    }

    @Test
    public void testTime() {
        int[] nums = new int[10000];
        for (int i = 0; i < 10000; i++) {
            nums[i] = i;
        }
        System.out.println(Arrays.toString(nums));

        long start = System.currentTimeMillis();
        Assert.assertEquals(10000, new MissingNumber().missingNumber(nums));
        System.out.println("Time = " + (System.currentTimeMillis() - start) + " ms");
    }
}
