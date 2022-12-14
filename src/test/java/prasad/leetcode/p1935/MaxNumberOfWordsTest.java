package prasad.leetcode.p1935;

import org.junit.Assert;
import org.junit.Test;

public class MaxNumberOfWordsTest {

    @Test
    public void test01() {
        Assert.assertEquals(1, new MaxNumberOfWords().canBeTypedWords("hello world", "ad"));
    }

    @Test
    public void test02() {
        Assert.assertEquals(1, new MaxNumberOfWords().canBeTypedWords("leet code", "lt"));
    }

    @Test
    public void test03() {
        Assert.assertEquals(0, new MaxNumberOfWords().canBeTypedWords("leet code", "e"));
    }

    @Test
    public void test04() {
        Assert.assertEquals(2, new MaxNumberOfWords().canBeTypedWords("hello world", ""));
    }

    @Test
    public void test05() {
        Assert.assertEquals(1, new MaxNumberOfWords().canBeTypedWords("h", ""));
    }
}
