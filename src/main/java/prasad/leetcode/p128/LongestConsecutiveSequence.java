package prasad.leetcode.p128;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class LongestConsecutiveSequence {

    public int longestConsecutive(int[] nums) {
        // Map holds start of sequence and end of sequence to sequence length.
        // E.g. If there is a sequence 3,4,5,6 then map would have 3->4 and 6->4 mappings (4 is the length).
        Map<Integer, Integer> map = new HashMap<>();
        int maxLength = 0;
        for (int n : nums) {
            if (!map.containsKey(n)) {
                int beforeSeqLength = 0;
                if (map.containsKey(n - 1)) {
                    beforeSeqLength = map.get(n - 1);
                }

                int afterSeqLength = 0;
                if (map.containsKey(n + 1)) {
                    afterSeqLength = map.get(n + 1);
                }

                int newLength = beforeSeqLength + afterSeqLength + 1;
                map.put(n, newLength);
                map.put(n - beforeSeqLength, newLength);
                map.put(n + afterSeqLength, newLength);

                if (newLength > maxLength) {
                    maxLength = newLength;
                }
            }
        }
        return maxLength;
    }

    public int longestConsecutiveTooSlow(int[] nums) {
        List<List<Integer>> sequences = new ArrayList<>();
        for (int n : nums) {
            boolean foundInASequence = false;
            for (List<Integer> seq : sequences) {
                Integer first = seq.get(0);
                Integer last = seq.get(seq.size() - 1);
                if (n == first - 1) {
                    seq.add(0, n);
                    foundInASequence = true;
                    break;
                }
                else if (n == last + 1) {
                    seq.add(seq.size(), n);
                    foundInASequence = true;
                    break;
                }
                else if (n >= first && n <= last) {
                    foundInASequence = true;
                }
            }

            if (!foundInASequence) {
                List<Integer> newSequence = new ArrayList<>();
                newSequence.add(n);
                sequences.add(newSequence);
            }
        }

        sequences.sort(Comparator.comparingInt(list -> list.get(0)));
        for (int i = 0; i < sequences.size() - 1; i++) {
            List<Integer> thisSeq = sequences.get(i);
            List<Integer> nextSeq = sequences.get(i + 1);
            if (thisSeq.get(thisSeq.size() - 1) + 1 == nextSeq.get(0)) {
                nextSeq.addAll(0, thisSeq);
            }
        }

        int maxLength = 0;
        for (List<Integer> seq : sequences) {
            if (maxLength < seq.size()) {
                maxLength = seq.size();
            }
        }
        return maxLength;
    }
}
