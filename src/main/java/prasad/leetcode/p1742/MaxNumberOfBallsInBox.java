package prasad.leetcode.p1742;

import java.util.stream.IntStream;

public class MaxNumberOfBallsInBox {

    public int countBalls(int lowLimit, int highLimit) {
        // Max highLimit is 100,000. Hence, max sum of digits is 45 (i.e. 9+9+9+9+9).
        int[] boxes = new int[46];
        for (int n = lowLimit; n <= highLimit; n++) {
            int sum = getSumOfDigits(n);
            boxes[sum]++;
        }
        return IntStream.of(boxes).max().getAsInt();
    }

    private int getSumOfDigits(int n) {
        char[] charArray = String.valueOf(n).toCharArray();
        int sum = 0;
        for (char c : charArray) {
            sum = sum + c - '0';
        }
        return sum;
    }
}
