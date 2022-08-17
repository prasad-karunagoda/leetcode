package prasad.leetcode.p1895;

import org.junit.Assert;
import org.junit.Test;

import java.util.Random;

public class LargestMagicSquareTest {

    @Test
    public void test01() {
        Assert.assertEquals(3, new LargestMagicSquare().largestMagicSquare(
                new int[][] {{7,1,4,5,6},{2,5,1,6,4},{1,5,4,3,2},{1,2,7,3,4}}));
    }

    @Test
    public void test02() {
        Assert.assertEquals(2, new LargestMagicSquare().largestMagicSquare(
                new int[][] {{5,1,3,1},{9,3,3,1},{1,3,3,8}}));
    }

    @Test
    public void test03() {
        Assert.assertEquals(1, new LargestMagicSquare().largestMagicSquare(
                new int[][] {{5}}));
    }

    @Test
    public void testTime() {
        int[][] grid = new int[50][50];
        Random random = new Random();
        for (int i = 0; i < 50; i++) {
            for (int j = 0; j < 50; j++) {
                grid[i][j] = random.nextInt(1000000) + 1;
            }
        }

        grid[35][42] = 5;
        grid[35][43] = 5;
        grid[36][42] = 5;
        grid[36][43] = 5;

        long start = System.currentTimeMillis();
        Assert.assertEquals(2, new LargestMagicSquare().largestMagicSquare(grid));
        System.out.println("Time = " + (System.currentTimeMillis() - start) + " ms");
    }
}
