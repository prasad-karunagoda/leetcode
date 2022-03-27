package prasad.leetcode.p2155;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

public class AllDivisionsWithHighestScoreTest {

    @Test
    public void test01() {
        List<Integer> result = new AllDivisionsWithHighestScore().maxScoreIndices(new int[] {0,0,1,0});
        Assert.assertEquals(2, result.size());
        Assert.assertTrue(result.containsAll(Arrays.asList(2,4)));
    }

    @Test
    public void test02() {
        List<Integer> result = new AllDivisionsWithHighestScore().maxScoreIndices(new int[] {0,0,0});
        Assert.assertEquals(1, result.size());
        Assert.assertEquals(3, result.get(0).intValue());
    }

    @Test
    public void test03() {
        List<Integer> result = new AllDivisionsWithHighestScore().maxScoreIndices(new int[] {1,1});
        Assert.assertEquals(1, result.size());
        Assert.assertEquals(0, result.get(0).intValue());
    }

    @Test
    public void test04() {
        List<Integer> result = new AllDivisionsWithHighestScore().maxScoreIndices(new int[] {0,1,1,0,1,0,0,1});
        Assert.assertEquals(2, result.size());
        Assert.assertTrue(result.containsAll(Arrays.asList(1,7)));
    }

    @Test
    public void test05() {
        List<Integer> result = new AllDivisionsWithHighestScore().maxScoreIndices(new int[] {1});
        Assert.assertEquals(1, result.size());
        Assert.assertEquals(0, result.get(0).intValue());
    }

    @Test
    public void test06() {
        List<Integer> result = new AllDivisionsWithHighestScore().maxScoreIndices(new int[] {0});
        Assert.assertEquals(1, result.size());
        Assert.assertEquals(1, result.get(0).intValue());
    }
}
