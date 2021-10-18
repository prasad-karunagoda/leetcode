package prasad.leetcode.p833;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class FindAndReplaceInString {

    public String findReplaceString(String s, int[] indices, String[] sources, String[] targets) {

        sortArraysByIndex(indices, sources, targets);

        int indexOfRemaining = 0;
        List<Token> tokens = new ArrayList<>();
        for (int i = 0; i < indices.length; i++) {
            int index = indices[i];
            String passiveSection = s.substring(indexOfRemaining, index);
            if (!passiveSection.isEmpty()) {
                tokens.add(new Token(passiveSection));
            }
            String content = s.substring(index, index + sources[i].length());
            tokens.add(new Token(content, sources[i], targets[i]));
            indexOfRemaining = indexOfRemaining + passiveSection.length() + content.length();
        }

        if (indexOfRemaining < s.length()) {
            String passiveSection = s.substring(indexOfRemaining);
            tokens.add(new Token(passiveSection));
        }

        StringBuilder sb = new StringBuilder();
        for (Token t : tokens) {
            if (t.isPassive) {
                sb.append(t.content);
            }
            else {
                if (t.content.equals(t.source)) {
                    sb.append(t.target);
                }
                else {
                    sb.append(t.content);
                }
            }
        }
        return sb.toString();
    }

    private void sortArraysByIndex(int[] indices, String[] sources, String[] targets) {
        List<Replacement> replacements = new ArrayList<>();
        for (int i = 0; i < indices.length; i++) {
            replacements.add(new Replacement(indices[i], sources[i], targets[i]));
        }
        Collections.sort(replacements);
        for (int j = 0; j < replacements.size(); j++) {
            indices[j] = replacements.get(j).index;
            sources[j] = replacements.get(j).source;
            targets[j] = replacements.get(j).target;
        }
    }

    private static class Replacement implements Comparable<Replacement> {
        private final int index;
        private final String source;
        private final String target;

        private Replacement(int index, String source, String target) {
            this.index = index;
            this.source = source;
            this.target = target;
        }

        @Override
        public int compareTo(Replacement otherReplacement) {
            return this.index - otherReplacement.index;
        }
    }

    private static class Token {
        private final boolean isPassive;
        private final String content;
        private String source;
        private String target;

        private Token(String passiveContent) {
            this.isPassive = true;
            this.content = passiveContent;
        }

        public Token(String content, String source, String target) {
            this.isPassive = false;
            this.content = content;
            this.source = source;
            this.target = target;
        }
    }
}
