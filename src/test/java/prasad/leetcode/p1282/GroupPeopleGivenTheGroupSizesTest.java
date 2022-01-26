package prasad.leetcode.p1282;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

public class GroupPeopleGivenTheGroupSizesTest {

    @Test
    public void test01() {
        List<List<Integer>> groups = new GroupPeopleGivenTheGroupSizes().groupThePeople(new int[] {3,3,3,3,3,1,3});
        Assert.assertEquals(3, groups.size());
        for (List<Integer> g : groups) {
            if (g.size() == 1) {
                Assert.assertEquals(5, g.get(0).intValue());
            }
            else {
                Assert.assertEquals(3, g.size());
            }
        }
    }

    @Test
    public void test02() {
        List<List<Integer>> groups = new GroupPeopleGivenTheGroupSizes().groupThePeople(new int[] {2,1,3,3,3,2});
        Assert.assertEquals(3, groups.size());
        for (List<Integer> g : groups) {
            if (g.size() == 1) {
                Assert.assertEquals(1, g.get(0).intValue());
            }
            else if (g.size() == 2) {
                Assert.assertTrue(g.containsAll(Arrays.asList(0, 5)));
            }
            else {
                Assert.assertEquals(3, g.size());
                Assert.assertTrue(g.containsAll(Arrays.asList(2, 3, 4)));
            }
        }
    }

    @Test
    public void test03() {
        List<List<Integer>> groups = new GroupPeopleGivenTheGroupSizes().groupThePeople(new int[] {1});
        Assert.assertEquals(1, groups.size());
        Assert.assertEquals(1, groups.get(0).size());
        Assert.assertEquals(0, groups.get(0).get(0).intValue());
    }

    @Test
    public void test04() {
        List<List<Integer>> groups = new GroupPeopleGivenTheGroupSizes().groupThePeople(new int[] {1,1,1});
        Assert.assertEquals(3, groups.size());
        Assert.assertEquals(1, groups.get(0).size());
        Assert.assertEquals(1, groups.get(1).size());
        Assert.assertEquals(1, groups.get(2).size());
    }

    @Test
    public void test05() {
        List<List<Integer>> groups = new GroupPeopleGivenTheGroupSizes().groupThePeople(new int[] {4,4,4,4});
        Assert.assertEquals(1, groups.size());
        Assert.assertEquals(4, groups.get(0).size());
        Assert.assertTrue(groups.get(0).containsAll(Arrays.asList(0,1,2,3)));
    }
}
