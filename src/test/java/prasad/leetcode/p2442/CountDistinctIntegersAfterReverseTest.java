package prasad.leetcode.p2442;

import org.junit.Assert;
import org.junit.Test;

public class CountDistinctIntegersAfterReverseTest {

    @Test
    public void test01() {
        Assert.assertEquals(6, new CountDistinctIntegersAfterReverse().countDistinctIntegers(
                new int[] {1,13,10,12,31}));
    }

    @Test
    public void test02() {
        Assert.assertEquals(1, new CountDistinctIntegersAfterReverse().countDistinctIntegers(
                new int[] {2,2,2}));
    }

    @Test
    public void testTime() {
        int[] nums = new int[100000];
        for (int i = 0; i < 100000; i++) {
            nums[i] = i + 1;
        }
        long start = System.currentTimeMillis();
        new CountDistinctIntegersAfterReverse().countDistinctIntegers(nums);
        System.out.println("Time = " + (System.currentTimeMillis() - start) + " ms");
    }
}
