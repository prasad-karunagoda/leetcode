package prasad.leetcode.p1190;

public class ReverseSubstringsBetweenEachPairOfParentheses {

    public String reverseParentheses(String s) {
        while (s.contains("(")) {
            int lastOpenParenthesisIndex = -1;
            for (int i = 0; i < s.length(); i++) {
                if (s.charAt(i) == '(') {
                    lastOpenParenthesisIndex = i;
                }
                else if (s.charAt(i) == ')') {
                    s = s.substring(0, lastOpenParenthesisIndex) +
                            new StringBuilder(s.substring(lastOpenParenthesisIndex + 1, i)).reverse() +
                            s.substring(i + 1);
                    break;
                }
            }
        }
        return s;
    }
}
