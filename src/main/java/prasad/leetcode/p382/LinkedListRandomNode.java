package prasad.leetcode.p382;

import prasad.leetcode.datastructure.ListNode;

import java.util.ArrayList;
import java.util.Random;

public class LinkedListRandomNode {

    private final ArrayList<Integer> values = new ArrayList<>();
    private final Random random = new Random();

    public LinkedListRandomNode(ListNode head) {
        for (ListNode node = head; node != null; node = node.next) {
            values.add(node.val);
        }
    }

    public int getRandom() {
        return values.get(random.nextInt(values.size()));
    }
}
