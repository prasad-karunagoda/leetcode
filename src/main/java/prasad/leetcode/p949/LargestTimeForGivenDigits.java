package prasad.leetcode.p949;

import prasad.leetcode.common.CommonFunctions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LargestTimeForGivenDigits {

    public String largestTimeFromDigits(int[] arr) {
        List<Integer> numbers = new ArrayList<>();
        for (int n : arr) {
            numbers.add(n);
        }
        List<List<Integer>> permutations = CommonFunctions.permutations(numbers);
        List<Integer> largest = Arrays.asList(0, 0, 0, 0);
        boolean validPermutationExists = false;
        for (List<Integer> p : permutations) {
            int hours = p.get(0) * 10 + p.get(1);
            int minutes = p.get(2) * 10 + p.get(3);
            if (hours <= 23 && minutes <= 59) {
                validPermutationExists = true;
                if (calculateMinutes(largest) < calculateMinutes(p)) {
                    largest = p;
                }
            }
        }

        if (!validPermutationExists) {
            return "";
        }
        return largest.get(0) + "" + largest.get(1) + ":" + largest.get(2) + "" + largest.get(3);
    }

    private int calculateMinutes(List<Integer> time) {
        return (time.get(0) * 10 + time.get(1)) * 12 + time.get(2) * 10 + time.get(3);
    }
}
