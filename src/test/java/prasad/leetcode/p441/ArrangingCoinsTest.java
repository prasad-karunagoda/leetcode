package prasad.leetcode.p441;

import org.junit.Assert;
import org.junit.Test;

public class ArrangingCoinsTest {

    @Test
    public void test1() {
        Assert.assertEquals(1, new ArrangingCoins().arrangeCoins(1));
    }

    @Test
    public void test2() {
        Assert.assertEquals(1, new ArrangingCoins().arrangeCoins(2));
    }

    @Test
    public void test3() {
        Assert.assertEquals(2, new ArrangingCoins().arrangeCoins(3));
    }

    @Test
    public void test4() {
        Assert.assertEquals(2, new ArrangingCoins().arrangeCoins(4));
    }

    @Test
    public void test5() {
        Assert.assertEquals(2, new ArrangingCoins().arrangeCoins(5));
    }

    @Test
    public void test6() {
        Assert.assertEquals(3, new ArrangingCoins().arrangeCoins(6));
    }

    @Test
    public void test7() {
        Assert.assertEquals(3, new ArrangingCoins().arrangeCoins(7));
    }

    @Test
    public void test8() {
        Assert.assertEquals(3, new ArrangingCoins().arrangeCoins(8));
    }

    @Test
    public void test9() {
        Assert.assertEquals(3, new ArrangingCoins().arrangeCoins(9));
    }

    @Test
    public void test10() {
        Assert.assertEquals(4, new ArrangingCoins().arrangeCoins(10));
    }

    @Test
    public void test30() {
        Assert.assertEquals(7, new ArrangingCoins().arrangeCoins(30));
    }

    @Test
    public void test2147483647() {
        Assert.assertEquals(65535, new ArrangingCoins().arrangeCoins(2147483647));
    }
}
