package prasad.leetcode.p839;

import org.junit.Assert;
import org.junit.Test;

public class SimilarStringGroupsTest {

    @Test
    public void test01() {
        Assert.assertEquals(2,
                new SimilarStringGroups().numSimilarGroups(new String[] {"tars", "rats", "arts", "star"}));
    }

    @Test
    public void test02() {
        Assert.assertEquals(1,
                new SimilarStringGroups().numSimilarGroups(new String[] {"omv", "ovm"}));
    }

    @Test
    public void test03() {
        Assert.assertEquals(1,
                new SimilarStringGroups().numSimilarGroups(new String[] {"abc", "acb", "bac", "bca", "cab", "cba"}));
    }

    @Test
    public void test04() {
        Assert.assertEquals(1,
                new SimilarStringGroups().numSimilarGroups(new String[] {"abc"}));
    }

    @Test
    public void test05() {
        Assert.assertEquals(3,
                new SimilarStringGroups().numSimilarGroups(new String[] {"abcde", "abdce", "decab", "dceab", "edabc"}));
    }
}
