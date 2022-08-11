package prasad.leetcode.p1051;

import java.util.Arrays;

public class HeightChecker {

    public int heightChecker(int[] heights) {
        int[] original = heights.clone();
        Arrays.sort(heights);
        int count = 0;
        for (int i = 0; i < original.length; i++) {
            if (original[i] != heights[i]) {
                count++;
            }
        }
        return count;
    }
}
