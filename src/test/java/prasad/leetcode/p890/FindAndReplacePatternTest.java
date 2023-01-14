package prasad.leetcode.p890;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

public class FindAndReplacePatternTest {

    @Test
    public void test01() {
        List<String> result = new FindAndReplacePattern().findAndReplacePattern(
                new String[] {"abc","deq","mee","aqq","dkd","ccc"}, "abb");
        Assert.assertEquals(2, result.size());
        Assert.assertTrue(result.containsAll(Arrays.asList("mee", "aqq")));
    }

    @Test
    public void test02() {
        List<String> result = new FindAndReplacePattern().findAndReplacePattern(
                new String[] {"a","b","c"}, "a");
        Assert.assertEquals(3, result.size());
        Assert.assertTrue(result.containsAll(Arrays.asList("a", "b", "c")));
    }

    @Test
    public void test03() {
        List<String> result = new FindAndReplacePattern().findAndReplacePattern(
                new String[] {"aaa","bbb"}, "abc");
        Assert.assertEquals(0, result.size());
    }
}
