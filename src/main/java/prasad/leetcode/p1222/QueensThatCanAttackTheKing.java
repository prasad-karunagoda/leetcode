package prasad.leetcode.p1222;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class QueensThatCanAttackTheKing {

    public List<List<Integer>> queensAttackTheKing(int[][] queens, int[] king) {
        List<List<Integer>> attackingQueens = new ArrayList<>();
        boolean[][] queenExists = new boolean[8][8];
        for (int[] q : queens) {
            queenExists[q[0]][q[1]] = true;
        }

        int kingRow = king[0];
        int kingColumn = king[1];

        // To south
        for (int row = kingRow + 1; row < 8; row++) {
            if (queenExists[row][kingColumn]) {
                attackingQueens.add(Arrays.asList(row, kingColumn));
                break;
            }
        }

        // To north
        for (int row = kingRow - 1; row >= 0; row--) {
            if (queenExists[row][kingColumn]) {
                attackingQueens.add(Arrays.asList(row, kingColumn));
                break;
            }
        }

        // To east
        for (int column = kingColumn + 1; column < 8; column++) {
            if (queenExists[kingRow][column]) {
                attackingQueens.add(Arrays.asList(kingRow, column));
                break;
            }
        }

        // To west
        for (int column = kingColumn - 1; column >= 0; column--) {
            if (queenExists[kingRow][column]) {
                attackingQueens.add(Arrays.asList(kingRow, column));
                break;
            }
        }

        // To south-east
        for (int delta = 1; kingRow + delta < 8 && kingColumn + delta < 8; delta++) {
            if (queenExists[kingRow + delta][kingColumn + delta]) {
                attackingQueens.add(Arrays.asList(kingRow + delta, kingColumn + delta));
                break;
            }
        }

        // To north-east
        for (int delta = 1; kingRow - delta >= 0 && kingColumn + delta < 8; delta++) {
            if (queenExists[kingRow - delta][kingColumn + delta]) {
                attackingQueens.add(Arrays.asList(kingRow - delta, kingColumn + delta));
                break;
            }
        }

        // To south-west
        for (int delta = 1; kingRow + delta < 8 && kingColumn - delta >= 0; delta++) {
            if (queenExists[kingRow + delta][kingColumn - delta]) {
                attackingQueens.add(Arrays.asList(kingRow + delta, kingColumn - delta));
                break;
            }
        }

        // To north-west
        for (int delta = 1; kingRow - delta >= 0 && kingColumn - delta >= 0; delta++) {
            if (queenExists[kingRow - delta][kingColumn - delta]) {
                attackingQueens.add(Arrays.asList(kingRow - delta, kingColumn - delta));
                break;
            }
        }

        return attackingQueens;
    }
}
