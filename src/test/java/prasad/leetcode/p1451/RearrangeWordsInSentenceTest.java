package prasad.leetcode.p1451;

import org.junit.Assert;
import org.junit.Test;

public class RearrangeWordsInSentenceTest {

    @Test
    public void test01() {
        Assert.assertEquals("Is cool leetcode",
                new RearrangeWordsInSentence().arrangeWords("Leetcode is cool"));
    }

    @Test
    public void test02() {
        Assert.assertEquals("On and keep calm code",
                new RearrangeWordsInSentence().arrangeWords("Keep calm and code on"));
    }

    @Test
    public void test03() {
        Assert.assertEquals("To be or to be not",
                new RearrangeWordsInSentence().arrangeWords("To be or not to be"));
    }

    @Test
    public void test04() {
        Assert.assertEquals("A",
                new RearrangeWordsInSentence().arrangeWords("A"));
    }
}
