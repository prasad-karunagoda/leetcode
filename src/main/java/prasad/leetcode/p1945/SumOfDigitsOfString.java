package prasad.leetcode.p1945;

public class SumOfDigitsOfString {

    public int getLucky(String s, int k) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            int n = s.charAt(i) - 'a' + 1;
            sb.append(n);
        }

        String number = sb.toString();
        int sum = 0;
        for (int x = 1; x <= k; x++) {
            sum = 0;
            for (int i = 0; i < number.length(); i++) {
                int n = number.charAt(i) - '0';
                sum += n;
            }
            number = String.valueOf(sum);
        }
        return sum;
    }
}
