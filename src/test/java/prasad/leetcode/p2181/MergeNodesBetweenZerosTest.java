package prasad.leetcode.p2181;

import org.junit.Assert;
import org.junit.Test;
import prasad.leetcode.datastructure.ListNode;
import prasad.leetcode.test.util.Util;

public class MergeNodesBetweenZerosTest {

    @Test
    public void test01() {
        ListNode result = new MergeNodesBetweenZeros().mergeNodes(Util.buildList(new int[] {0, 3, 1, 0, 4, 5, 2, 0}));
        Assert.assertEquals(4, result.val);
        Assert.assertEquals(11, result.next.val);
        Assert.assertNull(result.next.next);
    }

    @Test
    public void test02() {
        ListNode result = new MergeNodesBetweenZeros().mergeNodes(Util.buildList(new int[] {0, 1, 0, 3, 0, 2, 2, 0}));
        Assert.assertEquals(1, result.val);
        Assert.assertEquals(3, result.next.val);
        Assert.assertEquals(4, result.next.next.val);
        Assert.assertNull(result.next.next.next);
    }

    @Test
    public void test03() {
        ListNode result = new MergeNodesBetweenZeros().mergeNodes(Util.buildList(new int[] {0, 5, 0}));
        Assert.assertEquals(5, result.val);
        Assert.assertNull(result.next);
    }
}
