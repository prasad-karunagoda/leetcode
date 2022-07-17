package prasad.leetcode.p1305;

import prasad.leetcode.datastructure.TreeNode;

import java.util.ArrayList;
import java.util.List;

public class AllElementsInTwoBinarySearchTrees {

    public List<Integer> getAllElements(TreeNode root1, TreeNode root2) {
        int[] array1 = toArray(root1);
        int[] array2 = toArray(root2);

        List<Integer> allElements = new ArrayList<>();
        int currentIndex1 = 0;
        int currentIndex2 = 0;
        while (allElements.size() < array1.length + array2.length) {
            if (currentIndex1 == array1.length) {
                allElements.add(array2[currentIndex2]);
                currentIndex2++;
            }
            else if (currentIndex2 == array2.length) {
                allElements.add(array1[currentIndex1]);
                currentIndex1++;
            }
            else if (array1[currentIndex1] <= array2[currentIndex2]) {
                allElements.add(array1[currentIndex1]);
                currentIndex1++;
            }
            else {
                allElements.add(array2[currentIndex2]);
                currentIndex2++;
            }
        }
        return allElements;
    }

    private int[] toArray(TreeNode tree) {
        if (tree == null) {
            return new int[0];
        }

        int[] leftArray = toArray(tree.left);
        int[] rightArray = toArray(tree.right);
        int[] fullArray = new int[leftArray.length + 1 + rightArray.length];
        System.arraycopy(leftArray, 0, fullArray, 0, leftArray.length);
        fullArray[leftArray.length] = tree.val;
        System.arraycopy(rightArray, 0, fullArray, leftArray.length + 1, rightArray.length);
        return fullArray;
    }
}
