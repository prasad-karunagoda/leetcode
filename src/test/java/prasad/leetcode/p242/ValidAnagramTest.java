package prasad.leetcode.p242;

import org.junit.Assert;
import org.junit.Test;

public class ValidAnagramTest {

    @Test
    public void test01() {
        Assert.assertTrue(new ValidAnagram().isAnagram("anagram", "nagaram"));
    }

    @Test
    public void test02() {
        Assert.assertFalse(new ValidAnagram().isAnagram("rat", "car"));
    }

    @Test
    public void test03() {
        Assert.assertFalse(new ValidAnagram().isAnagram("ab", "abb"));
    }

    @Test
    public void test04() {
        Assert.assertTrue(new ValidAnagram().isAnagram("", ""));
    }
}
