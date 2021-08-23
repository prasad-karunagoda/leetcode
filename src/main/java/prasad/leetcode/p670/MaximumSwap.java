package prasad.leetcode.p670;

public class MaximumSwap {

    public int maximumSwap(int num) {
        int max = num;
        String str = String.valueOf(num);
        for (int i = 0; i < str.length(); i++) {
            for (int j = i + 1; j < str.length(); j++) {
                char[] array = str.toCharArray();
                char temp = array[i];
                array[i] = array[j];
                array[j] = temp;
                int newNum = Integer.parseInt(String.valueOf(array));
                if (newNum > max) {
                    max = newNum;
                }
            }
        }
        return max;
    }
}
