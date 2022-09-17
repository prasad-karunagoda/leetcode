package prasad.leetcode.p2391;

import org.junit.Assert;
import org.junit.Test;

public class MinTimeToCollectGarbageTest {

    @Test
    public void test01() {
        Assert.assertEquals(21, new MinTimeToCollectGarbage().garbageCollection(
                new String[] {"G","P","GP","GG"}, new int[] {2,4,3}));
    }

    @Test
    public void test02() {
        Assert.assertEquals(37, new MinTimeToCollectGarbage().garbageCollection(
                new String[] {"MMM","PGM","GP"}, new int[] {3,10}));
    }

    @Test
    public void test03() {
        Assert.assertEquals(5, new MinTimeToCollectGarbage().garbageCollection(
                new String[] {"M","M"}, new int[] {3}));
    }

    @Test
    public void test04() {
        Assert.assertEquals(12, new MinTimeToCollectGarbage().garbageCollection(
                new String[] {"M","P","G"}, new int[] {2,5}));
    }
}
