package prasad.leetcode.p797;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

public class AllPathsFromSourceToTargetTest {

    @Test
    public void test01() {
        List<List<Integer>> result = new AllPathsFromSourceToTarget().allPathsSourceTarget(new int[][] {{1,2},{3},{3},{}});
        Assert.assertEquals(2, result.size());
        Assert.assertTrue(result.contains(Arrays.asList(0,1,3)));
        Assert.assertTrue(result.contains(Arrays.asList(0,2,3)));
    }

    @Test
    public void test02() {
        List<List<Integer>> result = new AllPathsFromSourceToTarget().allPathsSourceTarget(new int[][] {{4,3,1},{3,2,4},{3},{4},{}});
        Assert.assertEquals(5, result.size());
        Assert.assertTrue(result.contains(Arrays.asList(0,4)));
        Assert.assertTrue(result.contains(Arrays.asList(0,3,4)));
        Assert.assertTrue(result.contains(Arrays.asList(0,1,3,4)));
        Assert.assertTrue(result.contains(Arrays.asList(0,1,2,3,4)));
        Assert.assertTrue(result.contains(Arrays.asList(0,1,4)));
    }

    @Test
    public void test03() {
        List<List<Integer>> result = new AllPathsFromSourceToTarget().allPathsSourceTarget(new int[][] {{1},{2},{}});
        Assert.assertEquals(1, result.size());
        Assert.assertEquals(Arrays.asList(0,1,2), result.get(0));
    }

    @Test
    public void test04() {
        List<List<Integer>> result = new AllPathsFromSourceToTarget().allPathsSourceTarget(new int[][] {{},{0}});
        Assert.assertEquals(0, result.size());
    }
}
