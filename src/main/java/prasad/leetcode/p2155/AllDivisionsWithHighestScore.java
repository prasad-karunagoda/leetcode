package prasad.leetcode.p2155;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class AllDivisionsWithHighestScore {

    public List<Integer> maxScoreIndices(int[] nums) {
        int zeros = 0;
        int ones = Arrays.stream(nums).sum();
        int highest = zeros + ones;
        List<Integer> highestIndices = new ArrayList<>();
        highestIndices.add(0);
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) {
                zeros++;
            }
            else {
                ones--;
            }

            if (highest < zeros + ones) {
                highest = zeros + ones;
                highestIndices.clear();
                highestIndices.add(i + 1);
            }
            else if (highest == zeros + ones) {
                highestIndices.add(i + 1);
            }
        }
        return highestIndices;
    }
}
