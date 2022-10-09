package prasad.leetcode.p2414;

public class LengthOfLongestAlphabeticalSubstring {

    public int longestContinuousSubstring(String s) {
        String alphabet = "abcdefghijklmnopqrstuvwxyz";
        int length = 26;
        while (length > 1) {
            for (int i = 0; i <= 26 - length; i++) {
                String substring = alphabet.substring(i, i + length);
                if (s.contains(substring)) {
                    return length;
                }
            }
            length--;
        }
        return 1;
    }
}
