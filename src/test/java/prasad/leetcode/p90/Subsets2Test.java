package prasad.leetcode.p90;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Subsets2Test {

    @Test
    public void test01() {
        List<List<Integer>> lists = new Subsets2().subsetsWithDup(new int[] {1, 2, 2});
        Assert.assertEquals(6, lists.size());

        Set<Set<Integer>> sets = convertToSets(lists);
        Assert.assertTrue(sets.contains(Collections.emptySet()));
        Assert.assertTrue(sets.contains(Collections.singleton(1)));
        Assert.assertTrue(sets.contains(Collections.singleton(2)));
        Assert.assertTrue(sets.contains(new HashSet<>(Arrays.asList(1, 2))));
        Assert.assertTrue(sets.contains(new HashSet<>(Arrays.asList(2, 2))));
        Assert.assertTrue(sets.contains(new HashSet<>(Arrays.asList(1, 2, 2))));
    }

    @Test
    public void test02() {
        List<List<Integer>> lists = new Subsets2().subsetsWithDup(new int[] {3, 3});
        Assert.assertEquals(3, lists.size());

        Set<Set<Integer>> sets = convertToSets(lists);
        Assert.assertTrue(sets.contains(Collections.emptySet()));
        Assert.assertTrue(sets.contains(Collections.singleton(3)));
        Assert.assertTrue(sets.contains(new HashSet<>(Arrays.asList(3, 3))));
    }

    @Test
    public void test03() {
        List<List<Integer>> lists = new Subsets2().subsetsWithDup(new int[] {5});
        Assert.assertEquals(2, lists.size());

        Set<Set<Integer>> sets = convertToSets(lists);
        Assert.assertTrue(sets.contains(Collections.emptySet()));
        Assert.assertTrue(sets.contains(Collections.singleton(5)));
    }

    private Set<Set<Integer>> convertToSets(List<List<Integer>> lists) {
        Set<Set<Integer>> sets = new HashSet<>();
        for (List<Integer> list : lists) {
            sets.add(new HashSet<>(list));
        }
        return sets;
    }
}
