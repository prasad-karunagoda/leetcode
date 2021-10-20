package prasad.leetcode.common;

import org.junit.Assert;
import org.junit.Test;

public class CommonFunctionsTest {

    @Test
    public void testIsPalindrome01() {
        Assert.assertTrue(CommonFunctions.isPalindrome(""));
    }

    @Test
    public void testIsPalindrome02() {
        Assert.assertTrue(CommonFunctions.isPalindrome("a"));
    }

    @Test
    public void testIsPalindrome03() {
        Assert.assertTrue(CommonFunctions.isPalindrome("bb"));
    }

    @Test
    public void testIsPalindrome04() {
        Assert.assertTrue(CommonFunctions.isPalindrome("abdckmpmkcdba"));
    }

    @Test
    public void testIsPalindrome05() {
        Assert.assertFalse(CommonFunctions.isPalindrome("ab"));
    }

    @Test
    public void testGetLowercaseCharacterCounts01() {
        int[] counts = CommonFunctions.getLowercaseCharacterCounts("acabbadc");
        int[] expected = new int[26];
        expected[0] = 3; // a
        expected[1] = 2; // b
        expected[2] = 2; // c
        expected[3] = 1; // d
        Assert.assertArrayEquals(expected, counts);
    }
}
