package prasad.leetcode.p118;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class PascalsTriangle {

    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> rows = new ArrayList<>();
        rows.add(Collections.singletonList(1));

        if (numRows == 1) {
            return rows;
        }

        rows.add(Arrays.asList(1, 1));
        if (numRows == 2) {
            return rows;
        }

        for (int i = 1; i <= numRows - 2; i++) {
            List<Integer> lastRow = rows.get(rows.size() - 1);

            List<Integer> newRow = new ArrayList<>();
            newRow.add(1);
            for (int j = 0; j < lastRow.size() - 1; j++) {
                newRow.add(lastRow.get(j) + lastRow.get(j + 1));
            }
            newRow.add(1);

            rows.add(newRow);
        }
        return rows;
    }
}
