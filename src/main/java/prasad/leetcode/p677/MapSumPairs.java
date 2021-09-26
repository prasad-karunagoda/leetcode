package prasad.leetcode.p677;

import java.util.HashMap;
import java.util.Map;

public class MapSumPairs {

    private final Map<String, Integer> map;

    public MapSumPairs() {
        map = new HashMap<>();
    }

    public void insert(String key, int val) {
        map.put(key, val);
    }

    public int sum(String prefix) {
        int sum = 0;
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            if (entry.getKey().startsWith(prefix)) {
                sum = sum + entry.getValue();
            }
        }
        return sum;
    }
}
