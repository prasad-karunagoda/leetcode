package prasad.leetcode.p890;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class FindAndReplacePattern {

    public List<String> findAndReplacePattern(String[] words, String pattern) {
        List<String> matchingWords = new ArrayList<>();
        for (String w : words) {
            boolean sameMapping = true;
            Map<Character, Character> map = new HashMap<>();
            for (int i = 0; i < pattern.length(); i++) {
                char c = pattern.charAt(i);
                if (map.containsKey(c)) {
                    if (map.get(c) != w.charAt(i)) {
                        sameMapping = false;
                        break;
                    }
                }
                else {
                    map.put(c, w.charAt(i));
                }
            }

            Set<Character> uniqueValues = new HashSet<>();
            boolean duplicateValueFound = false;
            for (Character v : map.values()) {
                if (!uniqueValues.add(v)) {
                    duplicateValueFound = true;
                    break;
                }
            }

            if (sameMapping && !duplicateValueFound) {
                matchingWords.add(w);
            }
        }
        return matchingWords;
    }
}
