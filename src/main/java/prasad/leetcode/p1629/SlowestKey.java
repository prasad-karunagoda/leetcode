package prasad.leetcode.p1629;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SlowestKey {

    public char slowestKey(int[] releaseTimes, String keysPressed) {
        List<Character> keys = new ArrayList<>();
        keys.add(keysPressed.charAt(0));
        int longest = releaseTimes[0];
        for (int i = 1; i < keysPressed.length(); i++) {
            char c = keysPressed.charAt(i);
            int time = releaseTimes[i] - releaseTimes[i - 1];
            if (time > longest) {
                keys.clear();
                keys.add(c);
                longest = time;
            }
            else if (time == longest) {
                keys.add(c);
            }
        }
        Collections.sort(keys);
        return keys.get(keys.size() - 1);
    }
}
