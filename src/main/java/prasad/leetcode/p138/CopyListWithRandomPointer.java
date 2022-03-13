package prasad.leetcode.p138;

import java.util.HashMap;
import java.util.Map;

public class CopyListWithRandomPointer {

    public Node copyRandomList(Node head) {
        if (head == null) {
            return null;
        }

        Node copy = new Node(head.val);
        Map<Node, Node> originalNodeToCopyNode = new HashMap<>();
        Map<Node, Node> copyNodeToOriginalNode = new HashMap<>();
        originalNodeToCopyNode.put(head, copy);
        copyNodeToOriginalNode.put(copy, head);
        Node copyPrevious = copy;
        for (Node current = head.next; current != null; current = current.next) {
            Node copyCurrent = new Node(current.val);
            copyPrevious.next = copyCurrent;
            copyPrevious = copyPrevious.next;
            originalNodeToCopyNode.put(current, copyCurrent);
            copyNodeToOriginalNode.put(copyCurrent, current);
        }

        for (Node node = copy; node != null; node = node.next) {
            if (copyNodeToOriginalNode.get(node).random != null) {
                node.random = originalNodeToCopyNode.get(copyNodeToOriginalNode.get(node).random);
            }
        }
        return copy;
    }
}
