package prasad.leetcode.p36;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class ValidSudoku {

    public boolean isValidSudoku(char[][] board) {
        Map<Integer, Set<Character>> foundInColumn = new HashMap<>();
        for (int i = 0; i < 9; i++) {
            foundInColumn.put(i, new HashSet<>());
        }

        Map<Integer, Set<Character>> foundInSubBox = new HashMap<>();
        for (int i = 1; i <= 9; i++) {
            foundInSubBox.put(i, new HashSet<>());
        }

        for (int row = 0; row < board.length; row++) {
            Set<Character> foundInRow = new HashSet<>();
            for (int column = 0; column < board[row].length; column++) {
                char ch = board[row][column];
                if (ch == '.') {
                    continue;
                }

                if (foundInRow.contains(ch)) {
                    return false;
                }
                else {
                    foundInRow.add(ch);
                }

                if (foundInColumn.get(column).contains(ch)) {
                    return false;
                }
                else {
                    foundInColumn.get(column).add(ch);
                }

                int subBoxNumber = getSubBoxNumber(row, column);
                if (foundInSubBox.get(subBoxNumber).contains(ch)) {
                    return false;
                }
                else {
                    foundInSubBox.get(subBoxNumber).add(ch);
                }
            }
        }
        return true;
    }

    static int getSubBoxNumber(int row, int column) {
        if (row < 3) {
            if (column < 3) {
                return 1;
            }
            else if (column < 6) {
                return 2;
            }
            else {
                return 3;
            }
        }
        else if (row < 6) {
            if (column < 3) {
                return 4;
            }
            else if (column < 6) {
                return 5;
            }
            else {
                return 6;
            }
        }
        else {
            if (column < 3) {
                return 7;
            }
            else if (column < 6) {
                return 8;
            }
            else {
                return 9;
            }
        }
    }
}
