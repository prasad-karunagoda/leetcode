package prasad.leetcode.p1753;

import java.util.Arrays;

public class MaxScoreFromRemovingStones {

    public int maximumScore(int a, int b, int c) {
        int[] array = new int[] {a, b, c};
        Arrays.sort(array);
        if (array[0] + array[1] < array[2]) {
            return array[0] + array[1];
        }

        return (array[0] + array[1] + array[2]) / 2;
    }
}
