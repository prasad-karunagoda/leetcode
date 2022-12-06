package prasad.leetcode.p1325;

import prasad.leetcode.datastructure.TreeNode;

public class DeleteLeavesWithGivenValue {

    private boolean modified;

    public TreeNode removeLeafNodes(TreeNode root, int target) {
        do {
            modified = false;
            removeLeaves(root, target);
        }
        while (modified);

        if (root.left == null && root.right == null && root.val == target) {
            root = null;
        }
        return root;
    }

    private void removeLeaves(TreeNode node, int target) {
        if (node.left != null) {
            if (node.left.left == null && node.left.right == null && node.left.val == target) {
                node.left = null;
                modified = true;
            }
            else {
                removeLeaves(node.left, target);
            }
        }
        if (node.right != null) {
            if (node.right.left == null && node.right.right == null && node.right.val == target) {
                node.right = null;
                modified = true;
            }
            else {
                removeLeaves(node.right, target);
            }
        }
    }
}
