package prasad.leetcode.p676;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MagicDictionary {

    private Map<Integer, List<String>> lengthToWordsMap;

    public MagicDictionary() {
        lengthToWordsMap = new HashMap<>();
    }

    public void buildDict(String[] dictionary) {
        for (String word : dictionary) {
            if (!lengthToWordsMap.containsKey(word.length())) {
                lengthToWordsMap.put(word.length(), new ArrayList<>());
            }
            lengthToWordsMap.get(word.length()).add(word);
        }
    }

    public boolean search(String searchWord) {
        char[] searchArray = searchWord.toCharArray();
        List<String> words = lengthToWordsMap.get(searchWord.length());
        if (words != null) {
            for (String w : words) {
                char[] array = w.toCharArray();
                int mismatches = 0;
                for (int i = 0; i < searchArray.length; i++) {
                    if (searchArray[i] != array[i]) {
                        mismatches++;
                        if (mismatches > 1) {
                            break;
                        }
                    }
                }
                if (mismatches == 1) {
                    return true;
                }
            }
        }
        return false;
    }
}
