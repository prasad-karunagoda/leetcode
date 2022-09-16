package prasad.leetcode.p1034;

import org.junit.Assert;
import org.junit.Test;

public class ColoringBorderTest {

    @Test
    public void test01() {
        int[][] result = new ColoringBorder().colorBorder(new int[][] {{1,1},{1,2}}, 0, 0, 3);
        Assert.assertEquals(2, result.length);
        Assert.assertArrayEquals(new int[] {3,3}, result[0]);
        Assert.assertArrayEquals(new int[] {3,2}, result[1]);
    }

    @Test
    public void test02() {
        int[][] result = new ColoringBorder().colorBorder(new int[][] {{1,2,2},{2,3,2}}, 0, 1, 3);
        Assert.assertEquals(2, result.length);
        Assert.assertArrayEquals(new int[] {1,3,3}, result[0]);
        Assert.assertArrayEquals(new int[] {2,3,3}, result[1]);
    }

    @Test
    public void test03() {
        int[][] result = new ColoringBorder().colorBorder(new int[][] {{1,1,1},{1,1,1},{1,1,1}}, 1, 1, 2);
        Assert.assertEquals(3, result.length);
        Assert.assertArrayEquals(new int[] {2,2,2}, result[0]);
        Assert.assertArrayEquals(new int[] {2,1,2}, result[1]);
        Assert.assertArrayEquals(new int[] {2,2,2}, result[2]);
    }

    @Test
    public void test04() {
        int[][] result = new ColoringBorder().colorBorder(new int[][] {{5}}, 0, 0, 3);
        Assert.assertEquals(1, result.length);
        Assert.assertArrayEquals(new int[] {3}, result[0]);
    }

    @Test
    public void test05() {
        int[][] result = new ColoringBorder().colorBorder(new int[][] {{5,5}}, 0, 1, 3);
        Assert.assertEquals(1, result.length);
        Assert.assertArrayEquals(new int[] {3,3}, result[0]);
    }

    @Test
    public void test06() {
        int[][] grid = new int[][] {
                {1, 1, 5, 1, 1, 1, 1, 1},
                {1, 1, 5, 5, 1, 1, 1, 1},
                {5, 5, 5, 5, 5, 1, 1, 1},
                {1, 5, 5, 5, 5, 1, 1, 1},
                {1, 1, 1, 5, 5, 1, 1, 1},
                {1, 1, 1, 5, 5, 1, 1, 1},
                {1, 1, 1, 1, 5, 5, 1, 1}};
        int[][] result = new ColoringBorder().colorBorder(grid, 3, 2, 3);
        Assert.assertEquals(7, result.length);
        Assert.assertArrayEquals(new int[] {1, 1, 3, 1, 1, 1, 1, 1}, result[0]);
        Assert.assertArrayEquals(new int[] {1, 1, 3, 3, 1, 1, 1, 1}, result[1]);
        Assert.assertArrayEquals(new int[] {3, 3, 5, 5, 3, 1, 1, 1}, result[2]);
        Assert.assertArrayEquals(new int[] {1, 3, 3, 5, 3, 1, 1, 1}, result[3]);
        Assert.assertArrayEquals(new int[] {1, 1, 1, 3, 3, 1, 1, 1}, result[4]);
        Assert.assertArrayEquals(new int[] {1, 1, 1, 3, 3, 1, 1, 1}, result[5]);
        Assert.assertArrayEquals(new int[] {1, 1, 1, 1, 3, 3, 1, 1}, result[6]);
    }
}
