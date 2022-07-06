package prasad.leetcode.p841;

import java.util.HashSet;
import java.util.List;

public class KeysAndRooms {

    public boolean canVisitAllRooms(List<List<Integer>> rooms) {
        HashSet<Integer> opened = new HashSet<>();
        opened.add(0);
        boolean newRoomOpened = true;
        while (newRoomOpened) {
            HashSet<Integer> newOpened = new HashSet<>(opened);
            boolean added = false;
            for (Integer op : opened) {
                if (newOpened.addAll(rooms.get(op))) {
                    added = true;
                }
            }
            newRoomOpened = added;
            opened = newOpened;
        }
        return opened.size() == rooms.size();
    }
}
