package prasad.leetcode.p2023;

import org.junit.Assert;
import org.junit.Test;

public class NumberOfPairsWithConcatenationEqualToTargetTest {

    @Test
    public void test01() {
        String[] nums = new String[] {"777","7","77","77"};
        Assert.assertEquals(4, new NumberOfPairsWithConcatenationEqualToTarget().numOfPairs(nums, "7777"));
    }

    @Test
    public void test02() {
        String[] nums = new String[] {"123","4","12","34"};
        Assert.assertEquals(2, new NumberOfPairsWithConcatenationEqualToTarget().numOfPairs(nums, "1234"));
    }

    @Test
    public void test03() {
        String[] nums = new String[] {"1","1","1"};
        Assert.assertEquals(6, new NumberOfPairsWithConcatenationEqualToTarget().numOfPairs(nums, "11"));
    }

    @Test
    public void test04() {
        String[] nums = new String[] {"12","23","34","45"};
        Assert.assertEquals(0, new NumberOfPairsWithConcatenationEqualToTarget().numOfPairs(nums, "7777"));
    }
}
