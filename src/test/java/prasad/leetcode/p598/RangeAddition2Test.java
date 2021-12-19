package prasad.leetcode.p598;

import org.junit.Assert;
import org.junit.Test;

public class RangeAddition2Test {

    @Test
    public void test01() {
        int[][] ops = new int[][] { {2,2}, {3,3} };
        Assert.assertEquals(4, new RangeAddition2().maxCount(3, 3, ops));
    }

    @Test
    public void test02() {
        int[][] ops = new int[][] {
                {2,2}, {3,3}, {3,3}, {3,3}, {2,2}, {3,3},
                {3,3}, {3,3}, {2,2}, {3,3}, {3,3}, {3,3} };
        Assert.assertEquals(4, new RangeAddition2().maxCount(3, 3, ops));
    }

    @Test
    public void test03() {
        int[][] ops = new int[0][];
        Assert.assertEquals(9, new RangeAddition2().maxCount(3, 3, ops));
    }

    @Test
    public void test04() {
        int[][] ops = new int[][] { {2,4}, {3,1} };
        Assert.assertEquals(2, new RangeAddition2().maxCount(4, 5, ops));
    }
}
