package prasad.leetcode.p981;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TimeMap {

    private final Map<String, List<Integer>> keyToTimestamps;
    private final Map<Integer, String> timestampToValue;

    public TimeMap() {
        keyToTimestamps = new HashMap<>();
        timestampToValue = new HashMap<>();
    }

    public void set(String key, String value, int timestamp) {
        if (keyToTimestamps.containsKey(key)) {
            keyToTimestamps.get(key).add(timestamp);
        }
        else {
            List<Integer> newList = new ArrayList<>();
            newList.add(timestamp);
            keyToTimestamps.put(key, newList);
        }

        timestampToValue.put(timestamp, value);
    }

    public String get(String key, int timestamp) {
        List<Integer> timestampList = keyToTimestamps.get(key);
        if (timestampList == null) {
            return "";
        }

        for (int i = timestampList.size() - 1; i >= 0; i--) {
            if (timestampList.get(i) <= timestamp) {
                return timestampToValue.get(timestampList.get(i));
            }
        }
        return "";
    }
}
