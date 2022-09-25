package prasad.leetcode.p2240;

public class NumberOfWaysToBuyPensAndPencils {

    public long waysToBuyPensPencils(int total, int cost1, int cost2) {
        long numberOfWays = 0;
        int maxPens = total / cost1;
        for (int n = 0; n <= maxPens; n++) {
            int maxPencils = (total - (n * cost1)) / cost2;
            numberOfWays += maxPencils + 1;
        }
        return numberOfWays;
    }
}
