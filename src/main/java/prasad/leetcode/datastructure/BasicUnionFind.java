package prasad.leetcode.datastructure;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class BasicUnionFind {

    private int[] parents;
    private int[] size;

    public BasicUnionFind(int N) {
        parents = new int[N];
        size = new int[N];
        for (int i = 0; i < N; i++) {
            parents[i] = i;
            size[i] = 1;
        }
    }

    public void union(int node1, int node2) {
        int root1 = root(node1);
        int root2 = root(node2);
        if (root1 == root2) {
            return;
        }

        if (size[root1] < size[root2]) {
            parents[root1] = root2;
            size[root2] = size[root2] + size[root1];
        }
        else {
            parents[root2] = root1;
            size[root1] = size[root1] + size[root2];
        }
    }

    public boolean find(int node1, int node2) {
        return root(node1) == root(node2);
    }

    public List<List<Integer>> getComponents() {
        Map<Integer, List<Integer>> rootToNodesMap = new HashMap<>();
        for (int i = 0; i < parents.length; i++) {
            int root = root(i);
            if (!rootToNodesMap.containsKey(root)) {
                rootToNodesMap.put(root, new ArrayList<>());
            }
            rootToNodesMap.get(root).add(i);
        }

        return new ArrayList<>(rootToNodesMap.values());
    }

    private int root(int node) {
        while (node != parents[node]) {
            parents[node] = parents[parents[node]];
            node = parents[node];
        }
        return node;
    }
}
