package prasad.leetcode.p561;

import org.junit.Assert;
import org.junit.Test;

public class ArrayPartition1Test {

    @Test
    public void test01() {
        Assert.assertEquals(4, new ArrayPartition1().arrayPairSum(new int[] {1,4,3,2}));
    }

    @Test
    public void test02() {
        Assert.assertEquals(9, new ArrayPartition1().arrayPairSum(new int[] {6,2,6,5,1,2}));
    }

    @Test
    public void test03() {
        Assert.assertEquals(-2, new ArrayPartition1().arrayPairSum(new int[] {4,-2,6,3,-5,-1}));
    }

    @Test
    public void test04() {
        Assert.assertEquals(3, new ArrayPartition1().arrayPairSum(new int[] {5,3}));
    }
}
