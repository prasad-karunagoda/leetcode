package prasad.leetcode.p2284;

import org.junit.Assert;
import org.junit.Test;

public class SenderWithLargestWordCountTest {

    @Test
    public void test01() {
        Assert.assertEquals("Alice", new SenderWithLargestWordCount().largestWordCount(
                new String[] {"Hello userTwooo","Hi userThree","Wonderful day Alice","Nice day userThree"},
                new String[] {"Alice","userTwo","userThree","Alice"}));
    }

    @Test
    public void test02() {
        Assert.assertEquals("Charlie", new SenderWithLargestWordCount().largestWordCount(
                new String[] {"How is leetcode for everyone","Leetcode is useful for practice"},
                new String[] {"Bob","Charlie"}));
    }

    @Test
    public void test03() {
        Assert.assertEquals("charlie", new SenderWithLargestWordCount().largestWordCount(
                new String[] {"How is leetcode for everyone","Leetcode is useful for practice"},
                new String[] {"charlie","Charlie"}));
    }
}
