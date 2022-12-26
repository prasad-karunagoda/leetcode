package prasad.leetcode.p1287;

import org.junit.Assert;
import org.junit.Test;

public class ElementAppearingMoreThan25PercentTest {

    @Test
    public void test01() {
        Assert.assertEquals(6, new ElementAppearingMoreThan25Percent().findSpecialInteger(
                new int[] {1,2,2,6,6,6,6,7,10}));
    }

    @Test
    public void test02() {
        Assert.assertEquals(1, new ElementAppearingMoreThan25Percent().findSpecialInteger(
                new int[] {1,1}));
    }

    @Test(expected = IllegalArgumentException.class)
    public void test03() {
        new ElementAppearingMoreThan25Percent().findSpecialInteger(
                new int[] {1,2,3,3,4,5,6,7});
    }

    @Test
    public void test04() {
        Assert.assertEquals(3, new ElementAppearingMoreThan25Percent().findSpecialInteger(
                new int[] {1,2,3,3,3,4,5,6}));
    }
}
