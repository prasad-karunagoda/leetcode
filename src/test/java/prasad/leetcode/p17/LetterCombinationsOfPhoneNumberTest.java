package prasad.leetcode.p17;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

public class LetterCombinationsOfPhoneNumberTest {

    @Test
    public void test01() {
        List<String> combinations = new LetterCombinationsOfPhoneNumber().letterCombinations("23");
        Assert.assertEquals(9, combinations.size());
        Assert.assertTrue(combinations.containsAll(Arrays.asList("ad", "ae", "af", "bd", "be", "bf", "cd", "ce", "cf")));
    }

    @Test
    public void test02() {
        List<String> combinations = new LetterCombinationsOfPhoneNumber().letterCombinations("2");
        Assert.assertEquals(3, combinations.size());
        Assert.assertTrue(combinations.containsAll(Arrays.asList("a", "b", "c")));
    }

    @Test
    public void test03() {
        List<String> combinations = new LetterCombinationsOfPhoneNumber().letterCombinations("");
        Assert.assertEquals(0, combinations.size());
    }
}
