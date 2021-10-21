package prasad.leetcode.p541;

public class ReverseString2 {

    public String reverseStr(String s, int k) {
        int start = 0;
        boolean isReverse = true;
        StringBuilder result = new StringBuilder();
        while (s.length() >= start + k) {
            String substring = s.substring(start, start + k);
            result.append(isReverse ? new StringBuilder(substring).reverse() : substring);
            start = start + k;
            isReverse = !isReverse;
        }
        result.append(isReverse ? new StringBuilder(s.substring(start)).reverse() : s.substring(start));
        return result.toString();
    }
}
