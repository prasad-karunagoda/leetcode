package prasad.leetcode.p1464;

import org.junit.Assert;
import org.junit.Test;

public class MaxProductOfTwoElementsInArrayTest {

    @Test
    public void test01() {
        Assert.assertEquals(12, new MaxProductOfTwoElementsInArray().maxProduct(new int[] {3,4,5,2}));
    }

    @Test
    public void test02() {
        Assert.assertEquals(16, new MaxProductOfTwoElementsInArray().maxProduct(new int[] {1,5,4,5}));
    }

    @Test
    public void test03() {
        Assert.assertEquals(12, new MaxProductOfTwoElementsInArray().maxProduct(new int[] {3,7}));
    }

    @Test
    public void test04() {
        Assert.assertEquals(0, new MaxProductOfTwoElementsInArray().maxProduct(new int[] {1,1}));
    }
}
