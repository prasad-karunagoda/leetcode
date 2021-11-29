package prasad.leetcode.p658;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class FindKClosestElements {

    public List<Integer> findClosestElements(int[] arr, int k, int x) {
        List<Element> elements = new ArrayList<>();
        for (int n : arr) {
            elements.add(new Element(n, Math.abs(n - x)));
        }
        Collections.sort(elements);

        List<Integer> closest = new ArrayList<>();
        for (int i = 0; i < k; i++) {
            closest.add(elements.get(i).value);
        }
        Collections.sort(closest);
        return closest;
    }

    private static class Element implements Comparable<Element> {
        private final int value;
        private final int distance;

        private Element(int value, int distance) {
            this.value = value;
            this.distance = distance;
        }

        @Override
        public int compareTo(Element otherElement) {
            if (this.distance == otherElement.distance) {
                return this.value - otherElement.value;
            }
            return this.distance - otherElement.distance;
        }
    }
}
