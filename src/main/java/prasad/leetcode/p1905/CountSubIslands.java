package prasad.leetcode.p1905;

import prasad.leetcode.datastructure.BasicUnionFind;

import java.util.List;

public class CountSubIslands {

    public int countSubIslands(int[][] grid1, int[][] grid2) {
        int m = grid2.length;
        int n = grid2[0].length;
        BasicUnionFind unionFind = new BasicUnionFind(m * n);
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (grid2[i][j] == 1) {
                    int node = (i * n) + j;
                    if (i < m - 1 && grid2[i + 1][j] == 1) {
                        int downNode = ((i + 1) * n) + j;
                        unionFind.union(node, downNode);
                    }
                    if (j < n - 1 && grid2[i][j + 1] == 1) {
                        int rightNode = (i * n) + j + 1;
                        unionFind.union(node, rightNode);
                    }
                    // upNode and leftNode are already connected because we are processing nodes
                    // from top-left corner to bottom-right corner.
                }
            }
        }

        List<List<Integer>> islands = unionFind.getComponents();
        int count = 0;
        for (List<Integer> island : islands) {
            // Component with only a zero
            if (island.size() == 1 && grid2[island.get(0) / n][island.get(0) % n] == 0) {
                continue;
            }

            boolean subIsland = true;
            for (Integer node : island) {
                int i = node / n;
                int j = node % n;
                if (grid1[i][j] == 0) {
                    subIsland = false;
                    break;
                }
            }
            if (subIsland) {
                count++;
            }
        }
        return count;
    }
}
