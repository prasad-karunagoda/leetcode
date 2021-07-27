package prasad.leetcode.p36;

import org.junit.Assert;
import org.junit.Test;

public class ValidSudokuTest {

    @Test
    public void testIsValidSudoku_Valid() {
        char[][] board = new char[][] {
                {'5','3','.', '.','7','.', '.','.','.'},
                {'6','.','.', '1','9','5', '.','.','.'},
                {'.','9','8', '.','.','.', '.','6','.'},

                {'8','.','.', '.','6','.', '.','.','3'},
                {'4','.','.', '8','.','3', '.','.','1'},
                {'7','.','.', '.','2','.', '.','.','6'},

                {'.','6','.', '.','.','.', '2','8','.'},
                {'.','.','.', '4','1','9', '.','.','5'},
                {'.','.','.', '.','8','.', '.','7','9'}};
        Assert.assertTrue(new ValidSudoku().isValidSudoku(board));
    }

    @Test
    public void testIsValidSudoku_RepeatInSubBox() {
        char[][] board = new char[][] {
                {'8','3','.', '.','7','.', '.','.','.'},
                {'6','.','.', '1','9','5', '.','.','.'},
                {'.','9','8', '.','.','.', '.','6','.'},

                {'8','.','.', '.','6','.', '.','.','3'},
                {'4','.','.', '8','.','3', '.','.','1'},
                {'7','.','.', '.','2','.', '.','.','6'},

                {'.','6','.', '.','.','.', '2','8','.'},
                {'.','.','.', '4','1','9', '.','.','5'},
                {'.','.','.', '.','8','.', '.','7','9'}};
        Assert.assertFalse(new ValidSudoku().isValidSudoku(board));
    }

    @Test
    public void testIsValidSudoku_RepeatInRow() {
        char[][] board = new char[][] {
                {'5','3','.', '.','7','.', '.','.','.'},
                {'6','.','.', '1','9','5', '.','.','.'},
                {'.','9','8', '.','.','.', '.','6','.'},

                {'8','.','.', '.','6','.', '.','.','3'},
                {'4','.','.', '8','.','4', '.','.','1'},
                {'7','.','.', '.','2','.', '.','.','6'},

                {'.','6','.', '.','.','.', '2','8','.'},
                {'.','.','.', '4','1','9', '.','.','5'},
                {'.','.','.', '.','8','.', '.','7','9'}};
        Assert.assertFalse(new ValidSudoku().isValidSudoku(board));
    }

    @Test
    public void testIsValidSudoku_RepeatInColumn() {
        char[][] board = new char[][] {
                {'5','3','.', '.','7','.', '.','.','.'},
                {'6','.','.', '1','9','5', '.','.','.'},
                {'.','9','8', '.','.','.', '.','7','.'},

                {'8','.','.', '.','6','.', '.','.','3'},
                {'4','.','.', '8','.','3', '.','.','1'},
                {'7','.','.', '.','2','.', '.','.','6'},

                {'.','6','.', '.','.','.', '2','8','.'},
                {'.','.','.', '4','1','9', '.','.','5'},
                {'.','.','.', '.','8','.', '.','7','9'}};
        Assert.assertFalse(new ValidSudoku().isValidSudoku(board));
    }

    @Test
    public void testGetSubBoxNumber_4_4() {
        Assert.assertEquals(5, ValidSudoku.getSubBoxNumber(4, 4));
    }

    @Test
    public void testGetSubBoxNumber_6_5() {
        Assert.assertEquals(8, ValidSudoku.getSubBoxNumber(6, 5));
    }

    @Test
    public void testGetSubBoxNumber_5_6() {
        Assert.assertEquals(6, ValidSudoku.getSubBoxNumber(5, 6));
    }

    @Test
    public void testGetSubBoxNumber_6_6() {
        Assert.assertEquals(9, ValidSudoku.getSubBoxNumber(6, 6));
    }

    @Test
    public void testGetSubBoxNumber_2_7() {
        Assert.assertEquals(3, ValidSudoku.getSubBoxNumber(2, 7));
    }
}
