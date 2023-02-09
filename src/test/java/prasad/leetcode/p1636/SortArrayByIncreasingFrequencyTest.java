package prasad.leetcode.p1636;

import org.junit.Assert;
import org.junit.Test;

public class SortArrayByIncreasingFrequencyTest {

    @Test
    public void test01() {
        int[] result = new SortArrayByIncreasingFrequency().frequencySort(new int[] {1,1,2,2,2,3});
        Assert.assertArrayEquals(new int[] {3,1,1,2,2,2}, result);
    }

    @Test
    public void test02() {
        int[] result = new SortArrayByIncreasingFrequency().frequencySort(new int[] {2,3,1,3,2});
        Assert.assertArrayEquals(new int[] {1,3,3,2,2}, result);
    }

    @Test
    public void test03() {
        int[] result = new SortArrayByIncreasingFrequency().frequencySort(new int[] {-1,1,-6,4,5,-6,1,4,1});
        Assert.assertArrayEquals(new int[] {5,-1,4,4,-6,-6,1,1,1}, result);
    }

    @Test
    public void test04() {
        int[] result = new SortArrayByIncreasingFrequency().frequencySort(new int[] {5});
        Assert.assertArrayEquals(new int[] {5}, result);
    }

    @Test
    public void test05() {
        int[] result = new SortArrayByIncreasingFrequency().frequencySort(new int[] {-100,100,-100,50,50});
        Assert.assertArrayEquals(new int[] {100,50,50,-100,-100}, result);
    }
}
