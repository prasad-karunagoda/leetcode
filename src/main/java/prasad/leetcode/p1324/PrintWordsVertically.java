package prasad.leetcode.p1324;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class PrintWordsVertically {

    public List<String> printVertically(String s) {
        if (s.isEmpty()) {
            throw new IllegalArgumentException("Input string is empty.");
        }

        String[] words = s.split(" ");
        Optional<Integer> optional = Arrays.stream(words).map(String::length).max(Comparator.comparingInt(l -> l));
        if (optional.isPresent()) {
            int maxLength = optional.get();
            List<String> columns = new ArrayList<>();
            for (int i = 0; i < maxLength; i++) {
                StringBuilder sb = new StringBuilder();
                for (String w : words) {
                    if (i < w.length()) {
                        sb.append(w.charAt(i));
                    }
                    else {
                        sb.append(" ");
                    }
                }
                // Remove trailing spaces using replaceFirst()
                columns.add(sb.toString().replaceFirst("\\s++$", ""));
            }
            return columns;
        }
        else {
            throw new IllegalStateException("Execution is not supposed to reach here.");
        }
    }
}
