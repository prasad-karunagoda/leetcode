package prasad.leetcode.p1471;

import java.util.Arrays;

public class TheKStrongestValuesInArray {

    public int[] getStrongest(int[] arr, int k) {
        Arrays.sort(arr);
        int median = arr[(arr.length - 1) / 2];
        return Arrays.stream(arr)
                .mapToObj(n -> new ValueAndStrength(n, median))
                .sorted()
                .skip(arr.length - k)
                .mapToInt(valueAndStrength -> valueAndStrength.value)
                .toArray();
    }

    private static class ValueAndStrength implements Comparable<ValueAndStrength> {
        private final int value;
        private final int strength;

        private ValueAndStrength(int value, int median) {
            this.value = value;
            this.strength = Math.abs(value - median);
        }

        @Override
        public int compareTo(ValueAndStrength other) {
            if (this.strength > other.strength) {
                return 1;
            }
            else if (this.strength < other.strength) {
                return -1;
            }
            else {
                return this.value - other.value;
            }
        }
    }
}
