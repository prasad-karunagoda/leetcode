package prasad.leetcode.p347;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;

public class TopKFrequentElementsTest {

    @Test
    public void test01() {
        int[] result = new TopKFrequentElements().topKFrequent(new int[] {1,1,1,2,2,3}, 2);
        Arrays.sort(result);
        Assert.assertArrayEquals(new int[] {1,2}, result);
    }

    @Test
    public void test02() {
        int[] result = new TopKFrequentElements().topKFrequent(new int[] {1}, 1);
        Assert.assertArrayEquals(new int[] {1}, result);
    }

    @Test
    public void test03() {
        int[] result = new TopKFrequentElements().topKFrequent(new int[] {1,3,2,1,4,4,2,4,3,2}, 2);
        Arrays.sort(result);
        Assert.assertArrayEquals(new int[] {2,4}, result);
    }

    @Test
    public void test04() {
        int[] result = new TopKFrequentElements().topKFrequent(new int[] {5,3,2,1,4,4,2,4,3}, 1);
        Assert.assertArrayEquals(new int[] {4}, result);
    }
}
