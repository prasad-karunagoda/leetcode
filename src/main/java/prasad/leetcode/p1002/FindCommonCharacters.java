package prasad.leetcode.p1002;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class FindCommonCharacters {

    private static final int NUMBER_OF_CHARACTERS = 26;
    private static final int MAX_WORD_LENGTH = 100;

    public List<String> commonChars(String[] words) {
        int[] minCounts = new int[NUMBER_OF_CHARACTERS];
        for (int i = 0; i < NUMBER_OF_CHARACTERS; i++) {
            minCounts[i] = MAX_WORD_LENGTH;
        }

        for (String w : words) {
            int[] characterCounts = new int[NUMBER_OF_CHARACTERS];
            for (char c : w.toCharArray()) {
                characterCounts[c - 'a']++;
            }

            for (int i = 0; i < NUMBER_OF_CHARACTERS; i++) {
                if (minCounts[i] > characterCounts[i]) {
                    minCounts[i] = characterCounts[i];
                }
            }
        }

        List<String> commonCharacters = new ArrayList<>();
        for (int i = 0; i < NUMBER_OF_CHARACTERS; i++) {
            commonCharacters.addAll(Collections.nCopies(minCounts[i], String.valueOf((char) (i + 'a'))));
        }
        return commonCharacters;
    }
}
