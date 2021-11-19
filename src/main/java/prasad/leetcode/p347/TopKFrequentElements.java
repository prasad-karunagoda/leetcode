package prasad.leetcode.p347;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class TopKFrequentElements {

    public int[] topKFrequent(int[] nums, int k) {
        Arrays.sort(nums);
        List<ElementAndFrequency> list = new ArrayList<>();
        int currentElement = nums[0];
        int frequency = 1;
        for (int i = 1; i < nums.length; i++) {
            if (currentElement == nums[i]) {
                frequency++;
            }
            else {
                list.add(new ElementAndFrequency(currentElement, frequency));
                currentElement = nums[i];
                frequency = 1;
            }
        }
        // Adding last ElementAndFrequency
        list.add(new ElementAndFrequency(currentElement, frequency));
        Collections.sort(list);

        int[] result = new int[k];
        for (int i = 0; i < k; i++) {
            result[i] = list.get(i).element;
        }
        return result;
    }

    private static class ElementAndFrequency implements Comparable<ElementAndFrequency> {
        private final int element;
        private final int frequency;

        private ElementAndFrequency(int element, int frequency) {
            this.element = element;
            this.frequency = frequency;
        }

        @Override
        public int compareTo(ElementAndFrequency other) {
            return other.frequency - this.frequency;
        }
    }
}
