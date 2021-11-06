package prasad.leetcode.p1980;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class FindUniqueBinaryString {

    public String findDifferentBinaryString(String[] nums) {
        int n = nums.length;
        int count = (int) Math.pow(2, n);
        List<String> list = Arrays.asList(nums);
        for (int i = 0; i < count; i++) {
            String s = Integer.toBinaryString(i);
            String leadingZeros = String.join("", Collections.nCopies(n - s.length(), "0"));
            if (!list.contains(leadingZeros + s)) {
                return leadingZeros + s;
            }
        }
        throw new IllegalStateException("Execution is not expected to reach here.");
    }
}
