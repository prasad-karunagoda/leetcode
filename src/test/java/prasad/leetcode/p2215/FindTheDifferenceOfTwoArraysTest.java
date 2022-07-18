package prasad.leetcode.p2215;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class FindTheDifferenceOfTwoArraysTest {

    @Test
    public void test01() {
        List<List<Integer>> result = new FindTheDifferenceOfTwoArrays().findDifference(new int[] {1,2,3}, new int[] {2,4,6});
        Assert.assertEquals(Arrays.asList(1,3), result.get(0));
        Assert.assertEquals(Arrays.asList(4,6), result.get(1));
    }

    @Test
    public void test02() {
        List<List<Integer>> result = new FindTheDifferenceOfTwoArrays().findDifference(new int[] {1,2,3,3}, new int[] {1,1,2,2});
        Assert.assertEquals(Collections.singletonList(3), result.get(0));
        Assert.assertEquals(Collections.emptyList(), result.get(1));
    }

    @Test
    public void test03() {
        List<List<Integer>> result = new FindTheDifferenceOfTwoArrays().findDifference(new int[] {5}, new int[] {5});
        Assert.assertEquals(Collections.emptyList(), result.get(0));
        Assert.assertEquals(Collections.emptyList(), result.get(1));
    }

    @Test
    public void test04() {
        List<List<Integer>> result = new FindTheDifferenceOfTwoArrays().findDifference(new int[] {1,2}, new int[] {3,4});
        Assert.assertEquals(Arrays.asList(1,2), result.get(0));
        Assert.assertEquals(Arrays.asList(3,4), result.get(1));
    }
}
