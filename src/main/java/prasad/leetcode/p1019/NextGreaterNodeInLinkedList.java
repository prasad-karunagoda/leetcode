package prasad.leetcode.p1019;

import prasad.leetcode.datastructure.ListNode;

import java.util.ArrayList;

public class NextGreaterNodeInLinkedList {

    public int[] nextLargerNodes(ListNode head) {
        ArrayList<Integer> greaterValues = new ArrayList<>();
        for (ListNode node = head; node != null; node = node.next) {
            boolean found = false;
            for (ListNode nextNode = node.next; nextNode != null; nextNode = nextNode.next) {
                if (node.val < nextNode.val) {
                    greaterValues.add(nextNode.val);
                    found = true;
                    break;
                }
            }

            if (!found) {
                greaterValues.add(0);
            }
        }

        int[] result = new int[greaterValues.size()];
        for (int i = 0; i < greaterValues.size(); i++) {
            result[i] = greaterValues.get(i);
        }
        return result;
    }
}
