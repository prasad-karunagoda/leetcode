package prasad.leetcode.p68;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TextJustification {

    public List<String> fullJustify(String[] words, int maxWidth) {
        List<String> lines = new ArrayList<>();
        StringBuilder currentLine = new StringBuilder();
        for (String w : words) {
            if (currentLine.length() == 0 && w.length() == maxWidth) {
                lines.add(w);
            }
            else if (currentLine.length() + w.length() + 1 > maxWidth) {
                lines.add(currentLine.toString());

                currentLine = new StringBuilder();
                currentLine.append(w);
            }
            else {
                if (currentLine.length() > 0) {
                    currentLine.append(" ");
                }
                currentLine.append(w);
            }
        }

        if (currentLine.length() > 0) {
            lines.add(currentLine.toString());
        }

        addSpaces(lines, maxWidth);
        return lines;
    }

    private void addSpaces(List<String> lines, int maxWidth) {
        for (int i = 0; i < lines.size() - 1; i++) { // Last line excluded
            String[] wordsInLine = lines.get(i).split(" ");
            int lengthOfLetters = lines.get(i).replace(" ", "").length();
            int numberOfSpaces = maxWidth - lengthOfLetters;
            if (wordsInLine.length == 1) {
                wordsInLine[0] = wordsInLine[0] + String.join("", Collections.nCopies(numberOfSpaces, " "));
            }
            else {
                outerLoop:
                while (true) {
                    for (int j = 0; j < wordsInLine.length - 1; j++) { // Last word excluded
                        wordsInLine[j] = wordsInLine[j] + " ";
                        numberOfSpaces--;
                        if (numberOfSpaces == 0) {
                            break outerLoop;
                        }
                    }
                }
            }
            lines.set(i, String.join("", wordsInLine));
        }

        String lastLine = lines.get(lines.size() - 1);
        String spaces = String.join("", Collections.nCopies(maxWidth - lastLine.length(), " "));
        lines.set(lines.size() - 1, lastLine + spaces);
    }
}
