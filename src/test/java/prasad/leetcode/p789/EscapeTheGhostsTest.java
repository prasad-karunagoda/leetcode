package prasad.leetcode.p789;

import org.junit.Assert;
import org.junit.Test;

public class EscapeTheGhostsTest {

    @Test
    public void test01() {
        Assert.assertTrue(new EscapeTheGhosts().escapeGhosts(new int[][] {{1,0},{0,3}}, new int[] {0,1}));
    }

    @Test
    public void test02() {
        Assert.assertFalse(new EscapeTheGhosts().escapeGhosts(new int[][] {{1,0}}, new int[] {2,0}));
    }

    @Test
    public void test03() {
        Assert.assertFalse(new EscapeTheGhosts().escapeGhosts(new int[][] {{2,0}}, new int[] {1,0}));
    }

    @Test
    public void test04() {
        Assert.assertFalse(new EscapeTheGhosts().escapeGhosts(new int[][] {{-2,0}}, new int[] {-1,0}));
    }

    @Test
    public void test05() {
        Assert.assertTrue(new EscapeTheGhosts().escapeGhosts(new int[][] {{-3,0}}, new int[] {-1,0}));
    }
}
