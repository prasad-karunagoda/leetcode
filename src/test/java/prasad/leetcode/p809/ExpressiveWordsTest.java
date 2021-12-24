package prasad.leetcode.p809;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.Collections;

public class ExpressiveWordsTest {

    @Test
    public void test01() {
        Assert.assertEquals(1, new ExpressiveWords().expressiveWords("heeellooo",
                new String[] {"hello", "hi", "helo"}));
    }

    @Test
    public void test02() {
        Assert.assertEquals(2, new ExpressiveWords().expressiveWords("heeellooo",
                new String[] {"hello", "hi", "helo", "heeellooo", "heeelloooooo"}));
    }

    @Test
    public void test03() {
        Assert.assertEquals(3, new ExpressiveWords().expressiveWords("zzzzzyyyyy",
                new String[] {"zzyy","zy","zyy"}));
    }

    @Test
    public void testGetStructure01() {
        ExpressiveWords.WordStructure wordStructure = new ExpressiveWords().getStructure("heeellooo");
        Assert.assertEquals("helo", wordStructure.startingCharOfGroups);
        Assert.assertEquals(Arrays.asList(1,3,2,3), wordStructure.charCounts);
    }

    @Test
    public void testGetStructure02() {
        ExpressiveWords.WordStructure wordStructure = new ExpressiveWords().getStructure("hello");
        Assert.assertEquals("helo", wordStructure.startingCharOfGroups);
        Assert.assertEquals(Arrays.asList(1,1,2,1), wordStructure.charCounts);
    }

    @Test
    public void testGetStructure03() {
        ExpressiveWords.WordStructure wordStructure = new ExpressiveWords().getStructure("h");
        Assert.assertEquals("h", wordStructure.startingCharOfGroups);
        Assert.assertEquals(Collections.singletonList(1), wordStructure.charCounts);
    }

    @Test
    public void testGetStructure04() {
        ExpressiveWords.WordStructure wordStructure = new ExpressiveWords().getStructure("hh");
        Assert.assertEquals("h", wordStructure.startingCharOfGroups);
        Assert.assertEquals(Collections.singletonList(2), wordStructure.charCounts);
    }
}
