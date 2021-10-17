package prasad.leetcode.p831;

import org.junit.Assert;
import org.junit.Test;

public class MaskingPersonalInformationTest {

    @Test
    public void test01() {
        Assert.assertEquals("l*****e@leetcode.com",
                new MaskingPersonalInformation().maskPII("LeetCode@LeetCode.com"));
    }

    @Test
    public void test02() {
        Assert.assertEquals("a*****b@qq.com",
                new MaskingPersonalInformation().maskPII("AB@qq.com"));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testEmailNameTooShort() {
        new MaskingPersonalInformation().maskPII("A@qq.com");
    }

    @Test
    public void testNoCountryCode() {
        Assert.assertEquals("***-***-7890",
                new MaskingPersonalInformation().maskPII("1(234)567-890"));
    }

    @Test
    public void testThreeDigitsCountryCode() {
        Assert.assertEquals("+***-***-***-5678",
                new MaskingPersonalInformation().maskPII("86-(150)123456 78"));
    }

    @Test
    public void testTwoDigitsCountryCode() {
        Assert.assertEquals("+**-***-***-5678",
                new MaskingPersonalInformation().maskPII("+86-(10)12345678"));
    }

    @Test
    public void testOneDigitCountryCode() {
        Assert.assertEquals("+*-***-***-5678",
                new MaskingPersonalInformation().maskPII("86-(1)12345678"));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testPhoneNumberTooShort() {
        new MaskingPersonalInformation().maskPII("123456789");
    }
}
