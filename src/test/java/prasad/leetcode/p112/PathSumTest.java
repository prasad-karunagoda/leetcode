package prasad.leetcode.p112;

import org.junit.Assert;
import org.junit.Test;
import prasad.leetcode.datastructure.TreeNode;

public class PathSumTest {

    @Test
    public void test01() {
        TreeNode root = new TreeNode(5,
                new TreeNode(4, new TreeNode(11, new TreeNode(7), new TreeNode(2)), null),
                new TreeNode(8, new TreeNode(13), new TreeNode(4, null, new TreeNode(1))));

        Assert.assertTrue(new PathSum().hasPathSum(root, 22));
    }

    @Test
    public void test02() {
        TreeNode root = new TreeNode(1, new TreeNode(2), new TreeNode(3));

        Assert.assertFalse(new PathSum().hasPathSum(root, 5));
    }

    @Test
    public void test03() {
        Assert.assertFalse(new PathSum().hasPathSum(null, 5));
    }

    @Test
    public void test04() {
        TreeNode root = new TreeNode(1, new TreeNode(2, new TreeNode(3, new TreeNode(4), null), null), null);

        Assert.assertTrue(new PathSum().hasPathSum(root, 10));
    }
}
