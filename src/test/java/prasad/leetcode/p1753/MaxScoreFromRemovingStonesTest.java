package prasad.leetcode.p1753;

import org.junit.Assert;
import org.junit.Test;

public class MaxScoreFromRemovingStonesTest {

    @Test
    public void test01() {
        Assert.assertEquals(6, new MaxScoreFromRemovingStones().maximumScore(2, 4, 6));
    }

    @Test
    public void test02() {
        Assert.assertEquals(7, new MaxScoreFromRemovingStones().maximumScore(4, 4, 6));
    }

    @Test
    public void test03() {
        Assert.assertEquals(8, new MaxScoreFromRemovingStones().maximumScore(1, 8, 8));
    }

    @Test
    public void test04() {
        Assert.assertEquals(5, new MaxScoreFromRemovingStones().maximumScore(2, 3, 8));
    }

    @Test
    public void test05() {
        Assert.assertEquals(1, new MaxScoreFromRemovingStones().maximumScore(1, 1, 1));
    }
}
