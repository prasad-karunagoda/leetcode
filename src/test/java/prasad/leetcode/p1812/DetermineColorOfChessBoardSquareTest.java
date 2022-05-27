package prasad.leetcode.p1812;

import org.junit.Assert;
import org.junit.Test;

public class DetermineColorOfChessBoardSquareTest {

    @Test
    public void testA1() {
        Assert.assertFalse(new DetermineColorOfChessBoardSquare().squareIsWhite("a1"));
    }

    @Test
    public void testB6() {
        Assert.assertFalse(new DetermineColorOfChessBoardSquare().squareIsWhite("b6"));
    }

    @Test
    public void testE5() {
        Assert.assertFalse(new DetermineColorOfChessBoardSquare().squareIsWhite("e5"));
    }

    @Test
    public void testB1() {
        Assert.assertTrue(new DetermineColorOfChessBoardSquare().squareIsWhite("b1"));
    }

    @Test
    public void testF7() {
        Assert.assertTrue(new DetermineColorOfChessBoardSquare().squareIsWhite("f7"));
    }

    @Test
    public void testC4() {
        Assert.assertTrue(new DetermineColorOfChessBoardSquare().squareIsWhite("c4"));
    }
}
