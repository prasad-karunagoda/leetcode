package prasad.leetcode.p1615;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class MaximalNetworkRank {

    public int maximalNetworkRank(int n, int[][] roads) {
        HashMap<Integer, CityAndRoadCount> map = new HashMap<>();
        boolean[][] connected = new boolean[n][n];
        for (int[] r : roads) {
            if (map.containsKey(r[0])) {
                map.get(r[0]).incrementRoadCount();
            }
            else {
                map.put(r[0], new CityAndRoadCount(r[0]));
            }

            if (map.containsKey(r[1])) {
                map.get(r[1]).incrementRoadCount();
            }
            else {
                map.put(r[1], new CityAndRoadCount(r[1]));
            }

            connected[r[0]][r[1]] = true;
            connected[r[1]][r[0]] = true;
        }

        List<CityAndRoadCount> list = new ArrayList<>(map.values());
        int max = 0;
        for (CityAndRoadCount first : list) {
            for (CityAndRoadCount second : list) {
                if (first.city != second.city) {
                    if (connected[first.city][second.city]) {
                        max = Math.max(max, first.roadCount + second.roadCount - 1);
                    }
                    else {
                        max = Math.max(max, first.roadCount + second.roadCount);
                    }
                }
            }
        }
        return max;
    }

    private static class CityAndRoadCount implements Comparable<CityAndRoadCount> {
        private final int city;
        private int roadCount;

        private CityAndRoadCount(int city) {
            this.city = city;
            this.roadCount = 1;
        }

        private void incrementRoadCount() {
            roadCount++;
        }

        @Override
        public int compareTo(CityAndRoadCount other) {
            return Integer.compare(other.roadCount, this.roadCount);
        }
    }
}
