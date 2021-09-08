package prasad.leetcode.p459;

import java.util.Collections;

public class RepeatedSubstringPattern {

    public boolean repeatedSubstringPattern(String s) {
        char firstChar = s.charAt(0);
        for (int i = 1; i < s.length(); i++) {
            if (s.charAt(i) == firstChar) {
                String substring = s.substring(0, i);
                String remaining = s.substring(i);
                if (remaining.length() % substring.length() == 0) {
                    int repetitions = remaining.length() / substring.length();
                    String repeatedString = String.join("", Collections.nCopies(repetitions, substring));
                    if (remaining.equals(repeatedString)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }
}
