package prasad.leetcode.p113;

import prasad.leetcode.datastructure.TreeNode;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class PathSum2 {

    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
        List<List<Integer>> paths = getPaths(root);

        List<List<Integer>> targetSumPaths = new ArrayList<>();
        for (List<Integer> p : paths) {
            int sum = 0;
            for (Integer n : p) {
                sum = sum + n;
            }

            if (sum == targetSum) {
                Collections.reverse(p);
                targetSumPaths.add(p);
            }
        }

        return targetSumPaths;
    }

    private List<List<Integer>> getPaths(TreeNode root) {
        List<List<Integer>> paths = new ArrayList<>();
        if (root == null) {
            return paths;
        }
        if (root.left == null && root.right == null) {
            List<Integer> path = new ArrayList<>();
            path.add(root.val);

            paths.add(path);
            return paths;
        }

        List<List<Integer>> leftPaths = getPaths(root.left);
        leftPaths.forEach(p -> p.add(root.val));
        paths.addAll(leftPaths);

        List<List<Integer>> rightPaths = getPaths(root.right);
        rightPaths.forEach(p -> p.add(root.val));
        paths.addAll(rightPaths);

        return paths;
    }
}
