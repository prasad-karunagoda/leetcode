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

    public static boolean isPalindrome(String str) {
        int forward = 0;
        int backward = str.length() - 1;
        while (forward < backward) {
            if (str.charAt(forward) != str.charAt(backward)) {
                return false;
            }
            forward++;
            backward--;
        }
        return true;
    }
}
