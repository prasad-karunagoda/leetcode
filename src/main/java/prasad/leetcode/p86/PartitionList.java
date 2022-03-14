package prasad.leetcode.p86;

import prasad.leetcode.datastructure.ListNode;

public class PartitionList {

    public ListNode partition(ListNode head, int x) {
        ListNode less = null;
        ListNode lessLast = null;
        ListNode greaterOrEqual = null;
        ListNode greaterOrEqualLast = null;
        for (ListNode node = head; node != null; node = node.next) {
            if (node.val < x) {
                if (less == null) {
                    less = node;
                }
                else {
                    lessLast.next = node;
                }
                lessLast = node;
            }
            else {
                if (greaterOrEqual == null) {
                    greaterOrEqual = node;
                }
                else {
                    greaterOrEqualLast.next = node;
                }
                greaterOrEqualLast = node;
            }
        }

        if (less != null && greaterOrEqual != null) {
            lessLast.next = greaterOrEqual;
            greaterOrEqualLast.next = null;
            return less;
        }
        else if (less != null) {
            lessLast.next = null;
            return less;
        }
        else if (greaterOrEqual != null) {
            greaterOrEqualLast.next = null;
            return greaterOrEqual;
        }
        else {
            return null;
        }
    }
}
