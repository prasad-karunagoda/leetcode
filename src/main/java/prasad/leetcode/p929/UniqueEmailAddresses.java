package prasad.leetcode.p929;

import java.util.HashSet;

public class UniqueEmailAddresses {

    public int numUniqueEmails(String[] emails) {
        HashSet<String> set = new HashSet<>();
        for (String em : emails) {
            String[] localAndDomain = em.split("@");
            String local = localAndDomain[0];
            String domain = localAndDomain[1];

            int indexOfPlus = local.indexOf('+');
            if (indexOfPlus != -1) {
                local = local.substring(0, indexOfPlus);
            }
            local = local.replaceAll("\\.", "");
            set.add(local + "@" + domain);
        }
        return set.size();
    }
}
