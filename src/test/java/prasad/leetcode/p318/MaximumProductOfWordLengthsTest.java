package prasad.leetcode.p318;

import org.junit.Assert;
import org.junit.Test;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.net.URISyntaxException;
import java.net.URL;

public class MaximumProductOfWordLengthsTest {

    @Test
    public void test01() {
        String[] words = new String[] {"abcw","baz","foo","bar","xtfn","abcdef"};
        Assert.assertEquals(16, new MaximumProductOfWordLengths().maxProduct(words));
    }

    @Test
    public void test02() {
        String[] words = new String[] {"a","ab","abc","d","cd","bcd","abcd"};
        Assert.assertEquals(4, new MaximumProductOfWordLengths().maxProduct(words));
    }

    @Test
    public void test03() {
        String[] words = new String[] {"a","aa","aaa","aaaa"};
        Assert.assertEquals(0, new MaximumProductOfWordLengths().maxProduct(words));
    }

    @Test
    public void testTime() throws IOException {
        String[] words = new String[1000];

        BufferedReader reader = null;
        try {
            URL resource = getClass().getClassLoader().getResource("p318_1000_strings_of_length_990.txt");
            reader = new BufferedReader(new FileReader(new File(resource.toURI())));
        } catch (URISyntaxException ex) {
            ex.printStackTrace();
        }

        if (reader != null) {
            String line;
            int i = 0;
            while ((line = reader.readLine()) != null) {
                words[i] = line;
                i++;
            }

            long start = System.currentTimeMillis();
            int maxProduct = new MaximumProductOfWordLengths().maxProduct(words);
            System.out.println("Time = " + (System.currentTimeMillis() - start) + " ms");
            System.out.println("maxProduct = " + maxProduct);
        }
    }
}
