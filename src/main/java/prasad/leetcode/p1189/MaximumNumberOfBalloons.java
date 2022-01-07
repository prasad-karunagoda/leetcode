package prasad.leetcode.p1189;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MaximumNumberOfBalloons {

    public int maxNumberOfBalloons(String text) {
        int bCount = 0;
        int aCount = 0;
        int lCount = 0;
        int oCount = 0;
        int nCount = 0;
        for (char c : text.toCharArray()) {
            switch (c) {
                case 'b':
                    bCount++;
                    break;
                case 'a':
                    aCount++;
                    break;
                case 'l':
                    lCount++;
                    break;
                case 'o':
                    oCount++;
                    break;
                case 'n':
                    nCount++;
                    break;
            }
        }

        List<Integer> counts = new ArrayList<>();
        counts.add(bCount);
        counts.add(aCount);
        counts.add(lCount / 2);
        counts.add(oCount / 2);
        counts.add(nCount);

        Collections.sort(counts);
        return counts.get(0);
    }
}
