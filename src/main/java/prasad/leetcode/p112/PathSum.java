package prasad.leetcode.p112;

import prasad.leetcode.datastructure.TreeNode;

import java.util.ArrayList;
import java.util.List;

public class PathSum {

    public boolean hasPathSum(TreeNode root, int targetSum) {
        if (root == null) {
            return false;
        }

        List<List<Integer>> paths = getPaths(root);
        paths.forEach(System.out::println);

        for (List<Integer> p : paths) {
            int sum = 0;
            for (Integer n : p) {
                sum = sum + n;
            }

            if (sum == targetSum) {
                return true;
            }
        }

        return false;
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
