package prasad.leetcode.p704;

import org.junit.Assert;
import org.junit.Test;

public class BinarySearchTest {

    @Test
    public void test01() {
        Assert.assertEquals(4, new BinarySearch().search(new int[]{-1, 0, 3, 5, 9, 12}, 9));
    }

    @Test
    public void test02() {
        Assert.assertEquals(-1, new BinarySearch().search(new int[]{-1, 0, 3, 5, 9, 12}, 2));
    }

    @Test
    public void test03() {
        Assert.assertEquals(0, new BinarySearch().search(new int[]{5}, 5));
    }

    @Test
    public void test04() {
        Assert.assertEquals(-1, new BinarySearch().search(new int[]{5}, 3));
    }

    @Test
    public void test05() {
        Assert.assertEquals(-1, new BinarySearch().search(new int[]{5}, 7));
    }

    @Test
    public void test06() {
        Assert.assertEquals(0, new BinarySearch().search(new int[]{5, 7}, 5));
    }

    @Test
    public void test07() {
        Assert.assertEquals(1, new BinarySearch().search(new int[]{5, 7}, 7));
    }

    @Test
    public void test08() {
        Assert.assertEquals(-1, new BinarySearch().search(new int[]{5, 7}, 6));
    }

    @Test
    public void test09() {
        Assert.assertEquals(-1, new BinarySearch().search(new int[]{5, 7}, 4));
    }

    @Test
    public void test10() {
        Assert.assertEquals(-1, new BinarySearch().search(new int[]{5, 7}, 8));
    }

    @Test
    public void test11() {
        Assert.assertEquals(9, new BinarySearch().search(new int[]{-4,-1,0,3,6,8,9,12,14,15,17,21,23}, 15));
    }

    @Test
    public void test12() {
        Assert.assertEquals(3, new BinarySearch().search(new int[]{-4,-1,0,3,6,8,9,12,14,15,17,21,23}, 3));
    }
}