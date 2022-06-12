package prasad.leetcode.p1887;

import java.util.Map;
import java.util.TreeMap;

public class ReductionOperationsToMakeArrayElementsEqual {

    public int reductionOperations(int[] nums) {
        TreeMap<Integer, Integer> map = new TreeMap<>();
        for (int n : nums) {
            if (map.containsKey(n)) {
                map.put(n, map.get(n) + 1);
            }
            else {
                map.put(n, 1);
            }
        }

        int operationsForGroup = 0;
        int totalOperations = 0;
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            totalOperations += operationsForGroup * entry.getValue();
            operationsForGroup++;
        }
        return totalOperations;
    }
}
