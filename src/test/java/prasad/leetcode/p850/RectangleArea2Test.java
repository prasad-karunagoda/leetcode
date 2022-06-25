package prasad.leetcode.p850;

import org.junit.Assert;
import org.junit.Test;

import java.util.Random;

public class RectangleArea2Test {

    @Test
    public void test01() {
        Assert.assertEquals(6, new RectangleArea2().rectangleArea(
                new int[][] {{0,0,2,2},{1,0,2,3},{1,0,3,1}}));
    }

    @Test
    public void test02() {
        Assert.assertEquals(49, new RectangleArea2().rectangleArea(
                new int[][] {{0,0,1000000000,1000000000}}));
    }

    @Test
    public void test03() {
        Assert.assertEquals(9, new RectangleArea2().rectangleArea(
                new int[][] {{2,2,4,5},{1,1,3,3}}));
    }

    @Test
    public void test04() {
        Assert.assertEquals(10, new RectangleArea2().rectangleArea(
                new int[][] {{3,2,5,5},{1,1,3,3}}));
    }

    @Test
    public void testTime() {
        int[][] rectangles = new int[200][4];
        Random random = new Random();
        for (int i = 0; i < 200; i++) {
            int x1 = random.nextInt(1000000000);
            int y1 = random.nextInt(1000000000);
            int x2 = x1 + random.nextInt(1000000001 - x1);
            int y2 = y1 + random.nextInt(1000000001 - y1);
            rectangles[i] = new int[] {x1, y1, x2, y2};
        }
        long start = System.currentTimeMillis();
        new RectangleArea2().rectangleArea(rectangles);
        System.out.println("Time  = " + (System.currentTimeMillis() - start) + " ms");
    }
}
