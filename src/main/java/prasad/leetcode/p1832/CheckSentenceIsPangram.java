package prasad.leetcode.p1832;

public class CheckSentenceIsPangram {

    public boolean checkIfPangram(String sentence) {
        boolean[] charFound = new boolean[26];
        for (int i = 0; i < sentence.length(); i++) {
            char c = sentence.charAt(i);
            charFound[c - 'a'] = true;
        }

        for (boolean found : charFound) {
            if (!found) {
                return false;
            }
        }
        return true;
    }
}
