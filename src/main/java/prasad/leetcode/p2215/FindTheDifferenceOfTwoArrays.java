package prasad.leetcode.p2215;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FindTheDifferenceOfTwoArrays {

    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        List<Integer> list1 = new ArrayList<>(Arrays.stream(nums1).boxed().collect(Collectors.toSet()));
        List<Integer> list2 = new ArrayList<>(Arrays.stream(nums2).boxed().collect(Collectors.toSet()));
        List<Integer> list1Original = new ArrayList<>(list1);

        list1.removeAll(list2);
        list2.removeAll(list1Original);
        return Arrays.asList(list1, list2);
    }
}
