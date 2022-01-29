package prasad.leetcode.p1310;

import org.junit.Assert;
import org.junit.Test;

import java.util.Random;

public class XorQueriesOfSubarrayTest {

    @Test
    public void test01() {
        int[] result = new XorQueriesOfSubarray().xorQueries(new int[] {1,3,4,8},
                new int[][] {{0,1},{1,2},{0,3},{3,3}});
        Assert.assertArrayEquals(new int[] {2,7,14,8}, result);
    }

    @Test
    public void test02() {
        int[] result = new XorQueriesOfSubarray().xorQueries(new int[] {4,8,2,10},
                new int[][] {{2,3},{1,3},{0,0},{0,3}});
        Assert.assertArrayEquals(new int[] {8,0,4,4}, result);
    }

    @Test
    public void test03() {
        int[] result = new XorQueriesOfSubarray().xorQueries(new int[] {5},
                new int[][] {{0,0},{0,0}});
        Assert.assertArrayEquals(new int[] {5,5}, result);
    }

    @Test
    public void testTime() {
        Random random = new Random();
        int[] arr = new int[30000];
        int[][] queries = new int[30000][];
        for (int i = 0; i < 30000; i++) {
            arr[i] = random.nextInt(1000000000) + 1;
            int left = random.nextInt(30000);
            int right = left + random.nextInt(30000 - left);
            queries[i] = new int[] {left, right};
        }

        long start = System.currentTimeMillis();
        new XorQueriesOfSubarray().xorQueries(arr, queries);
        System.out.println("Time = " + (System.currentTimeMillis() - start) + " ms");
    }
}
