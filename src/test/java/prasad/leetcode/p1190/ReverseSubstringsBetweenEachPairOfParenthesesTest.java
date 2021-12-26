package prasad.leetcode.p1190;

import org.junit.Assert;
import org.junit.Test;

public class ReverseSubstringsBetweenEachPairOfParenthesesTest {

    @Test
    public void test01() {
        Assert.assertEquals("dcba",
                new ReverseSubstringsBetweenEachPairOfParentheses().reverseParentheses("(abcd)"));
    }

    @Test
    public void test02() {
        Assert.assertEquals("iloveu",
                new ReverseSubstringsBetweenEachPairOfParentheses().reverseParentheses("(u(love)i)"));
    }

    @Test
    public void test03() {
        Assert.assertEquals("leetcode",
                new ReverseSubstringsBetweenEachPairOfParentheses().reverseParentheses("(ed(et(oc))el)"));
    }

    @Test
    public void test04() {
        Assert.assertEquals("",
                new ReverseSubstringsBetweenEachPairOfParentheses().reverseParentheses("()"));
    }

    @Test
    public void test05() {
        Assert.assertEquals("ab",
                new ReverseSubstringsBetweenEachPairOfParentheses().reverseParentheses("a()b"));
    }

    @Test
    public void test06() {
        Assert.assertEquals("abc",
                new ReverseSubstringsBetweenEachPairOfParentheses().reverseParentheses("a(b)c"));
    }

    @Test
    public void test07() {
        Assert.assertEquals("abc",
                new ReverseSubstringsBetweenEachPairOfParentheses().reverseParentheses("abc"));
    }
}
