package prasad.leetcode.p1447;

import java.util.ArrayList;
import java.util.List;

public class SimplifiedFractions {

    private static final int[] PRIMES = new int[] {2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47};

    public List<String> simplifiedFractions(int n) {
        List<String> fractions = new ArrayList<>();
        for (int denominator = 2; denominator <= n; denominator++) {
            for (int numerator = 1; numerator < denominator; numerator++) {
                if (!hasCommonFactors(numerator, denominator)) {
                    fractions.add(numerator + "/" + denominator);
                }
            }
        }
        return fractions;
    }

    private boolean hasCommonFactors(int numerator, int denominator) {
        for (int p : PRIMES) {
            if (numerator < p) {
                break;
            }
            if (numerator % p == 0 && denominator % p == 0) {
                return true;
            }
        }
        return false;
    }
}
