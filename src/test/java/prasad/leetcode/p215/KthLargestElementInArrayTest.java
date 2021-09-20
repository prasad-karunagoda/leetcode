package prasad.leetcode.p215;

import org.junit.Assert;
import org.junit.Test;

public class KthLargestElementInArrayTest {

    @Test
    public void test01() {
        // Sorted: 6,5,4,3,2,1
        Assert.assertEquals(6, new KthLargestElementInArray().findKthLargest(new int[] {3,2,1,5,6,4}, 1));
        Assert.assertEquals(5, new KthLargestElementInArray().findKthLargest(new int[] {3,2,1,5,6,4}, 2));
        Assert.assertEquals(4, new KthLargestElementInArray().findKthLargest(new int[] {3,2,1,5,6,4}, 3));
        Assert.assertEquals(3, new KthLargestElementInArray().findKthLargest(new int[] {3,2,1,5,6,4}, 4));
        Assert.assertEquals(2, new KthLargestElementInArray().findKthLargest(new int[] {3,2,1,5,6,4}, 5));
        Assert.assertEquals(1, new KthLargestElementInArray().findKthLargest(new int[] {3,2,1,5,6,4}, 6));
    }

    @Test
    public void test02() {
        // Sorted: 6,5,5,4,3,3,2,2,1
        Assert.assertEquals(6, new KthLargestElementInArray().findKthLargest(new int[] {3,2,3,1,2,4,5,5,6}, 1));
        Assert.assertEquals(5, new KthLargestElementInArray().findKthLargest(new int[] {3,2,3,1,2,4,5,5,6}, 2));
        Assert.assertEquals(5, new KthLargestElementInArray().findKthLargest(new int[] {3,2,3,1,2,4,5,5,6}, 3));
        Assert.assertEquals(4, new KthLargestElementInArray().findKthLargest(new int[] {3,2,3,1,2,4,5,5,6}, 4));
        Assert.assertEquals(3, new KthLargestElementInArray().findKthLargest(new int[] {3,2,3,1,2,4,5,5,6}, 5));
        Assert.assertEquals(3, new KthLargestElementInArray().findKthLargest(new int[] {3,2,3,1,2,4,5,5,6}, 6));
        Assert.assertEquals(2, new KthLargestElementInArray().findKthLargest(new int[] {3,2,3,1,2,4,5,5,6}, 7));
        Assert.assertEquals(2, new KthLargestElementInArray().findKthLargest(new int[] {3,2,3,1,2,4,5,5,6}, 8));
        Assert.assertEquals(1, new KthLargestElementInArray().findKthLargest(new int[] {3,2,3,1,2,4,5,5,6}, 9));
    }

    @Test
    public void test03() {
        Assert.assertEquals(5, new KthLargestElementInArray().findKthLargest(new int[] {5}, 1));
    }

    @Test(expected = IllegalArgumentException.class)
    public void test04() {
        new KthLargestElementInArray().findKthLargest(new int[] {1,5,3}, 0);
    }

    @Test(expected = IllegalArgumentException.class)
    public void test05() {
        new KthLargestElementInArray().findKthLargest(new int[] {1,5,3}, 4);
    }
}
