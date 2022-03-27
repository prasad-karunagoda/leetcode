package prasad.leetcode.p1832;

import org.junit.Assert;
import org.junit.Test;

public class CheckSentenceIsPangramTest {

    @Test
    public void test01() {
        Assert.assertTrue(new CheckSentenceIsPangram().checkIfPangram("thequickbrownfoxjumpsoverthelazydog"));
    }

    @Test
    public void test02() {
        Assert.assertTrue(new CheckSentenceIsPangram().checkIfPangram("abcdefghijklmnopqrstuvwxyz"));
    }

    @Test
    public void test03() {
        Assert.assertFalse(new CheckSentenceIsPangram().checkIfPangram("abcdefghijklmnopqrtuvwxyz"));
    }
}
