package prasad.leetcode.p114;

import prasad.leetcode.datastructure.TreeNode;

import java.util.ArrayList;
import java.util.List;

public class FlattenBinaryTreeToLinkedList {

    private List<TreeNode> list;

    public void flatten(TreeNode root) {
        list = new ArrayList<>();
        preOrder(root);
        for (int i = 0; i < list.size() - 1; i++) {
            list.get(i).left = null;
            list.get(i).right = list.get(i + 1);
        }
        if (!list.isEmpty()) {
            list.get(list.size() - 1).left = null;
            list.get(list.size() - 1).right = null;
        }
    }

    private void preOrder(TreeNode root) {
        if (root == null) {
            return;
        }

        list.add(root);

        preOrder(root.left);
        preOrder(root.right);
    }
}
