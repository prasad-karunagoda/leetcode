package prasad.leetcode.p1748;

import org.junit.Assert;
import org.junit.Test;

public class SumOfUniqueElementsTest {

    @Test
    public void test01() {
        Assert.assertEquals(4, new SumOfUniqueElements().sumOfUnique(new int[] {1,2,3,2}));
    }

    @Test
    public void test02() {
        Assert.assertEquals(0, new SumOfUniqueElements().sumOfUnique(new int[] {1,1,1,1,1}));
    }

    @Test
    public void test03() {
        Assert.assertEquals(15, new SumOfUniqueElements().sumOfUnique(new int[] {1,2,3,4,5}));
    }

    @Test
    public void test04() {
        Assert.assertEquals(5, new SumOfUniqueElements().sumOfUnique(new int[] {5}));
    }
}
