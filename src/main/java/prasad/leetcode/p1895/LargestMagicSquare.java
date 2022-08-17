package prasad.leetcode.p1895;

public class LargestMagicSquare {

    public int largestMagicSquare(int[][] grid) {
        int x = Math.min(grid.length, grid[0].length);
        while (x > 1) {
            for (int rowStart = 0; rowStart <= grid.length - x; rowStart++) {
                for (int columnStart = 0; columnStart <= grid[0].length - x; columnStart++) {
                    int sum = -1;
                    boolean magic = true;
                    for (int i = rowStart; i < rowStart + x; i++) {
                        int rowSum = 0;
                        for (int j = columnStart; j < columnStart + x; j++) {
                            rowSum += grid[i][j];
                        }

                        if (sum == -1 || sum == rowSum) {
                            sum = rowSum;
                        }
                        else {
                            magic = false;
                            break;
                        }
                    }

                    for (int j = columnStart; j < columnStart + x; j++) {
                        int columnSum = 0;
                        for (int i = rowStart; i < rowStart + x; i++) {
                            columnSum += grid[i][j];
                        }

                        if (sum != columnSum) {
                            magic = false;
                            break;
                        }
                    }

                    int backwardSlashDiagonalSum = 0;
                    int forwardSlashDiagonalSum = 0;
                    for (int i = 0; i < x; i++) {
                        backwardSlashDiagonalSum += grid[rowStart + i][columnStart + i];
                        forwardSlashDiagonalSum += grid[rowStart + x - 1 - i][columnStart + i];
                    }
                    if (sum == backwardSlashDiagonalSum && sum == forwardSlashDiagonalSum && magic) {
                        return x;
                    }
                }
            }

            x--;
        }

        return 1;
    }
}
