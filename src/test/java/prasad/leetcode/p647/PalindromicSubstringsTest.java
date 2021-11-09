package prasad.leetcode.p647;

import org.junit.Assert;
import org.junit.Test;

public class PalindromicSubstringsTest {

    @Test
    public void testCountSubstrings01() {
        Assert.assertEquals(3, new PalindromicSubstrings().countSubstrings("abc"));
    }

    @Test
    public void testCountSubstrings02() {
        Assert.assertEquals(6, new PalindromicSubstrings().countSubstrings("aaa"));
    }

    @Test
    public void testCountSubstrings03() {
        Assert.assertEquals(11, new PalindromicSubstrings().countSubstrings("akmdgbsbce"));
    }
}
