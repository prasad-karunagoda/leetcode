package prasad.leetcode.p1828;

import org.junit.Assert;
import org.junit.Test;

public class QueriesOnNumberOfPointsTest {

    @Test
    public void test01() {
        int[] counts = new QueriesOnNumberOfPoints().countPoints(
                new int[][] {{1,3},{3,3},{5,3},{2,2}},
                new int[][] {{2,3,1},{4,3,1},{1,1,2}});
        Assert.assertArrayEquals(new int[] {3,2,2}, counts);
    }

    @Test
    public void test02() {
        int[] counts = new QueriesOnNumberOfPoints().countPoints(
                new int[][] {{1,1},{2,2},{3,3},{4,4},{5,5}},
                new int[][] {{1,2,2},{2,2,2},{4,3,2},{4,3,3}});
        Assert.assertArrayEquals(new int[] {2,3,2,4}, counts);
    }

    @Test
    public void test03() {
        int[] counts = new QueriesOnNumberOfPoints().countPoints(
                new int[][] {{1,1}},
                new int[][] {{5,5,2}});
        Assert.assertArrayEquals(new int[] {0}, counts);
    }

    @Test
    public void test04() {
        int[] counts = new QueriesOnNumberOfPoints().countPoints(
                new int[][] {{1,1}},
                new int[][] {{-2,-2,5}});
        Assert.assertArrayEquals(new int[] {1}, counts);
    }
}
