package prasad.leetcode.p443;

public class StringCompression {

    public int compress(char[] chars) {
        char groupChar = chars[0];
        int count = 1;
        StringBuilder sb = new StringBuilder();
        for (int i = 1; i < chars.length; i++) {
            char c = chars[i];
            if (groupChar == c) {
                count++;
            }
            else {
                sb.append(groupChar);
                if (count > 1) {
                    sb.append(count);
                }
                groupChar = c;
                count = 1;
            }
        }
        sb.append(groupChar);
        if (count > 1) {
            sb.append(count);
        }

        char[] compressed = sb.toString().toCharArray();
        System.arraycopy(compressed, 0, chars, 0, compressed.length);
        return compressed.length;
    }
}
