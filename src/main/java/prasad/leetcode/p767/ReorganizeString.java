package prasad.leetcode.p767;

import prasad.leetcode.common.CommonFunctions;

import java.util.ArrayList;
import java.util.Collections;

public class ReorganizeString {

    public String reorganizeString(String s) {
        int[] counts = CommonFunctions.getLowercaseCharacterCounts(s);
        ArrayList<CharAndCount> list = new ArrayList<>();
        for (int i = 0; i < counts.length; i++) {
            list.add(new CharAndCount((char) ('a' + i), counts[i]));
        }
        Collections.sort(list);

        if (list.get(0).count > (s.length() + 1) / 2) {
            return "";
        }

        char[] array = new char[s.length()];
        int insertIndex = 0;
        for (CharAndCount charAndCount : list) {
            for (int n = 0; n < charAndCount.count; n++) {
                array[insertIndex] = charAndCount.c;
                if (insertIndex + 2 >= s.length()) {
                    insertIndex = 1;
                }
                else {
                    insertIndex += 2;
                }
            }
        }
        return new String(array);
    }

    private static class CharAndCount implements Comparable<CharAndCount> {
        private final char c;
        private final int count;

        private CharAndCount(char c, int count) {
            this.c = c;
            this.count = count;
        }

        @Override
        public int compareTo(CharAndCount other) {
            // Descending order
            return other.count - this.count;
        }
    }
}
