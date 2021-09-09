package prasad.leetcode.p73;

import java.util.Arrays;

public class SetMatrixZeroes {

    public void setZeroes(int[][] matrix) {
        boolean[] zeroColumns = new boolean[matrix[0].length];
        for (int i = 0; i < matrix.length; i++) {
            boolean zeroFound = false;
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] == 0) {
                    zeroFound = true;
                    zeroColumns[j] = true;
                }
            }

            if (zeroFound) {
                Arrays.fill(matrix[i], 0);
            }
        }

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (zeroColumns[j]) {
                    matrix[i][j] = 0;
                }
            }
        }
    }
}
