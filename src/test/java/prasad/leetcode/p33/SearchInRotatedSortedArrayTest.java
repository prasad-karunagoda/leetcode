package prasad.leetcode.p33;

import org.junit.Assert;
import org.junit.Test;

public class SearchInRotatedSortedArrayTest {

    @Test
    public void test01() {
        Assert.assertEquals(4, new SearchInRotatedSortedArray().search(new int[] {4,5,6,7,0,1,2}, 0));
    }

    @Test
    public void test02() {
        Assert.assertEquals(-1, new SearchInRotatedSortedArray().search(new int[] {4,5,6,7,0,1,2}, 3));
    }

    @Test
    public void test03() {
        Assert.assertEquals(-1, new SearchInRotatedSortedArray().search(new int[] {1}, 0));
    }

    @Test
    public void test04() {
        Assert.assertEquals(4, new SearchInRotatedSortedArray().search(new int[] {6,8,13,2,5}, 5));
    }

    @Test
    public void test05() {
        Assert.assertEquals(0, new SearchInRotatedSortedArray().search(new int[] {6,8,13,2,5}, 6));
    }

    @Test
    public void test06() {
        Assert.assertEquals(0, new SearchInRotatedSortedArray().search(new int[] {5}, 5));
    }

    @Test
    public void test07() {
        Assert.assertEquals(0, new SearchInRotatedSortedArray().search(new int[] {3,6,8,11,15,17}, 3));
    }

    @Test
    public void test08() {
        Assert.assertEquals(5, new SearchInRotatedSortedArray().search(new int[] {3,6,8,11,15,17}, 17));
    }

    @Test
    public void test09() {
        Assert.assertEquals(3, new SearchInRotatedSortedArray().search(new int[] {3,6,8,11,15,17}, 11));
    }

    @Test
    public void test10() {
        Assert.assertEquals(-1, new SearchInRotatedSortedArray().search(new int[] {3,6,8,11,15,17}, 5));
    }
}
