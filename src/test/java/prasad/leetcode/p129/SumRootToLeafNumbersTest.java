package prasad.leetcode.p129;

import org.junit.Assert;
import org.junit.Test;
import prasad.leetcode.datastructure.TreeNode;

public class SumRootToLeafNumbersTest {

    @Test
    public void test01() {
        TreeNode tree = new TreeNode(1, new TreeNode(2), new TreeNode(3));
        Assert.assertEquals(25, new SumRootToLeafNumbers().sumNumbers(tree));
    }

    @Test
    public void test02() {
        TreeNode tree = new TreeNode(4, new TreeNode(9, new TreeNode(5), new TreeNode(1)), new TreeNode(0));
        Assert.assertEquals(1026, new SumRootToLeafNumbers().sumNumbers(tree));
    }

    @Test
    public void test03() {
        TreeNode tree = new TreeNode(5);
        Assert.assertEquals(5, new SumRootToLeafNumbers().sumNumbers(tree));
    }

    @Test
    public void test04() {
        TreeNode tree = new TreeNode(5, null, new TreeNode(2, new TreeNode(7), null));
        Assert.assertEquals(527, new SumRootToLeafNumbers().sumNumbers(tree));
    }
}
