package prasad.leetcode.p833;

import org.junit.Assert;
import org.junit.Test;

public class FindAndReplaceInStringTest {

    @Test
    public void test01() {
        String result = new FindAndReplaceInString().findReplaceString("abcd", new int[] {0, 2},
                new String[] {"a", "cd"}, new String[] {"eee", "ffff"});
        Assert.assertEquals("eeebffff", result);
    }

    @Test
    public void test02() {
        String result = new FindAndReplaceInString().findReplaceString("abcd", new int[] {0, 2},
                new String[] {"ab", "ec"}, new String[] {"eee", "ffff"});
        Assert.assertEquals("eeecd", result);
    }

    @Test
    public void test03() {
        String result = new FindAndReplaceInString().findReplaceString("pqabcdrs", new int[] {2, 4},
                new String[] {"a", "cd"}, new String[] {"eee", "ffff"});
        Assert.assertEquals("pqeeebffffrs", result);
    }

    @Test
    public void test04() {
        String result = new FindAndReplaceInString().findReplaceString("pqabcdrs", new int[] {2, 4},
                new String[] {"a", "cde"}, new String[] {"eee", "ffff"});
        Assert.assertEquals("pqeeebcdrs", result);
    }

    @Test
    public void test05() {
        String result = new FindAndReplaceInString().findReplaceString("abcd", new int[0],
                new String[0], new String[0]);
        Assert.assertEquals("abcd", result);
    }

    @Test
    public void test06() {
        String result = new FindAndReplaceInString().findReplaceString("abcd", new int[] {0},
                new String[] {"abcd"}, new String[] {"pqr"});
        Assert.assertEquals("pqr", result);
    }

    @Test
    public void test07() {
        String result = new FindAndReplaceInString().findReplaceString("vmokgggqzp", new int[] {3, 5, 1},
                new String[] {"kg", "ggq", "mo"}, new String[] {"s", "so", "bfr"});
        Assert.assertEquals("vbfrssozp", result);
    }
}
