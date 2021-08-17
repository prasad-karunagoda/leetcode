package prasad.leetcode.p258;

public class AddDigits {

    public int addDigits(int num) {
        String s = String.valueOf(num);
        if (s.length() == 1) {
            return num;
        }
        else {
            return addDigits(s.chars().map(n -> n - '0').sum());
        }
    }
}
