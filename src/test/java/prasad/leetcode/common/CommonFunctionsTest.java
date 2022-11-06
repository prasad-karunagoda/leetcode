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

    @Test
    public void testLeastCommonMultiple01() {
        Assert.assertEquals(60, CommonFunctions.leastCommonMultiple(new int[] {4,3,5}));
    }

    @Test
    public void testLeastCommonMultiple02() {
        Assert.assertEquals(5, CommonFunctions.leastCommonMultiple(new int[] {5}));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testLeastCommonMultiple03() {
        Assert.assertEquals(0, CommonFunctions.leastCommonMultiple(new int[0]));
    }

    @Test
    public void testLeastCommonMultiple04() {
        Assert.assertEquals(180, CommonFunctions.leastCommonMultiple(new int[] {6,9,4,15}));
    }
}
