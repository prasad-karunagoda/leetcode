package prasad.leetcode.p242;

import prasad.leetcode.common.CommonFunctions;

import java.util.Map;

public class ValidAnagram {

    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }

        Map<Character, Integer> sMap = CommonFunctions.getCharacterCounts(s);
        Map<Character, Integer> tMap = CommonFunctions.getCharacterCounts(t);
        return sMap.equals(tMap);
    }
}
