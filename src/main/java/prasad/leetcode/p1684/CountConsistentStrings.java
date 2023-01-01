package prasad.leetcode.p1684;

public class CountConsistentStrings {

    public int countConsistentStrings(String allowed, String[] words) {
        boolean[] charAllowed = new boolean[26];
        for (int i = 0; i < allowed.length(); i++) {
            char c = allowed.charAt(i);
            charAllowed[c - 'a'] = true;
        }

        int count = 0;
        for (String w : words) {
            boolean consistent = true;
            for (int i = 0; i < w.length(); i++) {
                if (!charAllowed[w.charAt(i) - 'a']) {
                    consistent = false;
                    break;
                }
            }

            if (consistent) {
                count++;
            }
        }
        return count;
    }
}
