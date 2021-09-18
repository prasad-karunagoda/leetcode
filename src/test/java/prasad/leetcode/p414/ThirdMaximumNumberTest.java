package prasad.leetcode.p414;

import org.junit.Assert;
import org.junit.Test;

public class ThirdMaximumNumberTest {

    @Test
    public void test01() {
        Assert.assertEquals(1, new ThirdMaximumNumber().thirdMax(new int[] {3,2,1}));
    }

    @Test
    public void test02() {
        Assert.assertEquals(2, new ThirdMaximumNumber().thirdMax(new int[] {1,2}));
    }

    @Test
    public void test03() {
        Assert.assertEquals(1, new ThirdMaximumNumber().thirdMax(new int[] {2,2,3,1}));
    }

    @Test
    public void test04() {
        Assert.assertEquals(3, new ThirdMaximumNumber().thirdMax(new int[] {3,3,2}));
    }

    @Test
    public void test05() {
        Assert.assertEquals(5, new ThirdMaximumNumber().thirdMax(new int[] {5}));
    }

    @Test
    public void test06() {
        Assert.assertEquals(4, new ThirdMaximumNumber().thirdMax(new int[] {4,2,5,4,3,7,2,4,2,3,5,2}));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testEmptyInput() {
        new ThirdMaximumNumber().thirdMax(new int[0]);
    }
}
