package prasad.leetcode.p1267;

import org.junit.Assert;
import org.junit.Test;

import java.util.Random;

public class CountServersThatCommunicateTest {

    @Test
    public void test01() {
        Assert.assertEquals(0, new CountServersThatCommunicate().countServers(new int[][] {
                {1, 0},
                {0, 1}}));
    }

    @Test
    public void test02() {
        Assert.assertEquals(3, new CountServersThatCommunicate().countServers(new int[][] {
                {1, 0},
                {1, 1}}));
    }

    @Test
    public void test03() {
        Assert.assertEquals(4, new CountServersThatCommunicate().countServers(new int[][] {
                {1, 1, 0, 0},
                {0, 0, 1, 0},
                {0, 0, 1, 0},
                {0, 0, 0, 1}}));
    }

    @Test
    public void testTime() {
        int[][] grid = new int[250][250];
        Random random = new Random();
        for (int i = 0; i < 250; i++) {
            for (int j = 0; j < 250; j++) {
                grid[i][j] = random.nextInt(2);
            }
        }

        long start = System.currentTimeMillis();
        new CountServersThatCommunicate().countServers(grid);
        System.out.println("Time = " + (System.currentTimeMillis() - start) + " ms");
    }
}
