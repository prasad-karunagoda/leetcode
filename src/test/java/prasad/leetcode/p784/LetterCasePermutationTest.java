package prasad.leetcode.p784;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

public class LetterCasePermutationTest {

    @Test
    public void test01() {
        List<String> result = new LetterCasePermutation().letterCasePermutation("a1b2");
        Assert.assertEquals(4, result.size());
        Assert.assertTrue(result.containsAll(Arrays.asList("a1b2", "a1B2", "A1b2", "A1B2")));
    }

    @Test
    public void test02() {
        List<String> result = new LetterCasePermutation().letterCasePermutation("3z4");
        Assert.assertEquals(2, result.size());
        Assert.assertTrue(result.containsAll(Arrays.asList("3z4", "3Z4")));
    }

    @Test
    public void test03() {
        List<String> result = new LetterCasePermutation().letterCasePermutation("12345");
        Assert.assertEquals(1, result.size());
        Assert.assertEquals("12345", result.get(0));
    }

    @Test
    public void test04() {
        List<String> result = new LetterCasePermutation().letterCasePermutation("0");
        Assert.assertEquals(1, result.size());
        Assert.assertEquals("0", result.get(0));
    }

    @Test
    public void test05() {
        List<String> result = new LetterCasePermutation().letterCasePermutation("abc");
        Assert.assertEquals(8, result.size());
        Assert.assertTrue(result.containsAll(Arrays.asList("abc", "abC", "aBc", "aBC", "Abc", "AbC", "ABc", "ABC")));
    }

    @Test
    public void test06() {
        List<String> result = new LetterCasePermutation().letterCasePermutation("k");
        Assert.assertEquals(2, result.size());
        Assert.assertTrue(result.containsAll(Arrays.asList("k", "K")));
    }

    @Test
    public void testTime() {
        long start = System.currentTimeMillis();
        List<String> result = new LetterCasePermutation().letterCasePermutation("abcdefghijkl");
        System.out.println("Time = " + (System.currentTimeMillis() - start) + " ms");
        Assert.assertEquals((int) Math.pow(2, 12), result.size());
    }
}
