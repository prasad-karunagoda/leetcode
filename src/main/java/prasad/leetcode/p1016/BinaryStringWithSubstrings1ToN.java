package prasad.leetcode.p1016;

public class BinaryStringWithSubstrings1ToN {

    public boolean queryString(String s, int n) {
        for (int x = n; x >= 1; x--) {
            String binary = Integer.toBinaryString(x);
            if (!s.contains(binary)) {
                return false;
            }
        }
        return true;
    }
}
