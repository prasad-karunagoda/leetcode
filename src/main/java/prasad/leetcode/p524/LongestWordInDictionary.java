package prasad.leetcode.p524;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class LongestWordInDictionary {

    public String findLongestWord(String s, List<String> dictionary) {
        List<String> mutableDictionary = new ArrayList<>(dictionary);
        mutableDictionary.sort((s1, s2) -> s2.length() - s1.length());
        List<String> longestWords = new ArrayList<>();
        int longestWordLength = 0;
        for (String word : mutableDictionary) {
            if (longestWordLength > word.length()) {
                break;
            }

            int wIndex = 0;
            int sIndex = 0;
            while (sIndex < s.length()) {
                if (word.charAt(wIndex) == s.charAt(sIndex)) {
                    wIndex++;
                    if (wIndex == word.length()) {
                        longestWords.add(word);
                        longestWordLength = word.length();
                        break;
                    }
                }
                sIndex++;
            }
        }

        if (longestWords.isEmpty()) {
            return "";
        }
        else if (longestWords.size() == 1) {
            return longestWords.get(0);
        }
        else {
            Collections.sort(longestWords);
            return longestWords.get(0);
        }
    }
}
