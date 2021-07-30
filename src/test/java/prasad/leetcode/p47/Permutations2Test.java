package prasad.leetcode.p47;

import org.junit.Assert;
import org.junit.Test;

import java.util.List;

public class Permutations2Test {

    @Test
    public void test01() {
        List<List<Integer>> permutations = new Permutations2().permuteUnique(new int[] {5});
        Assert.assertEquals(1, permutations.size());
        Assert.assertEquals(1, permutations.get(0).size());
        Assert.assertEquals(5, permutations.get(0).get(0).intValue());
    }

    @Test
    public void test02() {
        List<List<Integer>> permutations = new Permutations2().permuteUnique(new int[] {3,5});
        Assert.assertEquals(2, permutations.size());
        Assert.assertEquals(2, permutations.get(0).size());
        Assert.assertEquals(2, permutations.get(1).size());
        for (List<Integer> p : permutations) {
            Assert.assertTrue((p.get(0) == 3 && p.get(1) == 5) || (p.get(0) == 5 && p.get(1) == 3));
        }
    }

    @Test
    public void test03() {
        List<List<Integer>> permutations = new Permutations2().permuteUnique(new int[] {1,3,5});
        Assert.assertEquals(6, permutations.size());
    }

    @Test
    public void test04() {
        List<List<Integer>> permutations = new Permutations2().permuteUnique(new int[] {1,1,2});
        Assert.assertEquals(3, permutations.size());
    }

    @Test
    public void test05() {
        List<List<Integer>> permutations = new Permutations2().permuteUnique(new int[] {2,2,2});
        Assert.assertEquals(1, permutations.size());
        Assert.assertEquals(3, permutations.get(0).size());
        Assert.assertEquals(2, permutations.get(0).get(0).intValue());
        Assert.assertEquals(2, permutations.get(0).get(1).intValue());
        Assert.assertEquals(2, permutations.get(0).get(2).intValue());
    }
}
