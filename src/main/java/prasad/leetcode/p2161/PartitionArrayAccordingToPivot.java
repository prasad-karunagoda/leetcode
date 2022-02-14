package prasad.leetcode.p2161;

import java.util.ArrayList;
import java.util.List;

public class PartitionArrayAccordingToPivot {

    public int[] pivotArray(int[] nums, int pivot) {
        List<Integer> less = new ArrayList<>();
        List<Integer> equal = new ArrayList<>();
        List<Integer> greater = new ArrayList<>();
        for (int n : nums) {
            if (n < pivot) {
                less.add(n);
            }
            else if (n > pivot) {
                greater.add(n);
            }
            else {
                equal.add(n);
            }
        }

        int[] rearranged = new int[nums.length];
        int i = 0;
        for (Integer n : less) {
            rearranged[i] = n;
            i++;
        }
        for (Integer n : equal) {
            rearranged[i] = n;
            i++;
        }
        for (Integer n : greater) {
            rearranged[i] = n;
            i++;
        }
        return rearranged;
    }
}
