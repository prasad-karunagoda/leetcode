package prasad.leetcode.p350;

import java.util.ArrayList;
import java.util.List;

public class IntersectionOfTwoArrays2 {

    public int[] intersect(int[] nums1, int[] nums2) {
        int max = 0;
        int[] counts1 = new int[1001];
        for (int n : nums1) {
            counts1[n]++;
            if (max < n) {
                max = n;
            }
        }

        int[] counts2 = new int[1001];
        for (int n : nums2) {
            counts2[n]++;
            if (max < n) {
                max = n;
            }
        }

        List<Integer> list = new ArrayList<>();
        for (int i = 0; i <= max; i++) {
            int minCount = Math.min(counts1[i], counts2[i]);
            for (int j = 1; j <= minCount; j++) {
                list.add(i);
            }
        }

        int[] intersection = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            intersection[i] = list.get(i);
        }
        return intersection;
    }
}
