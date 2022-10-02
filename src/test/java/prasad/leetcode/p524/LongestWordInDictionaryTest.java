package prasad.leetcode.p524;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class LongestWordInDictionaryTest {

    @Test
    public void test01() {
        Assert.assertEquals("apple", new LongestWordInDictionary().findLongestWord("abpcplea",
                Arrays.asList("ale","apple","monkey","plea")));
    }

    @Test
    public void test02() {
        Assert.assertEquals("a", new LongestWordInDictionary().findLongestWord("abpcplea",
                Arrays.asList("a","b","c")));
    }

    @Test
    public void test03() {
        Assert.assertEquals("", new LongestWordInDictionary().findLongestWord("abpcplea",
                Arrays.asList("epb","pb","lp")));
    }

    @Test
    public void testTime() {
        String a1000 = String.join("", Collections.nCopies(1000, "a"));
        String b1000 = String.join("", Collections.nCopies(1000, "b"));
        List<String> dictionary = Collections.nCopies(1000, b1000);
        long start = System.currentTimeMillis();
        Assert.assertEquals("", new LongestWordInDictionary().findLongestWord(a1000, dictionary));
        System.out.println("Time = " + (System.currentTimeMillis() - start) + " ms");
    }
}
