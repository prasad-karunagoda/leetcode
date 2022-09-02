package prasad.leetcode.p1615;

import org.junit.Assert;
import org.junit.Test;

public class MaximalNetworkRankTest {

    @Test
    public void test01() {
        Assert.assertEquals(4, new MaximalNetworkRank()
                .maximalNetworkRank(4, new int[][] {{0,1},{0,3},{1,2},{1,3}}));
    }

    @Test
    public void test02() {
        Assert.assertEquals(5, new MaximalNetworkRank()
                .maximalNetworkRank(5, new int[][] {{0,1},{0,3},{1,2},{1,3},{2,3},{2,4}}));
    }

    @Test
    public void test03() {
        Assert.assertEquals(5, new MaximalNetworkRank()
                .maximalNetworkRank(8, new int[][] {{0,1},{1,2},{2,3},{2,4},{5,6},{5,7}}));
    }
}
