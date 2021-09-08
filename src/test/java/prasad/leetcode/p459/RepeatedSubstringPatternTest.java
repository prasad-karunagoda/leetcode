package prasad.leetcode.p459;

import org.junit.Assert;
import org.junit.Test;

public class RepeatedSubstringPatternTest {

    @Test
    public void test01() {
        Assert.assertTrue(new RepeatedSubstringPattern().repeatedSubstringPattern("abab"));
    }

    @Test
    public void test02() {
        Assert.assertFalse(new RepeatedSubstringPattern().repeatedSubstringPattern("aba"));
    }

    @Test
    public void test03() {
        Assert.assertTrue(new RepeatedSubstringPattern().repeatedSubstringPattern("abcabcabcabc"));
    }

    @Test
    public void test04() {
        Assert.assertFalse(new RepeatedSubstringPattern().repeatedSubstringPattern("abcabcabcab"));
    }

    @Test
    public void test05() {
        Assert.assertTrue(new RepeatedSubstringPattern().repeatedSubstringPattern("ababcababcababc"));
    }

    @Test
    public void test06() {
        Assert.assertTrue(new RepeatedSubstringPattern().repeatedSubstringPattern("aaaa"));
    }

    @Test
    public void test07() {
        Assert.assertFalse(new RepeatedSubstringPattern().repeatedSubstringPattern("a"));
    }
}
