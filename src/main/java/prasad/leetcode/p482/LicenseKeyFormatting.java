package prasad.leetcode.p482;

public class LicenseKeyFormatting {

    public String licenseKeyFormatting(String s, int k) {
        s = s.replace("-", "").toUpperCase();
        int remainder = s.length() % k;
        StringBuilder sb = new StringBuilder();
        if (remainder == 0) {
            int groupCount = s.length() / k;
            for (int n = 0; n < groupCount; n++) {
                sb.append(s.substring(n * k, (n * k) + k));
                if (n < groupCount - 1) {
                    sb.append("-");
                }
            }
        }
        else {
            int fullGroupCount = s.length() / k;
            sb.append(s.substring(0, remainder));
            for (int n = 0; n < fullGroupCount; n++) {
                sb.append("-");
                sb.append(s.substring((n * k) + remainder, (n * k) + remainder + k));
            }
        }
        return sb.toString();
    }
}
