package prasad.leetcode.p1288;

import java.util.HashSet;
import java.util.Set;

public class RemoveCoveredIntervals {

    public int removeCoveredIntervals(int[][] intervals) {
        Set<Integer> coveredIndices= new HashSet<>();
        for (int i = 0; i < intervals.length; i++) {
            for (int j = 0; j < intervals.length; j++) {
                if (i != j && intervals[i][0] <= intervals[j][0] && intervals[i][1] >= intervals[j][1]) {
                    coveredIndices.add(j);
                }
            }
        }
        return intervals.length - coveredIndices.size();
    }
}
