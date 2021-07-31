package prasad.leetcode.p48;

public class RotateImage {

    /**
     * E.g.
     *  ---- ---- ---- ----
     * |  5 |  1 |  9 | 11 |
     *  ---- ---- ---- ----
     * |  2 |  4 |  8 | 10 |
     *  ---- ---- ---- ----
     * | 13 |  3 |  6 |  7 |
     *  ---- ---- ---- ----
     * | 15 | 14 | 12 | 16 |
     *  ---- ---- ---- ----
     *
     *  Here we have 2 rings.
     *  First ring: 5,1,9,11,10,7,16,12,14,15,13,2 (outer ring)
     *  Second ring: 4,8,6,3 (inner ring)
     *
     *  When the number of rings is a odd number, most inner ring has only 1 cell.
     *  Hence nothing to rotate in that ring.
     *
     *  In this example, in the first ring there are 4 groups to rotate. First group is 5,11,16,15.
     *  Second group is 1,10,12,13 etc.
     *
     *  In each rotate group there 4 changes of values. Hence the most inner for loop loops 4 times.
     */
    public void rotate(int[][] matrix) {
        int ringCount = matrix.length / 2;
        for (int ringNumber = 0; ringNumber < ringCount; ringNumber++) {
            int rotateGroupCount = matrix.length - 1 - (ringNumber * 2);
            for (int rotateGroupNumber = 0; rotateGroupNumber < rotateGroupCount; rotateGroupNumber++) {
                int iFrom = ringNumber;
                int jFrom = ringNumber + rotateGroupNumber;
                int fromValue = matrix[iFrom][jFrom];
                for (int i = 0; i < 4; i++) {

                    int iTo = jFrom;
                    int jTo = matrix.length - 1 - iFrom;

                    int temp = matrix[iTo][jTo];
                    matrix[iTo][jTo] = fromValue;
                    fromValue = temp;

                    iFrom = iTo;
                    jFrom = jTo;
                }
            }
        }
    }
}
