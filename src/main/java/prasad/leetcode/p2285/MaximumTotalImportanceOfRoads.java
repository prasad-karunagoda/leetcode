package prasad.leetcode.p2285;

import java.util.Arrays;

public class MaximumTotalImportanceOfRoads {

    public long maximumImportance(int n, int[][] roads) {
        int[] cityToNumberOfRoadsMap = new int[n];
        for (int[] r : roads) {
            int city1 = r[0];
            int city2 = r[1];
            cityToNumberOfRoadsMap[city1]++;
            cityToNumberOfRoadsMap[city2]++;
        }
        Arrays.sort(cityToNumberOfRoadsMap);
        long totalImportance = 0;
        for (int i = 0; i < cityToNumberOfRoadsMap.length; i++) {
            long numberOfRoads = cityToNumberOfRoadsMap[i];
            totalImportance += numberOfRoads * (i + 1);
        }
        return totalImportance;
    }
}
