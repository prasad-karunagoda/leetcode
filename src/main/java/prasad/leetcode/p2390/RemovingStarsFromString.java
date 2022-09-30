package prasad.leetcode.p2390;

public class RemovingStarsFromString {

    public String removeStars(String s) {
        StringBuilder sb = new StringBuilder();
        int stars = 0;
        for (int i = s.length() - 1; i >= 0; i--) {
            if (s.charAt(i) == '*') {
                stars++;
            }
            else {
                if (stars > 0) {
                    stars--;
                }
                else {
                    sb.insert(0, s.charAt(i));
                }
            }
        }
        return sb.toString();
    }
}
