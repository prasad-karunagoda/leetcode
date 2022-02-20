package prasad.leetcode.p200;

import org.junit.Assert;
import org.junit.Test;

import java.util.Random;

public class NumberOfIslandsTest {

    @Test
    public void test01() {
        Assert.assertEquals(1, new NumberOfIslands().numIslands(new char[][] {
                {'1','1','1','1','0'},
                {'1','1','0','1','0'},
                {'1','1','0','0','0'},
                {'0','0','0','0','0'}}));
    }

    @Test
    public void test02() {
        Assert.assertEquals(3, new NumberOfIslands().numIslands(new char[][] {
                {'1','1','0','0','0'},
                {'1','1','0','0','0'},
                {'0','0','1','0','0'},
                {'0','0','0','1','1'}}));
    }

    @Test
    public void test03() {
        Assert.assertEquals(1, new NumberOfIslands().numIslands(new char[][] {{'1'}}));
    }

    @Test
    public void test04() {
        Assert.assertEquals(0, new NumberOfIslands().numIslands(new char[][] {{'0'}}));
    }

    @Test
    public void testTime() {
        char[][] grid = new char[300][300];
        Random random = new Random();
        for (int i = 0; i < 300; i++) {
            for (int j = 0; j < 300; j++) {
                grid[i][j] = random.nextInt(2) == 0 ? '0' : '1';
            }
        }

        long start = System.currentTimeMillis();
        new NumberOfIslands().numIslands(grid);
        System.out.println("Time = " + (System.currentTimeMillis() - start) + " ms");
    }
}
