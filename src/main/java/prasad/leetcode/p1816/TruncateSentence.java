package prasad.leetcode.p1816;

public class TruncateSentence {

    public String truncateSentence(String s, int k) {
        char[] array = s.toCharArray();
        int wordCount = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == ' ') {
                wordCount++;
                if (wordCount == k) {
                    return s.substring(0, i);
                }
            }
        }
        return s;
    }

    public String truncateSentenceSimpleButSlow(String s, int k) {
        String[] words = s.split(" ");
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < k; i++) {
            sb.append(words[i]);
            if (i < k - 1) {
                sb.append(" ");
            }
        }
        return sb.toString();
    }
}
