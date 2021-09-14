package prasad.leetcode.p78;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class SubsetsTest {

    @Test
    public void test01() {
        List<List<Integer>> subsets = new Subsets().subsets(new int[] {5});
        Assert.assertEquals(2, subsets.size());
        Assert.assertTrue(subsets.contains(Collections.emptyList()));
        Assert.assertTrue(subsets.contains(Collections.singletonList(5)));
    }

    @Test
    public void test02() {
        List<List<Integer>> lists = new Subsets().subsets(new int[] {5, 7});
        Assert.assertEquals(4, lists.size());

        Set<Set<Integer>> sets = convertToSets(lists);
        Assert.assertTrue(sets.contains(Collections.emptySet()));
        Assert.assertTrue(sets.contains(Collections.singleton(5)));
        Assert.assertTrue(sets.contains(Collections.singleton(7)));
        Assert.assertTrue(sets.contains(new HashSet<>(Arrays.asList(5, 7))));
    }

    @Test
    public void test03() {
        List<List<Integer>> lists = new Subsets().subsets(new int[] {5, 7, 8});
        Assert.assertEquals(8, lists.size());

        Set<Set<Integer>> sets = convertToSets(lists);
        Assert.assertTrue(sets.contains(Collections.emptySet()));
        Assert.assertTrue(sets.contains(Collections.singleton(5)));
        Assert.assertTrue(sets.contains(Collections.singleton(7)));
        Assert.assertTrue(sets.contains(Collections.singleton(8)));
        Assert.assertTrue(sets.contains(new HashSet<>(Arrays.asList(5, 7))));
        Assert.assertTrue(sets.contains(new HashSet<>(Arrays.asList(5, 8))));
        Assert.assertTrue(sets.contains(new HashSet<>(Arrays.asList(7, 8))));
        Assert.assertTrue(sets.contains(new HashSet<>(Arrays.asList(5, 7, 8))));
    }

    private Set<Set<Integer>> convertToSets(List<List<Integer>> lists) {
        Set<Set<Integer>> sets = new HashSet<>();
        for (List<Integer> list : lists) {
            sets.add(new HashSet<>(list));
        }
        return sets;
    }
}
