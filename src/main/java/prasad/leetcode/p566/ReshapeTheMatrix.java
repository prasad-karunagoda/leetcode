package prasad.leetcode.p566;

public class ReshapeTheMatrix {

    public int[][] matrixReshape(int[][] mat, int r, int c) {
        validateMatrix(mat);

        int valueCount = mat.length * mat[0].length;
        if (valueCount != r * c) {
            return mat;
        }

        int[] values = new int[valueCount];
        int valuesIndex = 0;
        for (int[] row : mat) {
            for (int n : row) {
                values[valuesIndex] = n;
                valuesIndex++;
            }
        }

        int[][] reshaped = new int[r][c];
        valuesIndex = 0;
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                reshaped[i][j] = values[valuesIndex];
                valuesIndex++;
            }
        }
        return reshaped;
    }

    private void validateMatrix(int[][] mat) {
        if (mat.length == 0) {
            throw new IllegalArgumentException("Matrix is empty.");
        }
        int width = mat[0].length;
        for (int i = 1; i < mat.length; i++) {
            if (width != mat[i].length) {
                throw new IllegalArgumentException("Matrix is not a rectangle.");
            }
        }
    }
}
