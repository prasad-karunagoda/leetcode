package prasad.leetcode.p2348;

import java.util.HashMap;
import java.util.Map;

public class NumberOfZeroFilledSubarrays {

    public long zeroFilledSubarray(int[] nums) {
        boolean isPreviousZero = false;
        int sequenceLength = 0;
        HashMap<Integer, Integer> lengthToCountMap = new HashMap<>();
        for (int n : nums) {
            if (n == 0) {
                sequenceLength++;
                isPreviousZero = true;
            }
            else if (isPreviousZero) {
                if (lengthToCountMap.containsKey(sequenceLength)) {
                    lengthToCountMap.put(sequenceLength, lengthToCountMap.get(sequenceLength) + 1);
                }
                else {
                    lengthToCountMap.put(sequenceLength, 1);
                }
                isPreviousZero = false;
                sequenceLength = 0;
            }
        }

        if (isPreviousZero) {
            if (lengthToCountMap.containsKey(sequenceLength)) {
                lengthToCountMap.put(sequenceLength, lengthToCountMap.get(sequenceLength) + 1);
            }
            else {
                lengthToCountMap.put(sequenceLength, 1);
            }
        }

        long total = 0;
        for (Map.Entry<Integer, Integer> entry : lengthToCountMap.entrySet()) {
            long length = entry.getKey();
            long subarrays = (length * (length + 1)) / 2;
            total += (subarrays * entry.getValue());
        }
        return total;
    }
}
