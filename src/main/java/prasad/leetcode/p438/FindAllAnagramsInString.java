package prasad.leetcode.p438;

import prasad.leetcode.common.CommonFunctions;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class FindAllAnagramsInString {

    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> startIndices = new ArrayList<>();
        if (s.length() < p.length()) {
            return startIndices;
        }

        Map<Character, Integer> pMap = CommonFunctions.getCharacterCounts(p);

        String firstSubString = s.substring(0, p.length());
        Map<Character, Integer> map = CommonFunctions.getCharacterCounts(firstSubString);
        if (pMap.equals(map)) {
            startIndices.add(0);
        }

        for (int removeCharIndex = 0; removeCharIndex < s.length() - p.length(); removeCharIndex++) {
            char removeChar = s.charAt(removeCharIndex);
            if (map.get(removeChar) == 1) {
                map.remove(removeChar);
            }
            else {
                map.put(removeChar, map.get(removeChar) - 1);
            }


            char addChar = s.charAt(removeCharIndex + p.length());
            if (map.containsKey(addChar)) {
                map.put(addChar, map.get(addChar) + 1);
            }
            else {
                map.put(addChar, 1);
            }

            if (pMap.equals(map)) {
                startIndices.add(removeCharIndex + 1);
            }
        }
        return startIndices;
    }
}
