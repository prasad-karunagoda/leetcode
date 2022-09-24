package prasad.leetcode.p781;

import org.junit.Assert;
import org.junit.Test;

public class RabbitsInForestTest {

    @Test
    public void test01() {
        Assert.assertEquals(5, new RabbitsInForest().numRabbits(new int[] {1,1,2}));
    }

    @Test
    public void test02() {
        Assert.assertEquals(11, new RabbitsInForest().numRabbits(new int[] {10,10,10}));
    }

    @Test
    public void test03() {
        Assert.assertEquals(1, new RabbitsInForest().numRabbits(new int[] {0}));
    }

    @Test
    public void test04() {
        Assert.assertEquals(5, new RabbitsInForest().numRabbits(new int[] {1,0,1,0,0}));
    }

    @Test
    public void test05() {
        Assert.assertEquals(6, new RabbitsInForest().numRabbits(new int[] {2,2,2,2}));
    }

    @Test
    public void test06() {
        Assert.assertEquals(4, new RabbitsInForest().numRabbits(new int[] {3,3,3,3}));
    }
}
