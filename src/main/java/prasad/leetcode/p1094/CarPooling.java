package prasad.leetcode.p1094;

public class CarPooling {

    public boolean carPooling(int[][] trips, int capacity) {
        int[] needed = new int[1001];
        for (int[] t : trips) {
            for (int location = t[1]; location < t[2]; location++) {
                needed[location] += t[0];
            }
        }

        for (int n : needed) {
            if (n > capacity) {
                return false;
            }
        }
        return true;
    }
}
