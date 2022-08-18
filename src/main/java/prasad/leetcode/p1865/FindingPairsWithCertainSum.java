package prasad.leetcode.p1865;

import java.util.HashMap;
import java.util.Map;

public class FindingPairsWithCertainSum {

    private final int[] num2;
    private final HashMap<Integer, Integer> map1 = new HashMap<>();
    private final HashMap<Integer, Integer> map2 = new HashMap<>();

    public FindingPairsWithCertainSum(int[] nums1, int[] nums2) {
        this.num2 = nums2;
        for (int n : nums1) {
            if (map1.containsKey(n)) {
                map1.put(n, map1.get(n) + 1);
            }
            else {
                map1.put(n, 1);
            }
        }
        for (int n : nums2) {
            if (map2.containsKey(n)) {
                map2.put(n, map2.get(n) + 1);
            }
            else {
                map2.put(n, 1);
            }
        }
    }

    public void add(int index, int val) {
        int currentValue = num2[index];
        int newValue = num2[index] + val;
        map2.put(currentValue, map2.get(currentValue) - 1);
        if (map2.containsKey(newValue)) {
            map2.put(newValue, map2.get(newValue) + 1);
        }
        else {
            map2.put(newValue, 1);
        }
        num2[index] = newValue;
    }

    public int count(int tot) {
        int count = 0;
        for (Map.Entry<Integer, Integer> entry : map1.entrySet()) {
            int diff = tot - entry.getKey();
            if (diff > 0 && map2.containsKey(diff)) {
                int pairs = entry.getValue() * map2.get(diff);
                count += pairs;
            }
        }
        return count;
    }
}
