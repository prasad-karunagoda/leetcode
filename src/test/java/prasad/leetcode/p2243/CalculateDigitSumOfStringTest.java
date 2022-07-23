package prasad.leetcode.p2243;

import org.junit.Assert;
import org.junit.Test;

public class CalculateDigitSumOfStringTest {

    @Test
    public void test01() {
        Assert.assertEquals("135", new CalculateDigitSumOfString().digitSum("11111222223", 3));
    }

    @Test
    public void test02() {
        Assert.assertEquals("000", new CalculateDigitSumOfString().digitSum("00000000", 3));
    }

    @Test
    public void test03() {
        Assert.assertEquals("12345", new CalculateDigitSumOfString().digitSum("12345", 5));
    }

    @Test
    public void test04() {
        Assert.assertEquals("36", new CalculateDigitSumOfString().digitSum("111222", 3));
    }
}
