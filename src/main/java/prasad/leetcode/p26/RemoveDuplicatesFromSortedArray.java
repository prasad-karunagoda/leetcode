package prasad.leetcode.p26;

public class RemoveDuplicatesFromSortedArray {

    public int removeDuplicates(int[] nums) {
        int comparisonCount = nums.length - 1;
        int currentIndex = 0;
        int newLength = nums.length;
        while (comparisonCount > 0) {
            if (nums[currentIndex] == nums[currentIndex + 1]) {
                System.arraycopy(nums, currentIndex + 2, nums, currentIndex + 1, nums.length - currentIndex - 2);
                newLength--;
            }
            else {
                currentIndex++;
            }
            comparisonCount--;

            /*
            for (int i = 0; i < newLength; i++) {
                if (i == currentIndex) {
                    System.out.print(">");
                }
                System.out.print(nums[i] + " ");
            }
            System.out.println();
             */

        }
        return newLength;
    }
}
