package prasad.leetcode.p738;

public class MonotoneIncreasingDigits {

    public int monotoneIncreasingDigits(int n) {
        char[] array = String.valueOf(n).toCharArray();
        for (int i = array.length - 1; i > 0; i--) {
            if (array[i] < array[i - 1]) {
                array[i - 1] = (char) (array[i - 1] - 1);
                for (int j = i; j < array.length; j++) {
                    array[j] = '9';
                }
            }
        }
        return Integer.parseInt(String.valueOf(array));
    }
}
