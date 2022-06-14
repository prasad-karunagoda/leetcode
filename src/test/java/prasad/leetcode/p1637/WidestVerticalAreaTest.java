package prasad.leetcode.p1637;

import org.junit.Assert;
import org.junit.Test;

public class WidestVerticalAreaTest {

    @Test
    public void test01() {
        Assert.assertEquals(1, new WidestVerticalArea().maxWidthOfVerticalArea(
                new int[][] {{8,7},{9,9},{7,4},{9,7}}));
    }

    @Test
    public void test02() {
        Assert.assertEquals(3, new WidestVerticalArea().maxWidthOfVerticalArea(
                new int[][] {{3,1},{9,0},{1,0},{1,4},{5,3},{8,8}}));
    }

    @Test
    public void test03() {
        Assert.assertEquals(0, new WidestVerticalArea().maxWidthOfVerticalArea(
                new int[][] {{3,1},{3,5}}));
    }
}
