package prasad.leetcode.p2079;

public class WateringPlants {

    public int wateringPlants(int[] plants, int capacity) {
        int nextPlant = 0;
        int steps = 0;
        outerLoop:
        while (true) {
            int remaining = capacity;
            while (plants[nextPlant] <= remaining) {
                remaining = remaining - plants[nextPlant];
                steps++;
                nextPlant++;
                if (nextPlant == plants.length) {
                    break outerLoop;
                }
            }
            steps = steps + (nextPlant * 2);
        }
        return steps;
    }
}
