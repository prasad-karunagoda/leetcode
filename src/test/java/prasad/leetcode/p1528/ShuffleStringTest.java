package prasad.leetcode.p1528;

import org.junit.Assert;
import org.junit.Test;

public class ShuffleStringTest {

    @Test
    public void test01() {
        Assert.assertEquals("leetcode",
                new ShuffleString().restoreString("codeleet", new int[] {4,5,6,7,0,2,1,3}));
    }

    @Test
    public void test02() {
        Assert.assertEquals("abc",
                new ShuffleString().restoreString("abc", new int[] {0,1,2}));
    }

    @Test
    public void test03() {
        Assert.assertEquals("p",
                new ShuffleString().restoreString("p", new int[] {0}));
    }

    @Test
    public void test04() {
        Assert.assertEquals("qp",
                new ShuffleString().restoreString("pq", new int[] {1,0}));
    }
}
