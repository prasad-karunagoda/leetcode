package prasad.leetcode.p1023;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

public class CamelcaseMatchingTest {

    @Test
    public void test01() {
        List<Boolean> result = new CamelcaseMatching().camelMatch(
                new String[] {"FooBar","FooBarTest","FootBall","FrameBuffer","ForceFeedBack","FooB"}, "FB");
        Assert.assertEquals(Arrays.asList(true,false,true,true,false,true), result);
    }

    @Test
    public void test02() {
        List<Boolean> result = new CamelcaseMatching().camelMatch(
                new String[] {"FooBar","FooBarTest","FootBall","FrameBuffer","ForceFeedBack"}, "FoBa");
        Assert.assertEquals(Arrays.asList(true,false,true,false,false), result);
    }

    @Test
    public void test03() {
        List<Boolean> result = new CamelcaseMatching().camelMatch(
                new String[] {"FooBar","FooBarTest","FootBall","FrameBuffer","ForceFeedBack"}, "FoBaT");
        Assert.assertEquals(Arrays.asList(false,true,false,false,false), result);
    }

    @Test
    public void test04() {
        List<Boolean> result = new CamelcaseMatching().camelMatch(
                new String[] {"A","bA","Ab","ab"}, "A");
        Assert.assertEquals(Arrays.asList(true,true,true,false), result);
    }
}
