package prasad.leetcode.p709;

import org.junit.Assert;
import org.junit.Test;

public class ToLowerCaseTest {

    @Test
    public void test01() {
        Assert.assertEquals("hello", new ToLowerCase().toLowerCase("Hello"));
    }

    @Test
    public void test02() {
        Assert.assertEquals("here", new ToLowerCase().toLowerCase("here"));
    }

    @Test
    public void test03() {
        Assert.assertEquals("lovely", new ToLowerCase().toLowerCase("LOVELY"));
    }

    @Test
    public void test04() {
        Assert.assertEquals("abc$4", new ToLowerCase().toLowerCase("aBc$4"));
    }
}
