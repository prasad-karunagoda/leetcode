package prasad.leetcode.p1310;

public class XorQueriesOfSubarray {

    public int[] xorQueries(int[] arr, int[][] queries) {
        int[] result = new int[queries.length];
        for (int i = 0; i < queries.length; i++) {
            for (int j = queries[i][0]; j <= queries[i][1]; j++) {
                result[i] = result[i] ^ arr[j];
            }
        }
        return result;
    }
}
