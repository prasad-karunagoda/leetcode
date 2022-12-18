package prasad.leetcode.p2482;

import org.junit.Assert;
import org.junit.Test;

public class DifferenceBetweenOnesAndZerosTest {

    @Test
    public void test01() {
        int[][] diff = new DifferenceBetweenOnesAndZeros().onesMinusZeros(new int[][] {{0,1,1},{1,0,1},{0,0,1}});
        Assert.assertEquals(3, diff.length);
        Assert.assertArrayEquals(new int[] {0,0,4}, diff[0]);
        Assert.assertArrayEquals(new int[] {0,0,4}, diff[1]);
        Assert.assertArrayEquals(new int[] {-2,-2,2}, diff[2]);
    }

    @Test
    public void test02() {
        int[][] diff = new DifferenceBetweenOnesAndZeros().onesMinusZeros(new int[][] {{1,1,1},{1,1,1}});
        Assert.assertEquals(2, diff.length);
        Assert.assertArrayEquals(new int[] {5,5,5}, diff[0]);
        Assert.assertArrayEquals(new int[] {5,5,5}, diff[1]);
    }

    @Test
    public void test03() {
        int[][] diff = new DifferenceBetweenOnesAndZeros().onesMinusZeros(new int[][] {{1}});
        Assert.assertEquals(1, diff.length);
        Assert.assertArrayEquals(new int[] {2}, diff[0]);
    }

    @Test
    public void test04() {
        int[][] diff = new DifferenceBetweenOnesAndZeros().onesMinusZeros(new int[][] {{0}});
        Assert.assertEquals(1, diff.length);
        Assert.assertArrayEquals(new int[] {-2}, diff[0]);
    }
}
