package prasad.leetcode.p74;

import org.junit.Assert;
import org.junit.Test;

public class Search2DMatrixTest {

    @Test
    public void test01() {
        int[][] matrix = new int[][] {{1,3,5,7}, {10,11,16,20}, {23,30,34,60}};
        Assert.assertTrue(new Search2DMatrix().searchMatrix(matrix, 3));
    }

    @Test
    public void test02() {
        int[][] matrix = new int[][] {{1,3,5,7}, {10,11,16,20}, {23,30,34,60}};
        Assert.assertFalse(new Search2DMatrix().searchMatrix(matrix, 13));
    }

    @Test
    public void test03() {
        int[][] matrix = new int[][] {{5}};
        Assert.assertTrue(new Search2DMatrix().searchMatrix(matrix, 5));
    }

    @Test
    public void test04() {
        int[][] matrix = new int[][] {{5}};
        Assert.assertFalse(new Search2DMatrix().searchMatrix(matrix, 7));
    }

    @Test
    public void test05() {
        int[][] matrix = new int[][] {{5}};
        Assert.assertFalse(new Search2DMatrix().searchMatrix(matrix, 3));
    }

    @Test
    public void testTime() {
        int[][] matrix = new int[100][];
        for (int i = 0; i < 100; i++) {
            int[] row = new int[100];
            for (int j = 0; j < 100; j++) {
                row[j] = (i * 100) + j;
            }
            matrix[i] = row;
        }
        long start = System.currentTimeMillis();
        Assert.assertTrue(new Search2DMatrix().searchMatrix(matrix, 9998));
        System.out.println("Time = " + (System.currentTimeMillis() - start) + " ms");
    }
}
