package prasad.leetcode.p1268;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SearchSuggestionsSystem {

    public List<List<String>> suggestedProducts(String[] products, String searchWord) {
        Arrays.sort(products);
        List<List<String>> result = new ArrayList<>();
        for (int endIndex = 1; endIndex <= searchWord.length(); endIndex++) {
            List<String> searchResults = new ArrayList<>();
            String currentSearch = searchWord.substring(0, endIndex);
            for (String p : products) {
                if (p.startsWith(currentSearch)) {
                    searchResults.add(p);
                    if (searchResults.size() == 3) {
                        break;
                    }
                }
            }
            result.add(searchResults);
        }
        return result;
    }
}
