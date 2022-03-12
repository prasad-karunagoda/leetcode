package prasad.leetcode.p1290;

import org.junit.Assert;
import org.junit.Test;
import prasad.leetcode.datastructure.ListNode;

public class ConvertBinaryNumberInLinkedListToIntegerTest {

    @Test
    public void test01() {
        ListNode list = new ListNode(1, new ListNode(0, new ListNode(1)));
        Assert.assertEquals(5, new ConvertBinaryNumberInLinkedListToInteger().getDecimalValue(list));
    }

    @Test
    public void test02() {
        ListNode list = new ListNode(0);
        Assert.assertEquals(0, new ConvertBinaryNumberInLinkedListToInteger().getDecimalValue(list));
    }

    @Test
    public void test03() {
        ListNode list = new ListNode(1, new ListNode(1, new ListNode(0, new ListNode(1))));
        Assert.assertEquals(13, new ConvertBinaryNumberInLinkedListToInteger().getDecimalValue(list));
    }

    @Test
    public void test04() {
        ListNode list = new ListNode(1);
        Assert.assertEquals(1, new ConvertBinaryNumberInLinkedListToInteger().getDecimalValue(list));
    }
}
