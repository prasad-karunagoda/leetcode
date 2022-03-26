package prasad.leetcode.p852;

public class PeakIndexInMountainArray {

    public int peakIndexInMountainArray(int[] arr) {
        for (int i = 1; i <= arr.length - 2; i++) {
            if (arr[i] > arr[i + 1]) {
                return i;
            }
        }
        throw new IllegalArgumentException("Input array is not a mountain.");
    }
}
