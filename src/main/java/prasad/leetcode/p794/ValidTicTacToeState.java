package prasad.leetcode.p794;

public class ValidTicTacToeState {

    public boolean validTicTacToe(String[] board) {
        String row1 = board[0];
        String row2 = board[1];
        String row3 = board[2];

        String column1 = new String(new char[] {board[0].charAt(0), board[1].charAt(0), board[2].charAt(0)});
        String column2 = new String(new char[] {board[0].charAt(1), board[1].charAt(1), board[2].charAt(1)});
        String column3 = new String(new char[] {board[0].charAt(2), board[1].charAt(2), board[2].charAt(2)});

        String forwardDiagonal = new String(new char[] {board[2].charAt(0), board[1].charAt(1), board[0].charAt(2)});
        String backwardDiagonal = new String(new char[] {board[0].charAt(0), board[1].charAt(1), board[2].charAt(2)});

        byte xWins = 0;
        byte oWins = 0;
        String[] sequences = new String[] {row1, row2, row3, column1, column2, column3,
                forwardDiagonal, backwardDiagonal};
        for (String s : sequences) {
            if (s.equals("XXX")) {
                xWins++;
            }
            else if (s.equals("OOO")) {
                oWins++;
            }
        }

        byte xCount = 0;
        byte oCount = 0;
        for (String row : board) {
            for (int i = 0; i < row.length(); i++) {
                char c = row.charAt(i);
                switch (c) {
                    case 'X':
                        xCount++;
                        break;
                    case 'O':
                        oCount++;
                        break;
                }
            }
        }

        if (xCount == oCount) {
            return (xWins == 0 && oWins <= 1);
        }
        else if (xCount == oCount + 1) {
            return (xWins <= 2 && oWins == 0);
        }
        else {
            return false;
        }
    }
}
