package prasad.leetcode.p2405;

public class OptimalPartitionOfString {

    public int partitionString(String s) {
        boolean[] map = new boolean[26];
        int substringCount = 0;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (map[c - 'a']) {
                substringCount++;
                map = new boolean[26];
            }
            map[c - 'a'] = true;
        }
        substringCount++; // Last substring
        return substringCount;
    }
}
