package prasad.leetcode.p2130;

import org.junit.Assert;
import org.junit.Test;
import prasad.leetcode.datastructure.ListNode;

public class MaximumTwinSumOfLinkedListTest {

    @Test
    public void test01() {
        ListNode list = buildList(new int[] {5, 4, 2, 1});
        Assert.assertEquals(6, new MaximumTwinSumOfLinkedList().pairSum(list));
    }

    @Test
    public void test02() {
        ListNode list = buildList(new int[] {4, 2, 2, 3});
        Assert.assertEquals(7, new MaximumTwinSumOfLinkedList().pairSum(list));
    }

    @Test
    public void test03() {
        ListNode list = buildList(new int[] {1, 100000});
        Assert.assertEquals(100001, new MaximumTwinSumOfLinkedList().pairSum(list));
    }

    private ListNode buildList(int[] values) {
        ListNode next = null;
        for (int i = values.length - 1; i >= 0; i--) {
            next = new ListNode(values[i], next);
        }
        return next;
    }
}
