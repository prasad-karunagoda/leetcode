package prasad.leetcode.p1423;

public class MaximumPointsYouCanObtainFromCards {

    public int maxScore(int[] cardPoints, int k) {
        int sum = 0;
        for (int i = 0; i < k; i++) {
            sum += cardPoints[i];
        }

        if (cardPoints.length == k) {
            return sum;
        }

        int max = sum;
        for (int x = k; x > 0; x--) {
            int removeFromBeginning = cardPoints[x - 1];
            int addToEnd = cardPoints[cardPoints.length - k + x - 1];
            sum = sum - removeFromBeginning + addToEnd;
            if (max < sum) {
                max = sum;
            }
        }
        return max;
    }
}
