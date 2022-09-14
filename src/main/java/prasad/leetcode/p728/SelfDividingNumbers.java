package prasad.leetcode.p728;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class SelfDividingNumbers {

    public List<Integer> selfDividingNumbers(int left, int right) {
        List<Integer> result = new ArrayList<>();
        for (int n = left; n <= right; n++) {
            Set<Integer> digits = getDistinctDigits(n);
            if (!digits.contains(0)) {
                boolean divisible = true;
                for (Integer d : digits) {
                    if (n % d != 0) {
                        divisible = false;
                        break;
                    }
                }
                if (divisible) {
                    result.add(n);
                }
            }
        }
        return result;
    }

    private Set<Integer> getDistinctDigits(int number) {
        if (number < 0) {
            throw new IllegalArgumentException("Argument number must be greater than or equal to 0.");
        }
        char[] array = String.valueOf(number).toCharArray();
        Set<Integer> set = new HashSet<>();
        for (char c : array) {
            int n = c - '0';
            set.add(n);
        }
        return set;
    }
}
