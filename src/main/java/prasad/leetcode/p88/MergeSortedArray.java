package prasad.leetcode.p88;

public class MergeSortedArray {

    public void merge(int[] nums1, int m, int[] nums2, int n) {
        if (m == 0) {
            System.arraycopy(nums2, 0, nums1, 0, nums2.length);
        }

        int nums1Start = 0;
        for (int i = 0; i < nums2.length; i++) {
            for (int j = nums1Start; j < m; j++) {
                if (nums2[i] < nums1[j]) {
                    shiftRight(nums1, j);
                    nums1[j] = nums2[i];
                    nums1Start = j + 1;
                    m++;
                    break;
                }
                else if (j == m - 1) {
                    System.arraycopy(nums2, i, nums1, j + 1, n - i);
                    return;
                }
            }
        }
    }

    static void shiftRight(int[] array, int startIndex) {
        System.arraycopy(array, startIndex, array, startIndex + 1, array.length - 1 - startIndex);
    }
}
