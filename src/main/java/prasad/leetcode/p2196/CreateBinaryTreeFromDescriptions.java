package prasad.leetcode.p2196;

import prasad.leetcode.datastructure.TreeNode;

import java.util.HashMap;

public class CreateBinaryTreeFromDescriptions {

    public TreeNode createBinaryTree(int[][] descriptions) {
        HashMap<Integer, TreeNode> map = new HashMap<>();
        HashMap<TreeNode, TreeNode> parentMap = new HashMap<>();
        for (int[] desc : descriptions) {
            TreeNode parent;
            if (map.containsKey(desc[0])) {
                parent = map.get(desc[0]);
            }
            else {
                parent = new TreeNode(desc[0]);
                map.put(desc[0], parent);
            }

            TreeNode child;
            if (map.containsKey(desc[1])) {
                child = map.get(desc[1]);
            }
            else {
                child = new TreeNode(desc[1]);
                map.put(desc[1], child);
            }

            if (desc[2] == 1) {
                parent.left = child;
            }
            else {
                parent.right = child;
            }
            parentMap.put(child, parent);
        }

        TreeNode node = map.get(descriptions[0][0]);
        while (parentMap.get(node) != null) {
            node = parentMap.get(node);
        }
        return node;
    }
}
