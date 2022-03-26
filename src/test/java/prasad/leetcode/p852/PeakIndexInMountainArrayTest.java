package prasad.leetcode.p852;

import org.junit.Assert;
import org.junit.Test;

public class PeakIndexInMountainArrayTest {

    @Test
    public void test01() {
        Assert.assertEquals(1, new PeakIndexInMountainArray().peakIndexInMountainArray(new int[] {0,1,0}));
    }

    @Test
    public void test02() {
        Assert.assertEquals(1, new PeakIndexInMountainArray().peakIndexInMountainArray(new int[] {0,2,1,0}));
    }

    @Test
    public void test03() {
        Assert.assertEquals(1, new PeakIndexInMountainArray().peakIndexInMountainArray(new int[] {0,10,5,2}));
    }

    @Test
    public void test04() {
        Assert.assertEquals(2, new PeakIndexInMountainArray().peakIndexInMountainArray(new int[] {4,7,8,3}));
    }

    @Test(expected = IllegalArgumentException.class)
    public void test05() {
        new PeakIndexInMountainArray().peakIndexInMountainArray(new int[] {4,7,8,12});
    }
}
