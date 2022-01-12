package prasad.leetcode.p509;

public class FibonacciNumber {

    public int fib(int n) {
        if (n == 0) {
            return 0;
        }

        int[] series = new int[n + 1];
        series[0] = 0;
        series[1] = 1;
        for (int i = 2; i < n + 1; i++) {
            series[i] = series[i - 2] + series[i - 1];
        }
        return series[n];
    }
}
