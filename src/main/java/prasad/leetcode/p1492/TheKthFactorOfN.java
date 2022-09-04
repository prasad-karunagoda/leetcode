package prasad.leetcode.p1492;

import java.util.ArrayList;

public class TheKthFactorOfN {

    public int kthFactor(int n, int k) {
        if (n == 1) {
            return 1;
        }

        ArrayList<Integer> factors = new ArrayList<>();
        for (int x = 1; !factors.contains(x); x++) {
            if (n % x == 0) {
                int midIndex = factors.size() / 2;
                factors.add(midIndex, x);
                if (x != n / x) {
                    factors.add(midIndex + 1, n / x);
                }
            }

            if (factors.size() / 2 >= k) {
                break;
            }
        }
        return factors.size() < k ? -1 : factors.get(k - 1);
    }
}
