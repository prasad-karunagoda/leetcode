package prasad.leetcode.p1290;

import prasad.leetcode.datastructure.ListNode;

public class ConvertBinaryNumberInLinkedListToInteger {

    public int getDecimalValue(ListNode head) {
        int length = 1;
        ListNode currentNode = head;
        while (currentNode.next != null) {
            length++;
            currentNode = currentNode.next;
        }

        // Shift operator is used here. This is similar to Math.pow(2, length - 1).
        int powerOfTwo = 1 << (length - 1);
        int result = 0;
        for (ListNode node = head; node != null; node = node.next) {
            result += node.val * powerOfTwo;
            powerOfTwo /= 2;
        }
        return result;
    }
}
