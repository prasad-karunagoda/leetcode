package prasad.leetcode.p1282;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GroupPeopleGivenTheGroupSizes {

    public List<List<Integer>> groupThePeople(int[] groupSizes) {
        Map<Integer, List<Integer>> groupSizeToPeopleMap = new HashMap<>();
        for (int i = 0; i < groupSizes.length; i++) {
            if (groupSizeToPeopleMap.containsKey(groupSizes[i])) {
                groupSizeToPeopleMap.get(groupSizes[i]).add(i);
            }
            else {
                List<Integer> people = new ArrayList<>();
                people.add(i);
                groupSizeToPeopleMap.put(groupSizes[i], people);
            }
        }

        List<List<Integer>> allGroups = new ArrayList<>();
        for (Map.Entry<Integer, List<Integer>> entry : groupSizeToPeopleMap.entrySet()) {
            int size = entry.getKey();
            int groupCount = entry.getValue().size() / size;
            for (int x = 0; x < groupCount; x++) {
                List<Integer> group = new ArrayList<>();
                for (int y = x * size; y < (x + 1) * size; y++) {
                    group.add(entry.getValue().get(y));
                }
                allGroups.add(group);
            }
        }
        return allGroups;
    }
}
