package prasad.leetcode.p78;

import java.util.ArrayList;
import java.util.List;

public class Subsets {

    public List<List<Integer>> subsets(int[] nums) {
        if (nums.length == 1) {
            List<Integer> emptySet = new ArrayList<>();
            List<Integer> singleItemSet = new ArrayList<>();
            singleItemSet.add(nums[0]);

            List<List<Integer>> list = new ArrayList<>();
            list.add(emptySet);
            list.add(singleItemSet);
            return list;
        }

        int[] oneLessNums = new int[nums.length - 1];
        System.arraycopy(nums, 1, oneLessNums, 0, nums.length - 1);
        List<List<Integer>> subsets = subsets(oneLessNums);
        List<List<Integer>> addedSets = new ArrayList<>();
        for (List<Integer> set : subsets) {
            List<Integer> copy = new ArrayList<>(set);
            copy.add(nums[0]);
            addedSets.add(copy);
        }
        subsets.addAll(addedSets);
        return subsets;
    }
}
