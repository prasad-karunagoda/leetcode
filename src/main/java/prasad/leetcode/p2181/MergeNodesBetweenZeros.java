package prasad.leetcode.p2181;

import prasad.leetcode.datastructure.ListNode;

public class MergeNodesBetweenZeros {

    public ListNode mergeNodes(ListNode head) {
        int sum = 0;
        ListNode result = null;
        ListNode lastNode = null;
        for (ListNode node = head.next; node != null; node = node.next) {
            if (node.val > 0) {
                sum += node.val;
            }
            else {
                ListNode sumNode = new ListNode(sum);
                if (result == null) {
                    result = sumNode;
                }
                else {
                    lastNode.next = sumNode;
                }
                lastNode = sumNode;
                sum = 0;
            }
        }
        return result;
    }
}
