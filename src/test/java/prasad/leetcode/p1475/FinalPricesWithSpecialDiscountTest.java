package prasad.leetcode.p1475;

import org.junit.Assert;
import org.junit.Test;

public class FinalPricesWithSpecialDiscountTest {

    @Test
    public void test01() {
        Assert.assertArrayEquals(new int[] {4,2,4,2,3},
                new FinalPricesWithSpecialDiscount().finalPrices(new int[] {8,4,6,2,3}));
    }

    @Test
    public void test02() {
        Assert.assertArrayEquals(new int[] {1,2,3,4,5},
                new FinalPricesWithSpecialDiscount().finalPrices(new int[] {1,2,3,4,5}));
    }

    @Test
    public void test03() {
        Assert.assertArrayEquals(new int[] {9,0,1,6},
                new FinalPricesWithSpecialDiscount().finalPrices(new int[] {10,1,1,6}));
    }

    @Test
    public void test04() {
        Assert.assertArrayEquals(new int[] {5},
                new FinalPricesWithSpecialDiscount().finalPrices(new int[] {5}));
    }
}
