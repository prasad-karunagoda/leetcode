package prasad.leetcode.p1281;

public class SubtractProductAndSumOfDigits {

    public int subtractProductAndSum(int n) {
        char[] array = String.valueOf(n).toCharArray();
        int product = 1;
        int sum = 0;
        for (char c : array) {
            int digit = c - '0';
            product *= digit;
            sum += digit;
        }
        return product - sum;
    }
}
