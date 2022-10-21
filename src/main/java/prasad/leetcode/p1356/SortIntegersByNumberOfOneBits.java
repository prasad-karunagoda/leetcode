package prasad.leetcode.p1356;

import java.util.Arrays;

public class SortIntegersByNumberOfOneBits {

    public int[] sortByBits(int[] arr) {
        return Arrays.stream(arr)
                .mapToObj(OneBitCount::new)
                .sorted()
                .mapToInt(object -> object.number)
                .toArray();
    }

    private static class OneBitCount implements Comparable<OneBitCount> {
        private final int number;
        private byte bitCount;

        private OneBitCount(int number) {
            this.number = number;
            this.bitCount = 0;
            char[] array = Integer.toBinaryString(number).toCharArray();
            for (char c : array) {
                if (c == '1') {
                    bitCount++;
                }
            }
        }

        @Override
        public int compareTo(OneBitCount other) {
            if (this.bitCount > other.bitCount) {
                return 1;
            }
            else if (this.bitCount < other.bitCount) {
                return -1;
            }
            else {
                return this.number - other.number;
            }
        }
    }
}
