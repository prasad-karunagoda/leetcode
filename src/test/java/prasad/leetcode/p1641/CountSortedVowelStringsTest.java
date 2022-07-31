package prasad.leetcode.p1641;

import org.junit.Assert;
import org.junit.Test;

public class CountSortedVowelStringsTest {

    @Test
    public void test1() {
        Assert.assertEquals(5, new CountSortedVowelStrings().countVowelStrings(1));
    }

    @Test
    public void test2() {
        Assert.assertEquals(15, new CountSortedVowelStrings().countVowelStrings(2));
    }

    @Test
    public void test3() {
        Assert.assertEquals(35, new CountSortedVowelStrings().countVowelStrings(3));
    }

    @Test
    public void test4() {
        Assert.assertEquals(70, new CountSortedVowelStrings().countVowelStrings(4));
    }

    @Test
    public void test33() {
        Assert.assertEquals(66045, new CountSortedVowelStrings().countVowelStrings(33));
    }
}
