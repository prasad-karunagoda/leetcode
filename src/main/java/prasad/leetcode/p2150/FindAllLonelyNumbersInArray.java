package prasad.leetcode.p2150;

import java.util.ArrayList;
import java.util.List;

public class FindAllLonelyNumbersInArray {

    public List<Integer> findLonely(int[] nums) {
        int[] counts = new int[1000001];
        for (int x : nums) {
            counts[x]++;
        }

        List<Integer> lonely = new ArrayList<>();
        // Handle first and last specially
        if (counts[0] == 1 && counts[1] == 0) {
            lonely.add(0);
        }
        if (counts[counts.length - 1] == 1 && counts[counts.length - 2] == 0) {
            lonely.add(counts.length - 1);
        }

        for (int x = 1; x <= counts.length - 2; x++) {
            if (counts[x] == 1 && counts[x - 1] == 0 && counts[x + 1] == 0) {
                lonely.add(x);
            }
        }
        return lonely;
    }
}
