package prasad.leetcode.p2149;

public class RearrangeArrayElementsBySign {

    public int[] rearrangeArray(int[] nums) {
        int[] rearranged = new int[nums.length];
        boolean lookingForPositive = true;
        int lookingForPositiveFrom = 0;
        int lookingForNegativeFrom = 0;
        int i = 0;
        while (i < nums.length) {
            if (lookingForPositive) {
                while (nums[lookingForPositiveFrom] < 0) {
                    lookingForPositiveFrom++;
                }
                rearranged[i] = nums[lookingForPositiveFrom];
                lookingForPositiveFrom++;
            }
            else {
                while (nums[lookingForNegativeFrom] > 0) {
                    lookingForNegativeFrom++;
                }
                rearranged[i] = nums[lookingForNegativeFrom];
                lookingForNegativeFrom++;
            }
            lookingForPositive = !lookingForPositive;
            i++;
        }
        return rearranged;
    }
}
