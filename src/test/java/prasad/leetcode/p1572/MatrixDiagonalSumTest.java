package prasad.leetcode.p1572;

import org.junit.Assert;
import org.junit.Test;

public class MatrixDiagonalSumTest {

    @Test
    public void test01() {
        Assert.assertEquals(25, new MatrixDiagonalSum().diagonalSum(
                new int[][] {{1,2,3},{4,5,6},{7,8,9}}));
    }

    @Test
    public void test02() {
        Assert.assertEquals(8, new MatrixDiagonalSum().diagonalSum(
                new int[][] {{1,1,1,1},{1,1,1,1},{1,1,1,1},{1,1,1,1}}));
    }

    @Test
    public void test03() {
        Assert.assertEquals(5, new MatrixDiagonalSum().diagonalSum(
                new int[][] {{5}}));
    }
}
