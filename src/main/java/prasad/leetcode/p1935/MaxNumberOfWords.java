package prasad.leetcode.p1935;

public class MaxNumberOfWords {

    public int canBeTypedWords(String text, String brokenLetters) {
        String[] words = text.split(" ");
        int wordCount = 0;
        for (String w : words) {
            boolean canBeTyped = true;
            for (int i = 0; i < w.length(); i++) {
                if (brokenLetters.indexOf(w.charAt(i)) >= 0) {
                    canBeTyped = false;
                    break;
                }
            }
            if (canBeTyped) {
                wordCount++;
            }
        }
        return wordCount;
    }
}
