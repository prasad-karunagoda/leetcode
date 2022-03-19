package prasad.leetcode.p1019;

import org.junit.Assert;
import org.junit.Test;
import prasad.leetcode.datastructure.ListNode;
import prasad.leetcode.test.util.Util;

public class NextGreaterNodeInLinkedListTest {

    @Test
    public void test01() {
        ListNode list = Util.buildList(new int[] {2, 1, 5});
        int[] result = new NextGreaterNodeInLinkedList().nextLargerNodes(list);
        Assert.assertArrayEquals(new int[] {5, 5, 0}, result);
    }

    @Test
    public void test02() {
        ListNode list = Util.buildList(new int[] {2, 7, 4, 3, 5});
        int[] result = new NextGreaterNodeInLinkedList().nextLargerNodes(list);
        Assert.assertArrayEquals(new int[] {7, 0, 5, 5, 0}, result);
    }

    @Test
    public void test03() {
        ListNode list = Util.buildList(new int[] {5});
        int[] result = new NextGreaterNodeInLinkedList().nextLargerNodes(list);
        Assert.assertArrayEquals(new int[] {0}, result);
    }

    @Test
    public void testTime() {
        int[] array = new int[10000];
        for (int i = 0; i < 10000; i++) {
            array[i] = 10000 - i;
        }
        ListNode list = Util.buildList(array);

        long start = System.currentTimeMillis();
        int[] result = new NextGreaterNodeInLinkedList().nextLargerNodes(list);
        System.out.println("Time = " + (System.currentTimeMillis() - start) + " ms");
        Assert.assertArrayEquals(new int[10000], result);
    }
}
