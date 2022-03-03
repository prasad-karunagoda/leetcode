package prasad.leetcode.p1267;

import prasad.leetcode.datastructure.Point;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class CountServersThatCommunicate {

    public int countServers(int[][] grid) {
        Set<Point> communicatingServers = new HashSet<>();
        Map<Integer, Set<Point>> serversOnColumns = new HashMap<>();
        for (int i = 0; i < grid.length; i++) {
            Set<Point> serversOnRow = new HashSet<>();
            for (int j = 0; j < grid[i].length; j++) {
                if (grid[i][j] == 1) {
                    Point point = new Point(i, j);
                    serversOnRow.add(point);

                    if (serversOnColumns.containsKey(j)) {
                        serversOnColumns.get(j).add(point);
                    }
                    else {
                        Set<Point> servers = new HashSet<>();
                        servers.add(point);
                        serversOnColumns.put(j, servers);
                    }
                }
            }

            if (serversOnRow.size() > 1) {
                communicatingServers.addAll(serversOnRow);
            }
        }

        for (Set<Point> servers : serversOnColumns.values()) {
            if (servers.size() > 1) {
                communicatingServers.addAll(servers);
            }
        }
        return communicatingServers.size();
    }
}
