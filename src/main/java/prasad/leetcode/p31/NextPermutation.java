package prasad.leetcode.p31;

import java.util.Arrays;

public class NextPermutation {

    public void nextPermutation(int[] nums) {
        int sortStartIndex = -1;
        for (int i = nums.length - 1; i > 0; i--) {
            if (nums[i] > nums[i - 1]) {

                for (int j = nums.length - 1; j >= i; j--) {
                    if (nums[i - 1] < nums[j]) {
                        int temp = nums[i - 1];
                        nums[i - 1] = nums[j];
                        nums[j] = temp;
                        break;
                    }
                }

                sortStartIndex = i;
                break;
            }
        }

        if (sortStartIndex != -1) {
            sortSection(nums, sortStartIndex);
        }
        else {
            Arrays.sort(nums);
        }
    }

    private void sortSection(int[] nums, int sectionStartIndex) {
        // Bubble Sort
        while (true) {
            boolean sorted = true;
            for (int i = sectionStartIndex; i < nums.length - 1; i++) {
                if (nums[i] > nums[i + 1]) {
                    int temp = nums[i];
                    nums[i] = nums[i + 1];
                    nums[i + 1] = temp;
                    sorted = false;
                }
            }

            if (sorted) {
                break;
            }
        }
    }
}
