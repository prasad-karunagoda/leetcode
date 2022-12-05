package prasad.leetcode.p1315;

import prasad.leetcode.datastructure.TreeNode;

public class SumOfNodesWithEvenGrandparent {

    private int sum;

    public int sumEvenGrandparent(TreeNode root) {
        sum = 0;
        processNode(root, -1);
        return sum;
    }

    private void processNode(TreeNode node, int parentValue) {
        if (node.left != null) {
            if (parentValue % 2 == 0) {
                sum += node.left.val;
            }
            processNode(node.left, node.val);
        }
        if (node.right != null) {
            if (parentValue % 2 == 0) {
                sum += node.right.val;
            }
            processNode(node.right, node.val);
        }
    }
}
