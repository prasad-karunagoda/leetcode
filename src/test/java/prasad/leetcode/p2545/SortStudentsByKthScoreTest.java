package prasad.leetcode.p2545;

import org.junit.Assert;
import org.junit.Test;

public class SortStudentsByKthScoreTest {

    @Test
    public void test01() {
        int[][] result = new SortStudentsByKthScore().sortTheStudents(
                new int[][] {{10,6,9,1},{7,5,11,2},{4,8,3,15}}, 2);
        Assert.assertEquals(3, result.length);
        Assert.assertArrayEquals(new int[] {7,5,11,2}, result[0]);
        Assert.assertArrayEquals(new int[] {10,6,9,1}, result[1]);
        Assert.assertArrayEquals(new int[] {4,8,3,15}, result[2]);
    }

    @Test
    public void test02() {
        int[][] result = new SortStudentsByKthScore().sortTheStudents(
                new int[][] {{3,4},{5,6}}, 0);
        Assert.assertEquals(2, result.length);
        Assert.assertArrayEquals(new int[] {5,6}, result[0]);
        Assert.assertArrayEquals(new int[] {3,4}, result[1]);
    }

    @Test
    public void test03() {
        int[][] result = new SortStudentsByKthScore().sortTheStudents(
                new int[][] {{5}}, 0);
        Assert.assertEquals(1, result.length);
        Assert.assertArrayEquals(new int[] {5}, result[0]);
    }
}
