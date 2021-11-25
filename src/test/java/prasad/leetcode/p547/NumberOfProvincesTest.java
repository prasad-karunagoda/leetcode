package prasad.leetcode.p547;

import org.junit.Assert;
import org.junit.Test;

public class NumberOfProvincesTest {

    @Test
    public void test01() {
        Assert.assertEquals(2, new NumberOfProvinces().findCircleNum(
                new int[][] {
                        {1,1,0},
                        {1,1,0},
                        {0,0,1}}));
    }

    @Test
    public void test02() {
        Assert.assertEquals(3, new NumberOfProvinces().findCircleNum(
                new int[][] {
                        {1,0,0},
                        {0,1,0},
                        {0,0,1}}));
    }

    @Test
    public void test03() {
        Assert.assertEquals(1, new NumberOfProvinces().findCircleNum(
                new int[][] {
                        {1,1,0},
                        {1,1,1},
                        {0,1,1}}));
    }

    @Test
    public void test04() {
        Assert.assertEquals(2, new NumberOfProvinces().findCircleNum(
                new int[][] {
                        {1,0,1,0,0},
                        {0,1,0,0,1},
                        {1,0,1,1,0},
                        {0,0,1,1,0},
                        {0,1,0,0,1}}));
    }

    @Test
    public void test05() {
        Assert.assertEquals(1, new NumberOfProvinces().findCircleNum(
                new int[][] {{1}}));
    }
}
