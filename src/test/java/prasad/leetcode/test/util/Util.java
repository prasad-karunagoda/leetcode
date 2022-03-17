package prasad.leetcode.test.util;

import prasad.leetcode.datastructure.ListNode;

public final class Util {

    private Util() {
    }

    public static ListNode buildList(int[] values) {
        ListNode next = null;
        for (int i = values.length - 1; i >= 0; i--) {
            next = new ListNode(values[i], next);
        }
        return next;
    }
}
