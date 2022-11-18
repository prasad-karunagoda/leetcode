package prasad.leetcode.p1261;

import prasad.leetcode.datastructure.TreeNode;

import java.util.HashSet;
import java.util.Set;

public class FindElementsInContaminatedBinaryTree {

    private final Set<Integer> values = new HashSet<>();

    public FindElementsInContaminatedBinaryTree(TreeNode root) {
        root.val = 0;
        values.add(0);
        setChildrenValues(root);
    }

    private void setChildrenValues(TreeNode node) {
        if (node.left != null) {
            node.left.val = (node.val * 2) + 1;
            values.add(node.left.val);
            setChildrenValues(node.left);
        }
        if (node.right != null) {
            node.right.val = (node.val * 2) + 2;
            values.add(node.right.val);
            setChildrenValues(node.right);
        }
    }

    public boolean find(int target) {
        return values.contains(target);
    }
}
