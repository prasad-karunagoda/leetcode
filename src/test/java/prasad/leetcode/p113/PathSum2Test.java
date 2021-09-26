package prasad.leetcode.p113;

import org.junit.Assert;
import org.junit.Test;
import prasad.leetcode.datastructure.TreeNode;

import java.util.Arrays;
import java.util.List;

public class PathSum2Test {

    @Test
    public void test01() {
        TreeNode root = new TreeNode(5,
                new TreeNode(4, new TreeNode(11, new TreeNode(7), new TreeNode(2)), null),
                new TreeNode(8, new TreeNode(13), new TreeNode(4, new TreeNode(5), new TreeNode(1))));
        List<List<Integer>> paths = new PathSum2().pathSum(root, 22);
        Assert.assertEquals(2, paths.size());
        Assert.assertTrue(paths.contains(Arrays.asList(5,4,11,2)));
        Assert.assertTrue(paths.contains(Arrays.asList(5,8,4,5)));
    }

    @Test
    public void test02() {
        TreeNode root = new TreeNode(1, new TreeNode(2), new TreeNode(3));
        List<List<Integer>> paths = new PathSum2().pathSum(root, 5);
        Assert.assertTrue(paths.isEmpty());
    }

    @Test
    public void test03() {
        TreeNode root = new TreeNode(1, new TreeNode(2), null);
        List<List<Integer>> paths = new PathSum2().pathSum(root, 0);
        Assert.assertTrue(paths.isEmpty());
    }
}
