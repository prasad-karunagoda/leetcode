package prasad.leetcode.p1448;

import prasad.leetcode.datastructure.TreeNode;

public class CountGoodNodes {

    public int goodNodes(TreeNode root) {
        return getGoodNodeCount(root, root.val);
    }

    private int getGoodNodeCount(TreeNode node, int maxValueInPath) {
        if (node == null) {
            return 0;
        }

        int max = Math.max(maxValueInPath, node.val);
        int countThisNode = node.val >= maxValueInPath ? 1 : 0;
        return countThisNode + getGoodNodeCount(node.left, max) + getGoodNodeCount(node.right, max);
    }
}
