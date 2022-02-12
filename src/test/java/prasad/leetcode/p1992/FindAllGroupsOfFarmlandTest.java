package prasad.leetcode.p1992;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class FindAllGroupsOfFarmlandTest {

    @Test
    public void test01() {
        int[][] farmlands = new FindAllGroupsOfFarmland().findFarmland(new int[][] {
                {1, 0, 0},
                {0, 1, 1},
                {0, 1, 1}});
        Assert.assertEquals(2, farmlands.length);
        assertFarms(farmlands, Arrays.asList(0, 0, 0, 0), Arrays.asList(1, 1, 2, 2));
    }

    @Test
    public void test02() {
        int[][] farmlands = new FindAllGroupsOfFarmland().findFarmland(new int[][] {
                {1, 1},
                {1, 1}});
        Assert.assertEquals(1, farmlands.length);
        assertFarms(farmlands, Arrays.asList(0, 0, 1, 1));
    }

    @Test
    public void test03() {
        int[][] farmlands = new FindAllGroupsOfFarmland().findFarmland(new int[][] {{0}});
        Assert.assertEquals(0, farmlands.length);
    }

    @Test
    public void test04() {
        int[][] farmlands = new FindAllGroupsOfFarmland().findFarmland(new int[][] {{1}});
        Assert.assertEquals(1, farmlands.length);
        assertFarms(farmlands, Arrays.asList(0, 0, 0, 0));
    }

    @Test
    public void test05() {
        int[][] farmlands = new FindAllGroupsOfFarmland().findFarmland(new int[][] {
                {0, 0, 1, 1, 1, 0, 0, 0, 0, 0},
                {0, 0, 1, 1, 1, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 1, 0, 1, 1, 0},
                {0, 1, 1, 0, 0, 0, 0, 1, 1, 0},
                {0, 1, 1, 0, 0, 0, 0, 1, 1, 0},
                {0, 0, 0, 0, 1, 1, 0, 0, 0, 0}});
        Assert.assertEquals(5, farmlands.length);
        assertFarms(farmlands, Arrays.asList(0, 2, 1, 4), Arrays.asList(2, 5, 2, 5), Arrays.asList(2, 7, 4, 8),
                Arrays.asList(3, 1, 4, 2), Arrays.asList(5, 4, 5, 5));
    }

    @Test
    public void testTime() {
        Random random = new Random();
        int[][] land = new int[300][300];
        for (int i = 0; i < 300; i++) {
            for (int j = 0; j < 300; j++) {
                land[i][j] = random.nextInt(2);
            }
        }

        long start = System.currentTimeMillis();
        new FindAllGroupsOfFarmland().findFarmland(land);
        System.out.println("Time = " + (System.currentTimeMillis() - start) + " ms");
    }

    private static void assertFarms(int[][] actual, List<Integer>... expected) {
        List<List<Integer>> list = new ArrayList<>();
        for (int[] farm : actual) {
            list.add(Arrays.asList(farm[0], farm[1], farm[2], farm[3]));
        }

        for (List<Integer> farm : expected) {
            Assert.assertTrue(list.contains(farm));
        }
    }
}
