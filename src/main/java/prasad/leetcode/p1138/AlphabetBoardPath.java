package prasad.leetcode.p1138;

import prasad.leetcode.datastructure.Point;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class AlphabetBoardPath {

    private static final Map<Character, Point> BOARD = new HashMap<>();

    static {
        BOARD.put('a', new Point(0, 0));
        BOARD.put('b', new Point(1, 0));
        BOARD.put('c', new Point(2, 0));
        BOARD.put('d', new Point(3, 0));
        BOARD.put('e', new Point(4, 0));
        BOARD.put('f', new Point(0, 1));
        BOARD.put('g', new Point(1, 1));
        BOARD.put('h', new Point(2, 1));
        BOARD.put('i', new Point(3, 1));
        BOARD.put('j', new Point(4, 1));
        BOARD.put('k', new Point(0, 2));
        BOARD.put('l', new Point(1, 2));
        BOARD.put('m', new Point(2, 2));
        BOARD.put('n', new Point(3, 2));
        BOARD.put('o', new Point(4, 2));
        BOARD.put('p', new Point(0, 3));
        BOARD.put('q', new Point(1, 3));
        BOARD.put('r', new Point(2, 3));
        BOARD.put('s', new Point(3, 3));
        BOARD.put('t', new Point(4, 3));
        BOARD.put('u', new Point(0, 4));
        BOARD.put('v', new Point(1, 4));
        BOARD.put('w', new Point(2, 4));
        BOARD.put('x', new Point(3, 4));
        BOARD.put('y', new Point(4, 4));
        BOARD.put('z', new Point(0, 5));
    }

    public String alphabetBoardPath(String target) {
        Point from = new Point(0, 0);
        boolean isFromZ = false;
        StringBuilder sb = new StringBuilder();
        for (char c : target.toCharArray()) {
            Point to = BOARD.get(c);
            int x = to.getX() - from.getX();
            int y = to.getY() - from.getY();

            if (isFromZ) {
                sb.append(move(y, false));
                sb.append(move(x, true));
            }
            else {
                sb.append(move(x, true));
                sb.append(move(y, false));
            }
            sb.append("!");

            from = to;
            if (c == 'z') {
                isFromZ = true;
            }
            else {
                isFromZ = false;
            }
        }
        return sb.toString();
    }

    private String move(int distance, boolean isHorizontal) {
        if (distance > 0) {
            return String.join("", Collections.nCopies(Math.abs(distance), isHorizontal ? "R" : "D"));
        }
        else if (distance < 0) {
            return String.join("", Collections.nCopies(Math.abs(distance), isHorizontal ? "L" : "U"));
        }
        else {
            return "";
        }
    }
}
