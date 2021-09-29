package prasad.leetcode.p500;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class KeyboardRow {

    private static final List<List<Character>> rows = new ArrayList<>();

    static {
        rows.add(Arrays.asList('q', 'w', 'e', 'r', 't', 'y', 'u', 'i', 'o', 'p'));
        rows.add(Arrays.asList('a', 's', 'd', 'f', 'g', 'h', 'j', 'k', 'l'));
        rows.add(Arrays.asList('z', 'x', 'c', 'v', 'b', 'n', 'm'));
    }

    public String[] findWords(String[] words) {
        List<String> sameRowWords = new ArrayList<>();
        for (String w : words) {
            char[] chars = w.toCharArray();
            char firstChar = Character.toLowerCase(chars[0]);
            List<Character> firstCharRow = null;
            for (List<Character> r : rows) {
                if (r.contains(firstChar)) {
                    firstCharRow = r;
                    break;
                }
            }

            if (firstCharRow == null) {
                throw new IllegalArgumentException("Invalid character: " + chars[0]);
            }

            boolean isSameRowCharacters = true;
            for (int i = 1; i < chars.length; i++) {
                if (!firstCharRow.contains(Character.toLowerCase(chars[i]))) {
                    isSameRowCharacters = false;
                    break;
                }
            }

            if (isSameRowCharacters) {
                sameRowWords.add(w);
            }
        }
        return sameRowWords.toArray(new String[0]);
    }
}
