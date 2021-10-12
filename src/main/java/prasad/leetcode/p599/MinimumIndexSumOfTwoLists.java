package prasad.leetcode.p599;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MinimumIndexSumOfTwoLists {

    public String[] findRestaurant(String[] list1, String[] list2) {
        Map<String, Integer> list1Map = new HashMap<>();
        for (int i = 0; i < list1.length; i++) {
            list1Map.put(list1[i], i);
        }

        Map<Integer, List<String>> common = new HashMap<>();
        int min = Integer.MAX_VALUE;
        for (int j = 0; j < list2.length; j++) {
            if (list1Map.containsKey(list2[j])) {
                Integer indexSum = list1Map.get(list2[j]) + j;
                if (!common.containsKey(indexSum)) {
                    common.put(indexSum, new ArrayList<>());
                }
                common.get(indexSum).add(list2[j]);

                if (min > indexSum) {
                    min = indexSum;
                }
            }
        }

        List<String> commonList = common.get(min);
        if (commonList == null) {
            return new String[0];
        }
        return commonList.toArray(new String[0]);
    }
}
