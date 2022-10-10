package prasad.leetcode.p2428;

import org.junit.Assert;
import org.junit.Test;

public class MaxSumOfHourglassTest {

    @Test
    public void test01() {
        Assert.assertEquals(30, new MaxSumOfHourglass().maxSum(
                new int[][] {{6,2,1,3},{4,2,1,5},{9,2,8,7},{4,1,2,9}}));
    }

    @Test
    public void test02() {
        Assert.assertEquals(35, new MaxSumOfHourglass().maxSum(
                new int[][] {{1,2,3},{4,5,6},{7,8,9}}));
    }

    @Test
    public void test03() {
        Assert.assertEquals(0, new MaxSumOfHourglass().maxSum(
                new int[][] {{0,0,0,0},{0,0,0,0},{0,0,0,0},{0,0,0,0}}));
    }

    @Test
    public void test04() {
        Assert.assertEquals(14, new MaxSumOfHourglass().maxSum(
                new int[][] {
                        {1,1,1,1},
                        {1,2,2,2},
                        {1,1,2,1},
                        {1,2,2,2},
                        {1,1,1,1}}));
    }
}
