package prasad.leetcode.p1222;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

public class QueensThatCanAttackTheKingTest {

    @Test
    public void test01() {
        List<List<Integer>> result = new QueensThatCanAttackTheKing().queensAttackTheKing(
                new int[][] {{0,1},{1,0},{4,0},{0,4},{3,3},{2,4}}, new int[] {0,0});
        Assert.assertEquals(3, result.size());
        Assert.assertTrue(result.containsAll(Arrays.asList(Arrays.asList(0,1), Arrays.asList(1,0), Arrays.asList(3,3))));
    }

    @Test
    public void test02() {
        List<List<Integer>> result = new QueensThatCanAttackTheKing().queensAttackTheKing(
                new int[][] {{0,0},{1,1},{2,2},{3,4},{3,5},{4,4},{4,5}}, new int[] {3,3});
        Assert.assertEquals(3, result.size());
        Assert.assertTrue(result.containsAll(Arrays.asList(Arrays.asList(2,2), Arrays.asList(3,4), Arrays.asList(4,4))));
    }

    @Test
    public void test03() {
        List<List<Integer>> result = new QueensThatCanAttackTheKing().queensAttackTheKing(
                new int[][] {{5,6},{7,7},{2,1},{0,7},{1,6},{5,1},{3,7},{0,3},{4,0},{1,2},{6,3},{5,0},{0,4},{2,2},{1,1},
                        {6,4},{5,4},{0,0},{2,6},{4,5},{5,2},{1,4},{7,5},{2,3},{0,5},{4,2},{1,0},{2,7},{0,1},{4,6},{6,1},
                        {0,6},{4,3},{1,7}}, new int[] {3,4});
        Assert.assertEquals(7, result.size());
        Assert.assertTrue(result.containsAll(Arrays.asList(Arrays.asList(2,3), Arrays.asList(1,4), Arrays.asList(1,6),
                Arrays.asList(3,7), Arrays.asList(4,3), Arrays.asList(5,4), Arrays.asList(4,5))));
    }

    @Test
    public void test04() {
        List<List<Integer>> result = new QueensThatCanAttackTheKing().queensAttackTheKing(
                new int[][] {{2,4}}, new int[] {0,0});
        Assert.assertEquals(0, result.size());
    }

    @Test
    public void test05() {
        List<List<Integer>> result = new QueensThatCanAttackTheKing().queensAttackTheKing(
                new int[][] {{0,0}}, new int[] {7,7});
        Assert.assertEquals(1, result.size());
        Assert.assertTrue(result.contains(Arrays.asList(0,0)));
    }
}
