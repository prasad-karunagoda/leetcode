package prasad.leetcode.p1266;

import org.junit.Assert;
import org.junit.Test;

public class MinTimeVisitingAllPointsTest {

    @Test
    public void test01() {
        Assert.assertEquals(7, new MinTimeVisitingAllPoints().minTimeToVisitAllPoints(
                new int[][] {{1,1},{3,4},{-1,0}}));
    }

    @Test
    public void test02() {
        Assert.assertEquals(5, new MinTimeVisitingAllPoints().minTimeToVisitAllPoints(
                new int[][] {{3,2},{-2,2}}));
    }

    @Test
    public void test03() {
        Assert.assertEquals(0, new MinTimeVisitingAllPoints().minTimeToVisitAllPoints(
                new int[][] {{3,2}}));
    }
}
