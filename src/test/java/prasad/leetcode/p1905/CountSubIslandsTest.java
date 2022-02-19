package prasad.leetcode.p1905;

import org.junit.Assert;
import org.junit.Test;

import java.util.Random;

public class CountSubIslandsTest {

    @Test
    public void test01() {
        Assert.assertEquals(3, new CountSubIslands().countSubIslands(
                new int[][] {
                        {1, 1, 1, 0, 0},
                        {0, 1, 1, 1, 1},
                        {0, 0, 0, 0, 0},
                        {1, 0, 0, 0, 0},
                        {1, 1, 0, 1, 1}},
                new int[][] {
                        {1, 1, 1, 0, 0},
                        {0, 0, 1, 1, 1},
                        {0, 1, 0, 0, 0},
                        {1, 0, 1, 1, 0},
                        {0, 1, 0, 1, 0}}));
    }

    @Test
    public void test02() {
        Assert.assertEquals(2, new CountSubIslands().countSubIslands(
                new int[][] {
                        {1, 0, 1, 0, 1},
                        {1, 1, 1, 1, 1},
                        {0, 0, 0, 0, 0},
                        {1, 1, 1, 1, 1},
                        {1, 0, 1, 0, 1}},
                new int[][] {
                        {0, 0, 0, 0, 0},
                        {1, 1, 1, 1, 1},
                        {0, 1, 0, 1, 0},
                        {0, 1, 0, 1, 0},
                        {1, 0, 0, 0, 1}}));
    }

    @Test
    public void test03() {
        Assert.assertEquals(1, new CountSubIslands().countSubIslands(
                new int[][] {{1}},
                new int[][] {{1}}));
    }

    @Test
    public void testTime() {
        int[][] grid1 = new int[500][500];
        int[][] grid2 = new int[500][500];
        Random random = new Random();
        for (int i = 0; i < 500; i++) {
            for (int j = 0; j < 500; j++) {
                grid1[i][j] = random.nextInt(2);
                grid2[i][j] = random.nextInt(2);
            }
        }

        long start = System.currentTimeMillis();
        new CountSubIslands().countSubIslands(grid1, grid2);
        System.out.println("Time = " + (System.currentTimeMillis() - start) + " ms");
    }
}
