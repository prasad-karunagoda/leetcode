package prasad.leetcode.p445;

import org.junit.Assert;
import org.junit.Test;
import prasad.leetcode.datastructure.ListNode;
import prasad.leetcode.test.util.Util;

public class AddTwoNumbers2Test {

    @Test
    public void test01() {
        ListNode result = new AddTwoNumbers2().addTwoNumbers(
                Util.buildList(new int[] {7, 2, 4, 3}),
                Util.buildList(new int[] {5, 6, 4}));
        Assert.assertEquals(7, result.val);
        Assert.assertEquals(8, result.next.val);
        Assert.assertEquals(0, result.next.next.val);
        Assert.assertEquals(7, result.next.next.next.val);
        Assert.assertNull(result.next.next.next.next);
    }

    @Test
    public void test02() {
        ListNode result = new AddTwoNumbers2().addTwoNumbers(
                Util.buildList(new int[] {2, 4, 3}),
                Util.buildList(new int[] {5, 6, 4}));
        Assert.assertEquals(8, result.val);
        Assert.assertEquals(0, result.next.val);
        Assert.assertEquals(7, result.next.next.val);
        Assert.assertNull(result.next.next.next);
    }

    @Test
    public void test03() {
        ListNode result = new AddTwoNumbers2().addTwoNumbers(new ListNode(0), new ListNode(0));
        Assert.assertEquals(0, result.val);
        Assert.assertNull(result.next);
    }

    @Test
    public void test04() {
        ListNode result = new AddTwoNumbers2().addTwoNumbers(
                Util.buildList(new int[] {2, 4, 3}),
                Util.buildList(new int[] {5, 6, 4, 4, 8}));
        Assert.assertEquals(5, result.val);
        Assert.assertEquals(6, result.next.val);
        Assert.assertEquals(6, result.next.next.val);
        Assert.assertEquals(9, result.next.next.next.val);
        Assert.assertEquals(1, result.next.next.next.next.val);
        Assert.assertNull(result.next.next.next.next.next);
    }

    @Test
    public void test05() {
        ListNode result = new AddTwoNumbers2().addTwoNumbers(
                Util.buildList(new int[] {4, 7}),
                Util.buildList(new int[] {5, 6}));
        Assert.assertEquals(1, result.val);
        Assert.assertEquals(0, result.next.val);
        Assert.assertEquals(3, result.next.next.val);
        Assert.assertNull(result.next.next.next);
    }
}
