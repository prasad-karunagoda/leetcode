package prasad.leetcode.p797;

import java.util.ArrayList;
import java.util.List;

public class AllPathsFromSourceToTarget {

    public List<List<Integer>> allPathsSourceTarget(int[][] graph) {
        List<Integer> initial = new ArrayList<>();
        initial.add(0);
        List<List<Integer>> paths = new ArrayList<>();
        paths.add(initial);
        List<List<Integer>> result = new ArrayList<>();
        while (true) {
            List<List<Integer>> newPaths = new ArrayList<>();
            boolean extended = false;
            for (List<Integer> p : paths) {
                for (int destination : graph[p.get(p.size() - 1)]) {
                    List<Integer> newP = new ArrayList<>(p);
                    newP.add(destination);
                    extended = true;
                    if (destination == graph.length - 1) {
                        result.add(newP);
                    }
                    else {
                        newPaths.add(newP);
                    }
                }
            }

            if (!extended) {
                break;
            }
            paths = newPaths;
        }
        return result;
    }
}
