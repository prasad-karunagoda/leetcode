package prasad.leetcode.p557;

import org.junit.Assert;
import org.junit.Test;

public class ReverseWordsInString3Test {

    @Test
    public void test01() {
        Assert.assertEquals("s'teL ekat edoCteeL tsetnoc",
                new ReverseWordsInString3().reverseWords("Let's take LeetCode contest"));
    }

    @Test
    public void test02() {
        Assert.assertEquals("doG gniD",
                new ReverseWordsInString3().reverseWords("God Ding"));
    }

    @Test
    public void test03() {
        Assert.assertEquals("cba",
                new ReverseWordsInString3().reverseWords("abc"));
    }

    @Test
    public void test04() {
        Assert.assertEquals("a",
                new ReverseWordsInString3().reverseWords("a"));
    }
}
