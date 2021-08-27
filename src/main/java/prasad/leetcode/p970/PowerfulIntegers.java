package prasad.leetcode.p970;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class PowerfulIntegers {

    public List<Integer> powerfulIntegers(int x, int y, int bound) {
        // Handle special conditions of bound
        if (bound < 2) {
            return Collections.emptyList();
        }

        // Handle special conditions of x and y
        if (x == 1 && y == 1) {
            return Collections.singletonList(2);
        }
        else if (x == 1) {
            return handleOne(y, bound);
        }
        else if (y == 1) {
            return handleOne(x, bound);
        }

        Set<Integer> set = new HashSet<>();
        int i = 0;
        while (true) {
            int j = 0;
            while (true) {
                int sum = (int) (Math.pow(x, i) + Math.pow(y, j));
                if (sum <= bound) {
                    set.add(sum);
                    j++;
                }
                else {
                    break;
                }
            }

            if (j == 0) {
                break;
            }
            else {
                i++;
            }
        }
        return new ArrayList<>(set);
    }

    private List<Integer> handleOne(int otherInt, int bound) {
        List<Integer> list = new ArrayList<>();
        int k = 0;
        while (true) {
            int sum = (int) Math.pow(otherInt, k) + 1;
            if (sum <= bound) {
                list.add(sum);
                k++;
            }
            else {
                break;
            }
        }
        return list;
    }
}
