package prasad.leetcode.p2126;

import java.util.Arrays;

public class DestroyingAsteroids {

    public boolean asteroidsDestroyed(int mass, int[] asteroids) {
        long planetMass = mass;
        Arrays.sort(asteroids);
        for (int a : asteroids) {
            if (planetMass < a) {
                return false;
            }
            else {
                planetMass = planetMass + a;
            }
        }
        return true;
    }
}
