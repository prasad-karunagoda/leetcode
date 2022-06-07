package prasad.leetcode.p1833;

import org.junit.Assert;
import org.junit.Test;

public class MaximumIceCreamBarsTest {

    @Test
    public void test01() {
        Assert.assertEquals(4, new MaximumIceCreamBars().maxIceCream(new int[] {1,3,2,4,1}, 7));
    }

    @Test
    public void test02() {
        Assert.assertEquals(0, new MaximumIceCreamBars().maxIceCream(new int[] {10,6,8,7,7,8}, 5));
    }

    @Test
    public void test03() {
        Assert.assertEquals(6, new MaximumIceCreamBars().maxIceCream(new int[] {1,6,3,1,2,5}, 20));
    }

    @Test
    public void test04() {
        Assert.assertEquals(1, new MaximumIceCreamBars().maxIceCream(new int[] {5}, 8));
    }

    @Test
    public void test05() {
        Assert.assertEquals(0, new MaximumIceCreamBars().maxIceCream(new int[] {5}, 3));
    }

    @Test
    public void test06() {
        Assert.assertEquals(1, new MaximumIceCreamBars().maxIceCream(new int[] {5}, 5));
    }
}
