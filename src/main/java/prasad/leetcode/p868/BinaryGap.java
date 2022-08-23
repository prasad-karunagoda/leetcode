package prasad.leetcode.p868;

public class BinaryGap {

    public int binaryGap(int n) {
        String s = Integer.toBinaryString(n);
        int indexOfPreviousOne = -1;
        int max = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '1') {
                if (indexOfPreviousOne > -1 && max < i - indexOfPreviousOne) {
                    max = i - indexOfPreviousOne;
                }
                indexOfPreviousOne = i;
            }
        }
        return max;
    }
}
