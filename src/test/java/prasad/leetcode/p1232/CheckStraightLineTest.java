package prasad.leetcode.p1232;

import org.junit.Assert;
import org.junit.Test;

public class CheckStraightLineTest {

    @Test
    public void test01() {
        int[][] coordinates = new int[][] {{1,2}, {2,3}, {3,4}, {4,5}, {5,6}, {6,7}};
        Assert.assertTrue(new CheckStraightLine().checkStraightLine(coordinates));
    }

    @Test
    public void test02() {
        int[][] coordinates = new int[][] {{1,1}, {2,2}, {3,4}, {4,5}, {5,6}, {7,7}};
        Assert.assertFalse(new CheckStraightLine().checkStraightLine(coordinates));
    }

    @Test
    public void test03() {
        int[][] coordinates = new int[][] {{1,5}, {3,11}};
        Assert.assertTrue(new CheckStraightLine().checkStraightLine(coordinates));
    }

    @Test
    public void test04() {
        int[][] coordinates = new int[][] {{1,-1}, {4,5}, {-2,-7}};
        Assert.assertTrue(new CheckStraightLine().checkStraightLine(coordinates));
    }

    @Test
    public void test05() {
        int[][] coordinates = new int[][] {{0,0}, {0,5}, {5,5}, {5,0}};
        Assert.assertFalse(new CheckStraightLine().checkStraightLine(coordinates));
    }

    @Test
    public void test06() {
        int[][] coordinates = new int[][] {{0,0}, {0,5}, {0,8}, {0,10}};
        Assert.assertTrue(new CheckStraightLine().checkStraightLine(coordinates));
    }

    @Test
    public void test07() {
        int[][] coordinates = new int[][] {{2,0}, {6,0}, {3,0}, {5,0}};
        Assert.assertTrue(new CheckStraightLine().checkStraightLine(coordinates));
    }
}
