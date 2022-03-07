package prasad.leetcode.p1551;

public class MinimumOperationsToMakeArrayEqual {

    public int minOperations(int n) {
        if (n % 2 == 0) { // n is even
            // E.g.
            // 1  3  5  7  9  11
            // 5  3  1  1  3  5   (Differences from mid-point which is 6.)
            // Number of operations = 5 + 3 + 1 (Because 1 operation changes 2 values.)

            // Sum of 1, 3, 5,.. to n-1
            // Sum = (first + last) * number_of_items / 2
            return ((1 + (n - 1)) * (n / 2)) / 2;
        }
        else {
            // E.g.
            // 1  3  5  7  9  11  13
            // 6  4  2     2  4   6   (Difference from mid-point which is 7.)
            // Number of operations = 6 + 4 + 2 (Because 1 operation changes 2 values.)

            // Sum of 2, 4, 6,.. to n-1
            // Sum = (first + last) * number_of_items / 2
            return ((2 + (n - 1)) * (n / 2)) / 2;
        }
    }
}
