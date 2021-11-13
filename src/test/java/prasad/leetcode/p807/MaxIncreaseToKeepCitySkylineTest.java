package prasad.leetcode.p807;

import org.junit.Assert;
import org.junit.Test;

public class MaxIncreaseToKeepCitySkylineTest {

    @Test
    public void testTransposeSquare01() {
        int[][] grid = new int[][]
                {{3,0,8,4},
                 {2,4,5,7},
                 {9,2,6,3},
                 {0,3,1,0}};
        int[][] transposed = new MaxIncreaseToKeepCitySkyline().transposeSquare(grid);
        Assert.assertArrayEquals(new int[] {3,2,9,0}, transposed[0]);
        Assert.assertArrayEquals(new int[] {0,4,2,3}, transposed[1]);
        Assert.assertArrayEquals(new int[] {8,5,6,1}, transposed[2]);
        Assert.assertArrayEquals(new int[] {4,7,3,0}, transposed[3]);
    }

    @Test
    public void testMaxIncreaseKeepingSkyline01() {
        int[][] grid = new int[][]
                {{3,0,8,4},
                 {2,4,5,7},
                 {9,2,6,3},
                 {0,3,1,0}};
        Assert.assertEquals(35, new MaxIncreaseToKeepCitySkyline().maxIncreaseKeepingSkyline(grid));
    }

    @Test
    public void testMaxIncreaseKeepingSkyline02() {
        int[][] grid = new int[][]
                {{0,0,0},
                 {0,0,0},
                 {0,0,0}};
        Assert.assertEquals(0, new MaxIncreaseToKeepCitySkyline().maxIncreaseKeepingSkyline(grid));
    }

    @Test
    public void testMaxIncreaseKeepingSkyline03() {
        int[][] grid = new int[][]
                {{20,30},
                 {40,60}};
        Assert.assertEquals(10, new MaxIncreaseToKeepCitySkyline().maxIncreaseKeepingSkyline(grid));
    }
}
