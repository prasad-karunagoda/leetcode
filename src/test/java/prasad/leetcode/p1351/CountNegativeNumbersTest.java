package prasad.leetcode.p1351;

import org.junit.Assert;
import org.junit.Test;

public class CountNegativeNumbersTest {

    @Test
    public void test01() {
        Assert.assertEquals(8, new CountNegativeNumbers().countNegatives(
                new int[][] {{4,3,2,-1},{3,2,1,-1},{1,1,-1,-2},{-1,-1,-2,-3}}));
    }

    @Test
    public void test02() {
        Assert.assertEquals(0, new CountNegativeNumbers().countNegatives(
                new int[][] {{3,2},{1,0}}));
    }

    @Test
    public void test03() {
        Assert.assertEquals(12, new CountNegativeNumbers().countNegatives(
                new int[][] {{-1,-1,-1,-1},{-1,-1,-1,-1},{-1,-1,-1,-1}}));
    }
}
