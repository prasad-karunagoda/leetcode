package prasad.leetcode.p48;

import org.junit.Assert;
import org.junit.Test;

public class RotateImageTest {

    @Test
    public void test01() {
        int[][] matrix = new int[][] {{1,2,3}, {4,5,6}, {7,8,9}};
        new RotateImage().rotate(matrix);
        Assert.assertArrayEquals(new int[] {7,4,1}, matrix[0]);
        Assert.assertArrayEquals(new int[] {8,5,2}, matrix[1]);
        Assert.assertArrayEquals(new int[] {9,6,3}, matrix[2]);
    }

    @Test
    public void test02() {
        int[][] matrix = new int[][] {{5,1,9,11}, {2,4,8,10}, {13,3,6,7}, {15,14,12,16}};
        new RotateImage().rotate(matrix);
        Assert.assertArrayEquals(new int[] {15,13,2,5}, matrix[0]);
        Assert.assertArrayEquals(new int[] {14,3,4,1}, matrix[1]);
        Assert.assertArrayEquals(new int[] {12,6,8,9}, matrix[2]);
        Assert.assertArrayEquals(new int[] {16,7,10,11}, matrix[3]);
    }

    @Test
    public void test03() {
        int[][] matrix = new int[][] {{5}};
        new RotateImage().rotate(matrix);
        Assert.assertArrayEquals(new int[] {5}, matrix[0]);
    }
}
