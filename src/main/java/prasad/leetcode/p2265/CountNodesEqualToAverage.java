package prasad.leetcode.p2265;

import prasad.leetcode.datastructure.TreeNode;

public class CountNodesEqualToAverage {

    private int count = 0;

    public int averageOfSubtree(TreeNode root) {
        getNodeCountAndSum(root);
        return count;
    }

    private NodeCountAndSum getNodeCountAndSum(TreeNode root) {
        if (root == null) {
            return null;
        }

        int nodeCount = 1;
        int sum = root.val;
        NodeCountAndSum left = getNodeCountAndSum(root.left);
        if (left != null) {
            nodeCount += left.nodeCount;
            sum += left.sum;
        }

        NodeCountAndSum right = getNodeCountAndSum(root.right);
        if (right != null) {
            nodeCount += right.nodeCount;
            sum += right.sum;
        }

        int average = sum / nodeCount;
        if (root.val == average) {
            count++;
        }
        return new NodeCountAndSum(nodeCount, sum);
    }

    private static class NodeCountAndSum {
        private final int nodeCount;
        private final int sum;

        private NodeCountAndSum(int nodeCount, int sum) {
            this.nodeCount = nodeCount;
            this.sum = sum;
        }
    }
}
