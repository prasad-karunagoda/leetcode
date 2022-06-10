package prasad.leetcode.p2165;

import java.util.Arrays;

public class SmallestValueOfRearrangedNumber {

    public long smallestNumber(long num) {
        if (num == 0) {
            return 0;
        }
        else if (num < 0) {
            String s = String.valueOf(num);
            char[] array = new char[s.length() - 1];
            for (int i = 1; i < s.length(); i++) {
                array[i - 1] = s.charAt(i);
            }
            Arrays.sort(array);
            StringBuilder sb = new StringBuilder("-");
            for (int i = array.length - 1; i >= 0; i--) {
                sb.append(array[i]);
            }
            return Long.parseLong(sb.toString());
        }
        else { // num > 0
            String s = String.valueOf(num);
            char[] array = s.toCharArray();
            Arrays.sort(array);
            int firstNonZeroIndex = -1;
            for (int i = 0; i < array.length; i++) {
                if (array[i] > '0') {
                    firstNonZeroIndex = i;
                    break;
                }
            }

            char[] rearranged = new char[array.length];
            rearranged[0] = array[firstNonZeroIndex];
            System.arraycopy(array, 0, rearranged, 1, firstNonZeroIndex);
            System.arraycopy(array, firstNonZeroIndex + 1, rearranged, firstNonZeroIndex + 1, array.length - firstNonZeroIndex - 1);
            return Long.parseLong(new String(rearranged));
        }
    }
}
