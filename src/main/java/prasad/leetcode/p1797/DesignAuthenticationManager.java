package prasad.leetcode.p1797;

import java.util.HashMap;
import java.util.Map;

public class DesignAuthenticationManager {

    private final int timeToLive;
    private final Map<String, Integer> tokens;

    public DesignAuthenticationManager(int timeToLive) {
        this.timeToLive = timeToLive;
        this.tokens = new HashMap<>();
    }

    public void generate(String tokenId, int currentTime) {
        tokens.put(tokenId, currentTime);
    }

    public void renew(String tokenId, int currentTime) {
        if (tokens.containsKey(tokenId)) {
            int createdTime = tokens.get(tokenId);
            if (currentTime - createdTime < timeToLive) {
                tokens.put(tokenId, currentTime);
            }
        }
    }

    public int countUnexpiredTokens(int currentTime) {
        int count = 0;
        for (int createdTime : tokens.values()) {
            if (currentTime - createdTime < timeToLive) {
                count++;
            }
        }
        return count;
    }
}
