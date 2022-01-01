package prasad.leetcode.p726;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class NumberOfAtoms {

    public String countOfAtoms(String formula) {
        List<Token> tokens = tokenize(formula);
        resolveBrackets(tokens);

        Map<String, Integer> sortedMap = new TreeMap<>();
        for (Token t : tokens) {
            ElementToken e = (ElementToken) t;
            if (sortedMap.containsKey(e.element)) {
                sortedMap.put(e.element, sortedMap.get(e.element) + e.count);
            }
            else {
                sortedMap.put(e.element, e.count);
            }
        }

        StringBuilder sb = new StringBuilder();
        for (Map.Entry<String, Integer> entry : sortedMap.entrySet()) {
            sb.append(entry.getKey());
            if (entry.getValue() > 1) {
                sb.append(entry.getValue());
            }
        }
        return sb.toString();
    }

    List<Token> tokenize(String formula) {
        List<Token> tokens = new ArrayList<>();
        for (int i = 0; i < formula.length(); i++) {
            char c = formula.charAt(i);
            if (c == '(') {
                tokens.add(new OpeningBracketToken());
            }
            else if (c == ')') {
                tokens.add(new ClosingBracketToken());
            }
            else if (c >= 'A' && c <= 'Z') {
                StringBuilder element = new StringBuilder();
                element.append(c);
                while (i < formula.length() - 1 && formula.charAt(i + 1) >= 'a' && formula.charAt(i + 1) <= 'z') {
                    element.append(formula.charAt(i + 1));
                    i++;
                }

                StringBuilder sb = new StringBuilder();
                while (i < formula.length() - 1 && formula.charAt(i + 1) >= '0' && formula.charAt(i + 1) <= '9') {
                    sb.append(formula.charAt(i + 1));
                    i++;
                }

                int count = 1;
                if (sb.length() > 0) {
                    count = Integer.parseInt(sb.toString());
                }
                tokens.add(new ElementToken(element.toString(), count));
            }
            else if (c >= '0' && c <= '9') {
                int start = i;
                while (i < formula.length() - 1 && formula.charAt(i + 1) >= '0' && formula.charAt(i + 1) <= '9') {
                    i++;
                }
                int number = Integer.parseInt(formula.substring(start, i + 1));
                tokens.add(new NumberToken(number));
            }
        }
        return tokens;
    }

    void resolveBrackets(List<Token> tokens) {
        while (true) {
            int lastOpeningBracketIndex = -1;
            for (int i = 0; i < tokens.size(); i++) {
                if (tokens.get(i) instanceof OpeningBracketToken) {
                    lastOpeningBracketIndex = i;
                }

                if (tokens.get(i) instanceof ClosingBracketToken) {
                    if (i < tokens.size() - 1 && tokens.get(i + 1) instanceof NumberToken) {
                        for (int j = lastOpeningBracketIndex + 1; j < i; j++) {
                            ((ElementToken) tokens.get(j)).multiplyBy(((NumberToken) tokens.get(i + 1)).number);
                        }
                        tokens.remove(i + 1);
                    }
                    tokens.remove(i);
                    tokens.remove(lastOpeningBracketIndex);
                    break;
                }
            }

            if (lastOpeningBracketIndex == -1) {
                break;
            }
        }
    }

    static abstract class Token {

    }

    static class OpeningBracketToken extends Token {

    }

    static class ClosingBracketToken extends Token {

    }

    static class NumberToken extends Token {
        int number;

        NumberToken(int number) {
            this.number = number;
        }
    }

    static class ElementToken extends Token {
        String element;
        int count;

        ElementToken(String element, int count) {
            this.element = element;
            this.count = count;
        }

        void multiplyBy(int number) {
            this.count = this.count * number;
        }
    }
}
