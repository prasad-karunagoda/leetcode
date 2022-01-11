package prasad.leetcode.p2038;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RemoveColoredPiecesIfNeighborsAreSame {

    public boolean winnerOfGame(String colors) {
        Pattern patternAs = Pattern.compile("A{3,}");
        Matcher matcherAs = patternAs.matcher(colors);
        int removableAs = 0;
        while (matcherAs.find()) {
            String match = matcherAs.group();
            removableAs = removableAs + match.length() - 2;
        }

        Pattern patternBs = Pattern.compile("B{3,}");
        Matcher matcherBs = patternBs.matcher(colors);
        int removableBs = 0;
        while (matcherBs.find()) {
            String match = matcherBs.group();
            removableBs = removableBs + match.length() - 2;
        }

        return (removableAs > removableBs);
    }
}
