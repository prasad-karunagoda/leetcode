package prasad.leetcode.p5;

import prasad.leetcode.common.CommonFunctions;

public class LongestPalindromicSubstring {

    /*
     * E.g. s = "babad"
     * c = 'b'
     * remaining = "abad"
     * nextIndex = 2 ("babad")
     *                   ^
     * isPalindrome("a") -> true. It means "bab" is a palindrome
     * Therefore longest is "bab" so far.
     */
    public String longestPalindrome(String s) {
        String longest = s.substring(0, 1);
        // Take each character and try to build a palindrome with it.
        for (int i = 0; i < s.length() - longest.length(); i++) {
            char c = s.charAt(i);
            int end = s.length() - 1;
            while (true) {
                String remaining = s.substring(i + 1, end + 1);
                int nextIndexOfRemaining = remaining.lastIndexOf(c);
                if (nextIndexOfRemaining == -1) {
                    break;
                } else {
                    int nextIndex = nextIndexOfRemaining + i + 1;
                    if (CommonFunctions.isPalindrome(s.substring(i + 1, nextIndex))) {
                        String palindrome = s.substring(i, nextIndex + 1);
                        if (longest.length() < palindrome.length()) {
                            longest = palindrome;
                            break;
                        }
                    }
                    end = nextIndex - 1;
                }
            }
        }
        return longest;
    }
}
