package prasad.leetcode.p794;

import org.junit.Assert;
import org.junit.Test;

public class ValidTicTacToeStateTest {

    @Test
    public void test01() {
        Assert.assertFalse(new ValidTicTacToeState().validTicTacToe(new String[] {"O  ", "   ", "   "}));
    }

    @Test
    public void test02() {
        Assert.assertFalse(new ValidTicTacToeState().validTicTacToe(new String[] {"XOX", " X ", "   "}));
    }

    @Test
    public void test03() {
        Assert.assertTrue(new ValidTicTacToeState().validTicTacToe(new String[] {"XOX", "O O", "XOX"}));
    }

    @Test
    public void test04() {
        Assert.assertTrue(new ValidTicTacToeState().validTicTacToe(new String[] {"XOX", "OXO", "XOX"}));
    }

    @Test
    public void test05() {
        Assert.assertTrue(new ValidTicTacToeState().validTicTacToe(new String[] {"XXX", "OXO", "XOO"}));
    }

    @Test
    public void test06() {
        Assert.assertFalse(new ValidTicTacToeState().validTicTacToe(new String[] {"XXO", "XOX", "OXX"}));
    }

    @Test
    public void test07() {
        Assert.assertTrue(new ValidTicTacToeState().validTicTacToe(new String[] {"XXO", " O ", "O X"}));
    }

    @Test
    public void test08() {
        Assert.assertFalse(new ValidTicTacToeState().validTicTacToe(new String[] {"XXX", "OOO", "OXX"}));
    }

    @Test
    public void test09() {
        Assert.assertTrue(new ValidTicTacToeState().validTicTacToe(new String[] {"   ", "   ", "   "}));
    }

    @Test
    public void test10() {
        Assert.assertFalse(new ValidTicTacToeState().validTicTacToe(new String[] {"XXX", "XOO", "OO "}));
    }

    @Test
    public void test11() {
        Assert.assertFalse(new ValidTicTacToeState().validTicTacToe(new String[] {"OXX", "XOX", "OXO"}));
    }
}
