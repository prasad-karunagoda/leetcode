package prasad.leetcode.p2482;

public class DifferenceBetweenOnesAndZeros {

    public int[][] onesMinusZeros(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        int[] onesRow = new int[m];
        int[] onesColumn = new int[n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                int x = grid[i][j];
                onesRow[i] += x;
                onesColumn[j] += x;
            }
        }

        int[][] diff = new int[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                diff[i][j] = onesRow[i] + onesColumn[j] - (n - onesRow[i]) - (m - onesColumn[j]);
            }
        }
        return diff;
    }
}
