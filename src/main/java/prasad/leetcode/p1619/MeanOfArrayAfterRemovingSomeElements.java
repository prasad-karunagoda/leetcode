package prasad.leetcode.p1619;

import java.util.Arrays;

public class MeanOfArrayAfterRemovingSomeElements {

    public double trimMean(int[] arr) {
        Arrays.sort(arr);
        int fivePercent = arr.length / 20;
        int[] truncated = Arrays.copyOfRange(arr, fivePercent, arr.length - fivePercent);
        return Arrays.stream(truncated).average().getAsDouble();
    }
}
