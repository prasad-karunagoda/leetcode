package prasad.leetcode.p228;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SummaryRanges {

    public List<String> summaryRanges(int[] nums) {
        if (nums.length == 0) {
            return new ArrayList<>();
        }
        else if (nums.length == 1) {
            return Collections.singletonList(String.valueOf(nums[0]));
        }

        List<String> ranges = new ArrayList<>();
        int start = nums[0];
        int current = start;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] > current + 1) {
                if (start == current) {
                    ranges.add(String.valueOf(start));
                }
                else {
                    ranges.add(start + "->" + current);
                }

                if (i == nums.length - 1) {
                    ranges.add(String.valueOf(nums[i]));
                }
                start = nums[i];
            }
            else if (i == nums.length - 1) {
                ranges.add(start + "->" + nums[i]);
            }

            current = nums[i];
        }

        return ranges;
    }
}
