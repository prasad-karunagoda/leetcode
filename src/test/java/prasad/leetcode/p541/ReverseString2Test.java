package prasad.leetcode.p541;

import org.junit.Assert;
import org.junit.Test;

public class ReverseString2Test {

    @Test
    public void test01() {
        Assert.assertEquals("bacdfeg", new ReverseString2().reverseStr("abcdefg", 2));
    }

    @Test
    public void test02() {
        Assert.assertEquals("bacd", new ReverseString2().reverseStr("abcd", 2));
    }

    @Test
    public void test03() {
        Assert.assertEquals("cbadefhg", new ReverseString2().reverseStr("abcdefgh", 3));
    }

    @Test
    public void test04() {
        Assert.assertEquals("cbadef", new ReverseString2().reverseStr("abcdef", 3));
    }

    @Test
    public void test05() {
        Assert.assertEquals("cbadefg", new ReverseString2().reverseStr("abcdefg", 3));
    }

    @Test
    public void test06() {
        Assert.assertEquals("abcdefg", new ReverseString2().reverseStr("abcdefg", 1));
    }

    @Test
    public void test07() {
        Assert.assertEquals("ba", new ReverseString2().reverseStr("ab", 3));
    }

    @Test
    public void test08() {
        Assert.assertEquals("edcbafgh", new ReverseString2().reverseStr("abcdefgh", 5));
    }
}
