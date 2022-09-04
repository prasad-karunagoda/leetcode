package prasad.leetcode.p1441;

import java.util.ArrayList;
import java.util.List;

public class BuildArrayWithStackOperations {

    public List<String> buildArray(int[] target, int n) {
        List<String> operations = new ArrayList<>();
        int targetIndex = 0;
        for (int x = 1; x <= n; x++) {
            if (x == target[targetIndex]) {
                operations.add("Push");
                targetIndex++;
                if (targetIndex == target.length) {
                    break;
                }
            }
            else {
                operations.add("Push");
                operations.add("Pop");
            }
        }
        return operations;
    }
}
