package prasad.leetcode.p67;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class AddBinary {

    private static final Map<String, String> sum = new HashMap<>();
    private static final Map<String, String> carry = new HashMap<>();

    static {
        sum.put("000", "0");
        sum.put("001", "1");
        sum.put("010", "1");
        sum.put("011", "0");
        sum.put("100", "1");
        sum.put("101", "0");
        sum.put("110", "0");
        sum.put("111", "1");

        carry.put("000", "0");
        carry.put("001", "0");
        carry.put("010", "0");
        carry.put("011", "1");
        carry.put("100", "0");
        carry.put("101", "1");
        carry.put("110", "1");
        carry.put("111", "1");
    }

    public String addBinary(String a, String b) {
        if (a.length() > b.length()) {
            b = String.join("", Collections.nCopies(a.length() - b.length(), "0")) + b;
        }
        else if (a.length() < b.length()) {
            a = String.join("", Collections.nCopies(b.length() - a.length(), "0")) + a;
        }

        String c = "0";
        List<String> result = new ArrayList<>();
        for (int i = a.length() - 1; i >= 0; i--) {
            result.add(sum.get(c + a.charAt(i) + b.charAt(i)));
            c = carry.get(c + a.charAt(i) + b.charAt(i));
        }

        StringBuilder sb = new StringBuilder();
        if (c.equals("1")) {
            sb.append(c);
        }

        for (int i = result.size() - 1; i >= 0; i--) {
            sb.append(result.get(i));
        }
        return sb.toString();
    }
}
