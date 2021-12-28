package prasad.leetcode.p68;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class TextJustificationTest {

    @Test
    public void test01() {
        String[] words = new String[] {"This", "is", "an", "example", "of", "text", "justification."};
        List<String> result = new TextJustification().fullJustify(words, 16);
        Assert.assertEquals(Arrays.asList(
                "This    is    an",
                "example  of text",
                "justification.  "), result);
    }

    @Test
    public void test02() {
        String[] words = new String[] {"What", "must", "be", "acknowledgment", "shall", "be"};
        List<String> result = new TextJustification().fullJustify(words, 16);
        Assert.assertEquals(Arrays.asList(
                "What   must   be",
                "acknowledgment  ",
                "shall be        "), result);
    }

    @Test
    public void test03() {
        String[] words = new String[] {"Science", "is", "what", "we", "understand", "well", "enough", "to",
                "explain", "to", "a", "computer.", "Art", "is", "everything", "else", "we", "do"};
        List<String> result = new TextJustification().fullJustify(words, 20);
        Assert.assertEquals(Arrays.asList(
                "Science  is  what we",
                "understand      well",
                "enough to explain to",
                "a  computer.  Art is",
                "everything  else  we",
                "do                  "), result);
    }

    @Test
    public void test04() {
        String[] words = new String[] {"Hello", "world"};
        List<String> result = new TextJustification().fullJustify(words, 20);
        Assert.assertEquals(Collections.singletonList(
                "Hello world         "), result);
    }

    @Test
    public void test05() {
        String[] words = new String[] {"Hello", "world"};
        List<String> result = new TextJustification().fullJustify(words, 5);
        Assert.assertEquals(Arrays.asList(
                "Hello",
                "world"), result);
    }
}
