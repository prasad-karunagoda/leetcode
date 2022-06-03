package prasad.leetcode.p2013;

import org.junit.Assert;
import org.junit.Test;

public class DetectSquaresTest {

    @Test
    public void test01() {
        DetectSquares detectSquares = new DetectSquares();
        detectSquares.add(new int[] {3, 10});
        detectSquares.add(new int[] {11, 2});
        detectSquares.add(new int[] {3, 2});
        Assert.assertEquals(1, detectSquares.count(new int[] {11, 10}));
        Assert.assertEquals(0, detectSquares.count(new int[] {14, 8}));
        detectSquares.add(new int[] {11, 2});
        Assert.assertEquals(2, detectSquares.count(new int[] {11, 10}));
        detectSquares.add(new int[] {19, 10});
        detectSquares.add(new int[] {11, 18});
        detectSquares.add(new int[] {19, 18});
        Assert.assertEquals(3, detectSquares.count(new int[] {11, 10}));
        detectSquares.add(new int[] {3, 10});
        Assert.assertEquals(5, detectSquares.count(new int[] {11, 10}));
        detectSquares.add(new int[] {3, 10});
        Assert.assertEquals(7, detectSquares.count(new int[] {11, 10}));
    }

    @Test
    public void test02() {
        DetectSquares detectSquares = new DetectSquares();
        detectSquares.add(new int[] {3, 10});
        Assert.assertEquals(0, detectSquares.count(new int[] {11, 10}));
    }

    @Test
    public void test03() {
        DetectSquares detectSquares = new DetectSquares();
        Assert.assertEquals(0, detectSquares.count(new int[] {11, 10}));
    }
}
