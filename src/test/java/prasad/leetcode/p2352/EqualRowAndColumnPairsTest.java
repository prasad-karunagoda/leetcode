package prasad.leetcode.p2352;

import org.junit.Assert;
import org.junit.Test;

public class EqualRowAndColumnPairsTest {

    @Test
    public void test01() {
        Assert.assertEquals(1, new EqualRowAndColumnPairs().equalPairs(new int[][] {
                {3,2,1},
                {1,7,6},
                {2,7,7}}));
    }

    @Test
    public void test02() {
        Assert.assertEquals(3, new EqualRowAndColumnPairs().equalPairs(new int[][] {
                {3,1,2,2},
                {1,4,4,5},
                {2,4,2,2},
                {2,4,2,2}}));
    }

    @Test
    public void test03() {
        Assert.assertEquals(16, new EqualRowAndColumnPairs().equalPairs(new int[][] {
                {5,5,5,5},
                {5,5,5,5},
                {5,5,5,5},
                {5,5,5,5}}));
    }

    @Test
    public void test04() {
        Assert.assertEquals(0, new EqualRowAndColumnPairs().equalPairs(new int[][] {
                {1,2,3},
                {4,5,6},
                {7,8,9}}));
    }

    @Test
    public void test05() {
        Assert.assertEquals(2, new EqualRowAndColumnPairs().equalPairs(new int[][] {
                {5,5,5,5},
                {5,4,4,2},
                {5,5,4,5},
                {5,5,2,5}}));
    }
}
