package prasad.leetcode.p200;

import prasad.leetcode.datastructure.BasicUnionFind;

import java.util.List;

public class NumberOfIslands {

    public int numIslands(char[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        BasicUnionFind unionFind = new BasicUnionFind(m * n);
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (grid[i][j] == '1') {
                    int node = (i * n) + j;
                    if (i < m - 1 && grid[i + 1][j] == '1') {
                        int downNode = ((i + 1) * n) + j;
                        unionFind.union(node, downNode);
                    }
                    if (j < n - 1 && grid[i][j + 1] == '1') {
                        int rightNode = (i * n) + j + 1;
                        unionFind.union(node, rightNode);
                    }
                    // upNode and leftNode are already connected because we are processing nodes
                    // from top-left corner to bottom-right corner.
                }
            }
        }

        List<List<Integer>> components = unionFind.getComponents();
        int count = 0;
        for (List<Integer> comp : components) {
            if (comp.size() > 1 || grid[comp.get(0) / n][comp.get(0) % n] == '1') {
                count++;
            }
        }
        return count;
    }
}
