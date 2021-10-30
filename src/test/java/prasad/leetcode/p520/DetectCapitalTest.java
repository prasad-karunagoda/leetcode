package prasad.leetcode.p520;

import org.junit.Assert;
import org.junit.Test;

public class DetectCapitalTest {

    @Test
    public void testUSA() {
        Assert.assertTrue(new DetectCapital().detectCapitalUse("USA"));
    }

    @Test
    public void testFlaG() {
        Assert.assertFalse(new DetectCapital().detectCapitalUse("FlaG"));
    }

    @Test
    public void testleetcode() {
        Assert.assertTrue(new DetectCapital().detectCapitalUse("leetcode"));
    }

    @Test
    public void testGoogle() {
        Assert.assertTrue(new DetectCapital().detectCapitalUse("Google"));
    }

    @Test
    public void testk() {
        Assert.assertTrue(new DetectCapital().detectCapitalUse("k"));
    }

    @Test
    public void testB() {
        Assert.assertTrue(new DetectCapital().detectCapitalUse("B"));
    }

    @Test
    public void testkW() {
        Assert.assertFalse(new DetectCapital().detectCapitalUse("kW"));
    }
}
