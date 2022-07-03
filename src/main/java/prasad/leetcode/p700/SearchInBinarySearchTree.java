package prasad.leetcode.p700;

import prasad.leetcode.datastructure.TreeNode;

public class SearchInBinarySearchTree {

    public TreeNode searchBST(TreeNode root, int val) {
        if (val == root.val) {
            return root;
        }
        else if (val < root.val) {
            if (root.left == null) {
                return null;
            }
            return searchBST(root.left, val);
        }
        else { // val > root.val
            if (root.right == null) {
                return null;
            }
            return searchBST(root.right, val);
        }
    }
}
