package prasad.leetcode.p1556;

import org.junit.Assert;
import org.junit.Test;

public class ThousandSeparatorTest {

    @Test
    public void test987() {
        Assert.assertEquals("987", new ThousandSeparator().thousandSeparator(987));
    }

    @Test
    public void test1234() {
        Assert.assertEquals("1.234", new ThousandSeparator().thousandSeparator(1234));
    }

    @Test
    public void test12345678() {
        Assert.assertEquals("12.345.678", new ThousandSeparator().thousandSeparator(12345678));
    }

    @Test
    public void test3782465() {
        Assert.assertEquals("3.782.465", new ThousandSeparator().thousandSeparator(3782465));
    }

    @Test
    public void test0() {
        Assert.assertEquals("0", new ThousandSeparator().thousandSeparator(0));
    }
}
