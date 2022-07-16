package prasad.leetcode.p1481;

import org.junit.Assert;
import org.junit.Test;

public class LeastNumberOfUniqueIntegersTest {

    @Test
    public void test01() {
        Assert.assertEquals(1, new LeastNumberOfUniqueIntegers().findLeastNumOfUniqueInts(
                new int[] {5,5,4}, 1));
    }

    @Test
    public void test02() {
        Assert.assertEquals(2, new LeastNumberOfUniqueIntegers().findLeastNumOfUniqueInts(
                new int[] {4,3,1,1,3,3,2}, 3));
    }

    @Test
    public void test03() {
        Assert.assertEquals(0, new LeastNumberOfUniqueIntegers().findLeastNumOfUniqueInts(
                new int[] {5}, 1));
    }

    @Test
    public void test04() {
        Assert.assertEquals(1, new LeastNumberOfUniqueIntegers().findLeastNumOfUniqueInts(
                new int[] {5,5}, 1));
    }

    @Test
    public void test05() {
        Assert.assertEquals(1, new LeastNumberOfUniqueIntegers().findLeastNumOfUniqueInts(
                new int[] {5}, 0));
    }
}
