package prasad.leetcode.p2265;

import org.junit.Assert;
import org.junit.Test;
import prasad.leetcode.datastructure.TreeNode;

public class CountNodesEqualToAverageTest {

    @Test
    public void test01() {
        TreeNode tree = new TreeNode(4,
                new TreeNode(8, new TreeNode(0), new TreeNode(1)),
                new TreeNode(5, null, new TreeNode(6)));
        Assert.assertEquals(5, new CountNodesEqualToAverage().averageOfSubtree(tree));
    }

    @Test
    public void test02() {
        TreeNode tree = new TreeNode(5);
        Assert.assertEquals(1, new CountNodesEqualToAverage().averageOfSubtree(tree));
    }

    @Test
    public void test03() {
        TreeNode tree = new TreeNode(4,
                new TreeNode(8),
                new TreeNode(5));
        Assert.assertEquals(2, new CountNodesEqualToAverage().averageOfSubtree(tree));
    }

    @Test
    public void test04() {
        TreeNode tree = new TreeNode(5,
                new TreeNode(8),
                new TreeNode(4));
        Assert.assertEquals(3, new CountNodesEqualToAverage().averageOfSubtree(tree));
    }
}
