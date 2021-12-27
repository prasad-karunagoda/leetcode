package prasad.leetcode.p804;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class UniqueMorseCodeWords {

    private static final Map<Character, String> MORSE_CODES = new HashMap<>();

    static {
        MORSE_CODES.put('a', ".-");
        MORSE_CODES.put('b', "-...");
        MORSE_CODES.put('c', "-.-.");
        MORSE_CODES.put('d', "-..");
        MORSE_CODES.put('e', ".");
        MORSE_CODES.put('f', "..-.");
        MORSE_CODES.put('g', "--.");
        MORSE_CODES.put('h', "....");
        MORSE_CODES.put('i', "..");
        MORSE_CODES.put('j', ".---");
        MORSE_CODES.put('k', "-.-");
        MORSE_CODES.put('l', ".-..");
        MORSE_CODES.put('m', "--");
        MORSE_CODES.put('n', "-.");
        MORSE_CODES.put('o', "---");
        MORSE_CODES.put('p', ".--.");
        MORSE_CODES.put('q', "--.-");
        MORSE_CODES.put('r', ".-.");
        MORSE_CODES.put('s', "...");
        MORSE_CODES.put('t', "-");
        MORSE_CODES.put('u', "..-");
        MORSE_CODES.put('v', "...-");
        MORSE_CODES.put('w', ".--");
        MORSE_CODES.put('x', "-..-");
        MORSE_CODES.put('y', "-.--");
        MORSE_CODES.put('z', "--..");
    }

    public int uniqueMorseRepresentations(String[] words) {
        Set<String> uniqueSet = new HashSet<>();
        for (String w : words) {
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < w.length(); i++) {
                sb.append(MORSE_CODES.get(w.charAt(i)));
            }
            uniqueSet.add(sb.toString());
        }
        return uniqueSet.size();
    }
}
