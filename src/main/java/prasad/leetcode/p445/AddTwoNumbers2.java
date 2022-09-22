package prasad.leetcode.p445;

import prasad.leetcode.datastructure.ListNode;

import java.util.ArrayList;
import java.util.List;

public class AddTwoNumbers2 {

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        List<Byte> list1 = new ArrayList<>();
        while (l1 != null) {
            list1.add((byte) l1.val);
            l1 = l1.next;
        }

        List<Byte> list2 = new ArrayList<>();
        while (l2 != null) {
            list2.add((byte) l2.val);
            l2 = l2.next;
        }

        List<Byte> longerList;
        List<Byte> shorterList;
        if (list1.size() >= list2.size()) {
            longerList = list1;
            shorterList = list2;
        }
        else {
            longerList = list2;
            shorterList = list1;
        }

        int diff = longerList.size() - shorterList.size();
        int carry = 0;
        ListNode previousNode = null;
        for (int i = longerList.size() - 1; i >= 0; i--) {
            byte a = longerList.get(i);
            byte b = i >= diff ? shorterList.get(i - diff) : 0;
            int sum = (a + b + carry) % 10;
            carry = (a + b + carry) / 10;
            previousNode = new ListNode(sum, previousNode);
        }

        if (carry > 0) {
            previousNode = new ListNode(carry, previousNode);
        }
        return previousNode;
    }
}
