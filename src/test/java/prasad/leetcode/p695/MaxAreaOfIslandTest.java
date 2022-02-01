package prasad.leetcode.p695;

import org.junit.Assert;
import org.junit.Test;

public class MaxAreaOfIslandTest {

    @Test
    public void test01() {
        int[][] grid = new int[][] {
                {0,0,1,0,0,0,0,1,0,0,0,0,0},
                {0,0,0,0,0,0,0,1,1,1,0,0,0},
                {0,1,1,0,1,0,0,0,0,0,0,0,0},
                {0,1,0,0,1,1,0,0,1,0,1,0,0},
                {0,1,0,0,1,1,0,0,1,1,1,0,0},
                {0,0,0,0,0,0,0,0,0,0,1,0,0},
                {0,0,0,0,0,0,0,1,1,1,0,0,0},
                {0,0,0,0,0,0,0,1,1,0,0,0,0}
        };
        Assert.assertEquals(6, new MaxAreaOfIsland().maxAreaOfIsland(grid));
    }

    @Test
    public void test02() {
        int[][] grid = new int[][] {{0,0,0,0,0,0,0,0}};
        Assert.assertEquals(0, new MaxAreaOfIsland().maxAreaOfIsland(grid));
    }

    @Test
    public void test03() {
        int[][] grid = new int[][] {{1}};
        Assert.assertEquals(1, new MaxAreaOfIsland().maxAreaOfIsland(grid));
    }

    @Test
    public void test04() {
        int[][] grid = new int[][] {
                {0,1,1,0,0,0},
                {0,1,0,1,0,0},
                {0,0,0,1,1,0},
                {0,1,0,1,0,0}
        };
        Assert.assertEquals(4, new MaxAreaOfIsland().maxAreaOfIsland(grid));
    }
}
