package prasad.leetcode.p2243;

import java.util.Collections;

public class CalculateDigitSumOfString {

    public String digitSum(String s, int k) {
        String result = s;
        while (result.length() > k) {
            int lastGroupLength = result.length() % k;
            int padding = lastGroupLength > 0 ? k - lastGroupLength : 0;
            result = result + String.join("", Collections.nCopies(padding, "0"));
            int numberOfGroups = result.length() / k;
            StringBuilder sb = new StringBuilder();
            for (int groupIndex = 0; groupIndex < numberOfGroups; groupIndex++) {
                int groupSum = 0;
                for (int i = groupIndex * k; i < (groupIndex + 1) * k; i++) {
                    groupSum += result.charAt(i) - '0';
                }
                sb.append(groupSum);
            }
            result = sb.toString();
        }
        return result;
    }
}
