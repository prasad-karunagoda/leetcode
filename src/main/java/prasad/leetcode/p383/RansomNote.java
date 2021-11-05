package prasad.leetcode.p383;

import prasad.leetcode.common.CommonFunctions;

import java.util.Map;

public class RansomNote {

    public boolean canConstruct(String ransomNote, String magazine) {
        Map<Character, Integer> ransomCharMap = CommonFunctions.getCharacterCounts(ransomNote);
        Map<Character, Integer> magazineCharMap = CommonFunctions.getCharacterCounts(magazine);
        for (Map.Entry<Character, Integer> entry : ransomCharMap.entrySet()) {
            if (magazineCharMap.get(entry.getKey()) == null ||
                    entry.getValue() > magazineCharMap.get(entry.getKey())) {
                return false;
            }
        }
        return true;
    }
}
