package prasad.leetcode.p205;

import org.junit.Assert;
import org.junit.Test;

public class IsomorphicStringsTest {

    @Test
    public void test01() {
        Assert.assertTrue(new IsomorphicStrings().isIsomorphic("egg", "add"));
    }

    @Test
    public void test02() {
        Assert.assertFalse(new IsomorphicStrings().isIsomorphic("foo", "bar"));
    }

    @Test
    public void test03() {
        Assert.assertFalse(new IsomorphicStrings().isIsomorphic("bar", "foo"));
    }

    @Test
    public void test04() {
        Assert.assertTrue(new IsomorphicStrings().isIsomorphic("paper", "title"));
    }

    @Test
    public void test05() {
        Assert.assertTrue(new IsomorphicStrings().isIsomorphic("h", "h"));
    }

    @Test
    public void test06() {
        Assert.assertTrue(new IsomorphicStrings().isIsomorphic("h", "w"));
    }

    @Test
    public void test07() {
        Assert.assertFalse(new IsomorphicStrings().isIsomorphic("he", "w"));
    }
}
