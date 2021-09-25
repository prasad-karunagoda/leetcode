package prasad.leetcode.p434;

import java.util.Arrays;

public class NumberOfSegmentsInString {

    public int countSegments(String s) {
        String[] segments = s.split(" ");
        return (int) Arrays.stream(segments).filter(str -> !str.trim().isEmpty()).count();
    }
}
