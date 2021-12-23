package prasad.leetcode.p643;

import org.junit.Assert;
import org.junit.Test;

public class MaximumAverageSubarray1Test {

    @Test
    public void test01() {
        double result = new MaximumAverageSubarray1().findMaxAverage(new int[] {1,12,-5,-6,50,3}, 4);
        Assert.assertEquals(12.75, result, 0.00001);
    }

    @Test
    public void test02() {
        double result = new MaximumAverageSubarray1().findMaxAverage(new int[] {5}, 1);
        Assert.assertEquals(5.0, result, 0.00001);
    }

    @Test
    public void test03() {
        double result = new MaximumAverageSubarray1().findMaxAverage(new int[] {34,72,48,53,17,37,28,42}, 5);
        Assert.assertEquals(45.4, result, 0.00001);
    }
}
