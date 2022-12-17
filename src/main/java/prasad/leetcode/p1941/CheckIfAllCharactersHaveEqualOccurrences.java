package prasad.leetcode.p1941;

public class CheckIfAllCharactersHaveEqualOccurrences {

    public boolean areOccurrencesEqual(String s) {
        int[] countsMap = new int[26];
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            countsMap[c - 'a']++;
        }

        int commonFrequency = -1;
        for (int count : countsMap) {
            if (count != 0) {
                if (commonFrequency == -1) {
                    commonFrequency = count;
                }
                else if (commonFrequency != count) {
                    return false;
                }
            }
        }
        return true;
    }
}
