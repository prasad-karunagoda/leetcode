package prasad.leetcode.p809;

import java.util.ArrayList;
import java.util.List;

public class ExpressiveWords {

    public int expressiveWords(String s, String[] words) {
        WordStructure sStructure = getStructure(s);
        int stretchyCount = 0;
        for (String w : words) {
            WordStructure wStructure = getStructure(w);
            if (sStructure.startingCharOfGroups.equals(wStructure.startingCharOfGroups)) {
                boolean isStretchy = true;
                for (int i = 0; i < sStructure.charCounts.size(); i++) {
                    if (sStructure.charCounts.get(i) < wStructure.charCounts.get(i) ||
                            (sStructure.charCounts.get(i) > wStructure.charCounts.get(i) &&
                                    sStructure.charCounts.get(i) < 3)) {
                        isStretchy = false;
                        break;
                    }
                }

                if (isStretchy) {
                    stretchyCount++;
                }
            }
        }
        return stretchyCount;
    }

    WordStructure getStructure(String word) {
        StringBuilder startingCharOfGroups = new StringBuilder();
        List<Integer> charCounts = new ArrayList<>();
        char previous = word.charAt(0);
        int currentCount = 1;

        for (int i = 1; i < word.length(); i++) {
            if (word.charAt(i) == previous) {
                currentCount++;
            }
            else {
                startingCharOfGroups.append(previous);
                charCounts.add(currentCount);
                previous = word.charAt(i);
                currentCount = 1;
            }
        }

        // Adding last group
        startingCharOfGroups.append(previous);
        charCounts.add(currentCount);

        return new WordStructure(startingCharOfGroups.toString(), charCounts);
    }

    static class WordStructure {
        String startingCharOfGroups;
        List<Integer> charCounts;

        private WordStructure(String startingCharOfGroups, List<Integer> charCounts) {
            this.startingCharOfGroups = startingCharOfGroups;
            this.charCounts = charCounts;
        }
    }
}
