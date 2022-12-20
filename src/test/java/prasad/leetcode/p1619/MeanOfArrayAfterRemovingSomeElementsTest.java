package prasad.leetcode.p1619;

import org.junit.Assert;
import org.junit.Test;

public class MeanOfArrayAfterRemovingSomeElementsTest {

    @Test
    public void test01() {
        double mean = new MeanOfArrayAfterRemovingSomeElements().trimMean(
                new int[] {1,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,3});
        Assert.assertEquals(2.0, mean, 0.00001);
    }

    @Test
    public void test02() {
        double mean = new MeanOfArrayAfterRemovingSomeElements().trimMean(
                new int[] {6,2,7,5,1,2,0,3,10,2,5,0,5,5,0,8,7,6,8,0});
        Assert.assertEquals(4.0, mean, 0.00001);
    }

    @Test
    public void test03() {
        double mean = new MeanOfArrayAfterRemovingSomeElements().trimMean(
                new int[] {6,0,7,0,7,5,7,8,3,4,0,7,8,1,6,8,1,1,2,4,8,1,9,5,4,3,8,5,10,8,6,6,1,0,6,10,8,2,3,4});
        Assert.assertEquals(4.77778, mean, 0.00001);
    }

    @Test
    public void test04() {
        double mean = new MeanOfArrayAfterRemovingSomeElements().trimMean(
                new int[] {1,1,1,1,1,2,2,2,2,2,2,2,1,1,1,1,1,1,1,1});
        Assert.assertEquals(1.33333, mean, 0.00001);
    }
}
