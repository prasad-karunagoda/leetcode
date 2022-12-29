package prasad.leetcode.p129;

import prasad.leetcode.datastructure.TreeNode;

public class SumRootToLeafNumbers {

    private int sum;

    public int sumNumbers(TreeNode root) {
        sum = 0;
        visit(root, "");
        return sum;
    }

    private void visit(TreeNode node, String parentPath) {
        if (node.left == null && node.right == null) {
            sum += Integer.parseInt(parentPath + node.val);
            return;
        }

        if (node.left != null) {
            visit(node.left, parentPath + node.val);
        }
        if (node.right != null) {
            visit(node.right, parentPath + node.val);
        }
    }
}
