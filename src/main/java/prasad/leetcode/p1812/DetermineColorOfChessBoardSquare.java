package prasad.leetcode.p1812;

public class DetermineColorOfChessBoardSquare {

    public boolean squareIsWhite(String coordinates) {
        int sum = coordinates.charAt(0) + coordinates.charAt(1);
        return sum % 2 != 0;
    }
}
