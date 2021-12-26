package prasad.leetcode.p1404;

import java.util.Collections;

public class NumberOfStepsToReduceBinaryToOne {

    public int numSteps(String s) {
        int steps = 0;
        while (!s.equals("1")) {
            if (s.charAt(s.length() - 1) == '0') {
                s = s.substring(0, s.length() - 1);
            }
            else {
                s = addOne(s);
            }
            steps++;
        }
        return steps;
    }

    String addOne(String binaryNumber) {
        if (!binaryNumber.contains("0")) {
            return "1" + String.join("", Collections.nCopies(binaryNumber.length(), "0"));
        }

        char[] array = binaryNumber.toCharArray();
        for (int i = array.length - 1; i >= 0; i--) {
            if (array[i] == '0') {
                array[i] = '1';
                break;
            }
            else {
                array[i] = '0';
            }
        }
        return new String(array);
    }
}
