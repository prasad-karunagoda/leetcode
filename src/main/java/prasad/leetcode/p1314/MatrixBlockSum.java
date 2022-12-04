package prasad.leetcode.p1314;

public class MatrixBlockSum {

    public int[][] matrixBlockSum(int[][] mat, int k) {
        int m = mat.length;
        int n = mat[0].length;
        int[][] result = new int[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                int sum = 0;
                for (int p = i - k; p <= i + k; p++) {
                    for (int q = j - k; q <= j + k; q++) {
                        if (p >= 0 && p < m && q >= 0 && q < n) {
                            sum += mat[p][q];
                        }
                    }
                }
                result[i][j] = sum;
            }
        }
        return result;
    }
}
