package prasad.leetcode.p1046;

import org.junit.Assert;
import org.junit.Test;

public class LastStoneWeightTest {

    @Test
    public void test01() {
        Assert.assertEquals(1, new LastStoneWeight().lastStoneWeight(new int[] {2,7,4,1,8,1}));
    }

    @Test
    public void test02() {
        Assert.assertEquals(5, new LastStoneWeight().lastStoneWeight(new int[] {5}));
    }

    @Test
    public void test03() {
        Assert.assertEquals(0, new LastStoneWeight().lastStoneWeight(new int[] {5,5}));
    }

    @Test
    public void test04() {
        Assert.assertEquals(0, new LastStoneWeight().lastStoneWeight(new int[] {5,2,7,1,6,4,2,3}));
    }

    @Test
    public void test05() {
        Assert.assertEquals(2, new LastStoneWeight().lastStoneWeight(new int[] {5,1,8}));
    }
}
