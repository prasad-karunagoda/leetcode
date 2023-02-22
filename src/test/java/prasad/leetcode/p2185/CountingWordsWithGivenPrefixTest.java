package prasad.leetcode.p2185;

import org.junit.Assert;
import org.junit.Test;

public class CountingWordsWithGivenPrefixTest {

    @Test
    public void test01() {
        Assert.assertEquals(2, new CountingWordsWithGivenPrefix().prefixCount(
                new String[] {"pay","attention","practice","attend"}, "at"));
    }

    @Test
    public void test02() {
        Assert.assertEquals(0, new CountingWordsWithGivenPrefix().prefixCount(
                new String[] {"leetcode","win","loops","success"}, "code"));
    }

    @Test
    public void test03() {
        Assert.assertEquals(3, new CountingWordsWithGivenPrefix().prefixCount(
                new String[] {"k","ka","aka","kk"}, "k"));
    }
}
