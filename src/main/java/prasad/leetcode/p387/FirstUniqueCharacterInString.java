package prasad.leetcode.p387;

import java.util.LinkedHashMap;
import java.util.Map;

public class FirstUniqueCharacterInString {

    public int firstUniqChar(String s) {
        Map<Character, IndexAndCount> map = new LinkedHashMap<>();
        char[] charArray = s.toCharArray();
        for (int i = 0; i < charArray.length; i++) {
            char c = charArray[i];
            if (map.containsKey(c)) {
                IndexAndCount indexAndCount = map.get(c);
                indexAndCount.count++;
            }
            else {
                map.put(c, new IndexAndCount(i));
            }
        }

        for (Map.Entry<Character, IndexAndCount> entry : map.entrySet()) {
            if (entry.getValue().count == 1) {
                return entry.getValue().index;
            }
        }
        return -1;
    }

    class IndexAndCount {

        int index;
        int count;

        IndexAndCount(int index) {
            this.index = index;
            this.count = 1;
        }
    }
}
