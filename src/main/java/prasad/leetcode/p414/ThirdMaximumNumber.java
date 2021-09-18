package prasad.leetcode.p414;

import java.util.ArrayList;
import java.util.List;

public class ThirdMaximumNumber {

    public int thirdMax(int[] nums) {
        if (nums.length == 0) {
            throw new IllegalArgumentException("Input array is empty.");
        }

        List<Integer> sorted = new ArrayList<>();
        for (int n : nums) {
            boolean consumed = false;
            for (int i = 0; i < sorted.size(); i++) {
                if (n > sorted.get(i)) {
                    sorted.add(i, n);
                    consumed = true;
                    break;
                }
                else if (n == sorted.get(i)) {
                    consumed = true;
                    break;
                }
            }

            if (!consumed) {
                sorted.add(n);
            }
        }

        if (sorted.size() >= 3) {
            return sorted.get(2);
        }
        else {
            return sorted.get(0);
        }
    }
}
