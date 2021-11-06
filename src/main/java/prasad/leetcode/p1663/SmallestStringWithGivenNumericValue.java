package prasad.leetcode.p1663;

import java.util.Collections;

public class SmallestStringWithGivenNumericValue {

    /*
     * Resulting string has the pattern <prefix><middleCharacter><suffix>
     * Prefix is a string of a's. Suffix is a string of z's
     * E.g.
     * "aaaaakzzz"
     * "aaaam" (Here suffix is empty.)
     * "g" (Here both prefix and suffix are empty.)
     */
    public String getSmallestString(int n, int k) {
        StringBuilder sb = new StringBuilder();
        int prefixNumericValue = 0;
        while (k - prefixNumericValue - 1 < (n - sb.length() - 1) * 26) {
            sb.append('a');
            prefixNumericValue++;
        }

        int suffixLength = n - sb.length() - 1;
        String suffix = String.join("", Collections.nCopies(suffixLength, "z"));
        char middleCharacter = (char) (k - prefixNumericValue - suffixLength * 26 + 'a' - 1);

        return sb.append(middleCharacter).append(suffix).toString();
    }
}
