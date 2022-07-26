package prasad.leetcode.p2120;

public class ExecutionOfAllSuffixInstructions {

    public int[] executeInstructions(int n, int[] startPos, String s) {
        int[] result = new int[s.length()];
        for (int i = 0; i < s.length(); i++) {
            int row = startPos[0];
            int column = startPos[1];
            int currentIndex = i;
            int instructionCount = 0;
            boolean wentOffTheGrid = false;
            while (currentIndex < s.length()) {
                char ch = s.charAt(currentIndex);
                if (ch == 'R') {
                    if (column == n - 1) {
                        result[i] = instructionCount;
                        wentOffTheGrid = true;
                        break;
                    }
                    else {
                        instructionCount++;
                        currentIndex++;
                        column++;
                    }
                }
                else if (ch == 'L') {
                    if (column == 0) {
                        result[i] = instructionCount;
                        wentOffTheGrid = true;
                        break;
                    }
                    else {
                        instructionCount++;
                        currentIndex++;
                        column--;
                    }
                }
                else if (ch == 'D') {
                    if (row == n - 1) {
                        result[i] = instructionCount;
                        wentOffTheGrid = true;
                        break;
                    }
                    else {
                        instructionCount++;
                        currentIndex++;
                        row++;
                    }
                }
                else if (ch == 'U') {
                    if (row == 0) {
                        result[i] = instructionCount;
                        wentOffTheGrid = true;
                        break;
                    }
                    else {
                        instructionCount++;
                        currentIndex++;
                        row--;
                    }
                }
            }

            if (!wentOffTheGrid) {
                result[i] = instructionCount;
            }
        }

        return result;
    }
}
