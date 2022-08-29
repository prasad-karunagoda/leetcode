package prasad.leetcode.p1701;

import org.junit.Assert;
import org.junit.Test;

public class AverageWaitingTimeTest {

    @Test
    public void test01() {
        double averageWaitingTime = new AverageWaitingTime().averageWaitingTime(
                new int[][] {{1,2},{2,5},{4,3}});
        Assert.assertEquals(5.0, averageWaitingTime, 0.00001);
    }

    @Test
    public void test02() {
        double averageWaitingTime = new AverageWaitingTime().averageWaitingTime(
                new int[][] {{5,2},{5,4},{10,3},{20,1}});
        Assert.assertEquals(3.25, averageWaitingTime, 0.00001);
    }

    @Test
    public void test03() {
        double averageWaitingTime = new AverageWaitingTime().averageWaitingTime(
                new int[][] {{5,8}});
        Assert.assertEquals(8.0, averageWaitingTime, 0.00001);
    }

    @Test
    public void test04() {
        double averageWaitingTime = new AverageWaitingTime().averageWaitingTime(
                new int[][] {{5,2},{5,4},{10,3},{14,2}});
        Assert.assertEquals(3.5, averageWaitingTime, 0.00001);
    }
}
