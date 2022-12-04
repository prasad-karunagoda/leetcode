package prasad.leetcode.p1302;

import prasad.leetcode.datastructure.TreeNode;

import java.util.HashMap;
import java.util.Map;

public class DeepestLeavesSum {

    private Map<Integer, Integer> depthToSumMap;

    public int deepestLeavesSum(TreeNode root) {
        depthToSumMap = new HashMap<>();
        processNode(root, 0);
        int maxDepth = -1;
        int deepestSum = -1;
        for (Map.Entry<Integer, Integer> entry : depthToSumMap.entrySet()) {
            if (entry.getKey() > maxDepth) {
                maxDepth = entry.getKey();
                deepestSum = entry.getValue();
            }
        }
        return deepestSum;
    }

    private void processNode(TreeNode node, int depth) {
        if (node.left == null && node.right == null) {
            if (depthToSumMap.containsKey(depth)) {
                depthToSumMap.put(depth, depthToSumMap.get(depth) + node.val);
            }
            else {
                depthToSumMap.put(depth, node.val);
            }
            return;
        }

        depth++;
        if (node.left != null) {
            processNode(node.left, depth);
        }
        if (node.right != null) {
            processNode(node.right, depth);
        }
    }
}
