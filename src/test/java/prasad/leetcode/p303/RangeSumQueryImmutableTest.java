package prasad.leetcode.p303;

import org.junit.Assert;
import org.junit.Test;

public class RangeSumQueryImmutableTest {

    @Test
    public void test01() {
        RangeSumQueryImmutable rangeSumQuery = new RangeSumQueryImmutable(new int[] {-2, 0, 3, -5, 2, -1});
        Assert.assertEquals(1, rangeSumQuery.sumRange(0, 2));
        Assert.assertEquals(-1, rangeSumQuery.sumRange(2, 5));
        Assert.assertEquals(-3, rangeSumQuery.sumRange(0, 5));
        Assert.assertEquals(2, rangeSumQuery.sumRange(4, 4));
    }

    @Test
    public void test02() {
        RangeSumQueryImmutable rangeSumQuery = new RangeSumQueryImmutable(new int[] {5});
        Assert.assertEquals(5, rangeSumQuery.sumRange(0, 0));
    }
}
