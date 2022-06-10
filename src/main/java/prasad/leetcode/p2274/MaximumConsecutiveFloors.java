package prasad.leetcode.p2274;

import java.util.Arrays;

public class MaximumConsecutiveFloors {

    public int maxConsecutive(int bottom, int top, int[] special) {
        Arrays.sort(special);
        int max = 0;
        if (bottom < special[0]) {
            if (special[0] - bottom > max) {
                max = special[0] - bottom;
            }
        }

        for (int i = 0; i <= special.length - 2; i++) {
            if (special[i + 1] - special[i] - 1 > max) {
                max = special[i + 1] - special[i] - 1;
            }
        }

        if (top > special[special.length - 1]) {
            if (top - special[special.length - 1] > max) {
                max = top - special[special.length - 1];
            }
        }

        return max;
    }
}
