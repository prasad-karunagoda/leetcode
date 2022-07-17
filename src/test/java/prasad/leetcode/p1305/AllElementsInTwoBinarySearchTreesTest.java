package prasad.leetcode.p1305;

import org.junit.Assert;
import org.junit.Test;
import prasad.leetcode.datastructure.TreeNode;

import java.util.Arrays;
import java.util.List;

public class AllElementsInTwoBinarySearchTreesTest {

    @Test
    public void test01() {
        TreeNode root1 = new TreeNode(2, new TreeNode(1), new TreeNode(4));
        TreeNode root2 = new TreeNode(1, new TreeNode(0), new TreeNode(3));
        List<Integer> allElements = new AllElementsInTwoBinarySearchTrees().getAllElements(root1, root2);
        Assert.assertEquals(Arrays.asList(0,1,1,2,3,4), allElements);
    }

    @Test
    public void test02() {
        TreeNode root1 = new TreeNode(1, null, new TreeNode(8));
        TreeNode root2 = new TreeNode(8, new TreeNode(1), null);
        List<Integer> allElements = new AllElementsInTwoBinarySearchTrees().getAllElements(root1, root2);
        Assert.assertEquals(Arrays.asList(1,1,8,8), allElements);
    }

    @Test
    public void test03() {
        TreeNode root1 = new TreeNode(5);
        TreeNode root2 = new TreeNode(3);
        List<Integer> allElements = new AllElementsInTwoBinarySearchTrees().getAllElements(root1, root2);
        Assert.assertEquals(Arrays.asList(3,5), allElements);
    }

    @Test
    public void test04() {
        TreeNode root1 = new TreeNode(8,
                new TreeNode(4, new TreeNode(1), new TreeNode(6)),
                new TreeNode(14, new TreeNode(10), new TreeNode(16)));
        TreeNode root2 = new TreeNode(10,
                new TreeNode(5, new TreeNode(3), new TreeNode(6)),
                new TreeNode(15, new TreeNode(12), new TreeNode(17)));
        List<Integer> allElements = new AllElementsInTwoBinarySearchTrees().getAllElements(root1, root2);
        Assert.assertEquals(Arrays.asList(1,3,4,5,6,6,8,10,10,12,14,15,16,17), allElements);
    }
}
