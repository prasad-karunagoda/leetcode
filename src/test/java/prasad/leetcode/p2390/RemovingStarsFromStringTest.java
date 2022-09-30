package prasad.leetcode.p2390;

import org.junit.Assert;
import org.junit.Test;

public class RemovingStarsFromStringTest {

    @Test
    public void test01() {
        Assert.assertEquals("lecoe", new RemovingStarsFromString().removeStars("leet**cod*e"));
    }

    @Test
    public void test02() {
        Assert.assertEquals("", new RemovingStarsFromString().removeStars("erase*****"));
    }

    @Test
    public void test03() {
        Assert.assertEquals("abc", new RemovingStarsFromString().removeStars("abc"));
    }
}
