package prasad.leetcode.p2109;

public class AddingSpacesToString {

    public String addSpaces(String s, int[] spaces) {
        StringBuilder sb = new StringBuilder();
        int previousIndex = 0;
        for (int index : spaces) {
            sb.append(s, previousIndex, index);
            sb.append(' ');
            previousIndex = index;
        }
        sb.append(s.substring(previousIndex));
        return sb.toString();
    }
}
