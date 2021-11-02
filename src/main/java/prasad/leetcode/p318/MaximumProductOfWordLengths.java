package prasad.leetcode.p318;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MaximumProductOfWordLengths {

    public int maxProduct(String[] words) {

        Map<Integer, List<WordPair>> map = new HashMap<>();
        int max = 0;
        for (int i = 0; i < words.length; i++) {
            for (int j = i + 1; j < words.length; j++) {
                int product = words[i].length() * words[j].length();
                if (product > max) {
                    max = product;
                }

                WordPair wordPair = new WordPair(words[i], words[j]);
                if (map.containsKey(product)) {
                    map.get(product).add(wordPair);
                }
                else {
                    List<WordPair> pairs = new ArrayList<>();
                    pairs.add(wordPair);
                    map.put(product, pairs);
                }
            }
        }

        while (max > 0) {
            List<WordPair> pairs = map.get(max);
            if (pairs != null) {
                for (WordPair p : pairs) {
                    if (!hasCommonLetters(p.word1, p.word2)) {
                        return max;
                    }
                }
            }
            max--;
        }

        return 0;
    }

    private boolean hasCommonLetters(String s1, String s2) {
        for (char c1 : s1.toCharArray()) {
            for (char c2 : s2.toCharArray()) {
                if (c1 == c2) {
                    return true;
                }
            }
        }
        return false;
    }

    private static class WordPair {
        private final String word1;
        private final String word2;

        private WordPair(String word1, String word2) {
            this.word1 = word1;
            this.word2 = word2;
        }
    }
}
