package prasad.leetcode.p1669;

import org.junit.Assert;
import org.junit.Test;
import prasad.leetcode.datastructure.ListNode;
import prasad.leetcode.test.util.Util;

public class MergeInBetweenLinkedListsTest {

    @Test
    public void test01() {
        ListNode list1 = Util.buildList(new int[] {0, 1, 2, 3, 4, 5});
        ListNode list2 = Util.buildList(new int[] {1000000, 1000001, 1000002});
        ListNode result = new MergeInBetweenLinkedLists().mergeInBetween(list1, 3, 4, list2);
        Assert.assertEquals(0, result.val);
        Assert.assertEquals(1, result.next.val);
        Assert.assertEquals(2, result.next.next.val);
        Assert.assertEquals(1000000, result.next.next.next.val);
        Assert.assertEquals(1000001, result.next.next.next.next.val);
        Assert.assertEquals(1000002, result.next.next.next.next.next.val);
        Assert.assertEquals(5, result.next.next.next.next.next.next.val);
        Assert.assertNull(result.next.next.next.next.next.next.next);
    }

    @Test
    public void test02() {
        ListNode list1 = Util.buildList(new int[] {0, 1, 2, 3, 4, 5, 6});
        ListNode list2 = Util.buildList(new int[] {1000000, 1000001, 1000002, 1000003, 1000004});
        ListNode result = new MergeInBetweenLinkedLists().mergeInBetween(list1, 2, 5, list2);
        Assert.assertEquals(0, result.val);
        Assert.assertEquals(1, result.next.val);
        Assert.assertEquals(1000000, result.next.next.val);
        Assert.assertEquals(1000001, result.next.next.next.val);
        Assert.assertEquals(1000002, result.next.next.next.next.val);
        Assert.assertEquals(1000003, result.next.next.next.next.next.val);
        Assert.assertEquals(1000004, result.next.next.next.next.next.next.val);
        Assert.assertEquals(6, result.next.next.next.next.next.next.next.val);
        Assert.assertNull(result.next.next.next.next.next.next.next.next);
    }

    @Test
    public void test03() {
        ListNode list1 = Util.buildList(new int[] {5, 10, 15});
        ListNode list2 = Util.buildList(new int[] {50});
        ListNode result = new MergeInBetweenLinkedLists().mergeInBetween(list1, 1, 1, list2);
        Assert.assertEquals(5, result.val);
        Assert.assertEquals(50, result.next.val);
        Assert.assertEquals(15, result.next.next.val);
        Assert.assertNull(result.next.next.next);
    }
}
