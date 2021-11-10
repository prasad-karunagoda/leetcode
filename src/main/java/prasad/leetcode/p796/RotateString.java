package prasad.leetcode.p796;

public class RotateString {

    public boolean rotateString(String s, String goal) {
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == goal.charAt(0)) {
                String rotated = s.substring(i) + s.substring(0, i);
                if (goal.equals(rotated)) {
                    return true;
                }
            }
        }
        return false;
    }
}
