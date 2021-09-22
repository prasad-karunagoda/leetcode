package prasad.leetcode.p290;

import org.junit.Assert;
import org.junit.Test;

public class WordPatternTest {

    @Test
    public void test01() {
        Assert.assertTrue(new WordPattern().wordPattern("abba", "dog cat cat dog"));
    }

    @Test
    public void test02() {
        Assert.assertFalse(new WordPattern().wordPattern("abba", "dog cat cat fish"));
    }

    @Test
    public void test03() {
        Assert.assertFalse(new WordPattern().wordPattern("aaaa", "dog cat cat dog"));
    }

    @Test
    public void test04() {
        Assert.assertFalse(new WordPattern().wordPattern("abba", "dog dog dog dog"));
    }

    @Test
    public void test05() {
        Assert.assertFalse(new WordPattern().wordPattern("abba", "dog cat pig cat pig dog"));
    }

    @Test
    public void test06() {
        Assert.assertFalse(new WordPattern().wordPattern("aaaa", "dog dog"));
    }

    @Test
    public void test07() {
        Assert.assertTrue(new WordPattern().wordPattern("a", "dog"));
    }
}
