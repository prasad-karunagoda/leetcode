package prasad.leetcode.p1528;

public class ShuffleString {

    public String restoreString(String s, int[] indices) {
        char[] array = new char[s.length()];
        for (int i = 0; i < s.length(); i++) {
            array[indices[i]] = s.charAt(i);
        }
        return new String(array);
    }
}
