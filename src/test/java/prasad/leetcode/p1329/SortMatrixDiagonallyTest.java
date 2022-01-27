package prasad.leetcode.p1329;

import org.junit.Assert;
import org.junit.Test;

public class SortMatrixDiagonallyTest {

    @Test
    public void test01() {
        int[][] mat = new int[][] {{3,3,1,1},{2,2,1,2},{1,1,1,2}};
        int[][] sorted = new SortMatrixDiagonally().diagonalSort(mat);
        Assert.assertEquals(3, sorted.length);
        Assert.assertArrayEquals(new int[] {1,1,1,1}, sorted[0]);
        Assert.assertArrayEquals(new int[] {1,2,2,2}, sorted[1]);
        Assert.assertArrayEquals(new int[] {1,2,3,3}, sorted[2]);
    }

    @Test
    public void test02() {
        int[][] mat = new int[][] {{11,25,66,1,69,7},{23,55,17,45,15,52},{75,31,36,44,58,8},{22,27,33,25,68,4},{84,28,14,11,5,50}};
        int[][] sorted = new SortMatrixDiagonally().diagonalSort(mat);
        Assert.assertEquals(5, sorted.length);
        Assert.assertArrayEquals(new int[] {5,17,4,1,52,7}, sorted[0]);
        Assert.assertArrayEquals(new int[] {11,11,25,45,8,69}, sorted[1]);
        Assert.assertArrayEquals(new int[] {14,23,25,44,58,15}, sorted[2]);
        Assert.assertArrayEquals(new int[] {22,27,31,36,50,66}, sorted[3]);
        Assert.assertArrayEquals(new int[] {84,28,75,33,55,68}, sorted[4]);
    }

    @Test
    public void test03() {
        int[][] mat = new int[][] {{5}};
        int[][] sorted = new SortMatrixDiagonally().diagonalSort(mat);
        Assert.assertEquals(1, sorted.length);
        Assert.assertArrayEquals(new int[] {5}, sorted[0]);
    }

    @Test
    public void test04() {
        int[][] mat = new int[][] {{4,5,1,3,2}};
        int[][] sorted = new SortMatrixDiagonally().diagonalSort(mat);
        Assert.assertEquals(1, sorted.length);
        Assert.assertArrayEquals(new int[] {4,5,1,3,2}, sorted[0]);
    }

    @Test
    public void test05() {
        int[][] mat = new int[][] {{3},{5},{2},{1}};
        int[][] sorted = new SortMatrixDiagonally().diagonalSort(mat);
        Assert.assertEquals(4, sorted.length);
        Assert.assertArrayEquals(new int[] {3}, sorted[0]);
        Assert.assertArrayEquals(new int[] {5}, sorted[1]);
        Assert.assertArrayEquals(new int[] {2}, sorted[2]);
        Assert.assertArrayEquals(new int[] {1}, sorted[3]);
    }

    @Test
    public void test06() {
        int[][] mat = new int[][] {{5,1},{4,2}};
        int[][] sorted = new SortMatrixDiagonally().diagonalSort(mat);
        Assert.assertEquals(2, sorted.length);
        Assert.assertArrayEquals(new int[] {2,1}, sorted[0]);
        Assert.assertArrayEquals(new int[] {4,5}, sorted[1]);
    }
}
