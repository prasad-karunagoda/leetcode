package prasad.leetcode.p1451;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class RearrangeWordsInSentence {

    public String arrangeWords(String text) {
        String[] words = text.toLowerCase().split(" ");
        List<CustomComparableString> list = new ArrayList<>();
        for (int i = 0; i < words.length; i++) {
            list.add(new CustomComparableString(words[i], i));
        }
        List<String> sortedStrings = list.stream().sorted().map(c -> c.str).collect(Collectors.toList());
        String sentence = String.join(" ", sortedStrings);
        return Character.toUpperCase(sentence.charAt(0)) + sentence.substring(1);
    }

    private static class CustomComparableString implements Comparable<CustomComparableString> {

        private final String str;
        private final int initialPosition;

        private CustomComparableString(String str, int initialPosition) {
            this.str = str;
            this.initialPosition = initialPosition;
        }

        @Override
        public int compareTo(CustomComparableString other) {
            if (this.str.length() < other.str.length()) {
                return -1;
            }
            else if (this.str.length() > other.str.length()) {
                return 1;
            }
            else {
                return this.initialPosition - other.initialPosition;
            }
        }
    }
}
