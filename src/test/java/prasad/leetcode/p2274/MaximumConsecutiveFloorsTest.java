package prasad.leetcode.p2274;

import org.junit.Assert;
import org.junit.Test;

public class MaximumConsecutiveFloorsTest {

    @Test
    public void test01() {
        Assert.assertEquals(3, new MaximumConsecutiveFloors().maxConsecutive(2, 9,
                new int[] {4,6}));
    }

    @Test
    public void test02() {
        Assert.assertEquals(0, new MaximumConsecutiveFloors().maxConsecutive(6, 8,
                new int[] {7,6,8}));
    }

    @Test
    public void test03() {
        Assert.assertEquals(0, new MaximumConsecutiveFloors().maxConsecutive(5, 5,
                new int[] {5}));
    }

    @Test
    public void test04() {
        Assert.assertEquals(1999, new MaximumConsecutiveFloors().maxConsecutive(5000, 10000,
                new int[] {8500,9000,6500,9500,6000}));
    }
}
