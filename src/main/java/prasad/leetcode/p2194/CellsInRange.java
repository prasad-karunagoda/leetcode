package prasad.leetcode.p2194;

import java.util.ArrayList;
import java.util.List;

public class CellsInRange {

    public List<String> cellsInRange(String s) {
        String[] startAndFinish = s.split(":");
        char startColumn = startAndFinish[0].charAt(0);
        char startRow = startAndFinish[0].charAt(1);
        char finishColumn = startAndFinish[1].charAt(0);
        char finishRow = startAndFinish[1].charAt(1);
        List<String> result = new ArrayList<>();
        for (char column = startColumn; column <= finishColumn; column++) {
            for (char row = startRow; row <= finishRow; row++) {
                result.add("" + column + row);
            }
        }
        return result;
    }
}
