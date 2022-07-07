package prasad.leetcode.p1365;

import org.junit.Assert;
import org.junit.Test;

import java.util.Random;

public class HowManyNumbersAreSmallerTest {

    @Test
    public void test01() {
        Assert.assertArrayEquals(new int[] {4,0,1,1,3},
                new HowManyNumbersAreSmaller().smallerNumbersThanCurrent(new int[] {8,1,2,2,3}));
    }

    @Test
    public void test02() {
        Assert.assertArrayEquals(new int[] {2,1,0,3},
                new HowManyNumbersAreSmaller().smallerNumbersThanCurrent(new int[] {6,5,4,8}));
    }

    @Test
    public void test03() {
        Assert.assertArrayEquals(new int[] {0,0,0,0},
                new HowManyNumbersAreSmaller().smallerNumbersThanCurrent(new int[] {7,7,7,7}));
    }

    @Test
    public void test04() {
        Assert.assertArrayEquals(new int[] {1,0},
                new HowManyNumbersAreSmaller().smallerNumbersThanCurrent(new int[] {8,5}));
    }

    @Test
    public void testTime() {
        int[] nums = new int[50000];
        Random random = new Random();
        for (int i = 0; i < nums.length; i++) {
            nums[i] = random.nextInt(101);
        }
        long start = System.currentTimeMillis();
        new HowManyNumbersAreSmaller().smallerNumbersThanCurrent(nums);
        System.out.println("Time = " + (System.currentTimeMillis() - start) + " ms");
    }
}
