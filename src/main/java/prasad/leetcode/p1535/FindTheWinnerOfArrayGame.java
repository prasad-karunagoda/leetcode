package prasad.leetcode.p1535;

import java.util.stream.IntStream;

public class FindTheWinnerOfArrayGame {

    public int getWinner(int[] arr, int k) {
        if (k >= arr.length - 1) {
            return IntStream.of(arr).max().getAsInt();
        }

        int count = 0;
        int previousWinner = -1;
        while (count < k) {
            int first;
            int last;
            if (arr[0] > arr[1]) {
                first = arr[0];
                last = arr[1];
            }
            else {
                first = arr[1];
                last = arr[0];
            }

            if (previousWinner == first) {
                count++;
            }
            else {
                count = 1;
                previousWinner = first;
            }

            System.arraycopy(arr, 2, arr, 1, arr.length - 2);
            arr[0] = first;
            arr[arr.length - 1] = last;
        }
        return previousWinner;
    }
}
