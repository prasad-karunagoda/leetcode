package prasad.leetcode.p2181;

import org.junit.Assert;
import org.junit.Test;
import prasad.leetcode.datastructure.ListNode;

public class MergeNodesBetweenZerosTest {

    @Test
    public void test01() {
        ListNode result = new MergeNodesBetweenZeros().mergeNodes(buildList(new int[] {0, 3, 1, 0, 4, 5, 2, 0}));
        Assert.assertEquals(4, result.val);
        Assert.assertEquals(11, result.next.val);
        Assert.assertNull(result.next.next);
    }

    @Test
    public void test02() {
        ListNode result = new MergeNodesBetweenZeros().mergeNodes(buildList(new int[] {0, 1, 0, 3, 0, 2, 2, 0}));
        Assert.assertEquals(1, result.val);
        Assert.assertEquals(3, result.next.val);
        Assert.assertEquals(4, result.next.next.val);
        Assert.assertNull(result.next.next.next);
    }

    @Test
    public void test03() {
        ListNode result = new MergeNodesBetweenZeros().mergeNodes(buildList(new int[] {0, 5, 0}));
        Assert.assertEquals(5, result.val);
        Assert.assertNull(result.next);
    }

    private ListNode buildList(int[] values) {
        ListNode next = null;
        for (int i = values.length - 1; i >= 0; i--) {
            next = new ListNode(values[i], next);
        }
        return next;
    }
}
