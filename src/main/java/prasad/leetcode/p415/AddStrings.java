package prasad.leetcode.p415;

import java.util.Collections;

public class AddStrings {

    public String addStrings(String num1, String num2) {
        if (num1.length() > num2.length()) {
            String leadingZeros = String.join("", Collections.nCopies(num1.length() - num2.length(), "0"));
            num2 = leadingZeros + num2;
        }
        else if (num1.length() < num2.length()) {
            String leadingZeros = String.join("", Collections.nCopies(num2.length() - num1.length(), "0"));
            num1 = leadingZeros + num1;
        }

        int carry = 0;
        StringBuilder sum = new StringBuilder();
        for (int i = num1.length() - 1; i >= 0; i--) {
            int n = num1.charAt(i) - '0' + num2.charAt(i) - '0' + carry;
            carry = n / 10;

            sum.insert(0, n % 10);
        }
        if (carry == 1) {
            sum.insert(0, "1");
        }

        return sum.toString();
    }
}
