package prasad.leetcode.p1992;

import prasad.leetcode.datastructure.BasicUnionFind;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class FindAllGroupsOfFarmland {

    public int[][] findFarmland(int[][] land) {
        int m = land.length;
        int n = land[0].length;
        BasicUnionFind unionFind = new BasicUnionFind(m * n);

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (land[i][j] == 1) {
                    int node = (i * n) + j;
                    if (i > 0 && land[i - 1][j] == 1) {
                        int upNode = ((i - 1) * n) + j;
                        unionFind.union(node, upNode);
                    }
                    if (i < m - 1 && land[i + 1][j] == 1) {
                        int downNode = ((i + 1) * n) + j;
                        unionFind.union(node, downNode);
                    }
                    if (j > 0 && land[i][j - 1] == 1) {
                        int leftNode = (i * n) + j - 1;
                        unionFind.union(node, leftNode);
                    }
                    if (j < n - 1 && land[i][j + 1] == 1) {
                        int rightNode = (i * n) + j + 1;
                        unionFind.union(node, rightNode);
                    }
                }
            }
        }

        List<List<Integer>> components = unionFind.getComponents();
        List<int[]> farmlandList = new ArrayList<>();
        for (List<Integer> comp : components) {
            if (comp.size() == 1 && land[comp.get(0) / n][comp.get(0) % n] == 0) { // Component with only a zero
                continue;
            }

            Collections.sort(comp);
            int topLeftNode = comp.get(0);
            int bottomRightNode = comp.get(comp.size() - 1);
            farmlandList.add(new int[] {topLeftNode / n, topLeftNode % n, bottomRightNode / n, bottomRightNode % n});
        }

        int[][] farmlands = new int[farmlandList.size()][];
        for (int i = 0; i < farmlandList.size(); i++) {
            farmlands[i] = farmlandList.get(i);
        }
        return farmlands;
    }

    // This works but this is much slower than Union-Find approach.
    public int[][] findFarmlandSlow(int[][] land) {
        List<List<Integer>> list = new ArrayList<>();
        for (int i = 0; i < land.length; i++) {
            outerLoop:
            for (int j = 0; j < land[i].length; j++) {
                if (land[i][j] == 1) {
                    for (List<Integer> farm : list) {
                        if (i >= farm.get(0) && i <= farm.get(2) && j >= farm.get(1) && j <= farm.get(3)) {
                            continue outerLoop;
                        }
                    }

                    int x = 1;
                    while (j + x < land[i].length && land[i][j + x] == 1) {
                        x++;
                    }

                    int y = 1;
                    while (i + y < land.length && land[i + y][j] == 1) {
                        y++;
                    }

                    int r1 = i;
                    int c1 = j;
                    int r2 = i + y - 1;
                    int c2 = j + x - 1;
                    list.add(Arrays.asList(r1, c1, r2, c2));

                    // Skip the next 1s in this row.
                    j = c2;
                }
            }
        }

        int[][] farmlands = new int[list.size()][4];
        for (int i = 0; i < list.size(); i++) {
            for (int j = 0; j < list.get(i).size(); j++) {
                farmlands[i][j] = list.get(i).get(j);
            }
        }
        return farmlands;
    }
}
