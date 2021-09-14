package prasad.leetcode.p93;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class RestoreIpAddresses {

    public List<String> restoreIpAddresses(String s) {

        if (s.length() > 12) {
            return Collections.emptyList();
        }

        List<String> ipAddresses = new ArrayList<>();

        int indexAfterFirstDot = 1;
        int indexAfterSecondDot = 2;
        int indexAfterThirdDot = 3;

        while (indexAfterFirstDot < s.length() - 2) {
            indexAfterSecondDot = indexAfterFirstDot + 1;
            while (indexAfterSecondDot < s.length() - 1) {
                indexAfterThirdDot = indexAfterSecondDot + 1;
                while (indexAfterThirdDot < s.length()) {
                    String firstNumber = s.substring(0, indexAfterFirstDot);
                    String secondNumber = s.substring(indexAfterFirstDot, indexAfterSecondDot);
                    String thirdNumber = s.substring(indexAfterSecondDot, indexAfterThirdDot);
                    String fourthNumber = s.substring(indexAfterThirdDot);

                    if (isValid(firstNumber) && isValid(secondNumber) && isValid(thirdNumber) && isValid(fourthNumber)) {
                        ipAddresses.add(firstNumber + "." + secondNumber + "." + thirdNumber + "." + fourthNumber);
                    }
                    //System.out.println(firstNumber + "." + secondNumber + "." + thirdNumber + "." + fourthNumber);

                    indexAfterThirdDot++;
                }
                indexAfterSecondDot++;
            }
            indexAfterFirstDot++;
        }

        return ipAddresses;
    }

    private boolean isValid(String ipAddressComponent) {
        if (ipAddressComponent.isEmpty()) {
            return false;
        }
        if (ipAddressComponent.length() > 3) {
            return false;
        }
        if (!ipAddressComponent.equals("0") && ipAddressComponent.startsWith("0")) {
            return false;
        }

        int number = Integer.parseInt(ipAddressComponent);
        return (number <= 255);
    }
}
