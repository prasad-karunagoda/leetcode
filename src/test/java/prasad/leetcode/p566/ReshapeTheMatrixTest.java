package prasad.leetcode.p566;

import org.junit.Assert;
import org.junit.Test;

public class ReshapeTheMatrixTest {

    @Test
    public void test01() {
        int[][] matrix = new int[][] {{1,2}, {3,4}};
        int[][] reshaped = new ReshapeTheMatrix().matrixReshape(matrix, 1, 4);
        Assert.assertEquals(1, reshaped.length);
        Assert.assertArrayEquals(new int[] {1,2,3,4}, reshaped[0]);
    }

    @Test
    public void test02() {
        int[][] matrix = new int[][] {{1,2}, {3,4}};
        int[][] reshaped = new ReshapeTheMatrix().matrixReshape(matrix, 2, 4);
        // Reshape is not possible. Therefore, original matrix is returned.
        Assert.assertEquals(2, reshaped.length);
        Assert.assertArrayEquals(new int[] {1,2}, reshaped[0]);
        Assert.assertArrayEquals(new int[] {3,4}, reshaped[1]);
    }

    @Test(expected = IllegalArgumentException.class)
    public void test03() {
        int[][] matrix = new int[][] {{1,2}, {3,4,5}, {6,7}};
        new ReshapeTheMatrix().matrixReshape(matrix, 1, 7);
    }

    @Test(expected = IllegalArgumentException.class)
    public void test04() {
        int[][] matrix = new int[0][];
        new ReshapeTheMatrix().matrixReshape(matrix, 1, 1);
    }

    @Test
    public void test05() {
        int[][] matrix = new int[][] {{5}};
        int[][] reshaped = new ReshapeTheMatrix().matrixReshape(matrix, 1, 1);
        Assert.assertEquals(1, reshaped.length);
        Assert.assertArrayEquals(new int[] {5}, reshaped[0]);
    }

    @Test
    public void test06() {
        int[][] matrix = new int[][] {{1,2,3,4}, {5,6,7,8}, {9,10,11,12}};
        int[][] reshaped = new ReshapeTheMatrix().matrixReshape(matrix, 6, 2);
        Assert.assertEquals(6, reshaped.length);
        Assert.assertArrayEquals(new int[] {1,2}, reshaped[0]);
        Assert.assertArrayEquals(new int[] {3,4}, reshaped[1]);
        Assert.assertArrayEquals(new int[] {5,6}, reshaped[2]);
        Assert.assertArrayEquals(new int[] {7,8}, reshaped[3]);
        Assert.assertArrayEquals(new int[] {9,10}, reshaped[4]);
        Assert.assertArrayEquals(new int[] {11,12}, reshaped[5]);
    }
}
