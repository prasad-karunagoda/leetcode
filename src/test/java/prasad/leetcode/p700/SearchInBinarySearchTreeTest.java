package prasad.leetcode.p700;

import org.junit.Assert;
import org.junit.Test;
import prasad.leetcode.datastructure.TreeNode;

public class SearchInBinarySearchTreeTest {

    @Test
    public void test01() {
        TreeNode root = new TreeNode(4, new TreeNode(2, new TreeNode(1), new TreeNode(3)), new TreeNode(7));
        TreeNode result = new SearchInBinarySearchTree().searchBST(root, 2);
        Assert.assertEquals(2, result.val);
        Assert.assertEquals(1, result.left.val);
        Assert.assertEquals(3, result.right.val);
        Assert.assertNull(result.left.left);
        Assert.assertNull(result.left.right);
        Assert.assertNull(result.right.left);
        Assert.assertNull(result.right.right);
    }

    @Test
    public void test02() {
        TreeNode root = new TreeNode(4, new TreeNode(2, new TreeNode(1), new TreeNode(3)), new TreeNode(7));
        TreeNode result = new SearchInBinarySearchTree().searchBST(root, 5);
        Assert.assertNull(result);
    }

    @Test
    public void test03() {
        TreeNode root = new TreeNode(4, new TreeNode(2, new TreeNode(1), new TreeNode(3)), new TreeNode(7));
        TreeNode result = new SearchInBinarySearchTree().searchBST(root, 3);
        Assert.assertEquals(3, result.val);
        Assert.assertNull(result.left);
        Assert.assertNull(result.right);
    }
}
