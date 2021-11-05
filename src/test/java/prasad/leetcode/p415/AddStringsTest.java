package prasad.leetcode.p415;

import org.junit.Assert;
import org.junit.Test;

public class AddStringsTest {

    @Test
    public void test01() {
        Assert.assertEquals("134", new AddStrings().addStrings("11", "123"));
    }

    @Test
    public void test02() {
        Assert.assertEquals("533", new AddStrings().addStrings("456", "77"));
    }

    @Test
    public void test03() {
        Assert.assertEquals("0", new AddStrings().addStrings("0", "0"));
    }

    @Test
    public void test04() {
        Assert.assertEquals("5", new AddStrings().addStrings("2", "3"));
    }

    @Test
    public void test05() {
        Assert.assertEquals("35295", new AddStrings().addStrings("34783", "512"));
    }
}
