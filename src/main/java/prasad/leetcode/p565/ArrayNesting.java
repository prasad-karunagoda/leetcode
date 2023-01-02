package prasad.leetcode.p565;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ArrayNesting {

    public int arrayNesting(int[] nums) {
        int longest = 0;
        for (int i = 0; i < nums.length; i++) {
            int length = 0;
            int nextIndex = i;
            while (nums[nextIndex] > -1) {
                int temp = nextIndex;
                nextIndex = nums[nextIndex];
                nums[temp] = -1;
                length++;
            }

            if (length > longest) {
                longest = length;
            }
        }
        return longest;
    }

    public int arrayNestingSlow(int[] nums) {
        Set<Integer> processed = new HashSet<>();
        int longest = 0;
        System.out.println("cycles:");
        for (int i = 0; i < nums.length; i++) {
            if (processed.contains(i)) {
                continue;
            }

            List<Integer> cycle = new ArrayList<>();
            cycle.add(i);
            int nextIndex = nums[i];
            while (!cycle.contains(nextIndex)) {
                cycle.add(nextIndex);
                nextIndex = nums[nextIndex];
            }

            if (cycle.size() > longest) {
                longest = cycle.size();
                if (longest > nums.length / 2) {
                    return longest;
                }
            }
            processed.addAll(cycle);
            System.out.println(cycle);
        }
        System.out.println();
        return longest;
    }
}
