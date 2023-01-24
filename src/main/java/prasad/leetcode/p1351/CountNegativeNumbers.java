package prasad.leetcode.p1351;

public class CountNegativeNumbers {

    public int countNegatives(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        int count = 0;
        for (int i = 0; i < m; i++) {
            if (grid[i][0] < 0) {
                count = count + ((m - i) * n);
                break;
            }
            for (int j = 0; j < n; j++) {
                if (grid[i][j] < 0) {
                    count = count + n - j;
                    break;
                }
            }
        }
        return count;
    }
}
