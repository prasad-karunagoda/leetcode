package prasad.leetcode.p1710;

import org.junit.Assert;
import org.junit.Test;

public class MaximumUnitsOnTruckTest {

    @Test
    public void test01() {
        Assert.assertEquals(8, new MaximumUnitsOnTruck().maximumUnits(
                new int[][] {{1,3},{2,2},{3,1}}, 4));
    }

    @Test
    public void test02() {
        Assert.assertEquals(91, new MaximumUnitsOnTruck().maximumUnits(
                new int[][] {{5,10},{2,5},{4,7},{3,9}}, 10));
    }

    @Test
    public void test03() {
        Assert.assertEquals(20, new MaximumUnitsOnTruck().maximumUnits(
                new int[][] {{2,3},{4,5}}, 4));
    }

    @Test
    public void test04() {
        Assert.assertEquals(5, new MaximumUnitsOnTruck().maximumUnits(
                new int[][] {{4,5}}, 1));
    }
}
