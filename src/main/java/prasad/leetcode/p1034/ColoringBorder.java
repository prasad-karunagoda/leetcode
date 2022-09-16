package prasad.leetcode.p1034;

import java.util.Arrays;

public class ColoringBorder {

    private int[][] grid;
    private int[][] result;
    private boolean[][] checked;
    private int componentColor;
    private int borderColor;

    public int[][] colorBorder(int[][] grid, int row, int col, int color) {
        this.grid = grid;
        result = new int[grid.length][];
        for (int i = 0; i < grid.length; i++) {
            result[i] = Arrays.copyOf(grid[i], grid[i].length);
        }
        checked = new boolean[grid.length][grid[0].length];
        componentColor = grid[row][col];
        borderColor = color;

        checkNeighbors(row, col);
        return result;
    }

    private void checkNeighbors(int row, int col) {
        if (checked[row][col]) {
            return;
        }
        checked[row][col] = true;

        if (row > 0 && grid[row - 1][col] == componentColor) {
            checkNeighbors(row - 1, col);
        }
        else {
            result[row][col] = borderColor;
        }

        if (row < grid.length - 1 && grid[row + 1][col] == componentColor) {
            checkNeighbors(row + 1, col);
        }
        else {
            result[row][col] = borderColor;
        }

        if (col > 0 && grid[row][col - 1] == componentColor) {
            checkNeighbors(row, col - 1);
        }
        else {
            result[row][col] = borderColor;
        }

        if (col < grid[0].length - 1 && grid[row][col + 1] == componentColor) {
            checkNeighbors(row, col + 1);
        }
        else {
            result[row][col] = borderColor;
        }
    }
}
