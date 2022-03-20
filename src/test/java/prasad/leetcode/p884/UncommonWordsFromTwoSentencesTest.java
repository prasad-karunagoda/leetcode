package prasad.leetcode.p884;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;

public class UncommonWordsFromTwoSentencesTest {

    @Test
    public void test01() {
        String[] result = new UncommonWordsFromTwoSentences().uncommonFromSentences(
                "this apple is sweet",
                "this apple is sour");
        Assert.assertEquals(2, result.length);
        Assert.assertTrue(Arrays.asList("sweet", "sour").containsAll(Arrays.asList(result)));
    }

    @Test
    public void test02() {
        String[] result = new UncommonWordsFromTwoSentences().uncommonFromSentences(
                "apple apple",
                "banana");
        Assert.assertEquals(1, result.length);
        Assert.assertEquals("banana", result[0]);
    }

    @Test
    public void test03() {
        String[] result = new UncommonWordsFromTwoSentences().uncommonFromSentences(
                "apple banana",
                "banana apple");
        Assert.assertEquals(0, result.length);
    }
}
