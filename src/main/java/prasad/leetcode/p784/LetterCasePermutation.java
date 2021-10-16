package prasad.leetcode.p784;

import java.util.ArrayList;
import java.util.List;

public class LetterCasePermutation {

    public List<String> letterCasePermutation(String s) {
        List<String> permutations = new ArrayList<>();
        permutations.add(s);
        char[] array = s.toCharArray();
        for (int i = 0; i < array.length; i++) {
            char c = array[i];
            if (Character.isLetter(c)) {
                List<String> newPermutations = new ArrayList<>();
                for (String p : permutations) {
                    StringBuilder sb = new StringBuilder(p);
                    if (Character.isLowerCase(c)) {
                        sb.setCharAt(i, Character.toUpperCase(c));
                    }
                    else {
                        sb.setCharAt(i, Character.toLowerCase(c));
                    }
                    newPermutations.add(sb.toString());
                }
                permutations.addAll(newPermutations);
            }
        }
        return permutations;
    }
}
