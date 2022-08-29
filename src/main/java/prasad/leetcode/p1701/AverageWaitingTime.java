package prasad.leetcode.p1701;

public class AverageWaitingTime {

    public double averageWaitingTime(int[][] customers) {
        double waitingTime = 0;
        int nextStart = customers[0][0];
        for (int[] c : customers) {
            if (nextStart >= c[0]) {
                waitingTime += nextStart + c[1] - c[0];
                nextStart += c[1];
            }
            else {
                waitingTime += c[1];
                nextStart = c[0] + c[1];
            }
        }
        return waitingTime / customers.length;
    }
}
