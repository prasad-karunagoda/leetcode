package prasad.leetcode.p1261;

import org.junit.Assert;
import org.junit.Test;
import prasad.leetcode.datastructure.TreeNode;

public class FindElementsInContaminatedBinaryTreeTest {

    @Test
    public void test01() {
        FindElementsInContaminatedBinaryTree findElements = new FindElementsInContaminatedBinaryTree(
                new TreeNode(-1, null, new TreeNode(-1)));
        Assert.assertTrue(findElements.find(0));
        Assert.assertFalse(findElements.find(1));
        Assert.assertTrue(findElements.find(2));
        Assert.assertFalse(findElements.find(3));
    }

    @Test
    public void test02() {
        FindElementsInContaminatedBinaryTree findElements = new FindElementsInContaminatedBinaryTree(
                new TreeNode(-1, new TreeNode(-1, new TreeNode(-1), new TreeNode(-1)), new TreeNode(-1)));
        Assert.assertTrue(findElements.find(0));
        Assert.assertTrue(findElements.find(1));
        Assert.assertTrue(findElements.find(2));
        Assert.assertTrue(findElements.find(3));
        Assert.assertTrue(findElements.find(4));
        Assert.assertFalse(findElements.find(5));
        Assert.assertFalse(findElements.find(6));
    }

    @Test
    public void test03() {
        FindElementsInContaminatedBinaryTree findElements = new FindElementsInContaminatedBinaryTree(
                new TreeNode(-1, null, new TreeNode(-1, new TreeNode(-1, new TreeNode(-1), null), null)));
        Assert.assertTrue(findElements.find(0));
        Assert.assertFalse(findElements.find(1));
        Assert.assertTrue(findElements.find(2));
        Assert.assertFalse(findElements.find(3));
        Assert.assertFalse(findElements.find(4));
        Assert.assertTrue(findElements.find(5));
        Assert.assertFalse(findElements.find(6));
        Assert.assertTrue(findElements.find(11));
    }

    @Test
    public void test04() {
        FindElementsInContaminatedBinaryTree findElements = new FindElementsInContaminatedBinaryTree(
                new TreeNode(-1));
        Assert.assertTrue(findElements.find(0));
        Assert.assertFalse(findElements.find(1));
        Assert.assertFalse(findElements.find(2));
        Assert.assertFalse(findElements.find(3));
    }
}
