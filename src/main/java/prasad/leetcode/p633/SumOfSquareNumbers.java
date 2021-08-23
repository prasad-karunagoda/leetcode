package prasad.leetcode.p633;

public class SumOfSquareNumbers {

    public boolean judgeSquareSum(int c) {
        long n = 0;
        while (n * n <= c) {
            long remaining = c - n * n;
            if (isSquare(remaining)) {
                return true;
            }
            n++;
        }
        return false;
    }

    boolean isSquare(long number) {
        long n = (long) Math.sqrt(number);
        return (number == n * n);
    }
}
