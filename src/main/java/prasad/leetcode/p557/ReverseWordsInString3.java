package prasad.leetcode.p557;

import java.util.Arrays;
import java.util.stream.Collectors;

public class ReverseWordsInString3 {

    public String reverseWords(String s) {
        String[] words = s.split(" ");
        return Arrays.stream(words)
                .map(w -> new StringBuilder(w).reverse().toString())
                .collect(Collectors.joining(" "));
    }
}
