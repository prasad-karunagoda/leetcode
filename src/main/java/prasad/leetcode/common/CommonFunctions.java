package prasad.leetcode.common;

import java.util.HashMap;
import java.util.Map;

public final class CommonFunctions {

    public static Map<Character, Integer> getCharacterCounts(String str) {
        Map<Character, Integer> map = new HashMap<>();
        for (char c : str.toCharArray()) {
            if (map.containsKey(c)) {
                map.put(c, map.get(c) + 1);
            }
            else {
                map.put(c, 1);
            }
        }
        return map;
    }
}
