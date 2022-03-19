package prasad.leetcode.p725;

import prasad.leetcode.datastructure.ListNode;

public class SplitLinkedList {

    public ListNode[] splitListToParts(ListNode head, int k) {
        int length = 0;
        for (ListNode node = head; node != null; node = node.next) {
            length++;
        }

        int allPartsLength = length / k;
        int beginningPartsLength = length % k;
        int[] partLengths = new int[k];
        for (int i = 0; i < k; i++) {
            partLengths[i] = allPartsLength;
            if (i < beginningPartsLength) {
                partLengths[i]++;
            }
        }

        ListNode[] parts = new ListNode[k];
        parts[0] = head;
        int nextInsertIndex = 1;
        ListNode currentNode = head;
        for (int i = 0; i < partLengths.length - 1; i++) { // Skip the last partLength
            int l = partLengths[i];
            while (l > 1) {
                currentNode = currentNode.next;
                l--;
            }
            parts[nextInsertIndex] = currentNode != null ? currentNode.next : null;
            ListNode temp = null;
            if (currentNode != null) {
                temp = currentNode.next;
                currentNode.next = null;
            }
            currentNode = temp;
            nextInsertIndex++;
        }
        return parts;
    }
}
