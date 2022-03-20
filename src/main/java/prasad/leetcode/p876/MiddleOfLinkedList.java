package prasad.leetcode.p876;

import prasad.leetcode.datastructure.ListNode;

import java.util.ArrayList;

public class MiddleOfLinkedList {

    public ListNode middleNode(ListNode head) {
        ArrayList<ListNode> arrayList = new ArrayList<>();
        for (ListNode node = head; node != null; node = node.next) {
            arrayList.add(node);
        }
        return arrayList.get(arrayList.size() / 2);
    }
}
