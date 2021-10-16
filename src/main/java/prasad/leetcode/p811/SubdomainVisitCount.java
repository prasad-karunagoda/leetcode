package prasad.leetcode.p811;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class SubdomainVisitCount {

    public List<String> subdomainVisits(String[] cpdomains) {
        Map<String, Integer> countsMap = new HashMap<>();
        for (String cpd : cpdomains) {
            String[] countAndDomain = cpd.split(" ");
            int count = Integer.parseInt(countAndDomain[0]);
            String domain = countAndDomain[1];
            String[] subdomains = getSubdomains(domain);
            for (String sub : subdomains) {
                if (countsMap.containsKey(sub)) {
                    countsMap.put(sub, countsMap.get(sub) + count);
                }
                else {
                    countsMap.put(sub, count);
                }
            }
        }

        return countsMap.entrySet().stream()
                .map(entry -> entry.getValue() + " " + entry.getKey())
                .collect(Collectors.toList());
    }

    private String[] getSubdomains(String domain) {
        String[] segments = domain.split("\\.");
        if (segments.length == 3) {
            return new String[] {
                    domain,
                    segments[1] + "." + segments[2],
                    segments[2]};
        }
        else if (segments.length == 2) {
            return new String[] {
                    domain,
                    segments[1]};
        }
        else {
            throw new IllegalArgumentException("Invalid domain format: " + domain);
        }
    }
}
