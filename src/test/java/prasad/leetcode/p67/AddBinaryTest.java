package prasad.leetcode.p67;

import org.junit.Assert;
import org.junit.Test;

public class AddBinaryTest {

    @Test
    public void test01() {
        Assert.assertEquals("0", new AddBinary().addBinary("0", "0"));
    }

    @Test
    public void test02() {
        Assert.assertEquals("1", new AddBinary().addBinary("0", "1"));
    }

    @Test
    public void test03() {
        Assert.assertEquals("1", new AddBinary().addBinary("1", "0"));
    }

    @Test
    public void test04() {
        Assert.assertEquals("10", new AddBinary().addBinary("1", "1"));
    }

    @Test
    public void test05() {
        Assert.assertEquals("100", new AddBinary().addBinary("11", "1"));
    }

    @Test
    public void test06() {
        Assert.assertEquals("10101", new AddBinary().addBinary("1010", "1011"));
    }

    @Test
    public void test07() {
        Assert.assertEquals("1010", new AddBinary().addBinary("111", "11"));
    }

    @Test
    public void test08() {
        Assert.assertEquals(
                "1111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111110",
                new AddBinary().addBinary(
                        "111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111",
                        "111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111"));
    }
}
