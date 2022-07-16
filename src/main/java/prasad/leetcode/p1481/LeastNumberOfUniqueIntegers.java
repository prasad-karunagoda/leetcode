package prasad.leetcode.p1481;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

public class LeastNumberOfUniqueIntegers {

    public int findLeastNumOfUniqueInts(int[] arr, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int n : arr) {
            if (map.containsKey(n)) {
                map.put(n, map.get(n) + 1);
            }
            else {
                map.put(n, 1);
            }
        }

        ArrayList<Integer> allCounts = new ArrayList<>(map.values());
        Collections.sort(allCounts);

        int removedElements = 0;
        int removedIntegers = 0;
        for (Integer count : allCounts) {
            if (removedElements + count > k) {
                break;
            }
            removedElements += count;
            removedIntegers++;
        }
        return allCounts.size() - removedIntegers;
    }
}
