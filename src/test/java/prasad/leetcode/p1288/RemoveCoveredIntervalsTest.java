package prasad.leetcode.p1288;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;

public class RemoveCoveredIntervalsTest {

    @Test
    public void test01() {
        Assert.assertEquals(2, new RemoveCoveredIntervals().removeCoveredIntervals(
                new int[][] {{1,4},{3,6},{2,8}}));
    }

    @Test
    public void test02() {
        Assert.assertEquals(1, new RemoveCoveredIntervals().removeCoveredIntervals(
                new int[][] {{1,4},{2,3}}));
    }

    @Test
    public void test03() {
        Assert.assertEquals(1, new RemoveCoveredIntervals().removeCoveredIntervals(
                new int[][] {{4,5},{3,6},{2,7}}));
    }

    @Test
    public void testTime() {
        int[][] intervals = new int[1000][2];
        for (int i = 0; i < 1000; i++) {
            intervals[i][0] = i * 2;
            intervals[i][1] = (i * 2) + 1;
        }
        long start = System.currentTimeMillis();
        Assert.assertEquals(1000, new RemoveCoveredIntervals().removeCoveredIntervals(intervals));
        System.out.println("Time = " + (System.currentTimeMillis() - start) + " ms");
    }
}
