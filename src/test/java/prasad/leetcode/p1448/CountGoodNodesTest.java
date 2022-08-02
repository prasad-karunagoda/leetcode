package prasad.leetcode.p1448;

import org.junit.Assert;
import org.junit.Test;
import prasad.leetcode.datastructure.TreeNode;

public class CountGoodNodesTest {

    @Test
    public void test01() {
        TreeNode tree = new TreeNode(3,
                new TreeNode(1, new TreeNode(3), null),
                new TreeNode(4, new TreeNode(1), new TreeNode(5)));
        Assert.assertEquals(4, new CountGoodNodes().goodNodes(tree));
    }

    @Test
    public void test02() {
        TreeNode tree = new TreeNode(3,
                new TreeNode(3, new TreeNode(4), new TreeNode(2)),
                null);
        Assert.assertEquals(3, new CountGoodNodes().goodNodes(tree));
    }

    @Test
    public void test03() {
        TreeNode tree = new TreeNode(3,
                new TreeNode(5, new TreeNode(3), new TreeNode(7)),
                new TreeNode(2, new TreeNode(6), new TreeNode(8)));
        Assert.assertEquals(5, new CountGoodNodes().goodNodes(tree));
    }
}
