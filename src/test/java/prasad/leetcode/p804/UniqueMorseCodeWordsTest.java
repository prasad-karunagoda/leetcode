package prasad.leetcode.p804;

import org.junit.Assert;
import org.junit.Test;

public class UniqueMorseCodeWordsTest {

    @Test
    public void test01() {
        Assert.assertEquals(2, new UniqueMorseCodeWords().uniqueMorseRepresentations(
                new String[] {"gin","zen","gig","msg"}));
    }

    @Test
    public void test02() {
        Assert.assertEquals(1, new UniqueMorseCodeWords().uniqueMorseRepresentations(
                new String[] {"a"}));
    }
}
