package prasad.leetcode.p1877;

import org.junit.Assert;
import org.junit.Test;

public class MinimizeMaximumPairSumTest {

    @Test
    public void test01() {
        Assert.assertEquals(7, new MinimizeMaximumPairSum().minPairSum(new int[] {3,5,2,3}));
    }

    @Test
    public void test02() {
        Assert.assertEquals(8, new MinimizeMaximumPairSum().minPairSum(new int[] {3,5,4,2,4,6}));
    }

    @Test
    public void test03() {
        Assert.assertEquals(8, new MinimizeMaximumPairSum().minPairSum(new int[] {3,5}));
    }

    @Test
    public void test04() {
        Assert.assertEquals(9, new MinimizeMaximumPairSum().minPairSum(new int[] {3,6,1,3,4,7}));
    }
}
