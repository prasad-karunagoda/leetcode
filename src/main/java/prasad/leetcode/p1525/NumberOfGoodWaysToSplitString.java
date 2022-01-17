package prasad.leetcode.p1525;

import java.util.HashSet;
import java.util.Set;

public class NumberOfGoodWaysToSplitString {

    public int numSplits(String s) {
        Set<Character> leftDistinctLetters = new HashSet<>();
        int[] leftDistinctLetterCount = new int[s.length() - 1];
        for (int i = 0; i < s.length() - 1; i++) { // exclude the last index
            leftDistinctLetters.add(s.charAt(i));
            leftDistinctLetterCount[i] = leftDistinctLetters.size();
        }

        Set<Character> rightDistinctLetters = new HashSet<>();
        int[] rightDistinctLetterCount = new int[s.length() - 1];
        for (int i = s.length() - 1; i > 0; i--) { // exclude the first index
            rightDistinctLetters.add(s.charAt(i));
            rightDistinctLetterCount[i - 1] = rightDistinctLetters.size();
        }

        int count = 0;
        for (int i = 0; i < leftDistinctLetterCount.length; i++) {
            if (leftDistinctLetterCount[i] == rightDistinctLetterCount[i]) {
                count++;
            }
        }
        return count;
    }
}
