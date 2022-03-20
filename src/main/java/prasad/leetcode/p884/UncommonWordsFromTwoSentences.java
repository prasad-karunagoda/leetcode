package prasad.leetcode.p884;

import java.util.ArrayList;
import java.util.HashMap;

public class UncommonWordsFromTwoSentences {

    public String[] uncommonFromSentences(String s1, String s2) {
        String[] words1 = s1.split(" ");
        String[] words2 = s2.split(" ");
        String[] allWords = new String[words1.length + words2.length];
        System.arraycopy(words1, 0, allWords, 0, words1.length);
        System.arraycopy(words2, 0, allWords, words1.length, words2.length);

        HashMap<String, Integer> map = new HashMap<>();
        for (String w : allWords) {
            if (map.containsKey(w)) {
                map.put(w, map.get(w) + 1);
            }
            else {
                map.put(w, 1);
            }
        }

        ArrayList<String> list = new ArrayList<>();
        map.entrySet().stream().filter(entry -> entry.getValue() == 1).forEach(entry -> list.add(entry.getKey()));
        return list.toArray(new String[0]);
    }
}
