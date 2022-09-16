package prasad.leetcode.p289;

import org.junit.Assert;
import org.junit.Test;

public class GameOfLifeTest {

    @Test
    public void test01() {
        int[][] board = new int[][] {{0,1,0},{0,0,1},{1,1,1},{0,0,0}};
        new GameOfLife().gameOfLife(board);
        Assert.assertEquals(4, board.length);
        Assert.assertArrayEquals(new int[] {0,0,0}, board[0]);
        Assert.assertArrayEquals(new int[] {1,0,1}, board[1]);
        Assert.assertArrayEquals(new int[] {0,1,1}, board[2]);
        Assert.assertArrayEquals(new int[] {0,1,0}, board[3]);
    }

    @Test
    public void test02() {
        int[][] board = new int[][] {{1,1},{1,0}};
        new GameOfLife().gameOfLife(board);
        Assert.assertEquals(2, board.length);
        Assert.assertArrayEquals(new int[] {1,1}, board[0]);
        Assert.assertArrayEquals(new int[] {1,1}, board[1]);
    }

    @Test
    public void test03() {
        int[][] board = new int[][] {{1}};
        new GameOfLife().gameOfLife(board);
        Assert.assertEquals(1, board.length);
        Assert.assertArrayEquals(new int[] {0}, board[0]);
    }

    @Test
    public void test04() {
        int[][] board = new int[][] {{0}};
        new GameOfLife().gameOfLife(board);
        Assert.assertEquals(1, board.length);
        Assert.assertArrayEquals(new int[] {0}, board[0]);
    }
}
