package prasad.leetcode.p876;

import org.junit.Assert;
import org.junit.Test;
import prasad.leetcode.datastructure.ListNode;
import prasad.leetcode.test.util.Util;

public class MiddleOfLinkedListTest {

    @Test
    public void test01() {
        ListNode list = Util.buildList(new int[] {1, 2, 3, 4, 5});
        Assert.assertEquals(3, new MiddleOfLinkedList().middleNode(list).val);
    }

    @Test
    public void test02() {
        ListNode list = Util.buildList(new int[] {1, 2, 3, 4, 5, 6});
        Assert.assertEquals(4, new MiddleOfLinkedList().middleNode(list).val);
    }

    @Test
    public void test03() {
        ListNode list = Util.buildList(new int[] {5});
        Assert.assertEquals(5, new MiddleOfLinkedList().middleNode(list).val);
    }
}
