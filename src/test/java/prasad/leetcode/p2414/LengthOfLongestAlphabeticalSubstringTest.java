package prasad.leetcode.p2414;

import org.junit.Assert;
import org.junit.Test;

import java.util.Collections;

public class LengthOfLongestAlphabeticalSubstringTest {

    @Test
    public void test01() {
        Assert.assertEquals(2, new LengthOfLongestAlphabeticalSubstring().longestContinuousSubstring(
                "abacaba"));
    }

    @Test
    public void test02() {
        Assert.assertEquals(5, new LengthOfLongestAlphabeticalSubstring().longestContinuousSubstring(
                "abcde"));
    }

    @Test
    public void test03() {
        Assert.assertEquals(1, new LengthOfLongestAlphabeticalSubstring().longestContinuousSubstring(
                "acbed"));
    }

    @Test
    public void test04() {
        Assert.assertEquals(1, new LengthOfLongestAlphabeticalSubstring().longestContinuousSubstring(
                "k"));
    }

    @Test
    public void testTime() {
        long start = System.currentTimeMillis();
        Assert.assertEquals(1, new LengthOfLongestAlphabeticalSubstring().longestContinuousSubstring(
                String.join("", Collections.nCopies(100000, "e"))));
        System.out.println("Time = " + (System.currentTimeMillis() - start) + " ms");
    }
}
