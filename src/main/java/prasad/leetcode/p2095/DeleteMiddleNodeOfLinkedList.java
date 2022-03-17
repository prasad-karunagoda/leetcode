package prasad.leetcode.p2095;

import prasad.leetcode.datastructure.ListNode;

import java.util.ArrayList;

public class DeleteMiddleNodeOfLinkedList {

    public ListNode deleteMiddle(ListNode head) {
        ArrayList<ListNode> arrayList = new ArrayList<>();
        for (ListNode node = head; node != null; node = node.next) {
            arrayList.add(node);
        }

        if (arrayList.size() <= 1) {
            return null;
        }

        int middleIndex = arrayList.size() / 2;
        arrayList.get(middleIndex - 1).next = arrayList.get(middleIndex).next;
        arrayList.get(middleIndex).next = null;
        return head;
    }
}
