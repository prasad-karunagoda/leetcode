package prasad.leetcode.p697;

import org.junit.Assert;
import org.junit.Test;

public class DegreeOfArrayTest {

    @Test
    public void test01() {
        Assert.assertEquals(2, new DegreeOfArray().findShortestSubArray(new int[] {1,2,2,3,1}));
    }

    @Test
    public void test02() {
        Assert.assertEquals(6, new DegreeOfArray().findShortestSubArray(new int[] {1,2,2,3,1,4,2}));
    }

    @Test
    public void test03() {
        Assert.assertEquals(2, new DegreeOfArray().findShortestSubArray(new int[] {1,2,2,3,3,1}));
    }

    @Test
    public void test04() {
        Assert.assertEquals(1, new DegreeOfArray().findShortestSubArray(new int[] {5}));
    }

    @Test
    public void test05() {
        Assert.assertEquals(6, new DegreeOfArray().findShortestSubArray(new int[] {4,3,1,3,2,2,3,5}));
    }
}
