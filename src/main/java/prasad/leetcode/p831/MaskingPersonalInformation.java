package prasad.leetcode.p831;

import java.util.Collections;

public class MaskingPersonalInformation {

    public String maskPII(String s) {
        if (s.contains("@")) {
            s = s.toLowerCase();
            String[] nameAndDomain = s.split("@");
            String name = nameAndDomain[0];
            if (name.length() < 2) {
                throw new IllegalArgumentException("Name of the email must be at least 2 characters long.");
            }
            String domain = nameAndDomain[1];
            return name.charAt(0) + "*****" + name.substring(name.length() - 1) + "@" + domain;
        }
        else {
            s = s.replace("+", "")
                    .replace("-", "")
                    .replace("(", "")
                    .replace(")", "")
                    .replace(" ", "");
            if (s.length() > 10) {
                String countryCode = s.substring(0, s.length() - 10);
                String countryCodeMask = "+" + String.join("", Collections.nCopies(countryCode.length(), "*"));
                String localNumber = s.substring(s.length() - 10);
                String lastFourDigits = localNumber.substring(6);
                return countryCodeMask + "-***-***-" + lastFourDigits;
            }
            else if (s.length() == 10) {
                String localNumber = s;
                String lastFourDigits = localNumber.substring(6);
                return "***-***-" + lastFourDigits;
            }
            else {
                throw new IllegalArgumentException("Phone number does not have 10 digits.");
            }
        }
    }
}
