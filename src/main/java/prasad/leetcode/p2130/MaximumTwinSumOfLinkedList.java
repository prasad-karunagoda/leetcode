package prasad.leetcode.p2130;

import prasad.leetcode.datastructure.ListNode;

import java.util.ArrayList;

public class MaximumTwinSumOfLinkedList {

    public int pairSum(ListNode head) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        for (ListNode node = head; node != null; node = node.next) {
            arrayList.add(node.val);
        }

        int n = arrayList.size();
        int maxSum = 0;
        for (int i = 0; i < n / 2; i++) {
            int sum = arrayList.get(i) + arrayList.get(n - 1 - i);
            if (sum > maxSum) {
                maxSum = sum;
            }
        }
        return maxSum;
    }
}
