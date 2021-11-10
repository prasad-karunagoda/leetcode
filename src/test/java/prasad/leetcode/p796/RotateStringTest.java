package prasad.leetcode.p796;

import org.junit.Assert;
import org.junit.Test;

public class RotateStringTest {

    @Test
    public void test01() {
        Assert.assertTrue(new RotateString().rotateString("abcde", "cdeab"));
    }

    @Test
    public void test02() {
        Assert.assertFalse(new RotateString().rotateString("abcde", "abced"));
    }

    @Test
    public void test03() {
        Assert.assertTrue(new RotateString().rotateString("xyz", "xyz"));
    }

    @Test
    public void test04() {
        Assert.assertTrue(new RotateString().rotateString("b", "b"));
    }

    @Test
    public void test05() {
        Assert.assertFalse(new RotateString().rotateString("c", "d"));
    }

    @Test
    public void test06() {
        Assert.assertTrue(new RotateString().rotateString("cabcde", "cdecab"));
    }
}
