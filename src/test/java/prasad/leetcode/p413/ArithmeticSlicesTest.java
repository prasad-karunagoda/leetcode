package prasad.leetcode.p413;

import org.junit.Assert;
import org.junit.Test;

import java.util.Random;

public class ArithmeticSlicesTest {

    @Test
    public void test01() {
        Assert.assertEquals(3,
                new ArithmeticSlices().numberOfArithmeticSlices(new int[] {1,2,3,4}));
    }

    @Test
    public void test02() {
        Assert.assertEquals(0,
                new ArithmeticSlices().numberOfArithmeticSlices(new int[] {1}));
    }

    @Test
    public void test03() {
        Assert.assertEquals(1,
                new ArithmeticSlices().numberOfArithmeticSlices(new int[] {1,5,2,4,6,7}));
    }

    @Test
    public void test04() {
        Assert.assertEquals(1,
                new ArithmeticSlices().numberOfArithmeticSlices(new int[] {3,6,9}));
    }

    @Test
    public void test05() {
        Assert.assertEquals(3,
                new ArithmeticSlices().numberOfArithmeticSlices(new int[] {1,5,2,3,4,5,7}));
    }

    @Test
    public void testTime() {
        Random random = new Random();
        int[] nums = new int[5000];
        for (int i = 0; i < 5000; i++) {
            nums[i] = random.nextInt(1000);
        }
        long start = System.currentTimeMillis();
        new ArithmeticSlices().numberOfArithmeticSlices(nums);
        System.out.println("Time = " + (System.currentTimeMillis() - start) + " ms");
    }

    @Test
    public void testIsArithmetic01() {
        Assert.assertTrue(new ArithmeticSlices().isArithmetic(
                new int[] {0,1,2,5,10,15,20,25,3,4}, 3, 7));
    }

    @Test
    public void testIsArithmetic02() {
        Assert.assertFalse(new ArithmeticSlices().isArithmetic(
                new int[] {0,1,2,5,10,15,20,36,3,4}, 3, 7));
    }
}
