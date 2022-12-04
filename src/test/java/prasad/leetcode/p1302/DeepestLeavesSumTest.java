package prasad.leetcode.p1302;

import org.junit.Assert;
import org.junit.Test;
import prasad.leetcode.datastructure.TreeNode;

public class DeepestLeavesSumTest {

    @Test
    public void test01() {
        int deepestSum = new DeepestLeavesSum().deepestLeavesSum(new TreeNode(1,
                new TreeNode(2, new TreeNode(4, new TreeNode(7), null), new TreeNode(5)),
                new TreeNode(3, null, new TreeNode(6, null, new TreeNode(8)))));
        Assert.assertEquals(15, deepestSum);
    }

    @Test
    public void test02() {
        int deepestSum = new DeepestLeavesSum().deepestLeavesSum(new TreeNode(6,
                new TreeNode(7, new TreeNode(2, new TreeNode(9), null), new TreeNode(7, new TreeNode(1), new TreeNode(4))),
                new TreeNode(8, new TreeNode(1), new TreeNode(3, null, new TreeNode(5)))));
        Assert.assertEquals(19, deepestSum);
    }

    @Test
    public void test03() {
        int deepestSum = new DeepestLeavesSum().deepestLeavesSum(new TreeNode(5));
        Assert.assertEquals(5, deepestSum);
    }

    @Test
    public void test04() {
        int deepestSum = new DeepestLeavesSum().deepestLeavesSum(new TreeNode(5, new TreeNode(3, new TreeNode(7), null), null));
        Assert.assertEquals(7, deepestSum);
    }

    @Test
    public void test05() {
        int deepestSum = new DeepestLeavesSum().deepestLeavesSum(new TreeNode(5, null, new TreeNode(8, null, new TreeNode(2))));
        Assert.assertEquals(2, deepestSum);
    }
}
