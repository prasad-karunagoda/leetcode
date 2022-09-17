package prasad.leetcode.p2391;

public class MinTimeToCollectGarbage {

    public int garbageCollection(String[] garbage, int[] travel) {
        int totalGarbage = 0;
        for (String s : garbage) {
            totalGarbage += s.length();
        }

        int mLast = -1;
        int pLast = -1;
        int gLast = -1;
        for (int i = garbage.length - 1; i >= 0; i--) {
            if (mLast == -1 && garbage[i].contains("M")) {
                mLast = i;
            }
            if (pLast == -1 && garbage[i].contains("P")) {
                pLast = i;
            }
            if (gLast == -1 && garbage[i].contains("G")) {
                gLast = i;
            }

            if (mLast != -1 && pLast != -1 && gLast != -1) {
                break;
            }
        }

        int travelTime = 0;
        int totalTravelTime = 0;
        for (int i = 0; i < travel.length; i++) {
            travelTime += travel[i];
            if (i == mLast - 1) {
                totalTravelTime += travelTime;
            }
            if (i == pLast - 1) {
                totalTravelTime += travelTime;
            }
            if (i == gLast - 1) {
                totalTravelTime += travelTime;
            }
        }

        return totalGarbage + totalTravelTime;
    }
}
