package prasad.leetcode.p520;

public class DetectCapital {

    public boolean detectCapitalUse(String word) {
        if (word.isEmpty()) {
            throw new IllegalArgumentException("Input word is empty.");
        }
        if (word.length() == 1) {
            return true;
        }

        if (Character.isUpperCase(word.charAt(0))) {
            if (Character.isUpperCase(word.charAt(1))) {
                return isAllUpperCase(word.substring(2));
            }
            else {
                return isAllLowerCase(word.substring(2));
            }
        }
        else {
            return isAllLowerCase(word.substring(1));
        }
    }

    private boolean isAllLowerCase(String s) {
        for (char c : s.toCharArray()) {
            if (Character.isUpperCase(c)) {
                return false;
            }
        }
        return true;
    }

    private boolean isAllUpperCase(String s) {
        for (char c : s.toCharArray()) {
            if (Character.isLowerCase(c)) {
                return false;
            }
        }
        return true;
    }
}
