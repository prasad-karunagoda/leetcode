package prasad.leetcode.p49;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

public class GroupAnagramsTest {

    @Test
    public void test01() {
        List<List<String>> groups = new GroupAnagrams().groupAnagrams(
                new String[] {"eat", "tea", "tan", "ate", "nat", "bat"});

        Assert.assertEquals(3, groups.size());
        for (List<String> g : groups) {
            if (g.size() == 1) {
                Assert.assertEquals("bat", g.get(0));
            }
            else if (g.size() == 2) {
                Assert.assertTrue(g.containsAll(Arrays.asList("nat", "tan")));
            }
            else if (g.size() == 3) {
                Assert.assertTrue(g.containsAll(Arrays.asList("ate", "eat", "tea")));
            }
        }
    }

    @Test
    public void test02() {
        List<List<String>> groups = new GroupAnagrams().groupAnagrams(new String[]{""});
        Assert.assertEquals(1, groups.size());
        Assert.assertEquals(1, groups.get(0).size());
        Assert.assertEquals("", groups.get(0).get(0));
    }

    @Test
    public void test03() {
        List<List<String>> groups = new GroupAnagrams().groupAnagrams(
                new String[] {"eat", "tea", ""});

        Assert.assertEquals(2, groups.size());
        for (List<String> g : groups) {
            if (g.size() == 1) {
                Assert.assertEquals("", g.get(0));
            }
            else if (g.size() == 2) {
                Assert.assertTrue(g.containsAll(Arrays.asList("eat", "tea")));
            }
        }
    }
}
