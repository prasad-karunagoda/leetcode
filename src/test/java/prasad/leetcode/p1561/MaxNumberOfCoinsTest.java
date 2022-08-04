package prasad.leetcode.p1561;

import org.junit.Assert;
import org.junit.Test;

public class MaxNumberOfCoinsTest {

    @Test
    public void test01() {
        Assert.assertEquals(9, new MaxNumberOfCoins().maxCoins(new int[] {2,4,1,2,7,8}));
    }

    @Test
    public void test02() {
        Assert.assertEquals(4, new MaxNumberOfCoins().maxCoins(new int[] {2,4,5}));
    }

    @Test
    public void test03() {
        Assert.assertEquals(18, new MaxNumberOfCoins().maxCoins(new int[] {9,8,7,6,5,1,2,3,4}));
    }
}
