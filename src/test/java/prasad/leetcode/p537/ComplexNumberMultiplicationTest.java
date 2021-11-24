package prasad.leetcode.p537;

import org.junit.Assert;
import org.junit.Test;

public class ComplexNumberMultiplicationTest {

    @Test
    public void test01() {
        Assert.assertEquals("0+2i",
                new ComplexNumberMultiplication().complexNumberMultiply("1+1i", "1+1i"));
    }

    @Test
    public void test02() {
        Assert.assertEquals("0+-2i",
                new ComplexNumberMultiplication().complexNumberMultiply("1+-1i", "1+-1i"));
    }

    @Test
    public void test03() {
        Assert.assertEquals("2+16i",
                new ComplexNumberMultiplication().complexNumberMultiply("2+3i", "4+2i"));
    }

    @Test
    public void test04() {
        Assert.assertEquals("21+1i",
                new ComplexNumberMultiplication().complexNumberMultiply("5+-3i", "3+2i"));
    }
}
