package prasad.leetcode.p547;

import prasad.leetcode.datastructure.BasicUnionFind;

public class NumberOfProvinces {

    public int findCircleNum(int[][] isConnected) {
        BasicUnionFind unionFind = new BasicUnionFind(isConnected.length);
        for (int i = 0; i < isConnected.length; i++) {
            for (int j = i + 1; j < isConnected.length; j++) {
                if (isConnected[i][j] == 1) {
                    unionFind.union(i, j);
                }
            }
        }
        return unionFind.getComponents().size();
    }
}
