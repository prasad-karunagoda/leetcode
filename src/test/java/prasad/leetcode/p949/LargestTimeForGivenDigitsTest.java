package prasad.leetcode.p949;

import org.junit.Assert;
import org.junit.Test;

public class LargestTimeForGivenDigitsTest {

    @Test
    public void test01() {
        Assert.assertEquals("23:41",
                new LargestTimeForGivenDigits().largestTimeFromDigits(new int[] {1,2,3,4}));
    }

    @Test
    public void test02() {
        Assert.assertEquals("",
                new LargestTimeForGivenDigits().largestTimeFromDigits(new int[] {5,5,5,5}));
    }

    @Test
    public void test03() {
        Assert.assertEquals("00:00",
                new LargestTimeForGivenDigits().largestTimeFromDigits(new int[] {0,0,0,0}));
    }

    @Test
    public void test04() {
        Assert.assertEquals("10:00",
                new LargestTimeForGivenDigits().largestTimeFromDigits(new int[] {0,0,1,0}));
    }

    @Test
    public void test05() {
        Assert.assertEquals("19:38",
                new LargestTimeForGivenDigits().largestTimeFromDigits(new int[] {3,9,8,1}));
    }
}
