package prasad.leetcode.p1630;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArithmeticSubarrays {

    public List<Boolean> checkArithmeticSubarrays(int[] nums, int[] l, int[] r) {
        List<Boolean> result = new ArrayList<>();
        for (int i = 0; i < l.length; i++) {
            int size = r[i] - l[i] + 1;
            int[] subarray = new int[size];
            System.arraycopy(nums, l[i], subarray, 0, size);
            Arrays.sort(subarray);
            int diff = subarray[1] - subarray[0];
            boolean isArithmetic = true;
            for (int j = 1; j <= subarray.length - 2; j++) {
                if (subarray[j + 1] - subarray[j] != diff) {
                    isArithmetic = false;
                    break;
                }
            }
            result.add(isArithmetic);
        }
        return result;
    }
}
