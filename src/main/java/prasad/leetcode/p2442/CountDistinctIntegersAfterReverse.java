package prasad.leetcode.p2442;

import java.util.HashSet;
import java.util.Set;

public class CountDistinctIntegersAfterReverse {

    public int countDistinctIntegers(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for (int n : nums) {
            set.add(n);
        }

        Set<Integer> reverse = new HashSet<>();
        for (Integer i : set) {
            StringBuilder sb = new StringBuilder(String.valueOf(i));
            reverse.add(Integer.parseInt(sb.reverse().toString()));
        }

        set.addAll(reverse);
        return set.size();
    }
}
