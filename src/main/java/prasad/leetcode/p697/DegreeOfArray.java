package prasad.leetcode.p697;

import java.util.*;

public class DegreeOfArray {

    public int findShortestSubArray(int[] nums) {
        Map<Integer, FrequencyAndSpan> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            FrequencyAndSpan frequencyAndSpan = map.get(nums[i]);
            if (frequencyAndSpan != null) {
                frequencyAndSpan.frequency++;
                frequencyAndSpan.span = i - frequencyAndSpan.startIndex + 1;
            }
            else {
                map.put(nums[i], new FrequencyAndSpan(i, 1, 1));
            }
        }

        List<FrequencyAndSpan> list = new ArrayList<>(map.values());
        Collections.sort(list);
        return list.get(0).span;
    }

    private static class FrequencyAndSpan implements Comparable<FrequencyAndSpan> {
        private final int startIndex;

        private int frequency;
        private int span;

        private FrequencyAndSpan(int startIndex, int frequency, int span) {
            this.startIndex = startIndex;
            this.frequency = frequency;
            this.span = span;
        }

        @Override
        public int compareTo(FrequencyAndSpan other) {
            if (this.frequency > other.frequency) {
                return -1;
            }
            else if (this.frequency < other.frequency) {
                return 1;
            }
            else {
                return Integer.compare(this.span, other.span);
            }
        }
    }
}
