package prasad.leetcode.p1678;

import org.junit.Assert;
import org.junit.Test;

public class GoalParserInterpretationTest {

    @Test
    public void test01() {
        Assert.assertEquals("Goal", new GoalParserInterpretation().interpret("G()(al)"));
    }

    @Test
    public void test02() {
        Assert.assertEquals("Gooooal", new GoalParserInterpretation().interpret("G()()()()(al)"));
    }

    @Test
    public void test03() {
        Assert.assertEquals("alGalooG", new GoalParserInterpretation().interpret("(al)G(al)()()G"));
    }

    @Test(expected = IllegalArgumentException.class)
    public void test04() {
        new GoalParserInterpretation().interpret("a");
    }

    @Test(expected = IllegalArgumentException.class)
    public void test05() {
        new GoalParserInterpretation().interpret("G()((al)");
    }

    @Test
    public void test06() {
        Assert.assertEquals("G", new GoalParserInterpretation().interpret("G"));
    }
}
