package prasad.leetcode.p482;

import org.junit.Assert;
import org.junit.Test;

public class LicenseKeyFormattingTest {

    @Test
    public void test01() {
        Assert.assertEquals("5F3Z-2E9W",
                new LicenseKeyFormatting().licenseKeyFormatting("5F3Z-2e-9-w", 4));
    }

    @Test
    public void test02() {
        Assert.assertEquals("2-5G-3J",
                new LicenseKeyFormatting().licenseKeyFormatting("2-5g-3-J", 2));
    }

    @Test
    public void test03() {
        Assert.assertEquals("25G",
                new LicenseKeyFormatting().licenseKeyFormatting("2-5g", 4));
    }

    @Test
    public void test04() {
        Assert.assertEquals("25GH",
                new LicenseKeyFormatting().licenseKeyFormatting("2-5g-h", 4));
    }
}
