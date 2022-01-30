package prasad.leetcode.p654;

import prasad.leetcode.datastructure.TreeNode;

public class MaximumBinaryTree {

    public TreeNode constructMaximumBinaryTree(int[] nums) {
        if (nums.length == 0) {
            return null;
        }

        int max = -1;
        int maxIndex = -1;
        for (int i = 0; i < nums.length; i++) {
            if (max < nums[i]) {
                max = nums[i];
                maxIndex = i;
            }
        }

        int[] left = new int[maxIndex];
        System.arraycopy(nums, 0, left, 0, maxIndex);
        TreeNode leftTree = constructMaximumBinaryTree(left);

        int[] right = new int[nums.length - maxIndex - 1];
        System.arraycopy(nums, maxIndex + 1, right, 0, nums.length - maxIndex - 1);
        TreeNode rightTree = constructMaximumBinaryTree(right);

        return new TreeNode(max, leftTree, rightTree);
    }
}
