package prasad.leetcode.p1684;

import org.junit.Assert;
import org.junit.Test;

public class CountConsistentStringsTest {

    @Test
    public void test01() {
        Assert.assertEquals(2, new CountConsistentStrings().countConsistentStrings("ab",
                new String[] {"ad","bd","aaab","baa","badab"}));
    }

    @Test
    public void test02() {
        Assert.assertEquals(7, new CountConsistentStrings().countConsistentStrings("abc",
                new String[] {"a","b","c","ab","ac","bc","abc"}));
    }

    @Test
    public void test03() {
        Assert.assertEquals(4, new CountConsistentStrings().countConsistentStrings("cad",
                new String[] {"cc","acd","b","ba","bac","bad","ac","d"}));
    }

    @Test
    public void test04() {
        Assert.assertEquals(1, new CountConsistentStrings().countConsistentStrings("d",
                new String[] {"d"}));
    }

    @Test
    public void test05() {
        Assert.assertEquals(0, new CountConsistentStrings().countConsistentStrings("d",
                new String[] {"e"}));
    }
}
