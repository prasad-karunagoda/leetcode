package prasad.leetcode.p1545;

public class FindKthBitInNthBinaryString {

    public char findKthBit(int n, int k) {
        String s = "0";
        while (s.length() < k) {
            s = s + "1" + invertAndReverse(s);
        }
        return s.charAt(k - 1); // k is 1-indexed
    }

    String invertAndReverse(String s) {
        char[] charArray = new char[s.length()];
        for (int i = 0; i < s.length(); i++) {
            charArray[i] = s.charAt(s.length() - 1 - i) == '0' ? '1' : '0';
        }
        return new String(charArray);
    }
}
