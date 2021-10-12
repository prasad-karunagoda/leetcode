package prasad.leetcode.p599;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;

public class MinimumIndexSumOfTwoListsTest {

    @Test
    public void test01() {
        String[] common = new MinimumIndexSumOfTwoLists().findRestaurant(
                new String[] {"Shogun","Tapioca Express","Burger King","KFC"},
                new String[] {"Piatti","The Grill at Torrey Pines","Hungry Hunter Steakhouse","Shogun"});
        Assert.assertEquals(1, common.length);
        Assert.assertEquals("Shogun", common[0]);
    }

    @Test
    public void test02() {
        String[] common = new MinimumIndexSumOfTwoLists().findRestaurant(
                new String[] {"Shogun","Tapioca Express","Burger King","KFC"},
                new String[] {"KFC","Shogun","Burger King"});
        Assert.assertEquals(1, common.length);
        Assert.assertEquals("Shogun", common[0]);
    }

    @Test
    public void test03() {
        String[] common = new MinimumIndexSumOfTwoLists().findRestaurant(
                new String[] {"Shogun","Tapioca Express","Burger King","KFC"},
                new String[] {"KFC","Burger King","Tapioca Express","Shogun"});
        Assert.assertEquals(4, common.length);
        Assert.assertTrue(Arrays.asList(common).contains("KFC"));
        Assert.assertTrue(Arrays.asList(common).contains("Burger King"));
        Assert.assertTrue(Arrays.asList(common).contains("Tapioca Express"));
        Assert.assertTrue(Arrays.asList(common).contains("Shogun"));
    }

    @Test
    public void test04() {
        String[] common = new MinimumIndexSumOfTwoLists().findRestaurant(
                new String[] {"Shogun","Tapioca Express","Burger King","KFC"},
                new String[] {"KNN","KFC","Burger King","Tapioca Express","Shogun"});
        Assert.assertEquals(4, common.length);
        Assert.assertTrue(Arrays.asList(common).contains("KFC"));
        Assert.assertTrue(Arrays.asList(common).contains("Burger King"));
        Assert.assertTrue(Arrays.asList(common).contains("Tapioca Express"));
        Assert.assertTrue(Arrays.asList(common).contains("Shogun"));
    }

    @Test
    public void test05() {
        String[] common = new MinimumIndexSumOfTwoLists().findRestaurant(
                new String[] {"KFC"},
                new String[] {"KFC"});
        Assert.assertEquals(1, common.length);
        Assert.assertEquals("KFC", common[0]);
    }

    @Test
    public void testNoCommon() {
        String[] common = new MinimumIndexSumOfTwoLists().findRestaurant(
                new String[] {"Shogun","Tapioca Express"},
                new String[] {"Piatti","The Grill at Torrey Pines"});
        Assert.assertEquals(0, common.length);
    }
}
