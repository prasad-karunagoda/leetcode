package prasad.leetcode.p1409;

import java.util.stream.IntStream;

public class QueriesOnPermutationWithKey {

    public int[] processQueries(int[] queries, int m) {
        int[] p = IntStream.range(1, m + 1).toArray();
        int[] result = new int[queries.length];
        for (int i = 0; i < queries.length; i++) {
            for (int j = 0; j < p.length; j++) {
                if (queries[i] == p[j]) {
                    result[i] = j;
                    int temp = p[j];
                    System.arraycopy(p, 0, p, 1, j);
                    p[0] = temp;
                    break;
                }
            }
        }
        return result;
    }
}
