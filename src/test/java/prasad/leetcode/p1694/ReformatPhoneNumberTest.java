package prasad.leetcode.p1694;

import org.junit.Assert;
import org.junit.Test;

public class ReformatPhoneNumberTest {

    @Test
    public void test01() {
        Assert.assertEquals("123-456", new ReformatPhoneNumber().reformatNumber("1-23-45 6"));
    }

    @Test
    public void test02() {
        Assert.assertEquals("123-45-67", new ReformatPhoneNumber().reformatNumber("123 4-567"));
    }

    @Test
    public void test03() {
        Assert.assertEquals("123-456-78", new ReformatPhoneNumber().reformatNumber("123 4-5678"));
    }

    @Test
    public void test04() {
        Assert.assertEquals("45", new ReformatPhoneNumber().reformatNumber("- 4-  5 - "));
    }

    @Test
    public void test05() {
        Assert.assertEquals("567", new ReformatPhoneNumber().reformatNumber("5 6-7"));
    }
}
