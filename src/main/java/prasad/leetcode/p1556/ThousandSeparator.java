package prasad.leetcode.p1556;

public class ThousandSeparator {

    public String thousandSeparator(int n) {
        String s = String.valueOf(n);
        String result = "";
        while (s.length() > 3) {
            String threeDigits = s.substring(s.length() - 3);
            result = "." + threeDigits + result;
            s = s.substring(0, s.length() - 3);
        }
        return s + result;
    }
}
