package prasad.leetcode.p138;

import org.junit.Assert;
import org.junit.Test;

public class CopyListWithRandomPointerTest {

    @Test
    public void test01() {
        int[] values = new int[] {7, 13, 11, 10, 1};
        Node original = buildList(values);
        original.random = null;
        original.next.random = original;
        original.next.next.random = original.next.next.next.next;
        original.next.next.next.random = original.next.next;
        original.next.next.next.next.random = original;
        Node copy = new CopyListWithRandomPointer().copyRandomList(original);
        assertion(original, copy, values);
    }

    @Test
    public void test02() {
        int[] values = new int[] {1, 2};
        Node original = buildList(values);
        original.random = original.next;
        original.next.random = original.next;
        Node copy = new CopyListWithRandomPointer().copyRandomList(original);
        assertion(original, copy, values);
    }

    @Test
    public void test03() {
        int[] values = new int[0];
        Node original = buildList(values);
        Node copy = new CopyListWithRandomPointer().copyRandomList(original);
        assertion(original, copy, values);
    }

    private Node buildList(int[] values) {
        Node next = null;
        for (int i = values.length - 1; i >= 0; i--) {
            Node node = new Node(values[i]);
            node.next = next;
            next = node;
        }
        return next;
    }

    private void assertion(Node original, Node copy, int[] values) {
        Node currentOriginal = original;
        Node currentCopy = copy;
        int valueIndex = 0;
        while (currentOriginal != null) {
            Assert.assertEquals(values[valueIndex], currentCopy.val);
            Assert.assertNotEquals(currentCopy, currentOriginal);
            if (currentCopy.random != null) {
                Assert.assertNotEquals(currentCopy.random, currentOriginal.random);
            }

            currentOriginal = currentOriginal.next;
            currentCopy = currentCopy.next;
            valueIndex++;
        }
    }
}
