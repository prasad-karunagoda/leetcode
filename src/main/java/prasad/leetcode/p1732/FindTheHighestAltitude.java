package prasad.leetcode.p1732;

public class FindTheHighestAltitude {

    public int largestAltitude(int[] gain) {
        int altitude = 0;
        int highest = 0;
        for (int g : gain) {
            altitude += g;
            if (altitude > highest) {
                highest = altitude;
            }
        }
        return highest;
    }
}
