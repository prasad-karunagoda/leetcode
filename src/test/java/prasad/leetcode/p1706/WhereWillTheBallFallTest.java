package prasad.leetcode.p1706;

import org.junit.Assert;
import org.junit.Test;

public class WhereWillTheBallFallTest {

    @Test
    public void test01() {
        int[] result = new WhereWillTheBallFall().findBall(new int[][] {
                { 1,  1,  1, -1, -1},
                { 1,  1,  1, -1, -1},
                {-1, -1, -1,  1,  1},
                { 1,  1,  1,  1, -1},
                {-1, -1, -1, -1, -1}});
        Assert.assertArrayEquals(new int[] {1,-1,-1,-1,-1}, result);
    }

    @Test
    public void test02() {
        int[] result = new WhereWillTheBallFall().findBall(new int[][] {{-1}});
        Assert.assertArrayEquals(new int[] {-1}, result);
    }

    @Test
    public void test03() {
        int[] result = new WhereWillTheBallFall().findBall(new int[][] {
                { 1,  1,  1,  1,  1,  1},
                {-1, -1, -1, -1, -1, -1},
                { 1,  1,  1,  1,  1,  1},
                {-1, -1, -1, -1, -1, -1}});
        Assert.assertArrayEquals(new int[] {0,1,2,3,4,-1}, result);
    }

    @Test
    public void test04() {
        int[] result = new WhereWillTheBallFall().findBall(new int[][] {{1}});
        Assert.assertArrayEquals(new int[] {-1}, result);
    }
}
