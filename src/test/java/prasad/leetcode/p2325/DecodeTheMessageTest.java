package prasad.leetcode.p2325;

import org.junit.Assert;
import org.junit.Test;

public class DecodeTheMessageTest {

    @Test
    public void test01() {
        Assert.assertEquals("this is a secret",
                new DecodeTheMessage().decodeMessage("the quick brown fox jumps over the lazy dog", "vkbs bs t suepuv"));
    }

    @Test
    public void test02() {
        Assert.assertEquals("the five boxing wizards jump quickly",
                new DecodeTheMessage().decodeMessage("eljuxhpwnyrdgtqkviszcfmabo", "zwx hnfx lqantp mnoeius ycgk vcnjrdb"));
    }

    @Test
    public void test03() {
        Assert.assertEquals(" ",
                new DecodeTheMessage().decodeMessage("eljuxhpwnyrdgtqkviszcfmabo", " "));
    }

    @Test
    public void test04() {
        Assert.assertEquals("b",
                new DecodeTheMessage().decodeMessage("eljuxhpwnyrdgtqkviszcfmabo", "l"));
    }
}
