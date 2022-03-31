package prasad.leetcode.p1796;

public class SecondLargestDigitInString {

    public int secondHighest(String s) {
        int largest = -1;
        int secondLargest = -1;
        for (char c : s.toCharArray()) {
            if (c >= '0' && c <= '9') {
                int n = c - '0';
                if (n > largest) {
                    secondLargest = largest;
                    largest = n;
                }
                else if (n != largest && n > secondLargest) {
                    secondLargest = n;
                }
            }
        }
        return secondLargest;
    }
}
