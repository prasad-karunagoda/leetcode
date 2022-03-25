package prasad.leetcode.p2196;

import org.junit.Assert;
import org.junit.Test;
import prasad.leetcode.datastructure.TreeNode;

public class CreateBinaryTreeFromDescriptionsTest {

    @Test
    public void test01() {
        int[][] descriptions = new int[][] {{20,15,1}, {20,17,0}, {50,20,1}, {50,80,0}, {80,19,1}};
        TreeNode tree = new CreateBinaryTreeFromDescriptions().createBinaryTree(descriptions);
        Assert.assertEquals(50, tree.val);
        Assert.assertEquals(20, tree.left.val);
        Assert.assertEquals(80, tree.right.val);
        Assert.assertEquals(15, tree.left.left.val);
        Assert.assertEquals(17, tree.left.right.val);
        Assert.assertEquals(19, tree.right.left.val);
        Assert.assertNull(tree.right.right);
        Assert.assertNull(tree.left.left.left);
        Assert.assertNull(tree.left.left.right);
        Assert.assertNull(tree.left.right.left);
        Assert.assertNull(tree.left.right.right);
        Assert.assertNull(tree.right.left.left);
        Assert.assertNull(tree.right.left.right);
    }

    @Test
    public void test02() {
        int[][] descriptions = new int[][] {{1,2,1}, {2,3,0}, {3,4,1}};
        TreeNode tree = new CreateBinaryTreeFromDescriptions().createBinaryTree(descriptions);
        Assert.assertEquals(1, tree.val);
        Assert.assertEquals(2, tree.left.val);
        Assert.assertNull(tree.right);
        Assert.assertNull(tree.left.left);
        Assert.assertEquals(3, tree.left.right.val);
        Assert.assertEquals(4, tree.left.right.left.val);
        Assert.assertNull(tree.left.right.right);
    }

    @Test
    public void test03() {
        int[][] descriptions = new int[][] {{5,10,0}};
        TreeNode tree = new CreateBinaryTreeFromDescriptions().createBinaryTree(descriptions);
        Assert.assertEquals(5, tree.val);
        Assert.assertNull(tree.left);
        Assert.assertEquals(10, tree.right.val);
    }
}
