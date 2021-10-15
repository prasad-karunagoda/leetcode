package prasad.leetcode.p692;

import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class TopKFrequentWords {

    public List<String> topKFrequent(String[] words, int k) {
        Map<String, Integer> counts = new HashMap<>();
        for (String w : words) {
            if (counts.containsKey(w)) {
                counts.put(w, counts.get(w) + 1);
            }
            else {
                counts.put(w, 1);
            }
        }

        return counts.entrySet().stream()
                .sorted(new EntryComparator())
                .limit(k)
                .map(Map.Entry::getKey)
                .collect(Collectors.toList());
    }

    private class EntryComparator implements Comparator<Map.Entry<String, Integer>> {
        @Override
        public int compare(Map.Entry<String, Integer> entry1, Map.Entry<String, Integer> entry2) {
            if (entry2.getValue() < entry1.getValue()) {
                return -1;
            }
            else if (entry2.getValue() > entry1.getValue()) {
                return 1;
            }
            else {
                return entry1.getKey().compareTo(entry2.getKey());
            }
        }
    }
}
