package prasad.leetcode.p119;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class PascalsTriangle2 {

    public List<Integer> getRow(int rowIndex) {
        if (rowIndex == 0) {
            return Collections.singletonList(1);
        }
        if (rowIndex == 1) {
            return Arrays.asList(1, 1);
        }

        List<Integer> lastRow = new ArrayList<>();
        lastRow.add(1);
        lastRow.add(1);
        for (int i = 1; i <= rowIndex - 1; i++) {
            List<Integer> newRow = new ArrayList<>();
            newRow.add(1);
            for (int j = 0; j < lastRow.size() - 1; j++) {
                newRow.add(lastRow.get(j) + lastRow.get(j + 1));
            }
            newRow.add(1);

            lastRow = newRow;
        }
        return lastRow;
    }
}
