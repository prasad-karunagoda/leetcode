package prasad.leetcode.p2545;

import java.util.Arrays;
import java.util.Comparator;

public class SortStudentsByKthScore {

    public int[][] sortTheStudents(int[][] score, int k) {
        Arrays.sort(score, new Comparator<int[]>() {
            @Override
            public int compare(int[] student1, int[] student2) {
                return Integer.compare(student2[k], student1[k]);
            }
        });
        return score;
    }
}
