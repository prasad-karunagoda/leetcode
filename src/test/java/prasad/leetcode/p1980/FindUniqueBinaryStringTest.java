package prasad.leetcode.p1980;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;

public class FindUniqueBinaryStringTest {

    @Test
    public void test01() {
        String result = new FindUniqueBinaryString().findDifferentBinaryString(new String[] {"01", "10"});
        Assert.assertTrue(Arrays.asList("00", "11").contains(result));
    }

    @Test
    public void test02() {
        String result = new FindUniqueBinaryString().findDifferentBinaryString(new String[] {"00", "01"});
        Assert.assertTrue(Arrays.asList("10", "11").contains(result));
    }

    @Test
    public void test03() {
        String result = new FindUniqueBinaryString().findDifferentBinaryString(new String[] {"111", "011", "001"});
        Assert.assertTrue(Arrays.asList("000", "010", "100", "101", "110").contains(result));
    }

    @Test
    public void test04() {
        String result = new FindUniqueBinaryString().findDifferentBinaryString(new String[] {"0"});
        Assert.assertEquals("1", result);
    }

    @Test
    public void test05() {
        String result = new FindUniqueBinaryString().findDifferentBinaryString(new String[] {"1"});
        Assert.assertEquals("0", result);
    }
}
