package prasad.leetcode.p985;

public class SumOfEvenNumbersAfterQueries {

    public int[] sumEvenAfterQueries(int[] nums, int[][] queries) {
        int sum = 0;
        for (int n : nums) {
            if (n % 2 == 0) {
                sum += n;
            }
        }

        int[] answer = new int[queries.length];
        for (int i = 0; i < queries.length; i++) {
            int val = queries[i][0];
            int index = queries[i][1];

            if (nums[index] % 2 == 0) {
                sum -= nums[index];
            }

            nums[index] += val;

            if (nums[index] % 2 == 0) {
                sum += nums[index];
            }

            answer[i] = sum;
        }
        return answer;
    }
}
