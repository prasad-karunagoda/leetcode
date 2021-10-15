package prasad.leetcode.p692;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

public class TopKFrequentWordsTest {

    @Test
    public void test01() {
        List<String> result = new TopKFrequentWords().topKFrequent(
                new String[] {"i", "love", "leetcode", "i", "love", "coding"}, 2);
        Assert.assertEquals(Arrays.asList("i", "love"), result);
    }

    @Test
    public void test02() {
        List<String> result = new TopKFrequentWords().topKFrequent(
                new String[] {"i", "love", "leetcode", "i", "leetcode", "love", "coding"}, 2);
        Assert.assertEquals(Arrays.asList("i", "leetcode"), result);
    }
}
