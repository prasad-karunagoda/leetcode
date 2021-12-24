package prasad.leetcode.p1003;

import org.junit.Assert;
import org.junit.Test;

public class CheckIfWordIsValidAfterSubstitutionsTest {

    @Test
    public void test01() {
        Assert.assertTrue(new CheckIfWordIsValidAfterSubstitutions().isValid("aabcbc"));
    }

    @Test
    public void test02() {
        Assert.assertTrue(new CheckIfWordIsValidAfterSubstitutions().isValid("abcabcababcc"));
    }

    @Test
    public void test03() {
        Assert.assertFalse(new CheckIfWordIsValidAfterSubstitutions().isValid("abccba"));
    }

    @Test
    public void test04() {
        Assert.assertTrue(new CheckIfWordIsValidAfterSubstitutions().isValid(
                "aaabcabcabcbcabaabcbcabccabcabcbaababccbcababaabcbccaabcbabcabcccc"));
    }
}
