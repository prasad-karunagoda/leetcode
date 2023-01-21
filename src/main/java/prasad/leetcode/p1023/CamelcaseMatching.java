package prasad.leetcode.p1023;

import java.util.ArrayList;
import java.util.List;

public class CamelcaseMatching {

    public List<Boolean> camelMatch(String[] queries, String pattern) {
        List<Boolean> answer = new ArrayList<>();
        char[] array = pattern.toCharArray();
        for (String q : queries) {
            boolean match = true;
            int fromIndex = 0;
            for (char patternChar : array) {
                int index = q.indexOf(patternChar, fromIndex);
                if (index > -1) {
                    String substring = q.substring(fromIndex, index);
                    fromIndex = index + 1;
                    if (!isAllLowercase(substring)) {
                        match = false;
                        break;
                    }
                }
                else {
                    match = false;
                    break;
                }
            }

            String tail = q.substring(fromIndex);
            answer.add(match && isAllLowercase(tail));
        }
        return answer;
    }

    private boolean isAllLowercase(String s) {
        for (char ch : s.toCharArray()) {
            if (ch < 'a' || ch > 'z') {
                return false;
            }
        }
        return true;
    }
}
