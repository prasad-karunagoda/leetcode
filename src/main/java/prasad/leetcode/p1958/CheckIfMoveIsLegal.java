package prasad.leetcode.p1958;

public class CheckIfMoveIsLegal {

    public boolean checkMove(char[][] board, int rMove, int cMove, char color) {
        char oppositeColor = color == 'B' ? 'W' : 'B';

        // Line towards East
        if (cMove < 6 && board[rMove][cMove + 1] == oppositeColor) {
            int j = cMove + 2;
            while (j < 8) {
                if (board[rMove][j] == color) {
                    return true;
                }
                else if (board[rMove][j] == '.') {
                    break;
                }
                j++;
            }
        }

        // Line towards West
        if (cMove > 1 && board[rMove][cMove - 1] == oppositeColor) {
            int j = cMove - 2;
            while (j >= 0) {
                if (board[rMove][j] == color) {
                    return true;
                }
                else if (board[rMove][j] == '.') {
                    break;
                }
                j--;
            }
        }

        // Line towards South
        if (rMove < 6 && board[rMove + 1][cMove] == oppositeColor) {
            int i = rMove + 2;
            while (i < 8) {
                if (board[i][cMove] == color) {
                    return true;
                }
                else if (board[i][cMove] == '.') {
                    break;
                }
                i++;
            }
        }

        // Line towards North
        if (rMove > 1 && board[rMove - 1][cMove] == oppositeColor) {
            int i = rMove - 2;
            while (i >= 0) {
                if (board[i][cMove] == color) {
                    return true;
                }
                else if (board[i][cMove] == '.') {
                    break;
                }
                i--;
            }
        }

        // Diagonal towards South-East
        if (cMove < 6 && rMove < 6 && board[rMove + 1][cMove + 1] == oppositeColor) {
            int i = rMove + 2;
            int j = cMove + 2;
            while (i < 8 && j < 8) {
                if (board[i][j] == color) {
                    return true;
                }
                else if (board[i][j] == '.') {
                    break;
                }
                i++;
                j++;
            }
        }

        // Diagonal towards South-West
        if (cMove > 1 && rMove < 6 && board[rMove + 1][cMove - 1] == oppositeColor) {
            int i = rMove + 2;
            int j = cMove - 2;
            while (i < 8 && j >= 0) {
                if (board[i][j] == color) {
                    return true;
                }
                else if (board[i][j] == '.') {
                    break;
                }
                i++;
                j--;
            }
        }

        // Diagonal towards North-East
        if (cMove < 6 && rMove > 1 && board[rMove - 1][cMove + 1] == oppositeColor) {
            int i = rMove - 2;
            int j = cMove + 2;
            while (i >= 0 && j < 8) {
                if (board[i][j] == color) {
                    return true;
                }
                else if (board[i][j] == '.') {
                    break;
                }
                i--;
                j++;
            }
        }

        // Diagonal towards North-West
        if (cMove > 1 && rMove > 1 && board[rMove - 1][cMove - 1] == oppositeColor) {
            int i = rMove - 2;
            int j = cMove - 2;
            while (i >= 0 && j >= 0) {
                if (board[i][j] == color) {
                    return true;
                }
                else if (board[i][j] == '.') {
                    break;
                }
                i--;
                j--;
            }
        }

        return false;
    }
}
