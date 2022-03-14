package prasad.leetcode.p86;

import org.junit.Assert;
import org.junit.Test;
import prasad.leetcode.datastructure.ListNode;

public class PartitionListTest {

    @Test
    public void test01() {
        ListNode list = new ListNode(1, new ListNode(4, new ListNode(3, new ListNode(2, new ListNode(5, new ListNode(2))))));
        ListNode result = new PartitionList().partition(list, 3);
        Assert.assertEquals(1, result.val);
        Assert.assertEquals(2, result.next.val);
        Assert.assertEquals(2, result.next.next.val);
        Assert.assertEquals(4, result.next.next.next.val);
        Assert.assertEquals(3, result.next.next.next.next.val);
        Assert.assertEquals(5, result.next.next.next.next.next.val);
        Assert.assertNull(result.next.next.next.next.next.next);
    }

    @Test
    public void test02() {
        ListNode list = new ListNode(2, new ListNode(1));
        ListNode result = new PartitionList().partition(list, 2);
        Assert.assertEquals(1, result.val);
        Assert.assertEquals(2, result.next.val);
        Assert.assertNull(result.next.next);
    }

    @Test
    public void testNull() {
        ListNode result = new PartitionList().partition(null, 5);
        Assert.assertNull(result);
    }

    @Test
    public void testAllLess() {
        ListNode list = new ListNode(2, new ListNode(1, new ListNode(6, new ListNode(3, new ListNode(4)))));
        ListNode result = new PartitionList().partition(list, 8);
        Assert.assertEquals(2, result.val);
        Assert.assertEquals(1, result.next.val);
        Assert.assertEquals(6, result.next.next.val);
        Assert.assertEquals(3, result.next.next.next.val);
        Assert.assertEquals(4, result.next.next.next.next.val);
        Assert.assertNull(result.next.next.next.next.next);
    }

    @Test
    public void testAllGreater() {
        ListNode list = new ListNode(8, new ListNode(5, new ListNode(6, new ListNode(3, new ListNode(4)))));
        ListNode result = new PartitionList().partition(list, 2);
        Assert.assertEquals(8, result.val);
        Assert.assertEquals(5, result.next.val);
        Assert.assertEquals(6, result.next.next.val);
        Assert.assertEquals(3, result.next.next.next.val);
        Assert.assertEquals(4, result.next.next.next.next.val);
        Assert.assertNull(result.next.next.next.next.next);
    }
}
