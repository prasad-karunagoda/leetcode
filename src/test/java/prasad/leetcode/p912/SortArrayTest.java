package prasad.leetcode.p912;

import org.junit.Assert;
import org.junit.Test;

import java.util.Random;

public class SortArrayTest {

    @Test
    public void test01() {
        int[] sorted = new SortArray().sortArray(new int[] {5,2,3,1});
        Assert.assertArrayEquals(new int[] {1,2,3,5}, sorted);
    }

    @Test
    public void test02() {
        int[] sorted = new SortArray().sortArray(new int[] {5,1,1,2,0,0});
        Assert.assertArrayEquals(new int[] {0,0,1,1,2,5}, sorted);
    }

    @Test
    public void test03() {
        int[] sorted = new SortArray().sortArray(new int[] {5});
        Assert.assertArrayEquals(new int[] {5}, sorted);
    }

    @Test
    public void test04() {
        int[] sorted = new SortArray().sortArray(new int[] {5,3});
        Assert.assertArrayEquals(new int[] {3,5}, sorted);
    }

    @Test
    public void test05() {
        int[] sorted = new SortArray().sortArray(new int[] {5,3,6});
        Assert.assertArrayEquals(new int[] {3,5,6}, sorted);
    }

    @Test
    public void testTime() {
        Random random = new Random();
        int[] nums = new int[50000];
        for (int i = 0; i < 50000; i++) {
            nums[i] = random.nextInt(100000) - 50000;
        }

        long start = System.currentTimeMillis();
        new SortArray().sortArray(nums);
        System.out.println("Time = " + (System.currentTimeMillis() - start) + " ms");
    }
}
