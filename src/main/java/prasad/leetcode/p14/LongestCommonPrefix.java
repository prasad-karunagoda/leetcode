package prasad.leetcode.p14;

public class LongestCommonPrefix {

    public String longestCommonPrefix(String[] strs) {
        if (strs.length == 0) {
            return "";
        }
        else if (strs.length == 1) {
            return strs[0];
        }

        StringBuilder prefix = new StringBuilder();
        String first = strs[0];
        for (int i = 0; i < first.length(); i++) {
            char c = first.charAt(i);
            for (int j = 1; j < strs.length; j++) {
                if (strs[j].length() == i || c != strs[j].charAt(i)) {
                    return prefix.toString();
                }
            }
            prefix.append(c);
        }
        return prefix.toString();
    }
}
