package prasad.leetcode.p383;

import org.junit.Assert;
import org.junit.Test;

public class RansomNoteTest {

    @Test
    public void test01() {
        Assert.assertFalse(new RansomNote().canConstruct("a", "b"));
    }

    @Test
    public void test02() {
        Assert.assertFalse(new RansomNote().canConstruct("aa", "ab"));
    }

    @Test
    public void test03() {
        Assert.assertTrue(new RansomNote().canConstruct("aa", "aab"));
    }
}
