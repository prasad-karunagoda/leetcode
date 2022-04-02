package prasad.leetcode.p1694;

import java.util.ArrayList;

public class ReformatPhoneNumber {

    public String reformatNumber(String number) {
        String digits = number.replaceAll(" ", "").replaceAll("-", "");
        ArrayList<String> segments = new ArrayList<>();
        while (digits.length() >= 3) {
            segments.add(digits.substring(0, 3));
            digits = digits.substring(3);
        }

        if (digits.length() == 1) {
            String last = segments.remove(segments.size() - 1);
            segments.add(last.substring(0, 2));
            segments.add(last.substring(2) + digits);
        }
        else if (digits.length() == 2) {
            segments.add(digits);
        }

        return String.join("-", segments);
    }
}
