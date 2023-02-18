package prasad.leetcode.p1742;

import org.junit.Assert;
import org.junit.Test;

public class MaxNumberOfBallsInBoxTest {

    @Test
    public void test01() {
        Assert.assertEquals(2, new MaxNumberOfBallsInBox().countBalls(1, 10));
    }

    @Test
    public void test02() {
        Assert.assertEquals(2, new MaxNumberOfBallsInBox().countBalls(5, 15));
    }

    @Test
    public void test03() {
        Assert.assertEquals(2, new MaxNumberOfBallsInBox().countBalls(19, 28));
    }

    @Test
    public void test04() {
        Assert.assertEquals(1, new MaxNumberOfBallsInBox().countBalls(99_998, 100_000));
    }

    @Test
    public void testTime() {
        long start = System.currentTimeMillis();
        new MaxNumberOfBallsInBox().countBalls(1, 100_000);
        System.out.println("Time = " + (System.currentTimeMillis() - start) + " ms");
    }
}
