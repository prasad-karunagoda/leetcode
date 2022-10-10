package prasad.leetcode.p2428;

public class MaxSumOfHourglass {

    public int maxSum(int[][] grid) {
        int max = 0;
        for (int i = 0; i < grid.length - 2; i++) {
            for (int j = 0; j < grid[i].length - 2; j++) {
                int sum = grid[i][j] + grid[i][j + 1] + grid[i][j + 2] +
                        grid[i + 1][j + 1] +
                        grid[i + 2][j] + grid[i + 2][j + 1] + grid[i + 2][j + 2];
                if (max < sum) {
                    max = sum;
                }
            }
        }
        return max;
    }
}
