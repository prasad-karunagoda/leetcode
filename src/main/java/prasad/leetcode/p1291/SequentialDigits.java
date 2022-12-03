package prasad.leetcode.p1291;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SequentialDigits {

    private static final List<Integer> all = new ArrayList<>();

    static {
        String s = "123456789";
        for (int length = 2; length <= 9; length++) {
            for (int i = 0; i <= s.length() - length; i++) {
                all.add(Integer.parseInt(s.substring(i, i + length)));
            }
        }
    }

    public List<Integer> sequentialDigits(int low, int high) {
        int from = -1;
        for (int i = 0; i < all.size(); i++) {
            if (all.get(i) >= low) {
                from = i;
                break;
            }
        }

        int to = -1;
        for (int i = all.size() - 1; i >= 0; i--) {
            if (all.get(i) <= high) {
                to = i;
                break;
            }
        }

        if (from == -1 || to == -1) {
            return Collections.emptyList();
        }
        else {
            return new ArrayList<>(all.subList(from, to + 1));
        }
    }
}
