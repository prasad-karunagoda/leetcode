package prasad.leetcode.p1170;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class CompareFrequencyOfSmallestChar {

    public int[] numSmallerByFrequency(String[] queries, String[] words) {
        List<Integer> queryFrequencies = Arrays.stream(queries)
                .map(this::frequencyOfSmallestChar)
                .collect(Collectors.toList());
        List<Integer> wordFrequencies = Arrays.stream(words)
                .map(this::frequencyOfSmallestChar)
                .collect(Collectors.toList());
        int[] answers = new int[queryFrequencies.size()];
        for (int i = 0; i < queryFrequencies.size(); i++) {
            Integer q = queryFrequencies.get(i);
            int count = 0;
            for (Integer w : wordFrequencies) {
                if (q < w) {
                    count++;
                }
            }
            answers[i] = count;
        }
        return answers;
    }

    int frequencyOfSmallestChar(String s) {
        if (s == null || s.isEmpty()) {
            throw new IllegalArgumentException("Input string is null or empty.");
        }

        char[] array = s.toCharArray();
        Arrays.sort(array);
        char firstChar = array[0];
        int index = 1;
        while (index < array.length && firstChar == array[index]) {
            index++;
        }
        return index;
    }
}
