package prasad.leetcode.p1662;

import java.util.Arrays;

public class CheckIfTwoStringArraysEquivalent {

    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        StringBuilder sb1 = new StringBuilder();
        Arrays.stream(word1).forEach(sb1::append);

        StringBuilder sb2 = new StringBuilder();
        Arrays.stream(word2).forEach(sb2::append);

        return sb1.toString().equals(sb2.toString());
    }
}
