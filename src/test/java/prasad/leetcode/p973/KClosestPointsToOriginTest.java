package prasad.leetcode.p973;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;

public class KClosestPointsToOriginTest {

    @Test
    public void test01() {
        int[][] points = new int[][] {{1,3},{-2,2}};
        int[][] closest = new KClosestPointsToOrigin().kClosest(points, 1);
        Assert.assertEquals(1, closest.length);
        Assert.assertArrayEquals(new int[] {-2,2}, closest[0]);
    }

    @Test
    public void test02() {
        int[][] points = new int[][] {{3,3},{5,-1},{-2,4}};
        int[][] closest = new KClosestPointsToOrigin().kClosest(points, 2);
        Assert.assertEquals(2, closest.length);
        Assert.assertTrue(
                (Arrays.equals(new int[] {3,3}, closest[0]) && Arrays.equals(new int[] {-2,4}, closest[1])) ||
                (Arrays.equals(new int[] {-2,4}, closest[0]) && Arrays.equals(new int[] {3,3}, closest[1])));
    }

    @Test
    public void test03() {
        int[][] points = new int[][] {{1,3}};
        int[][] closest = new KClosestPointsToOrigin().kClosest(points, 1);
        Assert.assertEquals(1, closest.length);
        Assert.assertArrayEquals(new int[] {1,3}, closest[0]);
    }
}
