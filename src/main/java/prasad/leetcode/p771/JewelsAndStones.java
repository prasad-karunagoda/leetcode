package prasad.leetcode.p771;

public class JewelsAndStones {

    public int numJewelsInStones(String jewels, String stones) {
        int[] counts = new int['z' - 'A' + 1];
        for (int i = 0; i < stones.length(); i++) {
            counts[stones.charAt(i) - 'A']++;
        }

        int sum = 0;
        for (int i = 0; i < jewels.length(); i++) {
            sum += counts[jewels.charAt(i) - 'A'];
        }
        return sum;
    }
}
