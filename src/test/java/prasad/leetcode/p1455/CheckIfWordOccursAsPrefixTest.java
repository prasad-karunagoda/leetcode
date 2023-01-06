package prasad.leetcode.p1455;

import org.junit.Assert;
import org.junit.Test;

public class CheckIfWordOccursAsPrefixTest {

    @Test
    public void test01() {
        Assert.assertEquals(4, new CheckIfWordOccursAsPrefix().isPrefixOfWord(
                "i love eating burger", "burg"));
    }

    @Test
    public void test02() {
        Assert.assertEquals(2, new CheckIfWordOccursAsPrefix().isPrefixOfWord(
                "this problem is an easy problem", "pro"));
    }

    @Test
    public void test03() {
        Assert.assertEquals(-1, new CheckIfWordOccursAsPrefix().isPrefixOfWord(
                "i am tired", "you"));
    }

    @Test
    public void test04() {
        Assert.assertEquals(1, new CheckIfWordOccursAsPrefix().isPrefixOfWord(
                "b", "b"));
    }

    @Test
    public void test05() {
        Assert.assertEquals(-1, new CheckIfWordOccursAsPrefix().isPrefixOfWord(
                "b", "c"));
    }
}
