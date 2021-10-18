package prasad.leetcode.p205;

import java.util.HashMap;
import java.util.Map;

public class IsomorphicStrings {

    public boolean isIsomorphic(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }

        Map<Character, Character> mapping = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            if (mapping.containsKey(s.charAt(i))) {
                if (mapping.get(s.charAt(i)) != t.charAt(i)) {
                    return false;
                }
            }
            else if (mapping.containsValue(t.charAt(i))) {
                return false;
            }
            else {
                mapping.put(s.charAt(i), t.charAt(i));
            }
        }
        return true;
    }
}
