package prasad.leetcode.p1344;

import org.junit.Assert;
import org.junit.Test;

public class AngleBetweenHandsOfClockTest {

    @Test
    public void test01() {
        Assert.assertEquals(165, new AngleBetweenHandsOfClock().angleClock(12, 30), 0.00001);
    }

    @Test
    public void test02() {
        Assert.assertEquals(75, new AngleBetweenHandsOfClock().angleClock(3, 30), 0.00001);
    }

    @Test
    public void test03() {
        Assert.assertEquals(7.5, new AngleBetweenHandsOfClock().angleClock(3, 15), 0.00001);
    }

    @Test
    public void test04() {
        Assert.assertEquals(142.5, new AngleBetweenHandsOfClock().angleClock(1, 45), 0.00001);
    }

    @Test
    public void test05() {
        Assert.assertEquals(0, new AngleBetweenHandsOfClock().angleClock(12, 0), 0.00001);
    }
}
