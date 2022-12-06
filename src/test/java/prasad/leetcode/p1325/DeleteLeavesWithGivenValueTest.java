package prasad.leetcode.p1325;

import org.junit.Assert;
import org.junit.Test;
import prasad.leetcode.datastructure.TreeNode;

public class DeleteLeavesWithGivenValueTest {

    @Test
    public void test01() {
        TreeNode tree = new TreeNode(1,
                new TreeNode(2, new TreeNode(2), null),
                new TreeNode(3, new TreeNode(2), new TreeNode(4)));
        TreeNode result = new DeleteLeavesWithGivenValue().removeLeafNodes(tree, 2);
        Assert.assertEquals(1, result.val);
        Assert.assertNull(result.left);
        Assert.assertEquals(3, result.right.val);
        Assert.assertNull(result.right.left);
        Assert.assertEquals(4, result.right.right.val);
        Assert.assertNull(result.right.right.left);
        Assert.assertNull(result.right.right.right);
    }

    @Test
    public void test02() {
        TreeNode tree = new TreeNode(1,
                new TreeNode(3, new TreeNode(3), new TreeNode(2)),
                new TreeNode(3));
        TreeNode result = new DeleteLeavesWithGivenValue().removeLeafNodes(tree, 3);
        Assert.assertEquals(1, result.val);
        Assert.assertEquals(3, result.left.val);
        Assert.assertNull(result.right);
        Assert.assertNull(result.left.left);
        Assert.assertEquals(2, result.left.right.val);
        Assert.assertNull(result.left.right.left);
        Assert.assertNull(result.left.right.right);
    }

    @Test
    public void test03() {
        TreeNode tree = new TreeNode(1,
                new TreeNode(2, new TreeNode(2, new TreeNode(2), null), null),
                null);
        TreeNode result = new DeleteLeavesWithGivenValue().removeLeafNodes(tree, 2);
        Assert.assertEquals(1, result.val);
        Assert.assertNull(result.left);
        Assert.assertNull(result.right);
    }

    @Test
    public void test04() {
        TreeNode tree = new TreeNode(2,
                new TreeNode(2, new TreeNode(2, new TreeNode(2), null), null),
                null);
        TreeNode result = new DeleteLeavesWithGivenValue().removeLeafNodes(tree, 2);
        Assert.assertNull(result);
    }

    @Test
    public void test05() {
        TreeNode tree = new TreeNode(5, new TreeNode(2), new TreeNode(3));
        TreeNode result = new DeleteLeavesWithGivenValue().removeLeafNodes(tree, 4);
        Assert.assertEquals(5, result.val);
        Assert.assertEquals(2, result.left.val);
        Assert.assertEquals(3, result.right.val);
        Assert.assertNull(result.left.left);
        Assert.assertNull(result.left.right);
        Assert.assertNull(result.right.left);
        Assert.assertNull(result.right.right);
    }
}
