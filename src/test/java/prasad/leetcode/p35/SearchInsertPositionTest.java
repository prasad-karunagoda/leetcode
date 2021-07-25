package prasad.leetcode.p35;

import org.junit.Assert;
import org.junit.Test;

public class SearchInsertPositionTest {

    @Test
    public void test01() {
        Assert.assertEquals(2, new SearchInsertPosition().searchInsert(new int[] {1,3,5,6}, 5));
    }

    @Test
    public void test02() {
        Assert.assertEquals(1, new SearchInsertPosition().searchInsert(new int[] {1,3,5,6}, 2));
    }

    @Test
    public void test03() {
        Assert.assertEquals(4, new SearchInsertPosition().searchInsert(new int[] {1,3,5,6}, 7));
    }

    @Test
    public void test04() {
        Assert.assertEquals(0, new SearchInsertPosition().searchInsert(new int[] {1,3,5,6}, 0));
    }

    @Test
    public void test05() {
        Assert.assertEquals(0, new SearchInsertPosition().searchInsert(new int[] {1}, 0));
    }

    @Test(expected = IllegalArgumentException.class)
    public void test06() {
        new SearchInsertPosition().searchInsert(new int[0], 5);
    }

    @Test
    public void test07() {
        Assert.assertEquals(0, new SearchInsertPosition().searchInsert(new int[] {5}, 5));
    }

    @Test
    public void test08() {
        Assert.assertEquals(1, new SearchInsertPosition().searchInsert(new int[] {5}, 7));
    }

    @Test
    public void test09() {
        Assert.assertEquals(0, new SearchInsertPosition().searchInsert(new int[] {1,3,5,6}, 1));
    }

    @Test
    public void test10() {
        Assert.assertEquals(3, new SearchInsertPosition().searchInsert(new int[] {1,3,5,6}, 6));
    }

    @Test
    public void test11() {
        Assert.assertEquals(1, new SearchInsertPosition().searchInsert(new int[] {1,3}, 2));
    }
}
