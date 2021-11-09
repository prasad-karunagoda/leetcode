package prasad.leetcode.p567;

import prasad.leetcode.common.CommonFunctions;

import java.util.Map;

public class PermutationInString {

    public boolean checkInclusion(String s1, String s2) {
        Map<Character, Integer> s1Map = CommonFunctions.getCharacterCounts(s1);
        if (s1.length() > s2.length()) {
            return false;
        }

        String subString = s2.substring(0, s1.length());
        Map<Character, Integer> subStringMap = CommonFunctions.getCharacterCounts(subString);
        if (s1Map.equals(subStringMap)) {
            return true;
        }

        for (int removeIndex = 0; removeIndex < s2.length() - s1.length(); removeIndex++) {
            char removeChar = s2.charAt(removeIndex);
            if (subStringMap.get(removeChar) == 1) {
                subStringMap.remove(removeChar);
            }
            else {
                subStringMap.put(removeChar, subStringMap.get(removeChar) - 1);
            }

            char addChar = s2.charAt(removeIndex + s1.length());
            if (subStringMap.containsKey(addChar)) {
                subStringMap.put(addChar, subStringMap.get(addChar) + 1);
            }
            else {
                subStringMap.put(addChar, 1);
            }

            if (s1Map.equals(subStringMap)) {
                return true;
            }
        }
        return false;
    }
}
