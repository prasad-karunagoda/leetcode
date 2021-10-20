package prasad.leetcode.p839;

import prasad.leetcode.datastructure.BasicUnionFind;

import java.util.ArrayList;
import java.util.List;

public class SimilarStringGroups {

    public int numSimilarGroups(String[] strs) {
        BasicUnionFind unionFind = new BasicUnionFind(strs.length);
        for (int i = 0; i < strs.length; i++) {
            for (int j = i + 1; j < strs.length; j++) {
                if (isSimilar(strs[i], strs[j])) {
                    unionFind.union(i, j);
                }
            }
        }
        List<List<Integer>> groups = unionFind.getComponents();
        return groups.size();
    }

    private boolean isSimilar(String s1, String s2) {
        List<Integer> differentIndices = new ArrayList<>();
        int lengthOfStrings = s1.length();
        for (int i = 0; i < lengthOfStrings; i++) {
            if (s1.charAt(i) != s2.charAt(i)) {
                if (differentIndices.size() == 2) {
                    return false;
                }
                differentIndices.add(i);
            }
        }

        if (differentIndices.isEmpty()) {
            return true;
        }
        else if (differentIndices.size() == 1) {
            return false;
        }
        else { // differentIndices.size() == 2
            return s1.charAt(differentIndices.get(0)) == s2.charAt(differentIndices.get(1)) &&
                    s2.charAt(differentIndices.get(0)) == s1.charAt(differentIndices.get(1));
        }
    }
}
