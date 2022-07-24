package prasad.leetcode.p2352;

import java.util.ArrayList;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class EqualRowAndColumnPairs {

    public int equalPairs(int[][] grid) {
        int n = grid.length;
        int pairs = 0;
        for (int i = 0; i < n; i++) {
            ArrayList<Integer> matchingColumnIndices = IntStream.range(0, n).boxed()
                    .collect(Collectors.toCollection(ArrayList::new));
            for (int j = 0; j < n; j++) {
                for (int k = 0; k < matchingColumnIndices.size(); k++) {
                    Integer columnIndex = matchingColumnIndices.get(k);
                    if (grid[i][j] != grid[j][columnIndex]) {
                        matchingColumnIndices.remove(columnIndex);
                        k--;
                    }
                }
            }
            pairs += matchingColumnIndices.size();
        }
        return pairs;
    }
}
