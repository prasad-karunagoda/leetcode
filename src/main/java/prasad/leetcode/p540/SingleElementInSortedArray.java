package prasad.leetcode.p540;

public class SingleElementInSortedArray {

    /*
     * Specification of the input is strict. That is, every element appears exactly twice, except for one element.
     * And the input array is sorted. Therefore we can take this pairing approach.
     *
     * Take pairs from the beginning. If the pair does not have the same value, then first element of the pair is
     * a single element.
     */
    public int singleNonDuplicate(int[] nums) {
        int pairCount = nums.length / 2;
        for (int x = 0; x < pairCount; x++) {
            if (nums[x * 2] != nums[(x * 2) + 1]) {
                return nums[x * 2];
            }
        }

        // If all pairs have the same value, last element must be the single element.
        return nums[nums.length - 1];
    }
}
