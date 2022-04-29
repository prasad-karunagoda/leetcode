package prasad.leetcode.p883;

import java.util.Arrays;

public class ProjectionAreaOf3dShapes {

    public int projectionArea(int[][] grid) {
        int xProjection = 0;
        int zProjection = 0;
        for (int[] row : grid) {
            for (int v : row) {
                if (v > 0) {
                    zProjection++;
                }
            }

            xProjection += Arrays.stream(row).max().getAsInt();
        }

        int n = grid.length;
        int[][] transformed = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                transformed[j][i] = grid[i][j];
            }
        }

        int yProjection = 0;
        for (int[] row : transformed) {
            yProjection += Arrays.stream(row).max().getAsInt();
        }

        return xProjection + yProjection + zProjection;
    }
}
