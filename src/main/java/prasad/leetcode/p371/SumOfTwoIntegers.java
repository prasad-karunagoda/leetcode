package prasad.leetcode.p371;

import java.util.Collections;

public class SumOfTwoIntegers {

    public int getSum(int a, int b) {
        String s1 = String.join("", Collections.nCopies(Math.abs(a), "x"));
        String s2 = String.join("", Collections.nCopies(Math.abs(b), "x"));

        if (a == 0) {
            return b;
        }
        else if (b == 0) {
            return a;
        }
        else if (a * b > 0) { // Same sign (both positive or both negative)
            StringBuilder sb = new StringBuilder();
            sb.append(s1);
            sb.append(s2);

            if (a > 0) {
                return sb.length();
            }
            else {
                return sb.length() * -1;
            }
        }
        else { // Opposite sign (one positive and other negative)
            if (Math.abs(a) > Math.abs(b)) {
                String substring = s1.substring(s2.length());
                if (a > 0) {
                    return substring.length();
                }
                else {
                    return substring.length() * -1;
                }
            }
            else {
                String substring = s2.substring(s1.length());
                if (a > 0) {
                    return substring.length() * -1;
                }
                else {
                    return substring.length();
                }
            }
        }
    }
}
