package prasad.leetcode.p912;

public class SortArray {

    public int[] sortArray(int[] nums) {
        mergeSort(nums);
        return nums;
    }

    private void mergeSort(int[] nums) {
        if (nums.length <= 1) {
            return;
        }

        int[] leftHalf = new int[nums.length / 2];
        int[] rightHalf = new int[nums.length - (nums.length / 2)];
        System.arraycopy(nums, 0, leftHalf, 0, leftHalf.length);
        System.arraycopy(nums, leftHalf.length, rightHalf, 0, rightHalf.length);

        mergeSort(leftHalf);
        mergeSort(rightHalf);

        merge(nums, leftHalf, rightHalf);
    }

    private void merge(int[] nums, int[] leftHalf, int[] rightHalf) {
        int i = 0, j = 0, k = 0;
        while (i < leftHalf.length && j < rightHalf.length) {
            if (leftHalf[i] <= rightHalf[j]) {
                nums[k] = leftHalf[i];
                i++;
            }
            else {
                nums[k] = rightHalf[j];
                j++;
            }
            k++;
        }

        while (i < leftHalf.length) {
            nums[k] = leftHalf[i];
            i++;
            k++;
        }

        while (j < rightHalf.length) {
            nums[k] = rightHalf[j];
            j++;
            k++;
        }
    }
}
