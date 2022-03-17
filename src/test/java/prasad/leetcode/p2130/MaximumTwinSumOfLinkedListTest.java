package prasad.leetcode.p2130;

import org.junit.Assert;
import org.junit.Test;
import prasad.leetcode.datastructure.ListNode;
import prasad.leetcode.test.util.Util;

public class MaximumTwinSumOfLinkedListTest {

    @Test
    public void test01() {
        ListNode list = Util.buildList(new int[] {5, 4, 2, 1});
        Assert.assertEquals(6, new MaximumTwinSumOfLinkedList().pairSum(list));
    }

    @Test
    public void test02() {
        ListNode list = Util.buildList(new int[] {4, 2, 2, 3});
        Assert.assertEquals(7, new MaximumTwinSumOfLinkedList().pairSum(list));
    }

    @Test
    public void test03() {
        ListNode list = Util.buildList(new int[] {1, 100000});
        Assert.assertEquals(100001, new MaximumTwinSumOfLinkedList().pairSum(list));
    }
}
