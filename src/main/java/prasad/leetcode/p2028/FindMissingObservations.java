package prasad.leetcode.p2028;

public class FindMissingObservations {

    public int[] missingRolls(int[] rolls, int mean, int n) {
        int m = rolls.length;
        int availableTotal = 0;
        for (int r : rolls) {
            availableTotal += r;
        }
        int missingTotal = (mean * (m + n)) - availableTotal;

        if (missingTotal < n || missingTotal > n * 6) {
            return new int[0];
        }
        else {
            int missingMean = missingTotal / n;
            int remainder = missingTotal % n;

            int[] missing = new int[n];
            for (int i = 0; i < remainder; i++) {
                missing[i] = missingMean + 1;
            }
            for (int i = remainder; i < n; i++) {
                missing[i] = missingMean;
            }
            return missing;
        }
    }
}
