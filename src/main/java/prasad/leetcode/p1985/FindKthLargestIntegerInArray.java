package prasad.leetcode.p1985;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class FindKthLargestIntegerInArray {

    public String kthLargestNumber(String[] nums, int k) {
        int maxLength = Arrays.stream(nums).mapToInt(String::length).max().getAsInt();
        List<String> sorted = Arrays.stream(nums)
                .map(n -> String.join("", Collections.nCopies(maxLength - n.length(), "0")) + n)
                .sorted()
                .collect(Collectors.toList());
        String kthLargest = sorted.get(sorted.size() - k);

        int start = kthLargest.length() - 1;
        for (int i = 0; i < kthLargest.length(); i++) {
            if (kthLargest.charAt(i) != '0') {
                start = i;
                break;
            }
        }
        return kthLargest.substring(start);
    }
}
