package prasad.leetcode.p1281;

import org.junit.Assert;
import org.junit.Test;

public class SubtractProductAndSumOfDigitsTest {

    @Test
    public void test01() {
        Assert.assertEquals(15, new SubtractProductAndSumOfDigits().subtractProductAndSum(234));
    }

    @Test
    public void test02() {
        Assert.assertEquals(21, new SubtractProductAndSumOfDigits().subtractProductAndSum(4421));
    }

    @Test
    public void test03() {
        Assert.assertEquals(-2, new SubtractProductAndSumOfDigits().subtractProductAndSum(111));
    }
}
