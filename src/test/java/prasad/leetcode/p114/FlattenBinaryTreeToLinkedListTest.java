package prasad.leetcode.p114;

import org.junit.Assert;
import org.junit.Test;
import prasad.leetcode.datastructure.TreeNode;

public class FlattenBinaryTreeToLinkedListTest {

    @Test
    public void test01() {
        TreeNode root = new TreeNode(1,
                new TreeNode(2, new TreeNode(3), new TreeNode(4)),
                new TreeNode(5, null, new TreeNode(6)));
        new FlattenBinaryTreeToLinkedList().flatten(root);
        Assert.assertEquals(1, root.val);
        Assert.assertNull(root.left);
        Assert.assertEquals(2, root.right.val);
        Assert.assertNull(root.right.left);
        Assert.assertEquals(3, root.right.right.val);
        Assert.assertNull(root.right.right.left);
        Assert.assertEquals(4, root.right.right.right.val);
        Assert.assertNull(root.right.right.right.left);
        Assert.assertEquals(5, root.right.right.right.right.val);
        Assert.assertNull(root.right.right.right.right.left);
        Assert.assertEquals(6, root.right.right.right.right.right.val);
        Assert.assertNull(root.right.right.right.right.right.left);
        Assert.assertNull(root.right.right.right.right.right.right);
    }

    @Test
    public void test02() {
        new FlattenBinaryTreeToLinkedList().flatten(null);
    }

    @Test
    public void test03() {
        TreeNode root = new TreeNode(5);
        new FlattenBinaryTreeToLinkedList().flatten(root);
        Assert.assertEquals(5, root.val);
        Assert.assertNull(root.left);
        Assert.assertNull(root.right);
    }
}
