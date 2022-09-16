package prasad.leetcode.p289;

public class GameOfLife {

    public void gameOfLife(int[][] board) {
        int m = board.length;
        int n = board[0].length;
        int[][] liveNeighborsCount = new int[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (i > 0) {
                    if (j > 0) {
                        liveNeighborsCount[i][j] += board[i - 1][j - 1];
                    }
                    if (j < n - 1) {
                        liveNeighborsCount[i][j] += board[i - 1][j + 1];
                    }
                    liveNeighborsCount[i][j] += board[i - 1][j];
                }

                if (i < m - 1) {
                    if (j > 0) {
                        liveNeighborsCount[i][j] += board[i + 1][j - 1];
                    }
                    if (j < n - 1) {
                        liveNeighborsCount[i][j] += board[i + 1][j + 1];
                    }
                    liveNeighborsCount[i][j] += board[i + 1][j];
                }

                if (j > 0) {
                    liveNeighborsCount[i][j] += board[i][j - 1];
                }
                if (j < n - 1) {
                    liveNeighborsCount[i][j] += board[i][j + 1];
                }
            }
        }

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (board[i][j] == 1) {
                    if (liveNeighborsCount[i][j] < 2 || liveNeighborsCount[i][j] > 3) {
                        board[i][j] = 0;
                    }
                }
                else {
                    if (liveNeighborsCount[i][j] == 3) {
                        board[i][j] = 1;
                    }
                }
            }
        }
    }
}
