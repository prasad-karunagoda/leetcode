package prasad.leetcode.p1945;

import org.junit.Assert;
import org.junit.Test;

import java.util.Collections;

public class SumOfDigitsOfStringTest {

    @Test
    public void test01() {
        Assert.assertEquals(8, new SumOfDigitsOfString().getLucky("zbax", 2));
    }

    @Test
    public void test02() {
        Assert.assertEquals(36, new SumOfDigitsOfString().getLucky("iiii", 1));
    }

    @Test
    public void test03() {
        Assert.assertEquals(6, new SumOfDigitsOfString().getLucky("leetcode", 2));
    }

    @Test
    public void test04() {
        Assert.assertEquals(2, new SumOfDigitsOfString().getLucky("b", 1));
    }

    @Test
    public void test05() {
        String s = String.join("", Collections.nCopies(100, "z"));
        Assert.assertEquals(800, new SumOfDigitsOfString().getLucky(s, 1));
    }
}
