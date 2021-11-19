package prasad.leetcode.p994;

public class RottingOranges {

    private static final int FRESH = 1;
    private static final int ROTTEN = 2;

    public int orangesRotting(int[][] grid) {
        int minutes = 0;
        boolean changed;
        do {
            int[][] changedGrid = copy(grid);
            changed = false;
            for (int i = 0; i < grid.length; i++) {
                for (int j = 0; j < grid[i].length; j++) {
                    if (grid[i][j] == ROTTEN) {
                        if (j < grid[i].length - 1 && grid[i][j + 1] == FRESH) {
                            changedGrid[i][j + 1] = ROTTEN;
                            changed = true;
                        }
                        if (j > 0 && grid[i][j - 1] == FRESH) {
                            changedGrid[i][j - 1] = ROTTEN;
                            changed = true;
                        }
                        if (i < grid.length - 1 && grid[i + 1][j] == FRESH) {
                            changedGrid[i + 1][j] = ROTTEN;
                            changed = true;
                        }
                        if (i > 0 && grid[i - 1][j] == FRESH) {
                            changedGrid[i - 1][j] = ROTTEN;
                            changed = true;
                        }
                    }
                }
            }

            if (changed) {
                grid = changedGrid;
                minutes++;
            }
        }
        while (changed);

        return freshOrangeExists(grid) ? -1 : minutes;
    }

    private boolean freshOrangeExists(int[][] grid) {
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                if (grid[i][j] == FRESH) {
                    return true;
                }
            }
        }
        return false;
    }

    private int[][] copy(int[][] grid) {
        int[][] copy = new int[grid.length][];
        for (int i = 0; i < grid.length; i++) {
            int[] row = new int[grid[i].length];
            System.arraycopy(grid[i], 0, row, 0, grid[i].length);
            copy[i] = row;
        }
        return copy;
    }
}
