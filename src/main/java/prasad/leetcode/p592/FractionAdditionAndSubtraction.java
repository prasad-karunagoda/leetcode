package prasad.leetcode.p592;

import prasad.leetcode.common.CommonFunctions;

import java.util.ArrayList;
import java.util.List;

public class FractionAdditionAndSubtraction {

    public String fractionAddition(String expression) {
        List<Fraction> fractions = new ArrayList<>();
        int start = 0;
        for (int i = 0; i < expression.length(); i++) {
            if (i != 0 && (expression.charAt(i) == '+' || expression.charAt(i) == '-')) {
                String substring = expression.substring(start, i);
                fractions.add(new Fraction(substring));
                start = i;
            }
        }
        String lastSubstring = expression.substring(start);
        fractions.add(new Fraction(lastSubstring));

        int[] denominatorArray = new int[fractions.size()];
        for (int i = 0; i < fractions.size(); i++) {
            denominatorArray[i] = fractions.get(i).denominator;
        }
        int lcm = CommonFunctions.leastCommonMultiple(denominatorArray);

        int numeratorSum = 0;
        for (Fraction f : fractions) {
            f.changeDenominatorToLcm(lcm);
            numeratorSum += f.numerator;
        }

        if (numeratorSum % lcm == 0) {
            return (numeratorSum / lcm) + "/1";
        }
        else {
            int absNumerator = Math.abs(numeratorSum);
            // gcf(a,b) = (a * b) / lcm(a,b)
            int greatestCommonFactor = (absNumerator * lcm) / CommonFunctions.leastCommonMultiple(new int[] {absNumerator, lcm});
            return (numeratorSum / greatestCommonFactor) + "/" + (lcm / greatestCommonFactor);
        }
    }

    private static class Fraction {
        private int numerator;
        private int denominator;

        private Fraction(String string) {
            String[] numeratorAndDenominator = string.split("/");
            numerator = Integer.parseInt(numeratorAndDenominator[0]);
            denominator = Integer.parseInt(numeratorAndDenominator[1]);
        }

        private void changeDenominatorToLcm(int lcm) {
            int ratio = lcm / denominator;
            numerator *= ratio;
            denominator = lcm;
        }
    }
}
