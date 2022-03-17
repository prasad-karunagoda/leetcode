package prasad.leetcode.p2095;

import org.junit.Assert;
import org.junit.Test;
import prasad.leetcode.datastructure.ListNode;
import prasad.leetcode.test.util.Util;

public class DeleteMiddleNodeOfLinkedListTest {

    @Test
    public void test01() {
        ListNode list = Util.buildList(new int[] {1, 3, 4, 7, 1, 2, 6});
        ListNode result = new DeleteMiddleNodeOfLinkedList().deleteMiddle(list);
        Assert.assertEquals(1, result.val);
        Assert.assertEquals(3, result.next.val);
        Assert.assertEquals(4, result.next.next.val);
        Assert.assertEquals(1, result.next.next.next.val);
        Assert.assertEquals(2, result.next.next.next.next.val);
        Assert.assertEquals(6, result.next.next.next.next.next.val);
        Assert.assertNull(result.next.next.next.next.next.next);
    }

    @Test
    public void test02() {
        ListNode list = Util.buildList(new int[] {1, 2, 3, 4});
        ListNode result = new DeleteMiddleNodeOfLinkedList().deleteMiddle(list);
        Assert.assertEquals(1, result.val);
        Assert.assertEquals(2, result.next.val);
        Assert.assertEquals(4, result.next.next.val);
        Assert.assertNull(result.next.next.next);
    }

    @Test
    public void test03() {
        ListNode list = Util.buildList(new int[] {2, 1});
        ListNode result = new DeleteMiddleNodeOfLinkedList().deleteMiddle(list);
        Assert.assertEquals(2, result.val);
        Assert.assertNull(result.next);
    }

    @Test
    public void test04() {
        ListNode list = Util.buildList(new int[] {5});
        ListNode result = new DeleteMiddleNodeOfLinkedList().deleteMiddle(list);
        Assert.assertNull(result);
    }
}
