package prasad.leetcode.p1572;

public class MatrixDiagonalSum {

    public int diagonalSum(int[][] mat) {
        int sum = 0;
        for (int i = 0; i < mat.length; i++) {
            // Primary diagonal
            sum += mat[i][i];

            // Secondary diagonal
            sum += mat[i][mat.length - 1 - i];
        }

        if (mat.length % 2 == 1) {
            // Middle value is added twice. Removing it.
            sum -= mat[mat.length / 2][mat.length / 2];
        }
        return sum;
    }
}
