package prasad.leetcode.p1323;

public class Maximum69Number {

    public int maximum69Number (int num) {
        char[] array = String.valueOf(num).toCharArray();
        for (int i = 0; i < array.length; i++) {
            if (array[i] == '6') {
                array[i] = '9';
                break;
            }
        }
        return Integer.parseInt(String.valueOf(array));
    }
}
