package prasad.leetcode.p2294;

import org.junit.Assert;
import org.junit.Test;

public class PartitionArrayWithMaximumDifferenceTest {

    @Test
    public void test01() {
        Assert.assertEquals(2, new PartitionArrayWithMaximumDifference().partitionArray(
                new int[] {3,6,1,2,5}, 2));
    }

    @Test
    public void test02() {
        Assert.assertEquals(2, new PartitionArrayWithMaximumDifference().partitionArray(
                new int[] {1,2,3}, 1));
    }

    @Test
    public void test03() {
        Assert.assertEquals(3, new PartitionArrayWithMaximumDifference().partitionArray(
                new int[] {2,2,4,5}, 0));
    }

    @Test
    public void test04() {
        Assert.assertEquals(1, new PartitionArrayWithMaximumDifference().partitionArray(
                new int[] {5}, 1));
    }
}
