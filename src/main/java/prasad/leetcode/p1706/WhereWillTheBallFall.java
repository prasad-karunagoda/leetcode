package prasad.leetcode.p1706;

public class WhereWillTheBallFall {

    public int[] findBall(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        int[] result = new int[n];
        for (int column = 0; column < n; column++) {
            int i = 0;
            int j = column;
            while (i < m) {
                if (grid[i][j] == 1 && j < n - 1 && grid[i][j + 1] == 1) {
                    i++;
                    j++;
                }
                else if (grid[i][j] == -1 && j > 0 && grid[i][j - 1] == -1) {
                    i++;
                    j--;
                }
                else {
                    break;
                }
            }

            if (i == m) {
                result[column] = j;
            }
            else {
                result[column] = -1;
            }
        }
        return result;
    }
}
