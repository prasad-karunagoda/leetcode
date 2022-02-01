package prasad.leetcode.p695;

import prasad.leetcode.datastructure.BasicUnionFind;

import java.util.List;

public class MaxAreaOfIsland {

    public int maxAreaOfIsland(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        BasicUnionFind unionFind = new BasicUnionFind(m * n);
        boolean atLeastOneLand = false;

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                int node = (i * n) + j;

                if (grid[i][j] == 1) {
                    atLeastOneLand = true;

                    // Top
                    if (i > 0 && grid[i - 1][j] == 1) {
                        unionFind.union(node, ((i - 1) * n) + j);
                    }

                    // Left
                    if (j > 0 && grid[i][j - 1] == 1) {
                        unionFind.union(node, (i * n) + j - 1);
                    }

                    // Right
                    if (j < n - 1 && grid[i][j + 1] == 1) {
                        unionFind.union(node, (i * n) + j + 1);
                    }

                    // Bottom
                    if (i < m - 1 && grid[i + 1][j] == 1) {
                        unionFind.union(node, ((i + 1) * n) + j);
                    }
                }
            }
        }

        if (!atLeastOneLand) {
            return 0;
        }

        List<List<Integer>> islands = unionFind.getComponents();
        int max = 0;
        for (List<Integer> island : islands) {
            if (max < island.size()) {
                max = island.size();
            }
        }
        return max;
    }
}
