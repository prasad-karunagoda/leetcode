package prasad.leetcode.p593;

import org.junit.Assert;
import org.junit.Test;

public class ValidSquareTest {

    @Test
    public void test01() {
        Assert.assertTrue(new ValidSquare().validSquare(
                new int[] {0,0}, new int[] {1,1}, new int[] {1,0}, new int[] {0,1}));
    }

    @Test
    public void test02() {
        Assert.assertFalse(new ValidSquare().validSquare(
                new int[] {0,0}, new int[] {1,1}, new int[] {1,0}, new int[] {0,12}));
    }

    @Test
    public void test03() {
        Assert.assertTrue(new ValidSquare().validSquare(
                new int[] {1,0}, new int[] {-1,0}, new int[] {0,1}, new int[] {0,-1}));
    }

    @Test
    public void test04() {
        Assert.assertTrue(new ValidSquare().validSquare(
                new int[] {4,1}, new int[] {1,5}, new int[] {8,4}, new int[] {5,8}));
    }

    @Test
    public void testZeroSizeSquare() {
        Assert.assertFalse(new ValidSquare().validSquare(
                new int[] {2,2}, new int[] {2,2}, new int[] {2,2}, new int[] {2,2}));
    }

    @Test
    public void testZeroHeightSquare() {
        Assert.assertFalse(new ValidSquare().validSquare(
                new int[] {2,2}, new int[] {6,2}, new int[] {2,2}, new int[] {6,2}));
    }

    @Test
    public void testLineSquare() {
        Assert.assertFalse(new ValidSquare().validSquare(
                new int[] {2,2}, new int[] {6,2}, new int[] {3,2}, new int[] {4,2}));
    }

    @Test
    public void test05() {
        Assert.assertFalse(new ValidSquare().validSquare(
                new int[] {2,2}, new int[] {8,2}, new int[] {2,6}, new int[] {8,6}));
    }

    @Test
    public void test06() {
        Assert.assertFalse(new ValidSquare().validSquare(
                new int[] {2,3}, new int[] {6,1}, new int[] {5,6}, new int[] {7,5}));
    }

    @Test
    public void test07() {
        Assert.assertTrue(new ValidSquare().validSquare(
                new int[] {1,0}, new int[] {0,1}, new int[] {-1,0}, new int[] {0,-1}));
    }

    @Test
    public void test08() {
        Assert.assertFalse(new ValidSquare().validSquare(
                new int[] {0,0}, new int[] {1,1}, new int[] {1,1}, new int[] {0,1}));
    }

    @Test
    public void test09() {
        Assert.assertFalse(new ValidSquare().validSquare(
                new int[] {0,1}, new int[] {1,1}, new int[] {1,0}, new int[] {0,1}));
    }

    @Test
    public void test10() {
        Assert.assertFalse(new ValidSquare().validSquare(
                new int[] {0,0}, new int[] {0,0}, new int[] {1,0}, new int[] {1,1}));
    }

    @Test
    public void test11() {
        Assert.assertFalse(new ValidSquare().validSquare(
                new int[] {0,0}, new int[] {0,1}, new int[] {1,0}, new int[] {1,0}));
    }
}
