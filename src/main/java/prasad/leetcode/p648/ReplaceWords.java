package prasad.leetcode.p648;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class ReplaceWords {

    public String replaceWords(List<String> dictionary, String sentence) {

        List<String> mutableDictionary = new ArrayList<>(dictionary);
        mutableDictionary.sort(Comparator.comparingInt(String::length));

        String[] words = sentence.split(" ");
        StringBuilder sb = new StringBuilder();
        for (String w : words) {
            boolean found = false;
            for (String root : mutableDictionary) {
                if (w.startsWith(root)) {
                    sb.append(root);
                    found = true;
                    break;
                }
            }

            if (!found) {
                sb.append(w);
            }
            sb.append(" ");
        }

        return sb.substring(0, sb.length() - 1);
    }
}
