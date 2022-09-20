package prasad.leetcode.p62;

import java.math.BigInteger;

public class UniquePaths {

    public int uniquePaths(int m, int n) {
        /*
         * Multiset: x1 of a1, x2 of a2, x3 of a3, ... , xn of an
         * x1 + x2 + x3 + ... + xn = x
         * Permutations of multiset = x! / (x1! * x2! * x3! * ... * xn!)
         *
         * In the grid we have m rows and n columns
         * Every path is a permutation of (m - 1) Down moves and (n - 1) Right moves.
         * Therefore, number of unique paths
         *              = ((m - 1) + (n - 1))! / (m - 1)! * (n - 1)!
         */

        int x1 = m - 1;
        int x2 = n - 1;

        BigInteger dividend = new BigInteger("1");
        for (int p = x1 + 1; p <= x1 + x2; p++) {
            dividend = dividend.multiply(new BigInteger(String.valueOf(p)));
        }

        BigInteger divisor = new BigInteger("1");
        for (int q = 2; q <= x2; q++) {
            divisor = divisor.multiply(new BigInteger(String.valueOf(q)));
        }

        return dividend.divide(divisor).intValue();
    }
}
