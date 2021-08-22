package prasad.leetcode.p49;

import prasad.leetcode.common.CommonFunctions;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GroupAnagrams {

    public List<List<String>> groupAnagrams(String[] strs) {
        Map<Map<Character, Integer>, List<String>> groups = new HashMap<>();
        for (String s : strs) {
            Map<Character, Integer> map = CommonFunctions.getCharacterCounts(s);
            if (groups.containsKey(map)) {
                groups.get(map).add(s);
            }
            else {
                List<String> list = new ArrayList<>();
                list.add(s);
                groups.put(map, list);
            }
        }

        return new ArrayList<>(groups.values());
    }
}
