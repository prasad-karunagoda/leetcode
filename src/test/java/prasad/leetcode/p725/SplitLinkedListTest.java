package prasad.leetcode.p725;

import org.junit.Assert;
import org.junit.Test;
import prasad.leetcode.datastructure.ListNode;
import prasad.leetcode.test.util.Util;

public class SplitLinkedListTest {

    @Test
    public void test01() {
        ListNode[] result = new SplitLinkedList().splitListToParts(Util.buildList(new int[] {1, 2, 3}), 5);
        Assert.assertEquals(5, result.length);
        Assert.assertEquals(1, result[0].val);
        Assert.assertNull(result[0].next);
        Assert.assertEquals(2, result[1].val);
        Assert.assertNull(result[1].next);
        Assert.assertEquals(3, result[2].val);
        Assert.assertNull(result[2].next);
        Assert.assertNull(result[3]);
        Assert.assertNull(result[4]);
    }

    @Test
    public void test02() {
        ListNode[] result = new SplitLinkedList().splitListToParts(Util.buildList(new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9, 10}), 3);
        Assert.assertEquals(3, result.length);

        Assert.assertEquals(1, result[0].val);
        Assert.assertEquals(2, result[0].next.val);
        Assert.assertEquals(3, result[0].next.next.val);
        Assert.assertEquals(4, result[0].next.next.next.val);
        Assert.assertNull(result[0].next.next.next.next);

        Assert.assertEquals(5, result[1].val);
        Assert.assertEquals(6, result[1].next.val);
        Assert.assertEquals(7, result[1].next.next.val);
        Assert.assertNull(result[1].next.next.next);

        Assert.assertEquals(8, result[2].val);
        Assert.assertEquals(9, result[2].next.val);
        Assert.assertEquals(10, result[2].next.next.val);
        Assert.assertNull(result[2].next.next.next);
    }

    @Test
    public void test03() {
        ListNode[] result = new SplitLinkedList().splitListToParts(null, 3);
        Assert.assertEquals(3, result.length);
        Assert.assertNull(result[0]);
        Assert.assertNull(result[1]);
        Assert.assertNull(result[2]);
    }

    @Test
    public void test04() {
        ListNode[] result = new SplitLinkedList().splitListToParts(Util.buildList(new int[] {1, 2, 3}), 3);
        Assert.assertEquals(3, result.length);
        Assert.assertEquals(1, result[0].val);
        Assert.assertNull(result[0].next);
        Assert.assertEquals(2, result[1].val);
        Assert.assertNull(result[1].next);
        Assert.assertEquals(3, result[2].val);
        Assert.assertNull(result[2].next);
    }

    @Test
    public void test05() {
        ListNode[] result = new SplitLinkedList().splitListToParts(Util.buildList(new int[] {1, 2, 3}), 2);
        Assert.assertEquals(2, result.length);
        Assert.assertEquals(1, result[0].val);
        Assert.assertEquals(2, result[0].next.val);
        Assert.assertNull(result[0].next.next);
        Assert.assertEquals(3, result[1].val);
        Assert.assertNull(result[1].next);
    }
}
