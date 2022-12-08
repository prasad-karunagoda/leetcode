package prasad.leetcode.p1508;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class RangeSumOfSortedSubarraySums {

    public int rangeSum(int[] nums, int n, int left, int right) {
        List<Integer> subarraySums = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            int sum = nums[i];
            subarraySums.add(sum);
            for (int length = 2; length <= n - i; length++) {
                sum += nums[i + length - 1];
                subarraySums.add(sum);
            }
        }
        Collections.sort(subarraySums);
        long rangeSum = 0;
        for (int i = left - 1; i <= right - 1; i++) {
            rangeSum += subarraySums.get(i);
        }
        return (int) (rangeSum % (1_000_000_000 + 7));
    }
}
