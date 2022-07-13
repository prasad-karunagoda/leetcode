package prasad.leetcode.p1679;

import org.junit.Assert;
import org.junit.Test;

public class MaxNumberOfKSumPairsTest {

    @Test
    public void test01() {
        Assert.assertEquals(2, new MaxNumberOfKSumPairs().maxOperations(new int[] {1,2,3,4}, 5));
    }

    @Test
    public void test02() {
        Assert.assertEquals(1, new MaxNumberOfKSumPairs().maxOperations(new int[] {3,1,3,4,3}, 6));
    }

    @Test
    public void test03() {
        Assert.assertEquals(0, new MaxNumberOfKSumPairs().maxOperations(new int[] {5}, 5));
    }

    @Test
    public void test04() {
        Assert.assertEquals(1, new MaxNumberOfKSumPairs().maxOperations(new int[] {4,1}, 5));
    }

    @Test
    public void test05() {
        Assert.assertEquals(2, new MaxNumberOfKSumPairs().maxOperations(new int[] {1,2,2,3,4,4,5,6}, 5));
    }

    @Test
    public void test06() {
        Assert.assertEquals(0, new MaxNumberOfKSumPairs().maxOperations(new int[] {3,5,1,5}, 2));
    }
}
