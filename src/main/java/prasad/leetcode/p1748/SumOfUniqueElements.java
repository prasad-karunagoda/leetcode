package prasad.leetcode.p1748;

import java.util.HashMap;
import java.util.Map;

public class SumOfUniqueElements {

    public int sumOfUnique(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int n : nums) {
            if (map.containsKey(n)) {
                map.put(n, map.get(n) + 1);
            }
            else {
                map.put(n, 1);
            }
        }
        return map.entrySet().stream().filter(entry -> entry.getValue() == 1).mapToInt(Map.Entry::getKey).sum();
    }
}
