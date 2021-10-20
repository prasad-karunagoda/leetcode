package prasad.leetcode.p916;

import prasad.leetcode.common.CommonFunctions;

import java.util.ArrayList;
import java.util.List;

public class WordSubsets {

    // Still Time Limit Exceeded (~500ms)
    public List<String> wordSubsets(String[] words1, String[] words2) {
        int[][] charCountsOfWords1 = new int[words1.length][];
        for (int i = 0; i < words1.length; i++) {
            charCountsOfWords1[i] = CommonFunctions.getLowercaseCharacterCounts(words1[i]);
        }

        int[][] charCountsOfWords2 = new int[words2.length][];
        for (int i = 0; i < words2.length; i++) {
            charCountsOfWords2[i] = CommonFunctions.getLowercaseCharacterCounts(words2[i]);
        }

        List<String> universalWords = new ArrayList<>();
        for (int i = 0; i < charCountsOfWords1.length; i++) {
            int[] charCounts1 = charCountsOfWords1[i];
            boolean isUniversal = true;
            for (int[] charCounts2 : charCountsOfWords2) {
                boolean isSubset = true;
                for (int j = 0; j < charCounts2.length; j++) {
                    if (charCounts1[j] < charCounts2[j]) {
                        isSubset = false;
                        break;
                    }
                }

                if (!isSubset) {
                    isUniversal = false;
                    break;
                }
            }

            if (isUniversal) {
                universalWords.add(words1[i]);
            }
        }
        return universalWords;
    }

    // Time Limit Exceeded (~2000ms)
    public List<String> wordSubsetsSlow(String[] words1, String[] words2) {
        List<String> universalWords = new ArrayList<>();
        for (String w1 : words1) {
            boolean isUniversal = true;
            int[] counts1 = CommonFunctions.getLowercaseCharacterCounts(w1);
            for (String w2 : words2) {
                boolean isSubset = true;
                int[] counts2 = CommonFunctions.getLowercaseCharacterCounts(w2);
                for (int i = 0; i < counts2.length; i++) {
                    if (counts1[i] < counts2[i]) {
                        isSubset = false;
                        break;
                    }
                }

                if (!isSubset) {
                    isUniversal = false;
                    break;
                }
            }

            if (isUniversal) {
                universalWords.add(w1);
            }
        }
        return universalWords;
    }
}
