package prasad.leetcode.p791;

public class CustomSortString {

    public String customSortString(String order, String str) {
        if (str == null) {
            return null;
        }
        if (order == null) {
            return str;
        }

        StringBuilder sb = new StringBuilder();
        for (char orderChar : order.toCharArray()) {
            for (char strChar : str.toCharArray()) {
                if (orderChar == strChar) {
                    sb.append(strChar);
                }
            }
        }

        for (char strChar : str.toCharArray()) {
            if (!order.contains(String.valueOf(strChar))) {
                sb.append(strChar);
            }
        }
        return sb.toString();
    }
}
