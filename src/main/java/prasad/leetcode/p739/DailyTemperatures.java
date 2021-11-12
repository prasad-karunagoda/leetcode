package prasad.leetcode.p739;

public class DailyTemperatures {

    public int[] dailyTemperatures(int[] temperatures) {
        int[] answer = new int[temperatures.length];
        for (int i = 0; i < temperatures.length; i++) {
            for (int j = i + 1; j < temperatures.length; j++) {
                if (temperatures[i] < temperatures[j]) {
                    answer[i] = j - i;
                    break;
                }
            }
        }
        return answer;
    }
}
