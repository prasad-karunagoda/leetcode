package prasad.leetcode.p258;

import org.junit.Assert;
import org.junit.Test;

public class AddDigitsTest {

    @Test
    public void test38() {
        Assert.assertEquals(2, new AddDigits().addDigits(38));
    }

    @Test
    public void test0() {
        Assert.assertEquals(0, new AddDigits().addDigits(0));
    }

    @Test
    public void test5() {
        Assert.assertEquals(5, new AddDigits().addDigits(5));
    }

    @Test
    public void test27483653() {
        Assert.assertEquals(2, new AddDigits().addDigits(27483653));
    }

    @Test
    public void test8362931() {
        Assert.assertEquals(5, new AddDigits().addDigits(8362931));
    }
}
