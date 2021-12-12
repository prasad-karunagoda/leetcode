package prasad.leetcode.p104;

import org.junit.Assert;
import org.junit.Test;
import prasad.leetcode.datastructure.TreeNode;

public class MaximumDepthOfBinaryTreeTest {

    @Test
    public void test01() {
        TreeNode root = new TreeNode(3,
                new TreeNode(9), new TreeNode(20,
                    new TreeNode(15), new TreeNode(7)));
        Assert.assertEquals(3, new MaximumDepthOfBinaryTree().maxDepth(root));
    }

    @Test
    public void test02() {
        TreeNode root = new TreeNode(1,
                null, new TreeNode(2));
        Assert.assertEquals(2, new MaximumDepthOfBinaryTree().maxDepth(root));
    }

    @Test
    public void test03() {
        Assert.assertEquals(0, new MaximumDepthOfBinaryTree().maxDepth(null));
    }

    @Test
    public void test04() {
        Assert.assertEquals(1, new MaximumDepthOfBinaryTree().maxDepth(new TreeNode(0)));
    }
}
