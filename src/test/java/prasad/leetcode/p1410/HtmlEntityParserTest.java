package prasad.leetcode.p1410;

import org.junit.Assert;
import org.junit.Test;

public class HtmlEntityParserTest {

    @Test
    public void test01() {
        Assert.assertEquals("& is an HTML entity but &ambassador; is not.",
                new HtmlEntityParser().entityParser("&amp; is an HTML entity but &ambassador; is not."));
    }

    @Test
    public void test02() {
        Assert.assertEquals("and I quote: \"...\"",
                new HtmlEntityParser().entityParser("and I quote: &quot;...&quot;"));
    }

    @Test
    public void test03() {
        Assert.assertEquals("Stay home! Practice on Leetcode :)",
                new HtmlEntityParser().entityParser("Stay home! Practice on Leetcode :)"));
    }

    @Test
    public void test04() {
        Assert.assertEquals("x > y && x < y is always false",
                new HtmlEntityParser().entityParser("x &gt; y &amp;&amp; x &lt; y is always false"));
    }

    @Test
    public void test05() {
        Assert.assertEquals("leetcode.com/problemset/all",
                new HtmlEntityParser().entityParser("leetcode.com&frasl;problemset&frasl;all"));
    }

    @Test
    public void test06() {
        Assert.assertEquals("\"",
                new HtmlEntityParser().entityParser("&quot;"));
    }

    @Test
    public void test07() {
        Assert.assertEquals("",
                new HtmlEntityParser().entityParser(""));
    }

    @Test
    public void test08() {
        Assert.assertEquals("&gt;",
                new HtmlEntityParser().entityParser("&amp;gt;"));
    }
}
