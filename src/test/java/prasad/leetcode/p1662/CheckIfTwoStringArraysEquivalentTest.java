package prasad.leetcode.p1662;

import org.junit.Assert;
import org.junit.Test;

public class CheckIfTwoStringArraysEquivalentTest {

    @Test
    public void test01() {
        Assert.assertTrue(new CheckIfTwoStringArraysEquivalent().arrayStringsAreEqual(
                new String[] {"ab", "c"},
                new String[] {"a", "bc"}));
    }

    @Test
    public void test02() {
        Assert.assertFalse(new CheckIfTwoStringArraysEquivalent().arrayStringsAreEqual(
                new String[] {"a", "cb"},
                new String[] {"ab", "c"}));
    }

    @Test
    public void test03() {
        Assert.assertTrue(new CheckIfTwoStringArraysEquivalent().arrayStringsAreEqual(
                new String[] {"abc", "d", "defg"},
                new String[] {"abcddefg"}));
    }
}
