package prasad.leetcode.p2089;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class FindTargetIndicesAfterSortingArrayTest {

    @Test
    public void test01() {
        List<Integer> result = new FindTargetIndicesAfterSortingArray().targetIndices(new int[] {1,2,5,2,3}, 2);
        Assert.assertEquals(Arrays.asList(1,2), result);
    }

    @Test
    public void test02() {
        List<Integer> result = new FindTargetIndicesAfterSortingArray().targetIndices(new int[] {1,2,5,2,3}, 3);
        Assert.assertEquals(Collections.singletonList(3), result);
    }

    @Test
    public void test03() {
        List<Integer> result = new FindTargetIndicesAfterSortingArray().targetIndices(new int[] {1,2,5,2,3}, 5);
        Assert.assertEquals(Collections.singletonList(4), result);
    }

    @Test
    public void test04() {
        List<Integer> result = new FindTargetIndicesAfterSortingArray().targetIndices(new int[] {1,2,5,2,3}, 17);
        Assert.assertEquals(Collections.emptyList(), result);
    }

    @Test
    public void test05() {
        List<Integer> result = new FindTargetIndicesAfterSortingArray().targetIndices(new int[] {2,5,2,3}, 2);
        Assert.assertEquals(Arrays.asList(0,1), result);
    }

    @Test
    public void test06() {
        List<Integer> result = new FindTargetIndicesAfterSortingArray().targetIndices(new int[] {5}, 5);
        Assert.assertEquals(Collections.singletonList(0), result);
    }
}
