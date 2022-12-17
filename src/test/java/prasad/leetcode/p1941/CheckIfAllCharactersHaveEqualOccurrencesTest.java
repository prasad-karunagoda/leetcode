package prasad.leetcode.p1941;

import org.junit.Assert;
import org.junit.Test;

public class CheckIfAllCharactersHaveEqualOccurrencesTest {

    @Test
    public void test01() {
        Assert.assertTrue(new CheckIfAllCharactersHaveEqualOccurrences().areOccurrencesEqual("abacbc"));
    }

    @Test
    public void test02() {
        Assert.assertFalse(new CheckIfAllCharactersHaveEqualOccurrences().areOccurrencesEqual("aaabb"));
    }

    @Test
    public void test03() {
        Assert.assertTrue(new CheckIfAllCharactersHaveEqualOccurrences().areOccurrencesEqual("k"));
    }

    @Test
    public void test04() {
        Assert.assertTrue(new CheckIfAllCharactersHaveEqualOccurrences().areOccurrencesEqual("hhhh"));
    }
}
