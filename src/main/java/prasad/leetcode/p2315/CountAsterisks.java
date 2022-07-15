package prasad.leetcode.p2315;

public class CountAsterisks {

    public int countAsterisks(String s) {
        boolean skipping = false;
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '|') {
                skipping = !skipping;
            }
            else if (s.charAt(i) == '*' && !skipping) {
                count++;
            }
        }
        return count;
    }
}
