package prasad.leetcode.p2285;

import org.junit.Assert;
import org.junit.Test;

public class MaximumTotalImportanceOfRoadsTest {

    @Test
    public void test01() {
        Assert.assertEquals(43, new MaximumTotalImportanceOfRoads().maximumImportance(5,
                new int[][] {{0,1},{1,2},{2,3},{0,2},{1,3},{2,4}}));
    }

    @Test
    public void test02() {
        Assert.assertEquals(20, new MaximumTotalImportanceOfRoads().maximumImportance(5,
                new int[][] {{0,3},{2,4},{1,3}}));
    }

    @Test
    public void test03() {
        Assert.assertEquals(3, new MaximumTotalImportanceOfRoads().maximumImportance(2,
                new int[][] {{0,1}}));
    }
}
