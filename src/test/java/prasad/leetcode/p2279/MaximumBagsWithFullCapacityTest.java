package prasad.leetcode.p2279;

import org.junit.Assert;
import org.junit.Test;

public class MaximumBagsWithFullCapacityTest {

    @Test
    public void test01() {
        Assert.assertEquals(3, new MaximumBagsWithFullCapacity().maximumBags(
                new int[] {2,3,4,5}, new int[] {1,2,4,4}, 2));
    }

    @Test
    public void test02() {
        Assert.assertEquals(3, new MaximumBagsWithFullCapacity().maximumBags(
                new int[] {10,2,2}, new int[] {2,2,0}, 100));
    }

    @Test
    public void test03() {
        Assert.assertEquals(0, new MaximumBagsWithFullCapacity().maximumBags(
                new int[] {10,20,30}, new int[] {5,10,15}, 3));
    }
}
