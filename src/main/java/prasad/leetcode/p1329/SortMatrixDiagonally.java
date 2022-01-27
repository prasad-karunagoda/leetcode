package prasad.leetcode.p1329;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortMatrixDiagonally {

    private int[][] matrix;
    private int m;
    private int n;

    public int[][] diagonalSort(int[][] mat) {
        matrix = mat;
        m = mat.length;
        n = mat[0].length;

        // Diagonals start from top
        for (int x = n - 1; x >= 0; x--) {
            sortOneDiagonal(0, x);
        }

        // Diagonals start from left
        // y = 0 is skipped here bcoz it is taken in "Diagonals start from top"
        for (int y = 1; y < m; y++) {
            sortOneDiagonal(y, 0);
        }

        return matrix;
    }

    private void sortOneDiagonal(int startRow, int startColumn) {
        int i = startRow;
        int j = startColumn;
        List<Integer> diagonal = new ArrayList<>();
        while (i < m && j < n) {
            diagonal.add(matrix[i][j]);
            i++;
            j++;
        }
        Collections.sort(diagonal);

        i = startRow;
        j = startColumn;
        int listIndex = 0;
        while (i < m && j < n) {
            matrix[i][j] = diagonal.get(listIndex);
            i++;
            j++;
            listIndex++;
        }
    }
}
