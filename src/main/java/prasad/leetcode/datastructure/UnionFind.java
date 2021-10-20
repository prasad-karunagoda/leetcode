package prasad.leetcode.datastructure;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class UnionFind<T> {

    private int[] parents;
    private int[] size;
    private Map<T, Integer> nodeToIndexMap;
    private Map<Integer, T> indexToNodeMap;

    public UnionFind(List<T> nodes) {
        parents = new int[nodes.size()];
        size = new int[nodes.size()];
        nodeToIndexMap = new HashMap<>();
        indexToNodeMap = new HashMap<>();
        for (int i = 0; i < nodes.size(); i++) {
            parents[i] = i;
            size[i] = 1;
            nodeToIndexMap.put(nodes.get(i), i);
            indexToNodeMap.put(i, nodes.get(i));
        }
    }

    public void union(T node1, T node2) {
        int root1 = root(nodeToIndexMap.get(node1));
        int root2 = root(nodeToIndexMap.get(node2));
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

    public boolean find(T node1, T node2) {
        return root(nodeToIndexMap.get(node1)) == root(nodeToIndexMap.get(node2));
    }

    public List<List<T>> getComponents() {
        Map<Integer, List<Integer>> rootToNodesMap = new HashMap<>();
        for (int i = 0; i < parents.length; i++) {
            int root = root(i);
            if (!rootToNodesMap.containsKey(root)) {
                rootToNodesMap.put(root, new ArrayList<>());
            }
            rootToNodesMap.get(root).add(i);
        }

        List<List<T>> components = new ArrayList<>();
        for (List<Integer> indices : rootToNodesMap.values()) {
            List<T> comp = new ArrayList<>();
            for (Integer i : indices) {
                comp.add(indexToNodeMap.get(i));
            }
            components.add(comp);
        }
        return components;
    }

    private int root(int index) {
        while (index != parents[index]) {
            parents[index] = parents[parents[index]];
            index = parents[index];
        }
        return index;
    }
}
