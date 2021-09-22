package prasad.leetcode.p290;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class WordPattern {

    public boolean wordPattern(String pattern, String s) {
        String[] words = s.split(" ");
        if (pattern.length() != words.length) {
            return false;
        }

        Map<Character, String> map = new HashMap<>();
        List<String> mappedWords = new ArrayList<>();
        for (int i = 0; i < pattern.length(); i++) {
            if (map.containsKey(pattern.charAt(i))) {
                if (!map.get(pattern.charAt(i)).equals(words[i])) {
                    return false;
                }
            }
            else {
                if (mappedWords.contains(words[i])) {
                    return false;
                }
                else {
                    map.put(pattern.charAt(i), words[i]);
                    mappedWords.add(words[i]);
                }
            }
        }
        return true;
    }
}
