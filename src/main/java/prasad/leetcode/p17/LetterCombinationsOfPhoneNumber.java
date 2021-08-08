package prasad.leetcode.p17;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class LetterCombinationsOfPhoneNumber {

    private static final Map<Character, List<String>> map = new HashMap<>();

    static {
        map.put('2', Arrays.asList("a", "b", "c"));
        map.put('3', Arrays.asList("d", "e", "f"));
        map.put('4', Arrays.asList("g", "h", "i"));
        map.put('5', Arrays.asList("j", "k", "l"));
        map.put('6', Arrays.asList("m", "n", "o"));
        map.put('7', Arrays.asList("p", "q", "r", "s"));
        map.put('8', Arrays.asList("t", "u", "v"));
        map.put('9', Arrays.asList("w", "x", "y", "z"));
    }

    public List<String> letterCombinations(String digits) {
        List<String> combinations = new ArrayList<>();
        if (digits.length() > 0) {
            char d1 = digits.charAt(0);
            List<String> letters1 = map.get(d1);
            for (String l1 : letters1) {

                if (digits.length() > 1) {
                    char d2 = digits.charAt(1);
                    List<String> letters2 = map.get(d2);
                    for (String l2 : letters2) {

                        if (digits.length() > 2) {
                            char d3 = digits.charAt(2);
                            List<String> letters3 = map.get(d3);
                            for (String l3 : letters3) {

                                if (digits.length() > 3) {
                                    char d4 = digits.charAt(3);
                                    List<String> letters4 = map.get(d4);
                                    for (String l4 : letters4) {
                                        combinations.add(l1 + l2 + l3 + l4);
                                    }
                                }
                                else {
                                    combinations.add(l1 + l2 + l3);
                                }
                            }
                        }
                        else {
                            combinations.add(l1 + l2);
                        }
                    }
                }
                else {
                    combinations.add(l1);
                }
            }
        }
        return combinations;
    }
}
