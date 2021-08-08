package prasad.leetcode.p22;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

public class GenerateParenthesesTest {

    @Test
    public void test1() {
        List<String> list = new GenerateParentheses().generateParenthesis(1);
        Assert.assertEquals(1, list.size());
        Assert.assertEquals("()", list.get(0));
    }

    @Test
    public void test2() {
        List<String> list = new GenerateParentheses().generateParenthesis(2);
        Assert.assertEquals(2, list.size());
        Assert.assertTrue(list.containsAll(Arrays.asList("(())", "()()")));
    }

    @Test
    public void test3() {
        List<String> list = new GenerateParentheses().generateParenthesis(3);
        Assert.assertEquals(5, list.size());
        Assert.assertTrue(list.containsAll(Arrays.asList("((()))", "(()())", "(())()", "()(())", "()()()")));
    }
}
