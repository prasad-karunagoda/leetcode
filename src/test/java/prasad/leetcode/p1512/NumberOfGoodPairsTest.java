package prasad.leetcode.p1512;

import org.junit.Assert;
import org.junit.Test;

public class NumberOfGoodPairsTest {

    @Test
    public void test01() {
        Assert.assertEquals(4, new NumberOfGoodPairs().numIdenticalPairs(new int[] {1,2,3,1,1,3}));
    }

    @Test
    public void test02() {
        Assert.assertEquals(6, new NumberOfGoodPairs().numIdenticalPairs(new int[] {1,1,1,1}));
    }

    @Test
    public void test03() {
        Assert.assertEquals(0, new NumberOfGoodPairs().numIdenticalPairs(new int[] {1,2,3}));
    }

    @Test
    public void test04() {
        Assert.assertEquals(0, new NumberOfGoodPairs().numIdenticalPairs(new int[] {5}));
    }
}
