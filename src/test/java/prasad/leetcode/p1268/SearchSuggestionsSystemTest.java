package prasad.leetcode.p1268;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SearchSuggestionsSystemTest {

    @Test
    public void test01() {
        String[] products = {"mobile","mouse","moneypot","monitor","mousepad"};
        List<List<String>> result = new SearchSuggestionsSystem().suggestedProducts(products, "mouse");
        Assert.assertEquals(5, result.size());
        Assert.assertEquals(Arrays.asList("mobile","moneypot","monitor"), result.get(0));
        Assert.assertEquals(Arrays.asList("mobile","moneypot","monitor"), result.get(1));
        Assert.assertEquals(Arrays.asList("mouse","mousepad"), result.get(2));
        Assert.assertEquals(Arrays.asList("mouse","mousepad"), result.get(3));
        Assert.assertEquals(Arrays.asList("mouse","mousepad"), result.get(4));
    }

    @Test
    public void test02() {
        String[] products = {"havana"};
        List<List<String>> result = new SearchSuggestionsSystem().suggestedProducts(products, "havana");
        Assert.assertEquals(6, result.size());
        Assert.assertEquals(Collections.singletonList("havana"), result.get(0));
        Assert.assertEquals(Collections.singletonList("havana"), result.get(1));
        Assert.assertEquals(Collections.singletonList("havana"), result.get(2));
        Assert.assertEquals(Collections.singletonList("havana"), result.get(3));
        Assert.assertEquals(Collections.singletonList("havana"), result.get(4));
        Assert.assertEquals(Collections.singletonList("havana"), result.get(5));
    }

    @Test
    public void test03() {
        String[] products = {"bags","baggage","banner","box","cloths"};
        List<List<String>> result = new SearchSuggestionsSystem().suggestedProducts(products, "bags");
        Assert.assertEquals(4, result.size());
        Assert.assertEquals(Arrays.asList("baggage","bags","banner"), result.get(0));
        Assert.assertEquals(Arrays.asList("baggage","bags","banner"), result.get(1));
        Assert.assertEquals(Arrays.asList("baggage","bags"), result.get(2));
        Assert.assertEquals(Collections.singletonList("bags"), result.get(3));
    }

    @Test
    public void test04() {
        String[] products = {"havana"};
        List<List<String>> result = new SearchSuggestionsSystem().suggestedProducts(products, "tatiana");
        Assert.assertEquals(7, result.size());
        Assert.assertTrue(result.get(0).isEmpty());
        Assert.assertTrue(result.get(1).isEmpty());
        Assert.assertTrue(result.get(2).isEmpty());
        Assert.assertTrue(result.get(3).isEmpty());
        Assert.assertTrue(result.get(4).isEmpty());
        Assert.assertTrue(result.get(5).isEmpty());
        Assert.assertTrue(result.get(6).isEmpty());
    }
}
