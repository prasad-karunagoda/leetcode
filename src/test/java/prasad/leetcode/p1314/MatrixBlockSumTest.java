package prasad.leetcode.p1314;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;

public class MatrixBlockSumTest {

    @Test
    public void test01() {
        int[][] result = new MatrixBlockSum().matrixBlockSum(new int[][] {{1,2,3},{4,5,6},{7,8,9}}, 1);
        Assert.assertEquals(3, result.length);
        Assert.assertArrayEquals(new int[] {12,21,16}, result[0]);
        Assert.assertArrayEquals(new int[] {27,45,33}, result[1]);
        Assert.assertArrayEquals(new int[] {24,39,28}, result[2]);
    }

    @Test
    public void test02() {
        int[][] result = new MatrixBlockSum().matrixBlockSum(new int[][] {{1,2,3},{4,5,6},{7,8,9}}, 2);
        Assert.assertEquals(3, result.length);
        Assert.assertArrayEquals(new int[] {45,45,45}, result[0]);
        Assert.assertArrayEquals(new int[] {45,45,45}, result[1]);
        Assert.assertArrayEquals(new int[] {45,45,45}, result[2]);
    }

    @Test
    public void test03() {
        int[][] result = new MatrixBlockSum().matrixBlockSum(new int[][] {{5}}, 2);
        Assert.assertEquals(1, result.length);
        Assert.assertArrayEquals(new int[] {5}, result[0]);
    }

    @Test
    public void testTime() {
        int[][] mat = new int[100][100];
        for (int i = 0; i < 100; i++) {
            Arrays.fill(mat[i], 1);
        }
        long start = System.currentTimeMillis();
        int[][] result = new MatrixBlockSum().matrixBlockSum(mat, 100);
        System.out.println("Time = " + (System.currentTimeMillis() - start) + " ms");
        Assert.assertEquals(100, result.length);
        Assert.assertEquals(100, result[0].length);
    }
}
