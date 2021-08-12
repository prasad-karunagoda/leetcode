package prasad.leetcode.p167;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;

public class TwoSumSortedArrayTest {

    @Test
    public void test01() {
        int[] answer = new TwoSumSortedArray().twoSum(new int[] {2,7,11,15}, 9);
        Assert.assertArrayEquals(new int[] {1,2}, answer);
    }

    @Test
    public void test02() {
        int[] answer = new TwoSumSortedArray().twoSum(new int[] {2,3,4}, 6);
        Assert.assertArrayEquals(new int[] {1,3}, answer);
    }

    @Test
    public void test03() {
        int[] answer = new TwoSumSortedArray().twoSum(new int[] {-1,0}, -1);
        Assert.assertArrayEquals(new int[] {1,2}, answer);
    }

    @Test
    public void test04() {
        int[] answer = new TwoSumSortedArray().twoSum(new int[] {2,7,7,11,15}, 14);
        Assert.assertArrayEquals(new int[] {2,3}, answer);
    }

    @Test
    public void testTime() {
        int startingNumber = -10000;
        int[] numbers = new int[30000];
        numbers[0] = startingNumber;
        for (int i = 1; i < 30000; i++) {
            int randomNumber = (int) (Math.random() * 3);
            numbers[i] = numbers[i - 1] + randomNumber;
        }
        //System.out.println(Arrays.toString(numbers));

        long start = System.currentTimeMillis();
        int[] answer = new TwoSumSortedArray().twoSum(numbers, 10000);
        System.out.println("Time = " + (System.currentTimeMillis() - start) + " ms");
        System.out.println(Arrays.toString(answer));
    }
}
