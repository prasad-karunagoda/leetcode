package prasad.leetcode.p592;

import org.junit.Assert;
import org.junit.Test;

public class FractionAdditionAndSubtractionTest {

    @Test
    public void test01() {
        Assert.assertEquals("0/1", new FractionAdditionAndSubtraction().fractionAddition("-1/2+1/2"));
    }

    @Test
    public void test02() {
        Assert.assertEquals("1/3", new FractionAdditionAndSubtraction().fractionAddition("-1/2+1/2+1/3"));
    }

    @Test
    public void test03() {
        Assert.assertEquals("-1/6", new FractionAdditionAndSubtraction().fractionAddition("1/3-1/2"));
    }

    @Test
    public void test04() {
        Assert.assertEquals("-3/2", new FractionAdditionAndSubtraction().fractionAddition("-1/3-1/2-2/3"));
    }

    @Test
    public void test05() {
        Assert.assertEquals("2/1", new FractionAdditionAndSubtraction().fractionAddition("2/3+1/6+2/3+1/2"));
    }
}
