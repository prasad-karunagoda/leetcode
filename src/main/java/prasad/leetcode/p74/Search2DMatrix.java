package prasad.leetcode.p74;

public class Search2DMatrix {

    public boolean searchMatrix(int[][] matrix, int target) {
        for (int[] row : matrix) {
            if (row[row.length - 1] == target) {
                return true;
            }
            else if (row[row.length - 1] > target) {
                for (int n : row) {
                    if (n == target) {
                        return true;
                    }
                }
                return false;
            }
        }
        return false;
    }
}
