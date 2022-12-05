package prasad.leetcode.p1315;

import org.junit.Assert;
import org.junit.Test;
import prasad.leetcode.datastructure.TreeNode;

public class SumOfNodesWithEvenGrandparentTest {

    @Test
    public void test01() {
        int sum = new SumOfNodesWithEvenGrandparent().sumEvenGrandparent(new TreeNode(6,
                new TreeNode(7, new TreeNode(2, new TreeNode(9), null), new TreeNode(7, new TreeNode(1), new TreeNode(4))),
                new TreeNode(8, new TreeNode(1), new TreeNode(3, null, new TreeNode(5)))));
        Assert.assertEquals(18, sum);
    }

    @Test
    public void test02() {
        int sum = new SumOfNodesWithEvenGrandparent().sumEvenGrandparent(new TreeNode(1));
        Assert.assertEquals(0, sum);
    }

    @Test
    public void test03() {
        int sum = new SumOfNodesWithEvenGrandparent().sumEvenGrandparent(new TreeNode(4,
                new TreeNode(3, new TreeNode(5), null),
                new TreeNode(2, null, new TreeNode(4))));
        Assert.assertEquals(9, sum);
    }
}
