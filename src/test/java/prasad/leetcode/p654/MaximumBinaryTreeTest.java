package prasad.leetcode.p654;

import org.junit.Assert;
import org.junit.Test;
import prasad.leetcode.datastructure.TreeNode;

public class MaximumBinaryTreeTest {

    @Test
    public void test01() {
        TreeNode tree = new MaximumBinaryTree().constructMaximumBinaryTree(new int[] {3,2,1,6,0,5});
        Assert.assertEquals(6, tree.val);
        Assert.assertEquals(3, tree.left.val);
        Assert.assertEquals(5, tree.right.val);
        Assert.assertNull(tree.left.left);
        Assert.assertEquals(2, tree.left.right.val);
        Assert.assertEquals(0, tree.right.left.val);
        Assert.assertNull(tree.right.right);
        Assert.assertNull(tree.left.right.left);
        Assert.assertEquals(1, tree.left.right.right.val);
        Assert.assertNull(tree.right.left.left);
        Assert.assertNull(tree.right.left.right);
        Assert.assertNull(tree.left.right.right.left);
        Assert.assertNull(tree.left.right.right.right);
    }

    @Test
    public void test02() {
        TreeNode tree = new MaximumBinaryTree().constructMaximumBinaryTree(new int[] {3,2,1});
        Assert.assertEquals(3, tree.val);
        Assert.assertNull(tree.left);
        Assert.assertEquals(2, tree.right.val);
        Assert.assertNull(tree.right.left);
        Assert.assertEquals(1, tree.right.right.val);
        Assert.assertNull(tree.right.right.left);
        Assert.assertNull(tree.right.right.right);
    }

    @Test
    public void test03() {
        TreeNode tree = new MaximumBinaryTree().constructMaximumBinaryTree(new int[] {5});
        Assert.assertEquals(5, tree.val);
        Assert.assertNull(tree.left);
        Assert.assertNull(tree.right);
    }
}
