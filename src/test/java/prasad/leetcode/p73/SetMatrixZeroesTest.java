package prasad.leetcode.p73;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;

public class SetMatrixZeroesTest {

    @Test
    public void test01() {
        int[][] matrix = new int[][] {{1,1,1},{1,0,1},{1,1,1}};
        new SetMatrixZeroes().setZeroes(matrix);
        Assert.assertArrayEquals(new int[] {1,0,1}, matrix[0]);
        Assert.assertArrayEquals(new int[] {0,0,0}, matrix[1]);
        Assert.assertArrayEquals(new int[] {1,0,1}, matrix[2]);
    }

    @Test
    public void test02() {
        int[][] matrix = new int[][] {{0,1,2,0},{3,4,5,2},{1,3,1,5}};
        new SetMatrixZeroes().setZeroes(matrix);
        Assert.assertArrayEquals(new int[] {0,0,0,0}, matrix[0]);
        Assert.assertArrayEquals(new int[] {0,4,5,0}, matrix[1]);
        Assert.assertArrayEquals(new int[] {0,3,1,0}, matrix[2]);
    }

    @Test
    public void test03() {
        int[][] matrix = new int[][] {{5}};
        new SetMatrixZeroes().setZeroes(matrix);
        Assert.assertArrayEquals(new int[] {5}, matrix[0]);
    }

    @Test
    public void test04() {
        int[][] matrix = new int[][] {{0}};
        new SetMatrixZeroes().setZeroes(matrix);
        Assert.assertArrayEquals(new int[] {0}, matrix[0]);
    }

    @Test
    public void testTime() {
        int[][] matrix = new int[200][200];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                int n = (int) (Math.random() * 1000);
                matrix[i][j] = n < 200 ? 0 : n;
            }
            System.out.println(Arrays.toString(matrix[i]));
        }

        long start = System.currentTimeMillis();
        new SetMatrixZeroes().setZeroes(matrix);
        System.out.println("Time = " + (System.currentTimeMillis() - start) + " ms");
    }
}
