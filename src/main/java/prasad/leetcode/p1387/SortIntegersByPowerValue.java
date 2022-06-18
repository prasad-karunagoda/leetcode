package prasad.leetcode.p1387;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

public class SortIntegersByPowerValue {

    private final HashMap<Integer, Integer> powerValues = new HashMap<>();

    public int getKth(int lo, int hi, int k) {
        ArrayList<IntegerAndPowerValue> list = new ArrayList<>();
        for (int n = lo; n <= hi; n++) {
            int power = getPowerValue(n);
            powerValues.put(n, power);
            list.add(new IntegerAndPowerValue(n, power));
        }
        Collections.sort(list);
        return list.get(k - 1).n;
    }

    private int getPowerValue(int n) {
        int steps = 0;
        while (n > 1) {
            if (powerValues.containsKey(n)) {
                return steps + powerValues.get(n);
            }
            else {
                if (n % 2 == 0) {
                    n = n / 2;
                }
                else {
                    n = (n * 3) + 1;
                }
                steps++;
            }
        }
        return steps;
    }

    private static class IntegerAndPowerValue implements Comparable<IntegerAndPowerValue> {
        private final int n;
        private final int power;

        private IntegerAndPowerValue(int n, int power) {
            this.n = n;
            this.power = power;
        }

        @Override
        public int compareTo(IntegerAndPowerValue other) {
            if (this.power != other.power) {
                return this.power - other.power;
            }
            else {
                return this.n - other.n;
            }
        }
    }
}
