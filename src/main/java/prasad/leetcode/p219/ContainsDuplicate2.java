package prasad.leetcode.p219;

import java.util.HashSet;
import java.util.Set;

public class ContainsDuplicate2 {

    public boolean containsNearbyDuplicate(int[] nums, int k) {
        Set<Integer> set = new HashSet<>();
        for (int a = 0; a < nums.length; a++) {
            if (!set.add(nums[a])) {
                if (a <= k) {
                    return true;
                }
                else {
                    for (int b = 1; b <= k; b++) {
                        if (nums[a] == nums[a - b]) {
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }

    public boolean containsNearbyDuplicateTooSlow(int[] nums, int k) {
        for (int a = 0; a < nums.length; a++) {
            for (int b = 1; b <= k; b++) {
                if (a + b < nums.length && nums[a] == nums[a + b]) {
                    return true;
                }
            }
        }
        return false;
    }
}
