package prasad.leetcode.p1093;

import org.junit.Assert;
import org.junit.Test;

public class StatisticsFromLargeSampleTest {

    @Test
    public void test01() {
        int[] count = new int[] {
                0,1,3,4,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,
                0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,
                0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,
                0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,
                0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,
                0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,
                0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,
                0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,
                0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,
                0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,
                0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,
                0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,
                0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0};
        double[] stats = new StatisticsFromLargeSample().sampleStats(count);
        Assert.assertEquals(1.0, stats[0], 0.00001);
        Assert.assertEquals(3.0, stats[1], 0.00001);
        Assert.assertEquals(2.375, stats[2], 0.00001);
        Assert.assertEquals(2.5, stats[3], 0.00001);
        Assert.assertEquals(3.0, stats[4], 0.00001);
    }

    @Test
    public void test02() {
        int[] count = new int[] {
                0,4,3,2,2,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,
                0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,
                0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,
                0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,
                0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,
                0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,
                0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,
                0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,
                0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,
                0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,
                0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,
                0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,
                0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0};
        double[] stats = new StatisticsFromLargeSample().sampleStats(count);
        Assert.assertEquals(1.0, stats[0], 0.00001);
        Assert.assertEquals(4.0, stats[1], 0.00001);
        Assert.assertEquals(2.18182, stats[2], 0.00001);
        Assert.assertEquals(2.0, stats[3], 0.00001);
        Assert.assertEquals(1.0, stats[4], 0.00001);
    }

    @Test
    public void test03() {
        int[] count = new int[] {
                0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,
                0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,
                0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,
                0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,
                0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,
                0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,
                3,5,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,
                0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,
                0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,
                0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,
                0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,
                0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,
                0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0};
        double[] stats = new StatisticsFromLargeSample().sampleStats(count);
        Assert.assertEquals(120.0, stats[0], 0.00001);
        Assert.assertEquals(121.0, stats[1], 0.00001);
        Assert.assertEquals(120.625, stats[2], 0.00001);
        Assert.assertEquals(121.0, stats[3], 0.00001);
        Assert.assertEquals(121.0, stats[4], 0.00001);
    }

    @Test
    public void test04() {
        int[] count = new int[] {
                3,1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,
                0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,
                0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,
                0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,
                0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,
                0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,
                0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,
                0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,
                0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,
                0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,
                0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,
                0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,
                0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0};
        double[] stats = new StatisticsFromLargeSample().sampleStats(count);
        Assert.assertEquals(0.0, stats[0], 0.00001);
        Assert.assertEquals(1.0, stats[1], 0.00001);
        Assert.assertEquals(0.25, stats[2], 0.00001);
        Assert.assertEquals(0.0, stats[3], 0.00001);
        Assert.assertEquals(0.0, stats[4], 0.00001);
    }

    @Test
    public void test05() {
        int[] count = new int[] {
                0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,
                0,0,0,0,0,0,0,0,0,0,0,0,3510,0,0,0,0,0,0,0,
                0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,
                0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,
                0,0,0,0,0,0,0,6718,0,0,0,0,0,0,0,0,0,0,0,0,
                0,0,0,0,0,27870,0,0,0,0,0,0,0,0,0,0,0,1,0,0,
                0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,
                0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,
                0,0,0,0,0,0,0,0,0,0,35,0,0,0,0,0,0,0,0,0,
                0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,
                0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,
                0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,26256,0,
                0,0,0,9586565,0,0,0,0,0,0,0,2333,0,0,0,0};
        double[] stats = new StatisticsFromLargeSample().sampleStats(count);
        Assert.assertEquals(32.0, stats[0], 0.00001);
        Assert.assertEquals(251.0, stats[1], 0.00001);
        Assert.assertEquals(242.40435, stats[2], 0.00001);
        Assert.assertEquals(243.0, stats[3], 0.00001);
        Assert.assertEquals(243.0, stats[4], 0.00001);
    }

    @Test
    public void testGetNumber() {
        int[] count = new int[] {2,2,3,3,3};
        Assert.assertEquals(0, new StatisticsFromLargeSample().getNumber(count, 0));
        Assert.assertEquals(0, new StatisticsFromLargeSample().getNumber(count, 1));
        Assert.assertEquals(1, new StatisticsFromLargeSample().getNumber(count, 2));
        Assert.assertEquals(2, new StatisticsFromLargeSample().getNumber(count, 4));
        Assert.assertEquals(2, new StatisticsFromLargeSample().getNumber(count, 6));
        Assert.assertEquals(3, new StatisticsFromLargeSample().getNumber(count, 7));
        Assert.assertEquals(4, new StatisticsFromLargeSample().getNumber(count, 12));
    }
}
