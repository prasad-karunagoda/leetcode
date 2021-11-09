package prasad.leetcode.p647;

import prasad.leetcode.common.CommonFunctions;

public class PalindromicSubstrings {

    public int countSubstrings(String s) {
        int count = 0;
        int substringLength = s.length();
        while (substringLength > 0) {
            for (int shift = 0; shift <= s.length() - substringLength; shift++) {
                String substring = s.substring(shift, shift + substringLength);
                if (CommonFunctions.isPalindrome(substring)) {
                    count++;
                }
            }
            substringLength--;
        }
        return count;
    }
}
