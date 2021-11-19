package prasad.leetcode.p994;

import org.junit.Assert;
import org.junit.Test;

public class RottingOrangesTest {

    @Test
    public void test01() {
        int[][] grid = new int[][] {{2,1,1},{1,1,0},{0,1,1}};
        int minutes = new RottingOranges().orangesRotting(grid);
        Assert.assertEquals(4, minutes);
    }

    @Test
    public void test02() {
        int[][] grid = new int[][] {{2,1,1},{0,1,1},{1,0,1}};
        int minutes = new RottingOranges().orangesRotting(grid);
        Assert.assertEquals(-1, minutes);
    }

    @Test
    public void test03() {
        int[][] grid = new int[][] {{0,2}};
        int minutes = new RottingOranges().orangesRotting(grid);
        Assert.assertEquals(0, minutes);
    }

    @Test
    public void test04() {
        int[][] grid = new int[][] {{0}};
        int minutes = new RottingOranges().orangesRotting(grid);
        Assert.assertEquals(0, minutes);
    }

    @Test
    public void test05() {
        int[][] grid = new int[][] {{1}};
        int minutes = new RottingOranges().orangesRotting(grid);
        Assert.assertEquals(-1, minutes);
    }

    @Test
    public void test06() {
        int[][] grid = new int[][] {{2}};
        int minutes = new RottingOranges().orangesRotting(grid);
        Assert.assertEquals(0, minutes);
    }

    @Test
    public void test07() {
        int[][] grid = new int[][] {
                {2,1,1,1,1,1,1,1,1,1},
                {1,1,1,1,1,1,1,1,1,1},
                {1,1,1,1,1,1,1,1,1,1},
                {1,1,1,1,1,1,1,1,1,1},
                {1,1,1,1,1,1,1,1,1,1},
                {1,1,1,1,1,1,1,1,1,1},
                {1,1,1,1,1,1,1,1,1,1},
                {1,1,1,1,1,1,1,1,1,1},
                {1,1,1,1,1,1,1,1,1,1},
                {1,1,1,1,1,1,1,1,1,1}};
        int minutes = new RottingOranges().orangesRotting(grid);
        Assert.assertEquals(18, minutes);
    }

    @Test
    public void test08() {
        int[][] grid = new int[][] {
                {2,1,1,1,1,1,1,1,1,1},
                {1,1,1,1,1,1,1,1,1,1},
                {1,1,1,1,1,1,1,1,1,1},
                {1,1,1,1,1,1,1,1,1,1},
                {1,1,1,1,1,1,1,1,1,1},
                {1,1,1,1,1,1,1,1,1,1},
                {1,1,1,1,1,1,1,1,1,1},
                {1,1,1,1,1,1,1,1,1,1},
                {1,1,1,1,1,1,1,1,1,1},
                {1,1,1,1,1,1,1,1,1,0}};
        int minutes = new RottingOranges().orangesRotting(grid);
        Assert.assertEquals(17, minutes);
    }

    @Test
    public void test09() {
        int[][] grid = new int[][] {
                {1,1,1,1,1,1,1,1,1,1},
                {1,1,1,1,1,1,1,1,1,1},
                {1,1,1,1,1,1,1,1,1,1},
                {1,1,1,1,1,1,1,1,1,1},
                {1,1,1,1,1,1,1,1,1,1},
                {1,1,1,1,1,1,1,1,1,1},
                {1,1,1,1,1,1,1,1,1,1},
                {1,1,1,1,1,1,1,1,1,1},
                {1,1,1,1,1,1,1,1,1,1},
                {1,1,1,1,1,1,1,1,1,2}};
        int minutes = new RottingOranges().orangesRotting(grid);
        Assert.assertEquals(18, minutes);
    }

    @Test
    public void test10() {
        int[][] grid = new int[][] {
                {1,1,1,1},
                {1,2,1,1},
                {1,1,1,1},
                {1,1,1,1}};
        int minutes = new RottingOranges().orangesRotting(grid);
        Assert.assertEquals(4, minutes);
    }
}
