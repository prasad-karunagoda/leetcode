package prasad.leetcode.p806;

public class NumberOfLinesToWriteString {

    public int[] numberOfLines(int[] widths, String s) {
        int numberOfLines = 1;
        int currentLineWidth = 0;
        for (int i = 0; i < s.length(); i++) {
            int w = widths[s.charAt(i) - 'a'];
            if (currentLineWidth + w <= 100) {
                currentLineWidth = currentLineWidth + w;
            }
            else {
                numberOfLines++;
                currentLineWidth = w;
            }
        }
        return new int[] {numberOfLines, currentLineWidth};
    }
}
