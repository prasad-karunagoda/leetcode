package prasad.leetcode.p1636;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

public class SortArrayByIncreasingFrequency {

    public int[] frequencySort(int[] nums) {
        Group[] array = new Group[201];
        for (int n : nums) {
            if (array[n + 100] == null) {
                array[n + 100] = new Group((byte) n);
            }
            else {
                array[n + 100].add((byte) n);
            }
        }

        List<Byte> result = new ArrayList<>();
        Arrays.stream(array).filter(Objects::nonNull).sorted().forEach(g -> result.addAll(g.values));
        return result.stream().mapToInt(Byte::intValue).toArray();
    }

    private static class Group implements Comparable<Group> {
        private final List<Byte> values = new ArrayList<>();

        private Group(byte value) {
            values.add(value);
        }

        private void add(byte value) {
            values.add(value);
        }

        @Override
        public int compareTo(Group otherGroup) {
            if (values.size() > otherGroup.values.size()) {
                return 1;
            }
            else if (values.size() < otherGroup.values.size()) {
                return -1;
            }
            else {
                return Byte.compare(otherGroup.values.get(0), values.get(0));
            }
        }
    }
}
