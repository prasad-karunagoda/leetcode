package prasad.leetcode.p443;

import org.junit.Assert;
import org.junit.Test;

public class StringCompressionTest {

    @Test
    public void test01() {
        char[] chars = new char[] {'a','a','b','b','c','c','c'};
        int length = new StringCompression().compress(chars);
        Assert.assertEquals(6, length);
        Assert.assertEquals('a', chars[0]);
        Assert.assertEquals('2', chars[1]);
        Assert.assertEquals('b', chars[2]);
        Assert.assertEquals('2', chars[3]);
        Assert.assertEquals('c', chars[4]);
        Assert.assertEquals('3', chars[5]);
    }

    @Test
    public void test02() {
        char[] chars = new char[] {'a'};
        int length = new StringCompression().compress(chars);
        Assert.assertEquals(1, length);
        Assert.assertEquals('a', chars[0]);
    }

    @Test
    public void test03() {
        char[] chars = new char[] {'a','b','b','b','b','b','b','b','b','b','b','b','b'};
        int length = new StringCompression().compress(chars);
        Assert.assertEquals(4, length);
        Assert.assertEquals('a', chars[0]);
        Assert.assertEquals('b', chars[1]);
        Assert.assertEquals('1', chars[2]);
        Assert.assertEquals('2', chars[3]);
    }

    @Test
    public void test04() {
        char[] chars = new char[] {'a','a','a','b','b','a','a'};
        int length = new StringCompression().compress(chars);
        Assert.assertEquals(6, length);
        Assert.assertEquals('a', chars[0]);
        Assert.assertEquals('3', chars[1]);
        Assert.assertEquals('b', chars[2]);
        Assert.assertEquals('2', chars[3]);
        Assert.assertEquals('a', chars[4]);
        Assert.assertEquals('2', chars[5]);
    }

    @Test
    public void test05() {
        char[] chars = new char[] {'a','a','3','3','c','c','c'};
        int length = new StringCompression().compress(chars);
        Assert.assertEquals(6, length);
        Assert.assertEquals('a', chars[0]);
        Assert.assertEquals('2', chars[1]);
        Assert.assertEquals('3', chars[2]);
        Assert.assertEquals('2', chars[3]);
        Assert.assertEquals('c', chars[4]);
        Assert.assertEquals('3', chars[5]);
    }
}
