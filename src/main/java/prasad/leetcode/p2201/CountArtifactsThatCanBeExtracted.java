package prasad.leetcode.p2201;

public class CountArtifactsThatCanBeExtracted {

    public int digArtifacts(int n, int[][] artifacts, int[][] dig) {
        boolean[][] dug = new boolean[n][n];
        for (int[] cell : dig) {
            dug[cell[0]][cell[1]] = true;
        }

        int count = 0;
        for (int[] a : artifacts) {
            boolean notDugCellFound = false;
            outer:
            for (int r = a[0]; r <= a[2]; r++) {
                for (int c = a[1]; c <= a[3]; c++) {
                    if (!dug[r][c]) {
                        notDugCellFound = true;
                        break outer;
                    }
                }
            }

            if (!notDugCellFound) {
                count++;
            }
        }
        return count;
    }
}
