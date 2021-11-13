package prasad.leetcode.p436;

import org.junit.Assert;
import org.junit.Test;

public class FindRightIntervalTest {

    @Test
    public void test01() {
        int[] result = new FindRightInterval().findRightInterval(new int[][] {{1,2}});
        Assert.assertArrayEquals(new int[] {-1}, result);
    }

    @Test
    public void test02() {
        int[] result = new FindRightInterval().findRightInterval(new int[][] {{3,4},{2,3},{1,2}});
        Assert.assertArrayEquals(new int[] {-1,0,1}, result);
    }

    @Test
    public void test03() {
        int[] result = new FindRightInterval().findRightInterval(new int[][] {{1,4},{2,3},{3,4}});
        Assert.assertArrayEquals(new int[] {-1,2,-1}, result);
    }

    @Test
    public void test04() {
        int[] result = new FindRightInterval().findRightInterval(new int[][] {{3,4},{2,2},{1,3}});
        Assert.assertArrayEquals(new int[] {-1,1,0}, result);
    }
}
