package prasad.leetcode.p1910;

import org.junit.Assert;
import org.junit.Test;

public class RemoveAllOccurrencesOfSubstringTest {

    @Test
    public void test01() {
        Assert.assertEquals("dab",
                new RemoveAllOccurrencesOfSubstring().removeOccurrences("daabcbaabcbc", "abc"));
    }

    @Test
    public void test02() {
        Assert.assertEquals("ab",
                new RemoveAllOccurrencesOfSubstring().removeOccurrences("axxxxyyyyb", "xy"));
    }

    @Test
    public void test03() {
        Assert.assertEquals("daabcbaabcbc",
                new RemoveAllOccurrencesOfSubstring().removeOccurrences("daabcbaabcbc", "xy"));
    }

    @Test
    public void test04() {
        Assert.assertEquals("dbcbbcbc",
                new RemoveAllOccurrencesOfSubstring().removeOccurrences("daabcbaabcbc", "a"));
    }
}
