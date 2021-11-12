package prasad.leetcode.p788;

public class RotatedDigits {

    public int rotatedDigits(int n) {
        int count = 0;
        for (int x = 1; x <= n; x++) {
            if (isValid(x)) {
                count++;
            }
        }
        return count;
    }

    private boolean isValid(int x) {
        String s = String.valueOf(x);
        if (s.contains("3") || s.contains("4") || s.contains("7")) {
            return false;
        }

        return s.contains("2") || s.contains("5") || s.contains("6") || s.contains("9");
    }
}
