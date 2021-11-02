package prasad.leetcode.p1324;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class PrintWordsVerticallyTest {

    @Test
    public void test01() {
        List<String> result = new PrintWordsVertically().printVertically("HOW ARE YOU");
        Assert.assertEquals(Arrays.asList("HAY", "ORO", "WEU"), result);
    }

    @Test
    public void test02() {
        List<String> result = new PrintWordsVertically().printVertically("TO BE OR NOT TO BE");
        Assert.assertEquals(Arrays.asList("TBONTB", "OEROOE", "   T"), result);
    }

    @Test
    public void test03() {
        List<String> result = new PrintWordsVertically().printVertically("CONTEST IS COMING");
        Assert.assertEquals(Arrays.asList("CIC", "OSO", "N M", "T I", "E N", "S G", "T"), result);
    }

    @Test
    public void test04() {
        List<String> result = new PrintWordsVertically().printVertically("ABC");
        Assert.assertEquals(Arrays.asList("A", "B", "C"), result);
    }

    @Test
    public void test05() {
        List<String> result = new PrintWordsVertically().printVertically("A");
        Assert.assertEquals(Collections.singletonList("A"), result);
    }

    @Test(expected = IllegalArgumentException.class)
    public void test06() {
        new PrintWordsVertically().printVertically("");
    }
}
