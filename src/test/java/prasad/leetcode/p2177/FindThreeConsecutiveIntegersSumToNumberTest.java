package prasad.leetcode.p2177;

import org.junit.Assert;
import org.junit.Test;

public class FindThreeConsecutiveIntegersSumToNumberTest {

    @Test
    public void test01() {
        long[] result = new FindThreeConsecutiveIntegersSumToNumber().sumOfThree(33);
        Assert.assertArrayEquals(new long[] {10,11,12}, result);
    }

    @Test
    public void test02() {
        long[] result = new FindThreeConsecutiveIntegersSumToNumber().sumOfThree(4);
        Assert.assertArrayEquals(new long[0], result);
    }

    @Test
    public void test03() {
        long[] result = new FindThreeConsecutiveIntegersSumToNumber().sumOfThree(0);
        Assert.assertArrayEquals(new long[] {-1,0,1}, result);
    }
}
