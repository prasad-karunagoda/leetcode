package prasad.leetcode.p807;

import java.util.Arrays;

public class MaxIncreaseToKeepCitySkyline {

    public int maxIncreaseKeepingSkyline(int[][] grid) {
        int n = grid.length;
        int[][] columns = transposeSquare(grid);

        int[] rowMax = new int[n];
        for (int r = 0; r < n; r++) {
            rowMax[r] = Arrays.stream(grid[r]).max().getAsInt();
        }

        int[] columnMax = new int[n];
        for (int c = 0; c < n; c++) {
            columnMax[c] = Arrays.stream(columns[c]).max().getAsInt();
        }

        int totalIncrease = 0;
        for (int r = 0; r < n; r++) {
            for (int c = 0; c < n; c++) {
                totalIncrease = totalIncrease + Math.min(rowMax[r], columnMax[c]) - grid[r][c];
            }
        }
        return totalIncrease;
    }

    int[][] transposeSquare(int[][] square) {
        int n = square.length;
        int[][] transposed = new int[n][n];
        for (int r = 0; r < n; r++) {
            for (int c = 0; c < n; c++) {
                transposed[c][r] = square[r][c];
            }
        }
        return transposed;
    }
}
