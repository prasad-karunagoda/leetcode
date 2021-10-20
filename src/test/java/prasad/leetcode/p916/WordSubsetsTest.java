package prasad.leetcode.p916;

import org.junit.Assert;
import org.junit.Test;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.Arrays;
import java.util.List;

public class WordSubsetsTest {

    @Test
    public void test01() {
        List<String> result = new WordSubsets().wordSubsets(
                new String[] {"amazon","apple","facebook","google","leetcode"}, new String[] {"e","o"});
        Assert.assertEquals(3, result.size());
        Assert.assertTrue(result.containsAll(Arrays.asList("facebook","google","leetcode")));
    }

    @Test
    public void test02() {
        List<String> result = new WordSubsets().wordSubsets(
                new String[] {"amazon","apple","facebook","google","leetcode"}, new String[] {"l","e"});
        Assert.assertEquals(3, result.size());
        Assert.assertTrue(result.containsAll(Arrays.asList("apple","google","leetcode")));
    }

    @Test
    public void test03() {
        List<String> result = new WordSubsets().wordSubsets(
                new String[] {"amazon","apple","facebook","google","leetcode"}, new String[] {"e","oo"});
        Assert.assertEquals(2, result.size());
        Assert.assertTrue(result.containsAll(Arrays.asList("facebook","google")));
    }

    @Test
    public void test04() {
        List<String> result = new WordSubsets().wordSubsets(
                new String[] {"amazon","apple","facebook","google","leetcode"}, new String[] {"lo","eo"});
        Assert.assertEquals(2, result.size());
        Assert.assertTrue(result.containsAll(Arrays.asList("google","leetcode")));
    }

    @Test
    public void test05() {
        List<String> result = new WordSubsets().wordSubsets(
                new String[] {"amazon","apple","facebook","google","leetcode"}, new String[] {"ec","oc","ceo"});
        Assert.assertEquals(2, result.size());
        Assert.assertTrue(result.containsAll(Arrays.asList("facebook","leetcode")));
    }

    @Test
    public void test06() {
        List<String> result = new WordSubsets().wordSubsets(
                new String[] {"amazon"}, new String[] {"ec"});
        Assert.assertEquals(0, result.size());
    }

    @Test
    public void testTime() {
        try {
            URL resource = getClass().getClassLoader().getResource("p916.txt");
            BufferedReader reader = new BufferedReader(new FileReader(new File(resource.toURI())));
            String[] words1 = reader.readLine().split(",");
            String[] words2 = reader.readLine().split(",");
            long start = System.currentTimeMillis();
            new WordSubsets().wordSubsets(words1, words2);
            System.out.println("Time = " + (System.currentTimeMillis() - start) + " ms");
        }
        catch (IOException | URISyntaxException ex) {
            ex.printStackTrace();
        }
    }
}
