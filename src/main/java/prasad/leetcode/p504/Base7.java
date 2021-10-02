package prasad.leetcode.p504;

public class Base7 {

    public String convertToBase7(int num) {
        StringBuilder result = new StringBuilder();
        boolean isNegative = num < 0;
        int quotient = Math.abs(num);
        while (quotient >= 7) {
            int remainder = quotient % 7;
            quotient = quotient / 7;
            result.insert(0, remainder);
        }
        result.insert(0, quotient);
        if (isNegative) {
            result.insert(0, "-");
        }
        return result.toString();
    }
}
