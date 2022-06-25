package prasad.leetcode.p1402;

import org.junit.Assert;
import org.junit.Test;

public class ReducingDishesTest {

    @Test
    public void test01() {
        Assert.assertEquals(14, new ReducingDishes().maxSatisfaction(new int[] {-1,-8,0,5,-9}));
    }

    @Test
    public void test02() {
        Assert.assertEquals(20, new ReducingDishes().maxSatisfaction(new int[] {4,3,2}));
    }

    @Test
    public void test03() {
        Assert.assertEquals(0, new ReducingDishes().maxSatisfaction(new int[] {-1,-4,-5}));
    }

    @Test
    public void test04() {
        Assert.assertEquals(14, new ReducingDishes().maxSatisfaction(new int[] {-9,-4,-1,0,5}));
    }

    @Test
    public void test05() {
        Assert.assertEquals(0, new ReducingDishes().maxSatisfaction(new int[] {-9}));
    }

    @Test
    public void test06() {
        Assert.assertEquals(5, new ReducingDishes().maxSatisfaction(new int[] {5}));
    }
}
