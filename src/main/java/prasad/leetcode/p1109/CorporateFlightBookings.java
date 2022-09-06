package prasad.leetcode.p1109;

public class CorporateFlightBookings {

    public int[] corpFlightBookings(int[][] bookings, int n) {
        int[] totals = new int[n];
        for (int[] b : bookings) {
            for (int x = b[0]; x <= b[1]; x++) {
                totals[x - 1] += b[2];
            }
        }
        return totals;
    }
}
