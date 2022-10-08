package prasad.leetcode.p2424;

import org.junit.Assert;
import org.junit.Test;

public class LongestUploadedPrefixTest {

    @Test
    public void test01() {
        LongestUploadedPrefix lup = new LongestUploadedPrefix(4);
        lup.upload(3);
        Assert.assertEquals(0, lup.longest());
        lup.upload(1);
        Assert.assertEquals(1, lup.longest());
        lup.upload(2);
        Assert.assertEquals(3, lup.longest());
    }

    @Test
    public void test02() {
        LongestUploadedPrefix lup = new LongestUploadedPrefix(1);
        Assert.assertEquals(0, lup.longest());
        Assert.assertEquals(0, lup.longest());
        lup.upload(1);
        Assert.assertEquals(1, lup.longest());
    }
}
