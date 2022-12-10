package prasad.leetcode.p1456;

public class MaxNumberOfVowelsInSubstring {

    // For s.length() = 100_000 and k = 50_000, this takes around 12 milliseconds.
    public int maxVowels(String s, int k) {
        String firstSubstring = s.substring(0, k);
        int vowelCount = 0;
        for (int i = 0; i < firstSubstring.length(); i++) {
            char c = firstSubstring.charAt(i);
            if (isVowel(c)) {
                vowelCount++;
            }
        }

        int max = vowelCount;
        for (int i = 1; i <= s.length() - k; i++) {
            char removing = s.charAt(i - 1);
            char adding = s.charAt(i + k - 1);
            if (isVowel(removing)) {
                vowelCount--;
            }
            if (isVowel(adding)) {
                vowelCount++;
            }

            if (max < vowelCount) {
                max = vowelCount;
            }
        }
        return max;
    }

    private boolean isVowel(char c) {
        return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u';
    }

    // For s.length() = 100_000 and k = 50_000, this takes around 5 seconds.
    public int maxVowelsSlow(String s, int k) {
        int max = 0;
        for (int i = 0; i < s.length() - k; i++) {
            String sub = s.substring(i, i + k);
            int vowelCount = 0;
            for (int j = 0; j < sub.length(); j++) {
                char c = sub.charAt(j);
                if (isVowel(c)) {
                    vowelCount++;
                }
            }

            if (max < vowelCount) {
                max = vowelCount;
            }
        }
        return max;
    }
}
