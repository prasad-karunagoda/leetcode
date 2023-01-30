package prasad.leetcode.p2206;

import org.junit.Assert;
import org.junit.Test;

public class DivideArrayIntoEqualPairsTest {

    @Test
    public void test01() {
        Assert.assertTrue(new DivideArrayIntoEqualPairs().divideArray(new int[] {3,2,3,2,2,2}));
    }

    @Test
    public void test02() {
        Assert.assertFalse(new DivideArrayIntoEqualPairs().divideArray(new int[] {1,2,3,4}));
    }

    @Test
    public void test03() {
        Assert.assertFalse(new DivideArrayIntoEqualPairs().divideArray(new int[] {3,2,3,2,2}));
    }

    @Test
    public void test04() {
        Assert.assertFalse(new DivideArrayIntoEqualPairs().divideArray(new int[] {5}));
    }
}
