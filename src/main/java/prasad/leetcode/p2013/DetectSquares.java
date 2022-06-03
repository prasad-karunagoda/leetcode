package prasad.leetcode.p2013;

import java.util.HashMap;
import java.util.Map;

public class DetectSquares {

    private final Map<Integer, Map<Integer, Integer>> xMap;

    public DetectSquares() {
        xMap = new HashMap<>();
    }

    public void add(int[] point) {
        if (xMap.containsKey(point[0])) {
            Map<Integer, Integer> yMap = xMap.get(point[0]);
            if (yMap.containsKey(point[1])) {
                yMap.put(point[1], yMap.get(point[1]) + 1);
            }
            else {
                yMap.put(point[1], 1);
            }
        }
        else {
            Map<Integer, Integer> yMap = new HashMap<>();
            yMap.put(point[1], 1);

            xMap.put(point[0], yMap);
        }
    }

    public int count(int[] point) {
        int x = point[0];
        int y = point[1];
        Map<Integer, Integer> yMap = xMap.get(x);
        if (yMap == null) {
            return 0;
        }

        int count = 0;
        for (Map.Entry<Integer, Integer> entry : yMap.entrySet()) {
            if (entry.getKey() != y) {
                int c1 = entry.getValue();
                int squareSize = Math.abs(entry.getKey() - y);

                Map<Integer, Integer> leftLine = xMap.get(x - squareSize);
                if (leftLine != null) {
                    int c2 = leftLine.getOrDefault(y, 0);
                    int c3 = leftLine.getOrDefault(entry.getKey(), 0);
                    count += c1 * c2 * c3;
                }

                Map<Integer, Integer> rightLine = xMap.get(x + squareSize);
                if (rightLine != null) {
                    int c2 = rightLine.getOrDefault(y, 0);
                    int c3 = rightLine.getOrDefault(entry.getKey(), 0);
                    count += c1 * c2 * c3;
                }
            }
        }
        return count;
    }
}
