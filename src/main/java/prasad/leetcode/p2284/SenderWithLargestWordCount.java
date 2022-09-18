package prasad.leetcode.p2284;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SenderWithLargestWordCount {

    public String largestWordCount(String[] messages, String[] senders) {
        Map<String, SenderAndWordCount> sendersMap = new HashMap<>();
        for (int i = 0; i < messages.length; i++) {
            int words = messages[i].split(" ").length;
            if (sendersMap.containsKey(senders[i])) {
                sendersMap.get(senders[i]).updateWordCount(words);
            }
            else {
                sendersMap.put(senders[i], new SenderAndWordCount(senders[i], words));
            }
        }
        List<SenderAndWordCount> senderAndWordCounts = new ArrayList<>(sendersMap.values());
        Collections.sort(senderAndWordCounts);
        return senderAndWordCounts.get(0).senderName;
    }

    private static class SenderAndWordCount implements Comparable<SenderAndWordCount> {

        private final String senderName;
        private int wordCount;

        private SenderAndWordCount(String senderName, int initialWordCount) {
            this.senderName = senderName;
            this.wordCount = initialWordCount;
        }

        private void updateWordCount(int newWords) {
            wordCount += newWords;
        }

        @Override
        public int compareTo(SenderAndWordCount other) {
            int comparison = Integer.compare(other.wordCount, this.wordCount); // Descending order
            if (comparison == 0) {
                return other.senderName.compareTo(senderName); // Descending order
            }
            return comparison;
        }
    }
}
