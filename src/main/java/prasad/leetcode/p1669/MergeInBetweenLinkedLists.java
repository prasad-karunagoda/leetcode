package prasad.leetcode.p1669;

import prasad.leetcode.datastructure.ListNode;

public class MergeInBetweenLinkedLists {

    public ListNode mergeInBetween(ListNode list1, int a, int b, ListNode list2) {
        ListNode nodeBeforeList2 = null;
        ListNode lastRemovingNode = null;
        int currentIndex = 0; // 0-indexed
        for (ListNode node = list1; node != null; node = node.next) {
            if (currentIndex == a - 1) {
                nodeBeforeList2 = node;
            }
            if (currentIndex == b) {
                lastRemovingNode = node;
            }
            currentIndex++;
        }

        ListNode list2LastNode = list2;
        while (list2LastNode.next != null) {
            list2LastNode = list2LastNode.next;
        }

        nodeBeforeList2.next = list2;
        list2LastNode.next = lastRemovingNode.next;
        lastRemovingNode.next = null;
        return list1;
    }
}
