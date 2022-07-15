package prasad.leetcode.p2325;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DecodeTheMessage {

    public String decodeMessage(String key, String message) {
        List<Character> list = new ArrayList<>();
        for (int i = 0; i < key.length(); i++) {
            if (key.charAt(i) != ' ' && !list.contains(key.charAt(i))) {
                list.add(key.charAt(i));
            }
        }

        Map<Character, Character> map = new HashMap<>();
        for (int i = 0; i < list.size(); i++) {
            map.put(list.get(i), (char) (i + 'a'));
        }

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < message.length(); i++) {
            if (message.charAt(i) == ' ') {
                sb.append(' ');
            }
            else {
                sb.append(map.get(message.charAt(i)));
            }
        }
        return sb.toString();
    }
}
