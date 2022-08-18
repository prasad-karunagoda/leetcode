package prasad.leetcode.p1865;

import org.junit.Assert;
import org.junit.Test;

import java.util.stream.IntStream;

public class FindingPairsWithCertainSumTest {

    @Test
    public void test01() {
        FindingPairsWithCertainSum findingPairs = new FindingPairsWithCertainSum(
                new int[] {1, 1, 2, 2, 2, 3}, new int[] {1, 4, 5, 2, 5, 4});
        Assert.assertEquals(8, findingPairs.count(7));
        findingPairs.add(3, 2);
        Assert.assertEquals(2, findingPairs.count(8));
        Assert.assertEquals(1, findingPairs.count(4));
        findingPairs.add(0, 1);
        findingPairs.add(1, 1);
        Assert.assertEquals(11, findingPairs.count(7));
    }

    @Test
    public void test02() {
        FindingPairsWithCertainSum findingPairs = new FindingPairsWithCertainSum(
                new int[] {1}, new int[] {5});
        Assert.assertEquals(0, findingPairs.count(7));
        findingPairs.add(0, 1);
        Assert.assertEquals(1, findingPairs.count(7));
        findingPairs.add(0, 1);
        Assert.assertEquals(0, findingPairs.count(7));
    }

    @Test
    public void testTime() {
        int[] nums1 = IntStream.range(1, 1001).toArray();
        int[] nums2 = IntStream.range(1, 100001).toArray();
        FindingPairsWithCertainSum findingPairs = new FindingPairsWithCertainSum(nums1, nums2);
        long start = System.currentTimeMillis();
        findingPairs.count(50000);
        System.out.println("Time = " + (System.currentTimeMillis() - start) + " ms");
    }
}
