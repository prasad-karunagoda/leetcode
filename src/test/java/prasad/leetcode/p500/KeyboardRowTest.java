package prasad.leetcode.p500;

import org.junit.Assert;
import org.junit.Test;

public class KeyboardRowTest {

    @Test
    public void test01() {
        String[] result = new KeyboardRow().findWords(new String[] {"Hello", "Alaska", "Dad", "Peace"});
        Assert.assertArrayEquals(new String[] {"Alaska", "Dad"}, result);
    }

    @Test
    public void test02() {
        String[] result = new KeyboardRow().findWords(new String[] {"omk"});
        Assert.assertArrayEquals(new String[0], result);
    }

    @Test
    public void test03() {
        String[] result = new KeyboardRow().findWords(new String[] {"adsdf", "sfd"});
        Assert.assertArrayEquals(new String[] {"adsdf", "sfd"}, result);
    }

    @Test
    public void test04() {
        String[] result = new KeyboardRow().findWords(new String[] {"g"});
        Assert.assertArrayEquals(new String[] {"g"}, result);
    }

    @Test
    public void test05() {
        String[] result = new KeyboardRow().findWords(new String[] {"g", "t", "c", "w"});
        Assert.assertArrayEquals(new String[] {"g", "t", "c", "w"}, result);
    }
}
