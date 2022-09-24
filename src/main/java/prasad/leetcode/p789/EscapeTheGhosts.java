package prasad.leetcode.p789;

public class EscapeTheGhosts {

    public boolean escapeGhosts(int[][] ghosts, int[] target) {
        int steps = Math.abs(target[0]) + Math.abs(target[1]);
        for (int[] g : ghosts) {
            int stepsForGhost = Math.abs(target[0] - g[0]) + Math.abs(target[1] - g[1]);
            if (steps >= stepsForGhost) {
                return false;
            }
        }
        return true;
    }
}
