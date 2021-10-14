package prasad.leetcode.p676;

import org.junit.Assert;
import org.junit.Test;

public class MagicDictionaryTest {

    @Test
    public void test01() {
        MagicDictionary magicDictionary = new MagicDictionary();
        magicDictionary.buildDict(new String[] {"hello", "leetcode"});
        Assert.assertFalse(magicDictionary.search("hello"));
        Assert.assertTrue(magicDictionary.search("hhllo"));
        Assert.assertFalse(magicDictionary.search("hell"));
        Assert.assertFalse(magicDictionary.search("leetcoded"));
        Assert.assertFalse(magicDictionary.search("halli"));
    }

    @Test
    public void test02() {
        MagicDictionary magicDictionary = new MagicDictionary();
        magicDictionary.buildDict(new String[] {"a", "b", "c"});
        Assert.assertTrue(magicDictionary.search("p"));
        Assert.assertFalse(magicDictionary.search("xy"));
        Assert.assertTrue(magicDictionary.search("a"));
        Assert.assertTrue(magicDictionary.search("b"));
    }
}
